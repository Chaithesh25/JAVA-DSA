import java.util.Scanner;

class calAdvance{

    public void add(int a , int b){
        int sum  =  a + b ;
        System.out.println("sum of"+a+"+"+b+"="+sum);
    }
}

class cal extends calAdvance{

    public void addt(int num1 , int num2 ){
        int result  =  num1 + num2 +1;
        System.out.println("sum of "+num1+"+"+num2+"="+result);
    }
}

public class single{

    public static void main(String[]args){

        cal obj = new cal();
        // calAdvance obj2 =  new calAdvance();
        
        

        obj.add(20,30);
        obj.add(20,40);
        


    }
}
