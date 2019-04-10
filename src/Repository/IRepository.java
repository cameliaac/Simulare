package Repository;

import Domain.Activity;
import Domain.ActivityValidator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IRepository {

    private Map<String, Activity> storage = new HashMap<>();
    private ActivityValidator validator;

    public IRepository(ActivityValidator validator) {
        this.validator = validator;
    }

    /**
     * inserts an activity
     * @param activity
     * @throws Repository.RepositoryException if an activity with that id already exists
     */
    public void insert(Activity activity) {
        if (storage.containsKey(activity.getId())) {
            throw new Repository.RepositoryException("An activity with " + activity.getId() + " already exists");
        }
        validator.validate(activity);
        storage.put(activity.getId(), activity);
    }

    /**
     * @return a list with all activitys
     */
    public List<Activity> getAll() {
        return new ArrayList<>(storage.values());
    }

}