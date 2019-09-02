package exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class exercise12 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int temp = 0;
        int [] array = new int[3];

        array[0] = Integer.parseInt(buffer.readLine());
        array[1] = Integer.parseInt(buffer.readLine());
        array[2] = Integer.parseInt(buffer.readLine());

        for (int i = 2; i >= 0; i--) {
            for (int q = 2; q >= 1; q--) {
                if (array[i] < array[q]) {
                    temp = array[i];
                    array[i] = array[q];
                    array[q] = temp;
                }
            }
        }

        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
