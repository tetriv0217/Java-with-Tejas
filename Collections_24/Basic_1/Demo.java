package Collections_24.Basic_1;
import java.util.*;

// import java.util.ArrayList;
// import java.util.Collection;



/*
 * Topics covered :- 
 * List - ArrayList
 * Set -> HashSet,TreeSet
 * Iterator -> obj.iterator()
 * Map<Key,Value> => HashMap,Hashtable
 */
// Topics covered:- 
// List,Set,TreeSet,

public class Demo {

    public static void main(String[] args) {


        // Collection doesn't provide you to play with index
        // Collection<Integer> nums = new ArrayList<Integer>();

        // <> is used so that objects are not created

        // List
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(4);
        // nums.add(2);
        // nums.add(5);
        // nums.add(7);
        // System.out.println("Index of 5 is :- "+nums.indexOf(5));//2
        // System.out.println("Number at index 3 is :- "+nums.get(3));//2


        // Set works wiht HashSet
        // Set is not sorted in anyorder
        // removes duplicate value

        // Set<Integer> nums = new HashSet<Integer>();//HashSet doesn't allow ordering
        // Set<Integer> nums = new TreeSet<Integer>();//TreeSet allows ordering(in sorted manner)

        // nums.add(41);
        // nums.add(22);
        // nums.add(54);
        // nums.add(75);


        // We can use iterator
        // Iterator<Integer> it = nums.iterator();
        // while(it.hasNext())
        //     System.out.println(it.next());

        // for(int n : nums){
        //     System.out.println(n);
        // }


        // HashMap and Hashtable
        // Map<String,Integer> marks = new HashMap<>();
        // Hashtable works the same HashMap but it is synchronised
        Map<String,Integer> marks = new Hashtable<>();
        marks.put("Crypto", 94);
        marks.put("Affective", 84);
        marks.put("Sustainable", 100);

        System.out.println(marks.keySet());
        System.out.println("Tejas marks are :- ");
        for(String key : marks.keySet()){
            System.out.println(key + ":"+ marks.get(key));
        }

    }
}