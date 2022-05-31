package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        sumOfDigits(text);

    }

    private static void sumOfDigits(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (Character.isDigit(temp)){
                int tempDigit = Integer.parseInt(String.valueOf(temp));
                sum+=tempDigit;
            }
        }
        System.out.println(sum);
    }
}
