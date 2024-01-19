

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Insert tree = new Insert();
        tree.populate(scanner);
        tree.display();
    }
}