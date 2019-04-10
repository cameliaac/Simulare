package Service;

import Domain.Activity;
import Repository.IRepository;

import java.util.List;

public class ActivityService {

    private IRepository activityRepository;

    public ActivityService(IRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    /**
     * inserts an activity
     * @param id the id of the activity
     * @param time the time of activity
     * @param description the description of the activity
     * @param day the day of the activity
     * @param hour the hour of the activity
     */
    public void insert(String id, int time, String description, String day, String hour) {
        Activity activity = new Activity(id, time, description, day, hour);
        activityRepository.insert(activity);
    }

    /**
     * @return an List with all activitys
     */
    public List<Activity> getAll() {
        return activityRepository.getAll();
    }


}