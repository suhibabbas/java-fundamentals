package inheritance;

import inheritance.RestaurantReview.Company;
import inheritance.RestaurantReview.Restaurant;
import inheritance.RestaurantReview.Review;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[]args){
        restaurants();
    }

    public static void restaurants(){

        Company restaurant = new Restaurant("Borgir" , 4);

        Restaurant restaurantCasted =(Restaurant) restaurant;
        restaurantCasted.addCategory("Pizza",4);

        for (String item:restaurantCasted.getCategory()
        ) {
            System.out.println(item);
        }
        List<Review> reviews= new ArrayList<>();
        Review restaurantReview1 = new Review("amazing","suhib");
        restaurantReview1.addStars(2,restaurant);
        reviews.add(restaurantReview1);

        Review restaurantReview2 = new Review("bad","Mohammad");
        restaurantReview2.addStars(1,restaurant);
        reviews.add(restaurantReview2);

        Review restaurantReview3 = new Review("very good","Mohammad");
        restaurantReview3.addStars(5,restaurant);
        reviews.add(restaurantReview3);

        Review restaurantReview4 = new Review("good","Mohammad");
        restaurantReview4.addStars(4,restaurant);
        reviews.add(restaurantReview4);

        for (Review r:reviews
        ) {
            restaurant.addReviews(r);
        }

        for (Review r:restaurant.getReviews()
        ) {
            System.out.println(r);
        }

        System.out.println(restaurant.toString());

    }
}
