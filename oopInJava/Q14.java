// Using this Keyword
// Create a class Book with title field. Initialize title using a constructor that uses this keyword. Display the book’s title.
class Book{
    String title;
    Book(String title){
        this.title=title;
    }
    public void showTitle(){
        System.out.println("The title is"+title);
    }
}
public class Q14 {
    public static void main(String[] args) {
        Book b=new Book("Harry Potter");
        b.showTitle();
    }
}
