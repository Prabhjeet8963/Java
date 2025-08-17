package Aggregation;

public class Main {
    public static void main (String[] args){
        //Aggregation = represents a "has-a " relationship between objects.
        // One Object contains another object as a part of its structure,
        //but the contained object's can exist independently

        Book book1 = new Book("The follow of the Ring" , 423);
        Book book2 = new Book ("The two towers" , 322);
        Book book3 = new Book ("The return of the king " , 416);

        Book[] books = {book1 , book2, book3 };

    // loop to print contents of each array element 
        /*for (Book book : books){
        System.out.println(book.displayInfo());
        }*/

        Library library = new Library("NYC Public Library", 1897, books );

        library.displayInfo();
    }
}
