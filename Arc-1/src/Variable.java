// variables premetives non premetives & scape sequences
import java.awt.*;
import java.util.Date;

class Variable{
    public static void main(String[] args) {
// primitive type
    int age=30,Temperature=20;
    int viewsCount=123_456_789;
    long viewsCount2=3_123_456_789L;
    float points= 5.5F;
    double points2=5.22;
    char letter='A';
    byte ageb=30;

    boolean canVote=true ;
// reference type have to allocate memory by creating object
        Date now=new Date();
        System.out.println(now);
        //primitive value don't change when another value change later (eg x=1;y=x;x=10 dont change y)
        Point point1=new Point(1,1);
        Point point2=point1;
        point2.x=10;
        /*point 1 x and y share
        same memory location by pointer
        that causes change in
        point2 affecting point1
         */

        System.out.println(point1.x);
        System.out.println(Temperature);
        String name="Hari"+" !";
        // it don't modify original but return new because string are immutable
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('i'));
        System.out.println(name.replace("!","Prasad"));
        System.out.println(name.trim());
        System.out.println(name);

        // Scape sequence
        String message="Hello \"Saugat ";
        System.out.println(message);
        message="c:\\Windows\\user \nhello \t world";
        System.out.println(message);
        //C:\windows\...
    }
}