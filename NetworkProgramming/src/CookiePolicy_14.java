import java.net.*;
import java.io.*;

public class CookiePolicy_14 implements CookiePolicy {
    @Override
    public boolean shouldAccept(URI uri,HttpCookie cookie){
        String host=uri.getHost();
        return !(host!=null && host.endsWith(".gov"));
}

public static void main(String[] args) {
CookiePolicy_14 policy=new CookiePolicy_14();
CookieManager manager=new CookieManager(null,policy);
CookieHandler.setDefault(manager);
    System.out.println(".gov cookies are blocked!");
}
}
