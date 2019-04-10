package Domain;

public class ActivityValidator {
    /**
     * validate a activity
     * @param activity to validate
     * @throws Domain.ActivityValidatorException if there are validation errors
     */
    public void validate(Activity activity){
        String day = activity.getDay();
        String hour = activity.getHour();
        String id = activity.getId();

        String errors="";

        if(activity.getDay() == day && activity.getHour()== hour){
            errors+="Cannot book and activity during the same hour of the day!\n";
        }

     /*   if(activity.getId() == id){
            errors+="You cannot use the same ID!\n";
        }*/

        if(!errors.isEmpty()){
            throw new Domain.ActivityValidatorException(errors);
        }
    }
}
