package task3;

public class Main {
    public static void main(String[] args) {

        System.out.println(numberOfName("Roman"));

    }

    private static int numberOfName(String name) {
        String al = "abcdefghijklmnopqrstuvwxyz";
        String nameLowerCase = name.toLowerCase();
        int sum = 0;
        for (int i = 0; i < nameLowerCase.length(); i++) {
            int currentNumberOfChar = al.indexOf(nameLowerCase.charAt(i) + 1);
            sum += currentNumberOfChar;
        }
        return sum;
    }
}
