import java.net.URL;

public class Protocol_Support_10 {
    public static void main(String[] args) {
        try {
            String [] protocals={"http","https","ftp","mailto","file"};

            for (String protocal:protocals) {
                URL url = new URL(protocal, "www.google.com", "/");
                System.out.println(url);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
