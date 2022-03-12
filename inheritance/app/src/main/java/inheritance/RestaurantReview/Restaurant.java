package inheritance.RestaurantReview;

import inheritance.RestaurantReview.Catagorys.Category;

import java.util.ArrayList;

public class Restaurant extends Company implements Category {

    ArrayList<String> category = new ArrayList<>();

    public Restaurant(String name, int star) {
        super(name, star);
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    @Override
    public void addCategory(String dish, double price) {

        this.category.add(dish +" "+price+"$");
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + super.getName()+'\'' +
                ", stars='" + super.getStar()+'\'' +
                ", reviews='" + super.getReviews()+'\'' +
                ", category=" + category +
                '}';
    }
}
