

public class ControlStatement {
public static int numbering(){
        return 55;
}
 public static void main(String[] args) {
    ////! Branching statement
    int num=55;
    //if else statement
    if(num%2==0){
        System.out.println("Its even");
    }else{
        System.out.println("its odd");
    }

//if else if else statement
    if(num<=100){
        System.out.println("its less then 100");
    }
    else if(num>50){
        System.out.println("its grater then 50");
    }else if(num<60){
System.out.println("Its less then 60");
    }else{
        System.out.println("Something wrong");
    }

//switch statement
int day=5;
switch (day) {
    case 1:
        System.out.println("It's Sunday");
        break;
    case 2:
        System.out.println("It's Monday");
        break;
    case 3:
        System.out.println("It's Tuesday");
        break;
    case 4:
        System.out.println("It's Wednesday");
        break;
    case 5:
        System.out.println("It's Thursday");
        break;
    case 6:
        System.out.println("It's Friday");
        break;
    case 7:
        System.out.println("It's Saturday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
////! Looping statement
///for loop
for(int i=0;i<6;i++){
    System.out.println("Hello");
}
///while loop
int i=10;
while(i>0){
    i--;
    System.out.println("Hello");
}
int number=10;
///do while (run once even its false)
do{
if (number==8){
    // continue;
    break;
}
System.out.println("Hello world");
number--;
}while(number>5);


System.out.println(numbering());
} 


}
