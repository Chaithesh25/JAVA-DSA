package ArraysProblems.problem5;

import java.util.ArrayList;

class Cal{
    
    int ele,Arr[];
    Cal(int ele, int Arr[]){
          this.ele = ele;
          this.Arr = Arr.clone();
    }


    ArrayList<Integer> FindOccurence(){
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0 ; i< Arr.length; i++){
            if(ele == Arr[i])
            {
                count.add(1);
            }
        }
        return count;
    }
}

public class countocc {
    public static void main(String [] args){

        int[] arr = {12,34,54,32,12,34,34};
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Cal objx = new Cal(x,arr);
        Cal objy = new Cal(y,arr);


        
        ArrayList<Integer> result = objx.FindOccurence();
        ArrayList<Integer> result2 = objx.FindOccurence();

        // System.out.println(x+ " appeared "+obj.FindOccurence()+ " in the array");
        System.out.println(x+" occured "+result.size()+ " times in the array");
        System.out.println(y+" occured "+result2.size()+ " times in the array");


    }
}
