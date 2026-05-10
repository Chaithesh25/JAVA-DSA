package ArraysProblems.problem9;

import java.util.ArrayList;

class superClass{
    int[] data;
    superClass(int[] data){
       this.data = data.clone();
    }

    int[] sorttArray(){
        int temp = 0;
        // 4,2,5,2,6,7
        for(int i=0;i<data.length;i++){

            for(int j = i+1 ; j < data.length;j++){

                if(data[i] > data[j]){
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;

               }
            }
        }
        return data;
    }


    ArrayList<Integer> collectMINMax(){
        ArrayList<Integer> box = new ArrayList<>();
        
        sorttArray();
        box.add(data[0]);
        box.add(data[data.length-1]);
       
        return box;
    }

}

public class doodle {

    public static void main(String[] args) {
        int[] arr = { 4,2,5,2,6,7};
         
    superClass sp = new superClass(arr);
    
    ArrayList<Integer> result = sp.collectMINMax();

    System.out.println(result);
    }

}
