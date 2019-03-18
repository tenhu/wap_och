package mum.model;

public class TimeModel {

    int id;
    String stime;

    public TimeModel(int id ,String time) {
        this.id = id;
        this.stime = time;
    }

    public int getId() {
        return id;
    }
    public String getStime() {
        return stime;
    }
}
