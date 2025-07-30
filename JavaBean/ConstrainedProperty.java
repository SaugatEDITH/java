package JavaBean;
import java.io.*;
import java.beans.*;
public class ConstrainedProperty implements Serializable {
    private String name;
    private VetoableChangeSupport vc=new VetoableChangeSupport(this);
    public void setName(String name) throws PropertyVetoException {
        String old=this.name;
        vc.fireVetoableChange("name",old,name);
        this.name=name;
    }
    public String getName(){return name;}
    public void addVotoableChangeListiner(VetoableChangeListener support){
        vc.addVetoableChangeListener(support);
    }

    public static void main(String[] args) throws PropertyVetoException {
        ConstrainedProperty cp=new ConstrainedProperty();
        cp.setName("Hari");
        System.out.println(cp.getName());
    }
}
