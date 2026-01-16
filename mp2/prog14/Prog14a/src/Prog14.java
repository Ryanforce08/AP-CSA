import java.math.BigInteger;
import java.util.ArrayList;

public class Prog14 {
	public static ArrayList<BigInteger> fib(int n) {
		ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
		BigInteger last1 = new BigInteger("0");
		BigInteger last2 = new BigInteger("1");
		arr.add(last1);
		arr.add(last2);
		
		for(int i = 2; i < n; i++) {
			arr.add(arr.get(i - 1).add(arr.get(i - 2)));
		}
		
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(fib(101).get(fib(101).size()-1).toString().length());
	}

}
