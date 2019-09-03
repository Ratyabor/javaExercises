package exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise12 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int temp = 0;

        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());
        int c = Integer.parseInt(buffer.readLine());

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        } if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }  if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
