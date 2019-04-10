package Domain;

public class ActivityValidatorException extends RuntimeException {
    ActivityValidatorException(String message) {

        super("Activity Validator Exception ||| " + message);
    }
}