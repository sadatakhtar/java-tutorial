package Book;

public class Review {
    private int id;
    private String description;
    private int rating;

    public Review(int id, String description, int rating){
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    //toString
    public String toString(){
        return String.format("Id - [%d], description - [%s], rating - [%d]", id, description, rating);
    }
    
}
