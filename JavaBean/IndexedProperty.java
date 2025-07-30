package JavaBean;
import java.io.*;
public class IndexedProperty implements Serializable{
private String [] names=new String[10];
public void setName(String [] names){
    this.names=names;
}
public void setName(int index,String name){
    this.names[index]=name;
}

public String[] getNames(){
    return names;
}
public String getNames(int index){
    return names[index];
}
    public static void main(String[] args) {
        IndexedProperty ip=new IndexedProperty();
        ip.setName(new String[]{"Hari","Saym"});
        System.out.println(ip.getNames(0));
    }
}
