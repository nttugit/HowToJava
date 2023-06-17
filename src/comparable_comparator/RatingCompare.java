package comparable_comparator;

import java.util.Comparator;

// Class to compare Movies by ratings
public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {

        if(o1.getRating() - o2.getRating() < 0){
            return -1;
        }else if(o1.getRating() > o2.getRating()){
            return 1;
        }else{
            return 0;
        }
    }
}
