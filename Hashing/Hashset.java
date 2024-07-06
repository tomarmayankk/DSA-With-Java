package Hashing;
import java.util.HashSet;
/* java program to perform the operations in hashset 
 * operations - insertion, deletion, lookup, size, clear, etc
*/
public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(7);
        set.add(5);
        set.add(6); 
        System.out.println("Set after addition: " + set);

        //deletion
        set.remove(5);
        System.out.println("set after deletion: " + set);

        //lookup
        if(set.contains(6)){
            System.out.println("element found");
        }

        //iterate
        for(int num : set){
            System.out.print(num);
        }

        //size
        System.out.println("size: " + set.size());

        //clearing the hashset
        set.clear();
        System.out.println("after clearing: " + set);

    }
}
