package at.ac.fhcampuswien.fhmdb;

import at.ac.fhcampuswien.fhmdb.contoller.HomeController;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {


    private static HomeController homeController;
    @BeforeAll
    public static void beforeAll(){

    }
    @Test
    public void initialize_returns_a_nonempty_list_of_movies(){
        List<Movie> movies;
        movies = Movie.initializeMovies();
        assertTrue(movies.size() > 0);
    }
    @Test
    void movies_and_observableMovies_are_equal(){
        //GIVEN
        Movie.initializeMovies();

        //WHEN & THEN
        assertEquals(homeController.allMovies, homeController.observableMovies);
    }
    @Test
    void checks_if_all_movies_exist(){
        homeController.allMovies.clear();
        Movie.initializeMovies();
        assertEquals(15, homeController.allMovies.size());
    }

}