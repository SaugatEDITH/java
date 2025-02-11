//Constant,Data type , operators, typecasting
class Expressions{
    public static void main(String[] args) {
       //Constant
        final float PI=3.14F;
        System.out.println(PI);
        // Arithmetic operator
        int result=10+30;
        System.out.println(result);

       result=10-30;
        System.out.println(result);
       result=10*30;
        System.out.println(result);
        double resultDuble=(double) 10/(double) 30;
        System.out.println(resultDuble);
        int x=1;
        System.out.println(x);
        System.out.println(x++);// 1 cause post increment
        System.out.println(x);
        System.out.println(++x);//3 cause of pre increment
        x=x+2;
        System.out.println(x);
        x-=2;
        System.out.println(x);
//        order of operator (bodmas) use to avoid that
//        Type casting
        short xs=1;// 2byte
       // implicit type casting
        int y=xs+2; // 4 byte
        System.out.println(y);
        double xd=1.1;
        double yd=xd+2;
        System.out.println(yd);
        //explicit type casting
        int xi=(int)xd+2;
        System.out.println(xi);
//        converting string representation of no to int
        String si="1";
        int ii=Integer.parseInt(si);
        System.out.println(ii);
//        Double.parseDouble()
//        Short.parseShort()
//         etc ....
    }
}