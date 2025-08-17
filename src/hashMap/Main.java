package hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
     
    //HashMap = a data structure that stores key-value pairs
    //*key are unique* , but Value can be duplicated
    //Does not maintain any orders, but is memory efficint 
    // HshMap <key ,Values>

    HashMap<String,Double> map = new HashMap<>();

    map.put("Apple" , 0.50 );
    map.put("orange", 0.75);
    map.put("banana" , 0.40);
    map.put("cocunut", 1.00);

    //This will overwrite the previous statements , BCZ THE Key is same
    // map.put("orange", 0.6845984598);

    //to remove an element
    //map.remove("Apple");
    //System.out.println(map);

    //to get a value of a key 
    //System.out.println(map.get("Apple"));
    //to get the size of a map
    //System.out.println(map.size());  
    //System.out.println(map.containsValue(1.00));
    //for this ex , this has top be a double 

    //To0 check if a keuy or value exists , returns boolean
    System.out.println(map.containsKey("Apple"));
    System.out.println();

    //Just a example use 

    if(map.containsKey("Apple")){
        System.out.println(map.get("Apple"));
    }
    else{
        System.out.println("Key not found");
    }
    System.out.println();

    //when System.out.println(map);
    //outputs {orange=0.75, banana=0.4, Apple=0.5, cocunut=1.0}
    //Making this pretty!

    for(String key : map.keySet()){
        System.out.println(key + ":" + "$" + map.get(key));
    }

 }
}
