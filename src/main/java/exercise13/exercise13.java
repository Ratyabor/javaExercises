package exercise13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exercise13 {

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first name: ");
        String firstName = buffer.readLine();

        System.out.println("Enter second name: ");
        String secondName = buffer.readLine();

        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
