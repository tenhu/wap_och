package mum.model;

public class MovieModel {

    int id;
    String movieName;
    String description;
    String director;
    String pictureUrl;
    String time;
    String date;
    int available;
    String showroom;
    int ticketPrice;

    public MovieModel(int id, String mName, String mDescription, String mDirector, String mPicture,
    String time, String date, int available, String showroom, int ticketPrice) {
        this.id = id;
        this.movieName = mName;
        this.description = mDescription;
        this.director = mDirector;
        this.pictureUrl = mPicture;
        this.time = time;
        this.date = date;
        this.available = available;
        this.showroom = showroom;
        this.ticketPrice = ticketPrice;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public int getAvailable() {
        return available;
    }

    public String getShowroom() {
        return showroom;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
}

