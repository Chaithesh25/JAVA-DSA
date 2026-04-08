package factorial;

public class Facto {

    public static void main(String[]args){
        int N = 5,sum = 1;

        for(int i = 1 ; i <= N ; i++){
            sum = sum * i;
        }
         
        System.out.print("!"+N+" =");
        for(int i = N ; i > 0 ; i--){

            if(i == 1){
                System.out.println("!"+i+" = "+sum);
            }else{

                System.out.print("!"+i+"*");
            }

        }
        // System.out.println("factorial of "+N+" is : "+sum);


    }
    
}
