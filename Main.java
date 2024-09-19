
public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Display from first to last
        System.out.println("Integers from first to last:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Display from last to first
        System.out.println("Integers from last to first:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

