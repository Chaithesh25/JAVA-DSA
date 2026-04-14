class ArrayExample{


    void whileloop(){
        int [][] arr =  new int[3][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;


        int i = 0,j = 0;
        while(i < arr.length){

            while (j < arr[i].length) {
                System.out.println(arr[i][j]);
                j++;
            }
            i++;
        }
    }

    void print2Darray(){
        int [][] arr =  new int[3][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;


        for(int i = 0 ; i < arr.length; i++){
         

             for(int j = 0 ; j < arr[i].length; j++)
             {
                System.out.println(arr[i][j]);
             }
        }

        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[1][0]);
        // System.out.println(arr[1][1]);
        // System.out.println(arr[2][0]);
        // System.out.println(arr[2][1]);

        
    }
}



public class multiDime {

    public static void main(String []args){
       ArrayExample obj = new ArrayExample();

       obj.whileloop();
    }
    
}
