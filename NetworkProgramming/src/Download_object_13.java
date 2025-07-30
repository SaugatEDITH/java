import java.io.FileOutputStream;
import java.io.*;
import java.net.*;

public class Download_object_13 {
    public static void main(String[] args) {
        try{
            InputStream in=new URL("https://media.geeksforgeeks.org/wp-content/uploads/20240419170238/Client-Server-Model.webp").openStream();
            FileOutputStream fos=new FileOutputStream("download.webp");
            int bytes;
            byte [] buffer=new byte[4096];
            while ((bytes=in.read(buffer))!=-1){
                fos.write(buffer,0,bytes);
            }
            System.out.println("image downloaded");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
