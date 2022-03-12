package inheritance.RestaurantReview;

import inheritance.RestaurantReview.Catagorys.Stars;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    private final String name;
    private int star;
    private List<Review> reviews =new ArrayList<>();

    public Company(String name, int star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void addReviews(Review review){
        reviews.add(review);
    }

    public List<Review> getReviews() {

        return reviews;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", star=" + star +'\''+
                ", review" + getReviews()+
                '}';
    }


}
