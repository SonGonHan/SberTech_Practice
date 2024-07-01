public class Task {

    public static String findPrimeNumbers(final int LOWER_BOUND, final int UPPER_BOUND) {
        StringBuilder sb = new StringBuilder();
        for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
            if(isPrime(i)) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().strip();
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int LOWER_BOUND = 2, UPPER_BOUND = 100;
        System.out.println("Простые числа: " + findPrimeNumbers(LOWER_BOUND, UPPER_BOUND));
    }
}
