import java.util.Scanner;
class MainBranch{

    void display1(){
        System.out.println("Main branch");
    
}
}
class skoda extends MainBranch{

    void display2(){
        System.out.println("Skoda.....");
    }

}

class volkswagen extends MainBranch{

    void display3(){
        System.out.println("Volkswagen....");
    }


}


public class multi {

    public static void main(String[]args){

       volkswagen obj = new volkswagen();

        obj.display1();
   

    }
}