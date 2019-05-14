package park;

public abstract class Atraction implements IReviewed {
    private String name;
    private int rating;

    public Atraction(String name) {
        this.name = name;
        this.rating = 0;
    }

    @Override
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
