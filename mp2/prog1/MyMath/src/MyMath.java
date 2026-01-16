public class MyMath {

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long mersenneNumber(int p) {
        return (long) Math.pow(2, p) - 1;
    }

    public static long perfectNumberFromMersenne(int p) {
        long mersenne = mersenneNumber(p);
        return (long) (Math.pow(2, p - 1) * mersenne);
    }

    public static void main(String[] args) {
        int countPerfect = 0;
        int p = 2;

        while (countPerfect < 4) {
            long mersenne = mersenneNumber(p);
            if (isPrime(mersenne)) {
                long perfect = perfectNumberFromMersenne(p);
                System.out.println("Perfect " + (countPerfect + 1) + ": " + perfect);
                countPerfect++;
            }
            p++;
        }

        int countMersenne = 0;
        p = 2;
        System.out.println();

        while (countMersenne < 6) {
            long mersenne = mersenneNumber(p);
            if (isPrime(mersenne)) {
                System.out.println("Mersenne Prime " + (countMersenne + 1) + ": " + mersenne);
                System.out.println("Perfect Number " + (countMersenne + 1) + ": " + perfectNumberFromMersenne(p));
                countMersenne++;
                System.out.println();
            }
            p++;
        }
    }
}
