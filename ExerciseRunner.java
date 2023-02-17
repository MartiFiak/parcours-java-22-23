public class ExerciseRunner {

    public static void main(String[] args) throws DeadCharacterException {
        Weapon excalibur = new Weapon("Excalibur", 7);
        Weapon baton = new Weapon("Baton", 3);
        Templar arthur = new Templar("Arthur", 30, 5, 3, excalibur);
        Sorcerer merlin = new Sorcerer("Merlin", 28, 2, baton);

        arthur.takeDamage(50);

        arthur.takeDamage(2);
        arthur.attack(merlin);
    }
}