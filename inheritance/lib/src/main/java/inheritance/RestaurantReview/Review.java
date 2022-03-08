package inheritance.RestaurantReview;

import inheritance.RestaurantReview.Catagorys.Stars;

public class Review implements Stars {
    private final String body;
    private final String author;

    public Review(String body, String author) {
        this.body = body;
        this.author = author;
    }

    @Override
    public void addStars(int stars, Company company) {
        company.setStar((stars+company.getStar())/2);
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
