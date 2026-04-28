package ArraysProblems.problem3;
import java.util.Scanner;

public class input {

       public static void main(String[]args){
        int i,j;
        int arr[][] = new int[4][4];


       Scanner sc = new Scanner(System.in);


       System.out.println("enter the array elements");
       for(i = 0 ; i < arr.length; i++){
           
           for(j =  0 ; j < arr[i].length ; j++)
           {
            arr[i][j] = sc.nextInt();
           }
       }

        

        for(i = 0 ; i < arr.length; i++){

            for(j = 0 ; j < arr[i].length; j++){

                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


       }
    
}
