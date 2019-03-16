package mum.model;

import java.util.List;

public class ScheduleModel {
    int id;
    String movieName;
    List<TimeModel> times;
    int available;
    int showroom;
    String imageUrl;

    public ScheduleModel (int id, String mName, List<TimeModel> mtime, int mavailable, int mshowroom, String mimageUrl) {
        this.id = id;
        this.movieName = mName;
        this.times = mtime;
        this.available = mavailable;
        this.showroom = mshowroom;
        this.imageUrl = mimageUrl;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<TimeModel> getTimes() {
        return times;
    }

    public int getAvailable() {
        return available;
    }

    public int getShowroom() {
        return showroom;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
