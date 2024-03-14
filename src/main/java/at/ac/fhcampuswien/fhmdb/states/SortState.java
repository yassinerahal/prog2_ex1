package at.ac.fhcampuswien.fhmdb.states;

import at.ac.fhcampuswien.fhmdb.contoller.HomeController;
import at.ac.fhcampuswien.fhmdb.models.Movie;

import java.util.Comparator;

public abstract class SortState {

    protected HomeController homeController;
    private at.ac.fhcampuswien.fhmdb.models.sortedState sortedState;

    public SortState(HomeController homeController){
        this.homeController = homeController;
    }
    // Sort according to current SortState
    public void sortMovies() {
        if (sortedState == at.ac.fhcampuswien.fhmdb.models.sortedState.NONE || sortedState == at.ac.fhcampuswien.fhmdb.models.sortedState.DESCENDING) {
            homeController.observableMovies.sort(Comparator.comparing(Movie::getTitle));
            sortedState = at.ac.fhcampuswien.fhmdb.models.sortedState.ASCENDING;
        } else if (sortedState == at.ac.fhcampuswien.fhmdb.models.sortedState.ASCENDING) {
            homeController.observableMovies.sort(Comparator.comparing(Movie::getTitle).reversed());
            sortedState = at.ac.fhcampuswien.fhmdb.models.sortedState.DESCENDING;
        }
    }
}
