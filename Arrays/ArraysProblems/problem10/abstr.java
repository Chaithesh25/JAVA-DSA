package ArraysProblems.problem10;
import java.util.Scanner;
abstract class shape{

    abstract double Area();

}

class circle extends shape{
    byte rad;

    circle(byte rad){
        this.rad = rad;
    }
    double Area(){
        return (Math.PI*rad*rad);
    }
}

class rectangle extends shape{
    
    byte len , br;

    rectangle(byte len, byte br ){
         this.len = len;
         this.br = br;
         
    }

    double Area(){
        return len*br;
    }
}

public class abstr {
     public static void main(String[] args) {
        byte radius ,l,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for radius: ");
        radius = sc.nextByte();

        shape obj = new circle(radius);
        double r1 = obj.Area();
        System.out.println("area of the circle: "+r1);
        
        System.out.println("enter value for lenght and breadth: ");
        l = sc.nextByte();
        b = sc.nextByte();
        shape obj2 = new rectangle(l, b);
        double r2 = obj2.Area();
        System.out.println("area of the rectangle: "+r2);




        sc.close();

     }
    
}
