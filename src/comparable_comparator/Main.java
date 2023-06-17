package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

// ref: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // The sort() method invokes the compare() to sort objects.
        // sort by year (sort default by CompareTo method)
        Collections.sort(list);
        System.out.println("Movies after sorting by year : ");
        for (Movie movie : list) {
            System.out.println(movie);
        }

        // Collections class has a second sort() method and it takes Comparator.
        // sort by ratings
        Collections.sort(list, new RatingCompare());
        System.out.println("\nMovies after sorting by rating : ");
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }
}
