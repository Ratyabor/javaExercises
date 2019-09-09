package exercise14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise14 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int[] enteredNumbers = new int[3];
        int result = 0;

        for (int i = 0; i <= 2; i++) {
            enteredNumbers[i] = Integer.parseInt(buffer.readLine());
        }
        System.out.print("Entered numbers: ");
        for (int q = 0; q <= 2; q++) {
            System.out.print(enteredNumbers[q] + " ");
        }

        for (int arrayCheck = 0; arrayCheck <= 2; arrayCheck++) {
            int count = 0;
            for (int n = 0; n <= 2; n++) {
                if (enteredNumbers[arrayCheck] != enteredNumbers[n]) {
                    count++;
                    if (count >= 2) {
                        result = arrayCheck + 1;
                    }
                }
            }
        }
        System.out.println("\n" + result);
    }
}
