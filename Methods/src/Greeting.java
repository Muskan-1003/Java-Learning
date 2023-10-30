import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);


    }


    static String myGreet(String name) {
        String message = "Hello!!" + name;
        return message;
    }
}