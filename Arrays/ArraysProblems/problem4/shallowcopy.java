package ArraysProblems.problem4;

import java.util.Arrays;

class printArray{
    int arr[] =  new int[5];

    int copy[] = {0,0,0,0,0};


     printArray(int arr[]){
         this.arr = Arrays.copyOfRange(arr,1,arr.length);
         
    }


    void printA(){
        
        
        // arr[0] = 61;
        // arr[1] = 68;
        // arr[2] = 90;
        // arr[3] = 80;


        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}

public class shallowcopy {
    
     public static void main(String[] args){

        int arr[] = {3,5,6,3,6};

        printArray pr = new printArray(arr);
        
        System.out.println("copy array  :");
        pr.printA();
        System.out.println(" ");




        System.out.println("orginal array: ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        
       


     }
}
