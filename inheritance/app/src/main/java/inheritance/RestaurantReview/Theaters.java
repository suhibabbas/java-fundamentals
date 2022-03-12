package inheritance.RestaurantReview;

import java.util.ArrayList;

public class Theaters extends Company{

    private ArrayList<String> movies = new ArrayList<>();

    public Theaters(String name, int star) {
        super(name, star);
    }

    public void addMovie(String movie){
        if(!movies.contains(movie)){
            movies.add(movie);
        }else{
            System.out.println("already here");
        }
    }
    public void removeMovie(String movie){
        if (movies.contains(movie)){
            movies.remove(movie);
        }else{
            System.out.println("Movie not found :)");
        }
    }

    @Override
    public String toString() {
        return "Theaters{" +
                "name='"+ super.getName()+'\''+','+
                "review='"+ super.getReviews()+'\''+','+
                "movies=" + movies +
                '}';
    }
}
