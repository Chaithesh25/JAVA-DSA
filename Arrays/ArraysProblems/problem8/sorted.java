package ArraysProblems.problem8;

class Check{
    int[] arr;
    boolean sortedd = true;
    Check(int[] arr){
          this.arr = arr;
    }

    boolean find(){
        // 1,9,7,8,9
        System.out.println("a");
        for(int i = 1; i<arr.length-1; i++){
            if( arr[i] < arr[i-1]){
                sortedd = false;
                break;
            }
            
        }
        return sortedd;
    }

    void display(){
    //     if(!sortedd){
    //         System.out.println("array is not Sorted");
    //     }else{
    //         System.out.println("Array is sorted");
    //     }

       if(!find()){
        System.out.println("Array is not sorted..");
       }else{
        System.out.println("Array is sorted...");
       }
       
       
       

    
    }
}

public class sorted {
    public static void main(String[]args){
        int[] Array = {1,9,7,8,9};

        Check ck = new Check(Array);

        // ck.display();
        ck.find();


    }
}
