package exercise15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise15 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && b < 0) {
            System.out.println(3);
        } else if (a > 0 && b < 0) {
            System.out.println(4);
        }


    }
}
