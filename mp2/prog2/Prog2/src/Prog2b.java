
public class Prog2b {
	public static boolean check(int n) {
		String s = "" + n;
		String foo = "7";
		String foo2 = "9";
		if (s.contains(foo) && s.contains(foo2)) return true;
		return false;
	}

	public static void main(String[] args) {
		long amount = 0;
		for(int i = 0; i < 1_000_000;i++) {
			if (check(i)) amount += 1;
		}
		System.out.println(amount);

	}

}
