package InputFromUser_22.Finally_2;

import java.io.*;
// import java.util.*;

public class Demo {

    public static void main(String[] args) throws IOException{
        //Before 1.5
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally{
            bf.close();// This statement will execute even if there is an exception
        }

        
    }
}