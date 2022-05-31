package task1;

public class Main {
    public static void main(String[] args) {
        int var = -864542;
        System.out.println(digitsSum(var));

    }

    static int digitsSum(int var) {
        int tempVar = Math.abs(var);
        int length = 0;
        long temp = 1;
        while (temp <= tempVar) {
            length++;
            temp *= 10;
        }
        // закидуємо кожну цифру окремо у масив та сумуємо їх
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = tempVar % 10;
            tempVar = tempVar / 10;
        }
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
