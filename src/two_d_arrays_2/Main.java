package two_d_arrays_2;

public class Main {

    public static void main(String[] args) {

        // 2-D arrays are arrays with other arrays as elements
        // Telephone keypad layout

        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " "); 
            System.out.println();
        }
    }}
}
