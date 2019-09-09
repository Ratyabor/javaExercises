package exercise19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise19 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(buffer.readLine());
        int n = Integer.parseInt(buffer.readLine());

        for (int i = 1; i <= m; i++) {
            for (int q = 1; q<= n; q++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
