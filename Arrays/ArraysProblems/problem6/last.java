package ArraysProblems.problem6;

import java.util.ArrayList;

class Occurencce{
     int ele;
     int[] collection;
    Occurencce(int[] collection,int ele){
          this.ele = ele;
          this.collection = collection;
    }

    ArrayList<Integer> countOcc(){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < collection.length;i++){


            if(collection[i] == ele){

        
                temp.add(i);
            }
        }
       return temp;
    }


    int method2(){
        int temp = -1;

        for(int i = 0 ; i < collection.length ; i++){
            if(collection[i] == ele){
                temp = i;
            }
        }
        return temp;
    }
}

public class last {
    public static void main(String[]args){
        
        int[] arr = {5,3,2,5,2,3,5};
        int x = Integer.parseInt(args[0]);
        Occurencce oc = new Occurencce(arr,x);


        ArrayList<Integer> result = oc.countOcc();
        int result2 = oc.method2();
    
    //    System.out.println(result.get(result.size()-1));
       
       if(result2 != -1){
           
           System.out.println("Result 2: "+result2);
        }else{
            System.out.println("element not found in the array");
        }
            // System.out.println("last occurence of "+x+" is at position "+result[result.length-1]);
        

    }   
}
