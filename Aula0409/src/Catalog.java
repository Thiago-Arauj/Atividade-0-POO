import java.util.ArrayList;

public class Catalog {

    private ArrayList<Movie> movieCatalog = new ArrayList<>();
    private ArrayList<Series> seriesCatalog = new ArrayList<>();

    public void getMovieCatalog() {
        for (Movie movie : movieCatalog) {
            System.out.println(movie);
        }
    }

    public void setMovieCatalog(Movie movie) {
        this.movieCatalog.add(movie);
    }

    public void getSeriesCatalog() {
        for (Series s: seriesCatalog) {
            System.out.println(s);
        }
    }

    public void setSeriesCatalog(Series series) {
        this.seriesCatalog.add(series);
    }
}
