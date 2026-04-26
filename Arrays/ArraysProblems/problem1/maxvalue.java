package ArraysProblems.problem1;


public class maxvalue {

    public static void main(String [] args){
        int[] arr = {1,5,3,9};

        int maxValue = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        System.out.println("max value is : "+maxValue);

    }
    
}
