package JavaBean;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
public class BoundProperty implements Serializable {
    private String name;
    private PropertyChangeSupport pc=new PropertyChangeSupport(this);
    public void setName(String name){
        String old=this.name;
        this.name=name;
        pc.firePropertyChange("name",old,name);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        pc.addPropertyChangeListener(listener);
    }
    public static void main(String[] args) {

    }
}
