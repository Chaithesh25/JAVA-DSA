package ArraysProblems.problem2;

import java.util.ArrayList;

class SearchElement{
    
    int ele,arr[][];
   
    SearchElement(int ele, int arr[][]){
        this.ele = ele;
        this.arr = arr;
    }

    ArrayList<Integer> find(){
        ArrayList<Integer> positions = new ArrayList<>();
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++)
            {
                if(arr[i][j] == ele){
                   positions.add(j);

                }
            }
        }
        return positions;
    }
}

public class SearchEle {

    public static void main(String[] args){
        
        int[][] arr = {{1,4,3,6},
                       {3,7,9,5},
                       {4,3,6,2}
                      };
        int element = Integer.parseInt(args[0]);
        SearchElement se = new SearchElement(element,arr);

        ArrayList<Integer> result = se.find();

        
        if(result.isEmpty()){
            System.out.println("Element not found");

        }else{
            String suffix;
            for(int i = 0 ; i < result.size(); i++)
                {
                   if((i+1) == 1)
                      suffix = "st";
                   else if((i+1) == 2)
                      suffix = "nd";
                   else if((i+1)== 3)
                      suffix = "rd";
                   else
                      suffix = "th";
                     
                    System.out.println("Given element found "+(i+1)+suffix+ " row at location : "+result.get(i));
                }
            
        }

    }
    
}
