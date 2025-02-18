class Loops{
    public static void main(String[] args){
//        for loop
        for(int i=0;i<5;i++){
            System.out.println("GoodBye world from for");
        }
//        while loop
        int i=0;
        while(i<5){
            System.out.println("GoodBye world from while");
            i++;
        }

//        do while loop
        int j=0;
        do{
            System.out.println("Hello world from Do While");
            j++;
        }while (j<10);

        for (int k=0;k<20;k++){
//        break statement

            if(k==10){
                break;
            }
//        continue statement

            if(k%2==0){
                continue;
            }

            System.out.println(k);
        }
//        for each loop for iterables
        String[] fruits={"mango","Orange","Tomato","Grapes"};
        String[] names=new String[]{"hari","Saym","geeta"};
//        JAVA version of foreach
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        for(String name: names){
            System.out.println("The name is "+name);
        }
    }
}