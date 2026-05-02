package ArraysProblems.problem7;

class operation{
    int[] A;
    Byte Val;

    operation(int[] A, byte Val){
         this.A = A;
         this.Val = Val;
    }


    byte count(){
        byte c = 0;
        for(int e : A){
            if( e > Val){
                c++;
            }
        }
        return c;
    }

    void Display(){
        System.out.println("number which Strictly greater than "+Val+" are: "+count());
    }
}

public class Strict {
    public static void main(String[]args){
      int[] arr = {12,5,7,3,8,9,4};
      byte Value = Byte.parseByte(args[0]);

      operation obj  =  new operation(arr,Value);
      obj.Display();
    }
}
