import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private final int maxHealth;
    protected int currentHealth;
    private Weapon weapon;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
  
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


    public abstract void takeDamage(int damage) throws DeadCharacterException;
    public abstract void attack(Character uruk) throws DeadCharacterException;


    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        this.allCharacters.add(this);
        this.weapon = weapon;
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
            try {
                player1.attack(player2);
            } catch (DeadCharacterException e) {
                e.printStackTrace();
            }
            round = 2;
            } else {
                try {
                    player2.attack(player1);
                } catch (DeadCharacterException e) {
                    e.printStackTrace();
                }
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
