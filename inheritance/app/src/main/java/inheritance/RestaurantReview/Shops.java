package inheritance.RestaurantReview;

import inheritance.RestaurantReview.Catagorys.Category;

import java.util.ArrayList;

public class Shops extends Company {
    private final String description;
    private final String price ;

    public Shops(String name, int star,String description ,String price ) {
        super(name, star);
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "name='" + super.getName()+'\'' +
                ", stars='" + super.getStar()+'\'' +
                ", description='" + description + '\'' +
                ", price='" + price +'\'' +
                ", reviews='" + super.getReviews()+'\'' +
                '}';
    }


}
