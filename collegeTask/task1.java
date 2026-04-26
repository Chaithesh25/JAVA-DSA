package collegeTask;
class Student{
    String s;
    byte marks[];
    Student(String s,byte marks[]){
        this.s = s;
        for(int i = 0 ; i <= marks[i];i++){
            
            this.marks[i] = marks[i];
        }
    }

    int total(){
        int sum =0;
        for(int i = 0; i < marks.length ; i++){
          sum = sum + marks[i];
        }
        return sum;
    }

    // char grade(){
    //     boolean pass = true;
    //     for(byte m : marks){
    //         if( m <= 50)
    //             pass = false;
    //     }
    //     if(pass){

            
    //     }
    // }


    void display(){
        System.out.println(s);
        
        System.out.println(marks);
        System.out.println(total());
    }
}
class task1{ 
    
    public static void main(String [] args){
        String name = "chaithesh";
        byte score[][] = {90,45,90,56,45,67};

        Student[] stud = new Student[score.length];

        for(int i = 0; i < score.length;i++){
            stud[i] =  new Student(name, score);
        }

        for(Student s: stud){
            s.display();
        }

    }
   
}