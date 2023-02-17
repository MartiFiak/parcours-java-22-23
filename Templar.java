public class Templar extends Character implements Healer, Tank {


    private final int healCapacity;
    private final int shield;


    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield() {
        return shield;
    }

    
    @Override
    public String toString() {
        String retour;
        if (getCurrentHealth() <= 0) {
            retour = getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal " + getHealCapacity() + " HP.";
        } else {
            retour = getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of " + getShield() + ".";
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
        if (damage > currentHealth) {
            currentHealth = 0;
        } 
        if (this.currentHealth == 0) {
            throw new DeadCharacterException(this);
        }
        else {
            currentHealth -= (damage - getShield());
        }
        
    }


    @Override
    public void attack(Character uruk) throws DeadCharacterException {
        this.heal(this);
        if (this.getWeapon() == null){
            uruk.takeDamage(6); 
        } else {
            uruk.takeDamage(this.getWeapon().getDamage());
        }
        
    }
}
