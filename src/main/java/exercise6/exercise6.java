package exercise6;

import java.io.IOException;
import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int age;

        try {
            System.out.print("Enter age: ");
            age = in.nextInt();
        } catch (RuntimeException ex) {
            throw new RuntimeException("Oops, you enter not number as age");
        }

            System.out.print("Enter name: ");
            String name = in.next();

        System.out.printf("%s захватит мир через %x лет. Му-ха-ха!", name, age);
    }
}
