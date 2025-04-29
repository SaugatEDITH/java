// Encapsulation
// Create a class Employee with private field salary. Provide public methods setSalary() and getSalary() to access it.
class Employee{
    private int salary;
    public void setSalary(int cash){
        salary=cash;
    }
    public void getSalary(){
        System.out.println("The salary is: "+salary);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setSalary(500000);
        e.getSalary();
    }
}
