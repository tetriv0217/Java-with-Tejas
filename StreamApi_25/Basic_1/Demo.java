package StreamApi_25.Basic_1;

import java.util.*;
// import java.util.stream.Stream;
// import java.util.function.Predicate;


// Stream can be used only once. After that it will show errors

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,2,4,5,6,7,1,9);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 1);
        // Stream<Integer> s3 = s2.map(n->n*1);
        // int res = s3.reduce(0, (c,e) -> c+e);
        

        // Behind the scene of filter function

        // Predicate<Integer>p = new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         return n%2 == 0;
        //     }
        // };

        // With lamda function
        // Predicate<Integer>p = (n) -> n%2 == 0;
            

        int res = nums.stream()
        .filter((n) -> n%2 == 0)
        .reduce(0, (c,e)->c+e);

        System.out.println(res);
        // s3.forEach(n -> System.out.println(n));

    }
}
