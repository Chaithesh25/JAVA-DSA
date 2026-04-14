package StringArgs;

public class arguments {

    public static void main(String [] args){
        System.out.println(args[0]);
        System.out.println("Type of args[1] is: " + args[1].getClass());
        System.out.println(args[1]);
        System.out.println(args[2]);

        Integer n = 10;
        System.out.println(n.getClass());
    }
    
}
