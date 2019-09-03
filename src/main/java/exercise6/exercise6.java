package exercise6;

import java.io.IOException;
import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

           int age = in.nextInt();
           String name = in.next();

        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", name, age);
    }
}
