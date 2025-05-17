package Collections_24.Sorting_2;

import java.util.*;

class Students implements Comparable<Students>{
    int age;
    String name;
    public Students(String name,int age) {
        this.age = age;
        this.name = name;
    }
    
    public int compareTo(Students that) {
        return this.age > that.age ? 1:-1;
    }

    
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    
    
}

public class Demo {
    public static void main(String[] args) {
        // Basic Example


        // Comparator<String> c = new Comparator<String>(){
        //     public int compare(String i,String j){
        //         return i.length() > j.length()? 1:-1;
        //     }
        // };


        // Comparator<String> c = (i,j) -> i.length() > j.length()? 1:-1;

        // List<String>names = new ArrayList<>();
        // names.add("Tejas");
        // names.add("Debruyne");
        // names.add("Harshit");
        // names.add("Cristiano Ronaldo");

        // Collections.sort(names,c);
        // for(String name : names){
        //     System.out.println(name);
        // }


        // Now using students and implementing Comparable

        List<Students> studs = new ArrayList<>();
        studs.add(new Students("Tejas",21));
        studs.add(new Students("Harshit",20));
        studs.add(new Students("Prakhar",23));
        studs.add(new Students("Shikhar",21));

        Collections.sort(studs);
        for(Students s : studs){
            System.out.println(s.toString());
        }
    }
}
