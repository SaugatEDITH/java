/*Student Grade Calculator
Create a Java program that takes input for marks in 5 subjects, 
calculates the total, average, and percentage, and assigns a grade based on the percentage using control statements.
 Use appropriate data types and expressions.
 Handle input through command-line or user input.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks =new int[5];
        String [] subjects={"Math","Science","Social","English","geology"};
        double total=0,average,percentage;
        int noOfSubjects=marks.length;
        for (int i=0;i<noOfSubjects;i++){
            System.out.println("Enter the mark of :"+subjects[i]);
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        DecimalFormat df=new DecimalFormat("#.##");
        average = total / noOfSubjects; // Average marks per subject
        percentage = (total / (noOfSubjects * 100)) * 100; // Percentage of total marks
        System.out.println("Total Marks: " + df.format(total));
        System.out.println("Average Marks: " + df.format(average)); // Clarify as average marks
        System.out.println("Percentage: " + df.format(percentage) + "%"); // Clarify as percentage
       if(percentage>=90){
        System.out.println("A+");
       }else if(percentage>=80 && percentage<=89){
        System.out.println("A");
       }else if(percentage>=70 && percentage<=79){
        System.out.println("B+");
       }else if(percentage>=60 && percentage <=69){
        System.out.println("B");
       }else if(percentage>=50 && percentage<=59){
        System.out.println("C+");
       }else if (percentage >=40 && percentage<=49) {
        System.out.println("C");
       }else if(percentage>=30 && percentage<=39){
        System.out.println("D");
       }else{
        System.out.println("NG");
       }
    }
}
