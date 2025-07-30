package JavaBean;
import java.io.*;
public class BoleanProperty implements Serializable{
    private boolean pass;
    public void setPass(boolean pass){
        this.pass=pass;
    }
    public boolean isPassed(){
        return pass;
    }

    public static void main(String[] args) {
        BoleanProperty bo=new BoleanProperty();
        bo.setPass(false);
        System.out.println(bo.isPassed());
    }
}
