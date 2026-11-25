public class App {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int number = 2; number <= 500; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}