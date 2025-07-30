package JavaBean;
import java.io.*;
public class normalProperty implements Serializable{
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        normalProperty np=new normalProperty();
        np.setAge(12);
        System.out.println(np.getAge());
    }
}
