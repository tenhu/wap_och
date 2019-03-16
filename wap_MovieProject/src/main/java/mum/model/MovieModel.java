package mum.model;

public class MovieModel {

    int id;
    String movieName;
    String description;
    String director;
    String pictureUrl;

    public MovieModel(int id, String mName, String mDescription, String mDirector, String mPicture) {
        this.id = id;
        this.movieName = mName;
        this.description = mDescription;
        this.director = mDirector;
        this.pictureUrl = mPicture;
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

}

