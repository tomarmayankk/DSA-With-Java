package Hashing;

import java.util.TreeSet;

//java program to learn operations on hashtree
public class Treeset {
    public static void main(String[] args){
        //creating a treeset
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(15);
        ts.add(9);

        //Printing the treeset
        System.out.println("Treeset: " + ts);

        //retrieving the first and last elements of the treeset
        System.out.println("first: " + ts.first());
        System.out.println("Last: " + ts.last());

        //check that the specific value exists
        System.out.println("Does TreeSet contain 15? " + ts.contains(15));

        //removing the element
        ts.remove(10);

        //after removal
        System.out.println("After removal: "+ts);
    }
}
