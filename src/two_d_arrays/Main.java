package two_d_arrays;

public class Main {
    
     public static void main(String[] args) {

         //2-D arrays are normal arrays with an array as elements

         /*String[] fruits = {"apple", "orange", "banana"};
         String[] vegetables = {"Spinach","Peas","tomato","carrot"};
         String[] breads ={"roti", "naan", "kulcha","paratha"};
         String[][] groceries = {fruits,vegetables,breads}*/
         //Or another way =>

         String[][] groceries = {{"apple", "orange", "banana"}
                 ,{"Spinach","Peas","tomato","carrot"},
                 {"roti", "naan", "kulcha","paratha"}};

         // for changing/accessing and element; row,column
         groceries[0][0]="pineapple";
         groceries[1][2]="Bell-pepper";
         groceries[2][1]="missi-roti";
         
         for(String[] foods :groceries) {
             for (String food : foods) {
                 System.out.print(food + " ");
             }
             System.out.println();
         }
     
    }
}
