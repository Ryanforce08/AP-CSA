
public class Prog5b {
	public static int index(String str, char ch, int fromPos) {
		for(int i = fromPos; i < str.length(); i++) {
			if(str.charAt(i) == ch) 
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		String test = "hello";
		System.out.println(index(test,'l', 3));
		System.out.println(test.indexOf('l', 3));

	}

}
