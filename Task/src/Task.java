import java.util.Arrays;

public class Task {

    public static int[] generateArray(final int SIZE, final int LOWER_BOUND, final int UPPER_BOUND) {
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; ++i) {
            arr[i] = getValueInRange(LOWER_BOUND, UPPER_BOUND);
        }
        return arr;
    }

    private static int getValueInRange(int LOWER_BOUND, int UPPER_BOUND) {
        return (int) (Math.random() * (UPPER_BOUND - LOWER_BOUND)) + LOWER_BOUND;
    }

    public static int findMinValueInArray(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            minVal = Math.min(minVal, arr[i]);
        }
        return minVal;
    }

    public static int findMaxValueInArray(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            maxVal = Math.max(maxVal, arr[i]);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        final int SIZE = 10, LOWER_BOUND = 1, UPPER_BOUND = 10;
        int[] arr = generateArray(SIZE, LOWER_BOUND, SIZE);
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Минимальное значение: " + findMinValueInArray(arr));
        System.out.println("Максимальное значение: " + findMaxValueInArray(arr));
    }
}
