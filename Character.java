import java.util.ArrayList;
import java.util.List;

public class Character {

    private final int maxHealth;
    protected int currentHealth;
    
    
    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }


    private final String name;
    private static List <Character>allCharacters = new ArrayList<>();


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
        this.allCharacters.add(this);
    }


    public static String printStatus() {
        String status ="------------------------------------------\n" +
        "Characters currently fighting :\n";
        
        if (allCharacters.size() == 0) {
            status = "------------------------------------------\n" +
                    "Nobody's fighting right now !\n" +
                    "------------------------------------------";
        } else {
            
            for (Character character : allCharacters) {
                status += " - " + character.toString() + "\n";
            }
            status +=  "------------------------------------------";
        }
        
        return status;
    }


    public static Character fight(Character player1, Character player2) {
        Character winner;
        int round = 1;
        while (player1.getCurrentHealth() > 0 && player2.getCurrentHealth() > 0) {
            if (round == 1){
            player1.attack(player2);
            round = 2;
            } else {
                player2.attack(player1);
                round = 1;
            }
        }
        if (player1.getCurrentHealth() > 0) {
            winner = player1;
        } else {
            winner = player2;
        }
        return winner;
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
