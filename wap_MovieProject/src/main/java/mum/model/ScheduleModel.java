package mum.model;

import java.util.List;

public class ScheduleModel {
    int id;
    List<TimeModel> times;
    String imageUrl;

    public ScheduleModel (int id, List<TimeModel> mtime, String mimageUrl) {
        this.id = id;
        this.times = mtime;
        this.imageUrl = mimageUrl;
    }

    public int getId() {
        return id;
    }
    public List<TimeModel> getTimes() {
        return times;
    }
    public String getImageUrl() {
        return imageUrl;
    }
}
