package Q4NetflixMovies;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Movie> romanticList = new ArrayList<>();
        List<Movie> documentaryList = new ArrayList<>();
        Movie movieRomanticOne = new Movie("Little Women", new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), Arrays.asList("Emma", "Teemo"), "DirectorOne");
        Movie movieRomanticTwo = new Movie("Lala Land", new GregorianCalendar(2017, Calendar.FEBRUARY, 14).getTime(), Arrays.asList("Emma", "Leonardo", "Tommy"), "Stone");
        Movie movieDocumentaryOne = new Movie("Animals", new GregorianCalendar(1988, Calendar.APRIL, 22).getTime(), Arrays.asList("Summer", "Frank"), "Spielberg");
        Movie movieDocumentaryTwo = new Movie("Movies", new GregorianCalendar(2021, Calendar.MAY, 13).getTime(), Arrays.asList("Derek", "Hillson"), "Ash");

        romanticList.add(movieRomanticOne);
        romanticList.add(movieRomanticTwo);

        documentaryList.add(movieDocumentaryOne);
        documentaryList.add(movieDocumentaryTwo);

        Genre roman = new Genre(romanticList);
        Genre documentary = new Genre(documentaryList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(roman);
        genreList.add(documentary);

        Netflix netflix = new Netflix(genreList);

        //add the string "(Classic)" to the title of the movie using flatMap.

        Date twoTh = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).filter(movie -> movie.releaseDate.before(twoTh)).forEach(movie -> movie.title = movie.title + "(Classic)");

        //limit() method of stream.
        List<Movie> ans = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.releaseDate.compareTo(o1.releaseDate);
            }
        }).limit(3).collect(Collectors.toList());

        Date ntin = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        List<Movie> listOfAllMovie = netflix.genreList.stream().flatMap(genre -> genre.movieList.stream()).collect(Collectors.toList());
        Predicate<Movie> before2000 = movie -> movie.releaseDate.before(twoTh);
        Predicate<Movie> after1990 = movie -> movie.releaseDate.after(ntin);

        //Sorting
        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.title.compareTo(o2.title);
            }
        });
    }



}

