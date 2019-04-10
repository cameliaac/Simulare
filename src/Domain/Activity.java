package Domain;

public class Activity {
    private String id;
    private String description;
    private int time;
    private String day;
    private String hour;

    public Activity(String id, int time, String description, String day, String hour) {
        this.id = id;
        this.time = time;
        this.description = description;
        this.day = day;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String hour) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }
}
