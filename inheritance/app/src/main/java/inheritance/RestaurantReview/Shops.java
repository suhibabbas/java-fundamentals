package inheritance.RestaurantReview;

public class Shops extends Company {
    public String description;
    public Shops(String name, int star,String description) {
        super(name, star);
        this.description = description;
    }
}
