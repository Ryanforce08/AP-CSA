
public class Prog1a {
	public static int sumDigits(int n) { 
		int sum = 0;
		while(n > 0) {
			int num = n % 10;
			sum += num;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(99));
	}

}
