package static_1;


 
public class Friend {
    static int numOfFriends;
    String name;

    Friend (String name){
        this.name = name;
        numOfFriends++;
    }
}
