import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //to take user input
        Scanner sc=new Scanner(System.in);
        //when value is already known
        String [] apple={"apple1","apple2","apple3"};
        apple[2]="girraf";
        for(int i=0;i<apple.length;i++){
            System.out.println(apple[i]);
        }
        //when value is currently unknown 
        String[] names=new String[10];
        for(int i=0;i<10;i++){
        names[i]=sc.next();
        }   

        for(String element:names){
            System.out.println(element);
        }
        // int [] numbers={}
        // int [] numbers=new int[sc.nextInt()]

    }
}
