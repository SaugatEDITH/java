// Single & multi dimensional Array
import java.util.Arrays;
class ArraysClass{
    public static void main(String[] args){
        int[] numbers={9,1,3,5,8};
        int[] numbers2=new int[5];//to assign elements later fixed sized
        String [] name={"ram","saym","hari","geeta","Reeta"};
        //Sorting array
        Arrays.sort(numbers);
        //one way
        System.out.println("Printing array in string representation");
        System.out.println(Arrays.toString(numbers));

        // another way
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i]=numbers[i];
            System.out.println(numbers2[i]);
            System.out.println(name[i]);
        }
        //multi dimensional array
        int[][] count=new int[2][5];
     for(int i=0;i<count.length;i++){
         int innerLen=count[i].length;
         for(int j=0;j<innerLen;j++){
             count[i][j]=i+1;
             System.out.println(count[i][j]);
         }

     }
     // another way for multi dimentional array using deepToString
        System.out.println(Arrays.deepToString(count));
    }
}