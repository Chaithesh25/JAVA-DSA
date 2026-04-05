import java.util.Scanner;

interface Payment{
   public void pay();
}

class UPIPay implements Payment{

   public void pay(){

        System.out.println("processing UPI payment....");
    }
    
}

class CreditCardPay implements Payment{
    public void pay(){
        System.out.println("Processing the Creditcard payment.....");
    }
}

class Paypal implements Payment{
    public void pay(){

        System.out.println("processing the Paypal.....");

    }
}

public class poly{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        String choice  = sc.nextLine();

        
        Payment p =  null;

        switch(choice.toLowerCase()){

            case "upi": p = new UPIPay(); break;
            case "creditcard" : p = new CreditCardPay(); break;
            case "paypal" : p =  new Paypal();break;

            default: System.out.println("Invalid choice...");
        }

        p.pay();



    }
}