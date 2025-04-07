package Strings_5;

public class Demo {
    public static void main(String[] args) {
        // String name = "Tejas";// Immutable Strings
        // System.out.println(name);
        // name = name + " Trivedi";//It changes the address for Tejas+ Trivedi in string pool but Tejas is intact
        // System.out.println(name);

        StringBuffer sb = new StringBuffer("Tejas");
        System.out.println(sb);
        sb.append(" Trivedi");
        System.out.println(sb);



    }
}
