
public class ExpressionAndOperator {
 public static void main(String[] args) {
    //Arithmetic: +, -, *, /, %

    int num=5;
    num=num+3;
    num-=3;
    num++;
    num++;
    ++num;
    System.out.println(num--);
    //Bitwise: &, |, ^, ~, <<, >>
    //Relational: ==, !=, >, <, >=, <=
    //Logical: &&, ||, !
    //Assignment: =, +=, -=, *=, /=
    System.out.println(1<<1);
    //ternary operator (condition)?"true":false
    int number=(5>1)?4:3;
    System.out.println(number);
 }   
}
