import java.util.Scanner;

class calculator{

    int res,a,b;

    // calculator(int a , int b){
    //     this.a = a;
    //     this.b = b;
    // }

    void SetValues(int num1 , int num2)
     {
        this.a = num1;
        this.b = num2;
     }
     
    public int add(){

        res = a + b;
        return res;

    }

    public int subtract(){

        res = a - b ;
        return res;

    }

    public int mul(){

        res = a * b;
        return res;

    }


}

public class doodle{
    public static void main(String []args){

        calculator obj = new calculator();
        int sum = 0,count=0;
        // 1 2 3 4 5 6 7 8 9 10
        for(int i  = 2 ; i <= 10; i+=2){

            obj.SetValues(sum,i);
           sum =  obj.add();
           count++;
            // System.out.println(i);


        

        }
         
        float avg = sum/count;
        System.out.println(avg);


    }
}