public class Sorcerer extends Character implements Healer {

    private final int healCapacity;


    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }


    @Override
    public int getHealCapacity() {
        return healCapacity;
    }


    @Override
    public void heal(Character character) {
        if (character.getCurrentHealth() <= 0) {
            return;
        }
        if (character.getCurrentHealth() + healCapacity > character.getMaxHealth()) {
            character.setCurrentHealth(character.getMaxHealth());
        } else {
            character.setCurrentHealth(character.getCurrentHealth() + healCapacity);
        }
    }

    
    @Override
    public String toString() {
        String retour;
        if (getCurrentHealth() <= 0) {
            retour = getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP." + " He has the weapon ";
        } else {
            retour = getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP." + " He has the weapon ";
        }
        if (this.getWeapon() != null) {
            retour += " He has no weapon " + this.getWeapon().toString() + ".";
        } else {
            retour += " He has the weapon ";
        }
        return retour;
    }


    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.currentHealth == 0) {
            throw new DeadCharacterException(this);
        }
        if (getCurrentHealth() >= damage) {
            currentHealth = getCurrentHealth();
            currentHealth -= damage;
        } else {
            currentHealth = 0;
        }
        
    }


    @Override
    public void attack(Character uruk) throws DeadCharacterException {
        this.heal(this);
        if (this.getWeapon() == null){
            uruk.takeDamage(10); 
        } else {
            uruk.takeDamage(this.getWeapon().getDamage());
        }
        
    }
        
}
