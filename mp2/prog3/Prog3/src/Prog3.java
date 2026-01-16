
public class Prog3 {
	public static double sqrtEst(double a)
	{
	    double x = a / 2;
	    double diff = Math.abs(x * x - a);

	    do
	    {
	        x = 0.5 * (x + a / x);
	        diff = Math.abs(x * x - a);
	    } while (diff >= 0.00001);

	    return x;
	}

	public static void main(String[] args) {
		System.out.println(sqrtEst(2));

	}

}
