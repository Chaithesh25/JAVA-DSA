class calculate{

    int arrcal(int arr[]){
        int sum = 0;
        for(int ele : arr){
           sum = sum + ele;
        }

        return sum;
    }

    void largest(int arr[]){

        int temp=0;
        for(int i = 0; i < arr.length-1 ; i++){
          
            if(arr[i+1] > arr[i]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            
        }

        
       System.out.println("largest number is : "+arr[0]);
       System.out.println(arr.length);
    }
}

public class arrayprob {

    public static void main(String[]args){

        int ages[] = {1,5,3,4,2};

        calculate obj = new calculate();
        // int result =  obj.largest(ages);
        
        obj.largest(ages);
        
        // System.out.println(result);

    }
    
}
