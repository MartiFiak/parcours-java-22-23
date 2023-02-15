public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() <= 0) {
            return getName() + " is a monster and is dead";
        }
    return getName() + " is a monster with " + getCurrentHealth() + " HP";
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth = (damage * (80/100));
        }
        
    }

    @Override
    public void attack(Character uruk) {
        uruk.takeDamage(7);
        
    }
}
