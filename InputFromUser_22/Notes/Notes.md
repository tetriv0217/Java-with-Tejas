# How to take input from user in Java

##  Input brfore 1.5 using BufferedReader
```java
import java.io.*;
import java.util.*;
class InputFromUser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + num);
    }
}
```
## Input after 1.5 using Scanner
```java
import java.util.*;
class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }
}
```
## Input using Console
```java
import java.io.*;
import java.util.*;
class InputFromUser {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        System.out.println("Enter a number:");
        String input = console.readLine();
        int num = Integer.parseInt(input);
        System.out.println("You entered: " + num);
    }
}
```


## Use of Finally for closing resources
- The `finally` block is used to execute a block of code after the try-catch block, regardless of whether an exception was thrown or not. It is typically used for cleanup operations, such as closing resources like files or network connections.
- The `finally` block is always executed after the try-catch block, even if an exception is thrown or caught. This ensures that resources are properly released and any necessary cleanup is performed.