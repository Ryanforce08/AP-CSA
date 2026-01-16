
public class Prog10 {

	public static double[] discriminant(int a, int b, int c) {
		if (a == 0)
			throw new IllegalArgumentException("a = 0");

		double discrim = b * b - 4 * a * c;
		if (discrim > 0) {
			double sqrtD = Math.sqrt(discrim);
			return new double[] {(-b + sqrtD) / (2 * a), 
								(-b - sqrtD) / (2 * a) };
		} else if (discrim == 0) {
			double root = -b / (2*a);
			return new double[] {root, root};
		} else
			return null;
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 4;
		int c = 13;
		double[] roots = discriminant(a,b,c);
		if (roots == null)
			System.out.println("No real roots");
		else
			for(double i : roots) {
				System.out.println(i);
			}

	}

}