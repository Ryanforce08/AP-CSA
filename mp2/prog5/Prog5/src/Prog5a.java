
public class Prog5a {
	public static String method(String input) {
		String temp = input;
		temp = temp.replace("1", "foo");
		temp = temp.replace("0", "1");
		temp = temp.replace("foo", "0");
		return temp;
	}
	public static void main(String[] args) { 
		String test = "1010";
		String test_s = method(test);
		System.out.println("og: " + test + "new: " + test_s);
	}
}
