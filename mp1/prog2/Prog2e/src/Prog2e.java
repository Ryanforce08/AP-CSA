import java.util.Scanner;

public class Prog2e {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("give me a int: ");
		int input = s.nextInt();
		s.close();
		System.out.println("2 * " + input + " * " + "= "  + (2 * input));

	}

}
