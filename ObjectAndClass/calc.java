import java.util.Scanner;

class Car{

    String name;
    String color;

    // Car(String Name , String color){
    //     this.Name = Name;
    //     this.color = color;
    // }

    public void DisplayCarDetails(){
        System.out.println("Name of the Car is :"+name);
        System.out.println("color is : "+color);
    }

    Car(Car obj2){
        this.name = obj2.name;
        this .color = obj2.color;
    }

    Car(){

    }

   
}



public class calc {
    public static void main(String []args){
       
       Car obj1 = new Car();
       

       obj1.name = "toyota";
       obj1.color = "Black";

       Car obj2 =  new Car(obj1);


    //    obj1.DisplayCarDetails();
       obj2.DisplayCarDetails();
    }
}