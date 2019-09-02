package exercise11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise11 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: "); int a = Integer.parseInt(buffer.readLine());

        System.out.print("Enter second number: "); int b = Integer.parseInt(buffer.readLine());

        System.out.println("Minimal entered number is: " + Integer.min(a,b));
    }
}
