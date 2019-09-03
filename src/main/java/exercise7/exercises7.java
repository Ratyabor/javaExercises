package exercise7;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class exercises7 {

    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int salary = Integer.parseInt(buffer.readLine());
        int years = Integer.parseInt(buffer.readLine());
        String name = buffer.readLine();

        System.out.printf("\n%s получает %d через %d лет.", name, salary, years);
    }
}
