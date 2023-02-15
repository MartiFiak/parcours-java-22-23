public class DeadCharacterException extends Exception {
    public Character character;
    private String className;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    @Override
    public String getMessage() {
        className = "";
        if (character instanceof Sorcerer) {
            className += "sorcerer";
        }
        else if (character instanceof Monster) {
            className += "monster";
        }
        else if (character instanceof Templar) {
            className += "templar";
        }
        return "The " + className + " " + character.getName() + " is dead";
    }
}
