public class Templar extends Character implements Healer, Tank {


    private final int healCapacity;
    private final int shield;


    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
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
        if (getCurrentHealth() <= 0) {
            return getName() + " has been beaten, even with its " + getShield() + " shield. So bad, it could heal " + getHealCapacity() + " HP.";
        } else {
            return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP and has a shield of " + getShield() + ".";
        }
    }


}
