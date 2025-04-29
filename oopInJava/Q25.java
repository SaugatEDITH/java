// Create a class Library with an inner class Book. The Book class should have a method showDetails().
class Library{
    class Book{
        public void showDetail(){
            System.out.println("Showing Detail!");
        }
    }
}
public class Q25 {
    public static void main(String[] args) {
        Library L = new Library();
        Library.Book B = L.new Book();
        B.showDetail();
    }
}
