// A Simple Class
// Create a class Movie with title and rating fields. Write a method show() to display them. Then create 2 instances.
class Movie{
    String title;
    int rating;
    public void setValue(String title,int rating){
        this.title=title;
        this.rating=rating;
    }
    public void show(){
        System.out.println("The title of movie is : "+title+" and the rating of movie is: "+rating);
    }

}
public class Q8 {
    public static void main(String[] args) {
        Movie m=new Movie();
        m.setValue("Avengers Endgame", 8);
        m.show();
        Movie m2=new Movie();
        m2.setValue("Avatar", 9);
        m2.show();
    }
}
