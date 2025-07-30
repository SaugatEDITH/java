import java.io.*;
import java.net.*;
public class CompairDomain_5 {
    public static void main(String[] args) {
        try{
            URL url1=new URL("https://www.ibiblo.org");
            System.out.println(url1);
            URL url2=new URL("https://www.helios.ibiblo.org");
            System.out.println(url2);
            if(url2.equals(url1)){
                System.out.println("they are same");
            }else{
                System.out.println("they are different");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

