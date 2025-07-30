import java.io.*;
import java.net.*;
import java.util.List;

public class Add_Read_Delete_Cookies_15 {
    public static void main(String[] args) {
        try {
            CookieManager manager=new CookieManager();
            CookieHandler.setDefault(manager);
            CookieStore store=manager.getCookieStore();
            URI uri=new URI("http://www.example.com");
            //cookie added
            HttpCookie cookie=new HttpCookie("username","hari");
            store.add(uri,cookie);

            System.out.println("Cookie Added: "+cookie);
            //cookie fetch and read
            List<HttpCookie> cookies=(store.get(uri));
            System.out.println("cookies for "+uri+": ");
            for(HttpCookie c:cookies) {
                System.out.println(c);
            }
            //remove cookie
            store.remove(uri,cookie);
            System.out.println("Coolie removed "+cookie);


        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

