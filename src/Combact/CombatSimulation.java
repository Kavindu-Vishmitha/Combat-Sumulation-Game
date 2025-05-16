// Abstract Gun class to prevent direct instantiation
abstract class Gun {

    protected String name;
    protected int bullets;

    public Gun(String name, int bullets) {
        this.name = name;
        this.bullets = bullets;
    }

    public abstract void shoot();

    public void reload(int bullets) {
        this.bullets += bullets;
        System.out.println(name + " reloaded with " + bullets + " bullets.");
    }

    public String getName() {
        return name;
    }

    public int getBullets() {
        return bullets;
    }
}

// AK47 class
class AK47 extends Gun {

    public AK47(int bullets) {
        super("AK47", bullets);
    }

    @Override
    public void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("AK47 fired! Bullets left: " + bullets);
        } else {
            System.out.println("AK47 is out of bullets! Reload needed.");
        }
    }
}

// Pistol class
class Pistol extends Gun {

    public Pistol(int bullets) {
        super("Pistol", bullets);
    }

    @Override
    public void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Pistol fired! Bullets left: " + bullets);
        } else {
            System.out.println("Pistol is out of bullets! Reload needed.");
        }
    }
}

// Sniper class
class Sniper extends Gun {

    public Sniper(int bullets) {
        super("Sniper", bullets);
    }

    @Override
    public void shoot() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Sniper fired! Bullets left: " + bullets);
        } else {
            System.out.println("Sniper is out of bullets! Reload needed.");
        }
    }
}

// Soldier class
class Soldier {

    private String name;
    private Gun[] guns;
    private int gunCount;
    private int currentGunIndex;

    public Soldier(String name) {
        this.name = name;
        this.guns = new Gun[3];
        this.gunCount = 0;
        this.currentGunIndex = -1;
    }

    public void addGun(Gun gun) {
        if (gunCount < 3) {
            guns[gunCount] = gun;
            gunCount++;
            if (currentGunIndex == -1) {
                currentGunIndex = 0; // Automatically select the first gun
            }
            System.out.println(gun.getName() + " added to soldier.");
        } else {
            System.out.println("Cannot carry more than 3 guns.");
        }
    }

    public void switchGun(int index) {
        if (index >= 0 && index < gunCount) {
            currentGunIndex = index;
            System.out.println("Switched to " + guns[currentGunIndex].getName());
        } else {
            System.out.println("Invalid gun index.");
        }
    }

    public void shoot() {
        if (currentGunIndex != -1 && guns[currentGunIndex] != null) {
            guns[currentGunIndex].shoot();
        } else {
            System.out.println("No gun equipped.");
        }
    }

    public void reload(int bullets) {
        if (currentGunIndex != -1 && guns[currentGunIndex] != null) {
            guns[currentGunIndex].reload(bullets);
        } else {
            System.out.println("No gun to reload.");
        }
    }

    public void dropGun(int index) {
        if (index >= 0 && index < gunCount) {
            System.out.println(guns[index].getName() + " dropped.");
            for (int i = index; i < gunCount - 1; i++) {
                guns[i] = guns[i + 1];
            }
            guns[gunCount - 1] = null;
            gunCount--;
            if (gunCount == 0) {
                currentGunIndex = -1; // No guns left
            } else if (index == currentGunIndex) {
                currentGunIndex = 0; // Switch to first gun available
            }
        } else {
            System.out.println("Invalid index. Cannot drop.");
        }
    }
}

// Main class to run the simulation
public class CombatSimulation {

    public static void main(String[] args) {
        Soldier soldier = new Soldier("Kevin");

        Gun ak47 = new AK47(5);
        Gun pistol = new Pistol(3);
        Gun sniper = new Sniper(2);

        soldier.addGun(ak47);
        soldier.addGun(pistol);
        soldier.addGun(sniper);

        soldier.shoot();
        soldier.switchGun(1);
        soldier.shoot();
        soldier.reload(5);
        soldier.shoot();
        soldier.switchGun(2);
        soldier.shoot();
        soldier.dropGun(1);
        soldier.shoot();
    }
}
