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

        Restaurant restaurant = new Restaurant("Pro Restaurant" , 4);


        restaurant.addCategory("Pizza",4);
        restaurant.addCategory("Borgir",5.25);

        for (String item:restaurant.getCategory()
        ) {
            System.out.println(item);
        }
        List<Review> reviews= new ArrayList<>();
        Review restaurantReview1 = new Review("amazing","suhib" ,2);
        restaurantReview1.UpdateStars(restaurantReview1,restaurant);
        reviews.add(restaurantReview1);

        Review restaurantReview2 = new Review("bad","Mohammad",1);
        restaurantReview2.UpdateStars(restaurantReview2,restaurant);
        reviews.add(restaurantReview2);

        Review restaurantReview3 = new Review("very good","Mohammad",5);
        restaurantReview3.UpdateStars(restaurantReview3,restaurant);
        reviews.add(restaurantReview3);

        Review restaurantReview4 = new Review("good","Mohammad",4);
        restaurantReview4.UpdateStars(restaurantReview4,restaurant);
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
