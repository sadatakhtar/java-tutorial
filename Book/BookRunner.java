package Book;

public class BookRunner {
   public static void main(String[] args) {
    Book book = new Book(100, "Jack and the beanstalk", "Raul Dahl");
    book.addReview(new Review(10, "Great Book", 4));
    book.addReview(new Review(11, "Nice Book", 3));

    System.out.println(book);
   }
    
}
