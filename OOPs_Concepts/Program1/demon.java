import java.util.Scanner;



public class demon{

    public static int AddNum(int A , int B){
    
    int X , Y ;

    X = A;
    Y = B;

    int Result = X + B;
    System.out.println(Result);
    return 0;

}

    public static void main(String []args){

    Scanner sc =  new Scanner(System.in);

    System.out.println("Enter value for Num1 and Num2: ");

    int num1  = sc.nextInt();

    int num2  = sc.nextInt();

    AddNum(num1 , num2);
    // System.out.println(Sum);
    }
}