public class Main {

    // Method to find the largest and smallest difference
    public static int findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    // Method to find the smallest and second smallest
    public static void findSmallestElements(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("2.a - Smallest value: " + smallest);
        System.out.println("2.b - Second smallest value: " + secondSmallest);
    }

    // Method to calculate the mathematical expression
    public static double calculateExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow(((4 * y) / 5) - x, 2);
    }

    public static void main(String[] args) {
        // Example usage of the methods
        int[] array = {3, 8, 2, 10, 5}; // array for exercise 1
        System.out.println("EXERCISE REPLIES:");
        System.out.println("1. Difference between largest and smallest values: " + findDifference(array));
        findSmallestElements(array);

        double x = 3;
        double y = 4;
        System.out.println("3. Result of the expression: " + calculateExpression(x, y));
    }
}
