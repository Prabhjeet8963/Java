package arithmetic_operator;

public class Main {
     public static void main(String[] args){

         // Airthematic operators

         int x=10;
         int y= 3;
         int z;

         //z=x+y;
         //z=x-y;
         //z=x*y;
         z=x/y;
         //z=x%y;

         System.out.println(z);

         //Augmented Assignment operators

         //x += y;  i.e x = x + y;
         //x -= y;
         //x *= y;
         //x /= y;  //if we use double we get decimal portion!
         //x %=y;

         // Increment and decrement operators
          x ++;
          x--;

          //Order Of Operators {P-E-M-D-A-S}

         double result = 3 + 4 * (7 - 5) / 2.0 ;
         

         System.out.println(result);
         System.out.println(x);

     }
}
