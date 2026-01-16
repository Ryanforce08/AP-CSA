
public class Prog6b {
	public static boolean isValidISBN(String isbn) {
		int sum = 0;
		for(int i = 0; i < isbn.length() - 1; i++) {
			sum += Character.digit(isbn.charAt(i), 10);
		}
		if(sum % 10 == Character.digit(isbn.charAt(12), 10))
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isValidISBN("9780997252829"));
		

	}

}
