package Hashing;
import java.util.*;
public class Hashmap{
    public static void main(String[] args){
        HashMap <Integer, String> map = new HashMap<>();

        //put
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("map after adding: " + map);

        //remove key value pair
        map.remove(3);
        System.out.println("map after removal: "  + map);

        //retrieving elements
        System.out.println("element: " + map.get(2));

        //getting the size of the hashmap
        System.out.println("size: " + map.size());

        //clearing the hashmap
        System.out.println("map after clearing: " + map);

        //iterating over the key value pairs *PENDING*


    }
}