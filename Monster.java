public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        String retour;
        if (getCurrentHealth() <= 0) {
            retour = getName() + " is a monster and is dead." + " He has the weapon ";
        } else {
            retour = getName() + " is a monster with " + getCurrentHealth() + " HP." + " He has the weapon ";
        }
        if (this.getWeapon() != null) {
            retour += " He has no weapon " + this.getWeapon().toString() + ".";
        } else {
            retour += " He has the weapon ";
        }
        return retour;
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            this.currentHealth -=  Math.floor(damage * 0.8);
        }
        
    }

    @Override
    public void attack(Character uruk) {
        if (this.getWeapon() == null){
            uruk.takeDamage(7); 
        } else {
            uruk.takeDamage(this.getWeapon().getDamage());
        }        
    }
}
