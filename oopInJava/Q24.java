// Nested and Inner Classes
// Create a class University that has a static nested class Department with a method departmentInfo().


class University{
    static class Department{
        public void departmentInfo(){
            System.out.println("Its Department all right!");
        }
    }
}
public class Q24 {
    public static void main(String[] args) {
        University.Department d=new University.Department();
        d.departmentInfo();
    }
}
