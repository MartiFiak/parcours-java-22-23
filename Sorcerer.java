public class Sorcerer extends Character implements Healer {

    private final int healCapacity;


    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
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
        if (getCurrentHealth() <= 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + getHealCapacity() + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity() + " HP.";
    }


    @Override
    public void takeDamage(int damage) {
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damage;
        }
        
    }


    @Override
    public void attack(Character uruk) {
        this.heal(this);
        uruk.takeDamage(10);
    }
        
}
