package Strings;

public class prob1 {
    
    public static void main(String [] args){
        String sb = "hello ";

        StringBuilder s1 = new StringBuilder("hello world");


        //  if(s1.indexOf("world") != -1){
        //  }

        // System.out.println(s1.indexOf("well"));


        // System.out.println(sb.charAt(2));
        // System.out.println(sb.toUpperCase());
        // System.out.println(sb.contains());

        int result = s1.indexOf("wor");
        System.out.println(result);
        if(s1.indexOf("wor") != -1){
            System.out.print("sub string found:"+result);
        }




    }
}
