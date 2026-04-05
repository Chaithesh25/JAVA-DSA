import java.util.Scanner;

class A{
     void display1(){
        System.out.println("class A ....");
     }
}

class B extends A{
         void display2(){
        System.out.println("class B....");
     }
}

class C extends B{
           void display3(){
        System.out.println("class C....");
     }
}

public class demo{
    public static void main(String[]args){

        C obj = new C();
        obj.display1();
        obj.display2();
        obj.display3();



    }
}