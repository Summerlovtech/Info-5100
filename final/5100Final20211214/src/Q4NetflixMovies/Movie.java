package Q4NetflixMovies;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

public class Movie {
    String title;
    Date releaseDate;
    List<String> actorList;
    String Director;

    public Movie(String title, Date date, List<String> actorList, String director) {
        this.title = title;
        this.releaseDate = date;
        this.actorList = actorList;
        Director = director;
    }
}