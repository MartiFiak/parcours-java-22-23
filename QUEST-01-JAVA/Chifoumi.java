public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        switch(chifoumiAction) {

            case SCISSOR:
            return ChifoumiAction.PAPER;

            case ROCK:
            return ChifoumiAction.SCISSOR;

            case PAPER:
            return ChifoumiAction.ROCK;

            default:
            return null;
        }
    }
}
