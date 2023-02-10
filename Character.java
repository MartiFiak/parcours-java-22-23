public class Character {

    private final int maxHealth;
    public int currentHealth;
    private final String name;


    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public String getName() {
        return name;
    }


    public void takeDamage(int damage) {
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damage;
        }

    }
    public void attack(Character uruk) {
        uruk.takeDamage(9);
    }


    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
    }


    @Override
    public String toString() {
        if (currentHealth <= 0) {
            return getName() + " : KO";
        } else {
        return getName() + " : " + getCurrentHealth() + "/" + getMaxHealth();
        }
    }
}
