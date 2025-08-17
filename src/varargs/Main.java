package varargs;

public class Main {

     public static void main(String[] args) {

        //varargs = allows a method to accept a varying # of arguments
         //makes more flexible , no need for overloaded methods
         //working java will pack the arguments into an array; ...(ellipsis)

         System.out.println(avg(1,2,3,4,5));

    }
    static double avg(double ...numbers){
         double sum = 0;

         if(numbers.length == 0){
             return 0;
         }

         for(double number: numbers){
             sum+=number;
         }
         return sum / numbers.length;
    }
}
