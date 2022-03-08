package inheritance.RestaurantReview;

import inheritance.RestaurantReview.Catagorys.Stars;

public class Review implements Stars {
    private final String body;
    private final String author;
    private int stars;

    public Review(String body, String author,int stars) {
        this.body = body;
        this.author = author;
        this.stars =stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public void UpdateStars(Review review, Company company) {

        company.setStar((review.getStars()+company.getStar())/2);
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
