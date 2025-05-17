package InputFromUser_22.Basic_1;

// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.Reader;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws IOException{
        //Before 1.5
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}