package static_1;

//This is the Main class. 
//Every Java program starts from the 'main' method inside a class.
public class Main {

    public static void main(String[] args) {

        // ------------------ CLASS vs OBJECT ------------------
        // A class is a blueprint — like a design or recipe.
        // An object is a real thing created from the class.


        // Example: If "Friend" is a class (blueprint of a person)
        // Then "friend1", "friend2" are objects (actual people with names)

        // ----------- OBJECT CREATION USING 'new' KEYWORD ------------
        // This line creates an object of the Friend class.
        // Each object gets its own copy of non-static variables (like 'name').

        Friend friend1 = new Friend("Spongebob"); 
        Friend friend2 = new Friend("Patrick"); 
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        // Accessing instance (non-static) variable
        // Each friend has their own name    

        System.out.println(friend1.name); 
        System.out.println(friend2.name); 
        System.out.println(friend3.name);  
        System.out.println(friend4.name);  

        // Accessing static variable: WRONG WAY (Not recommended)
        // Even though this will work, it's confusing and misleading
        // because it looks like each object has its own numOfFriends.
        // System.out.println(friend1.numOfFriends);

        //System.out.println(friend2.name);  
        //System.out.println(friend3.name);
        // CORRECT WAY to access static variable:
        // Since 'numOfFriends' is shared by all Friend objects,
        // we should access it through the class itself


        System.out.println("The total number of Friends present are: " + Friend.numOfFriends); 

    }
}
