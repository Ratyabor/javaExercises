package exercise7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class exercises7 {

    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int salary;
        int years;

        try {
            System.out.print("Enter salary: ");
            salary = Integer.parseInt(buffer.readLine());
            System.out.print("Enter time in years: ");
            years = Integer.parseInt(buffer.readLine());
        } catch (RuntimeException ex) {
            throw new RuntimeException("Oops, you enter not a number! Don't do that.");
        }

        System.out.print("Enter name: ");
        String name = buffer.readLine();

        System.out.printf("\n%s получает %d через %d лет.", name, salary, years);
    }
}
