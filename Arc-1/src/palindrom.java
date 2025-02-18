import java.util.Scanner;

class palindrom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String text=sc.nextLine();
        String next="";
        for(int i=0;i<text.length();i++){
//            System.out.println(text.charAt(i));
            next+=text.charAt((text.length()-1)-i);
        }
//        System.out.println(next);
        if (text.equals(next)){
            System.out.println("Its palindrome");
        }else{
            System.out.println("! palindrome");
        }
    }
}