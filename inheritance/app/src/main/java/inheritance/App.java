package inheritance;

import inheritance.RestaurantReview.*;

public class App {
    public static void main(String[]args){
        restaurants();
        System.out.println("");
        shop();
        System.out.println("");
        theaters();
    }
    public static void theaters(){
        Theaters theater = new Theaters("Black Cinema",5);
        Review moviesReview = new Review("This is so good movie","Khaled",4);
        moviesReview.setMovieName("spider-man");
        theater.addReviews(moviesReview);

        theater.addMovie("Spider-man");
        theater.addMovie("Batman");

        System.out.println(theater);

    }

    public static void shop(){
        Shops shop = new Shops("suh shop",3,"selling goods", "$");

        Review shopReview = new Review("good", "Ahmad",4);
        shopReview.UpdateStars(shopReview,shop);
        shop.addReviews(shopReview);

        System.out.println(shop);

    }

    public static void restaurants(){
        Restaurant restaurant = new Restaurant("Pro Restaurant" , 4);

        restaurant.addCategory("Pizza",4);
        restaurant.addCategory("Borgir",5.25);

        Review restaurantReview = new Review("amazing","suhib" ,2);
        restaurantReview.UpdateStars(restaurantReview,restaurant);
        restaurant.addReviews(restaurantReview);

        Review restaurantReview2 = new Review("good","Mohammad",3);
        restaurantReview2.UpdateStars(restaurantReview2,restaurant);
        restaurant.addReviews(restaurantReview2);

        System.out.println(restaurant);

    }
}
