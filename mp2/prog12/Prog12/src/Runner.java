public class Runner {

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);
        Complex c3 = new Complex(5);
        
        System.out.println("c1 = " + c1); 
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("\nabs(c1) = " + c1.abs()); 

        Complex sum = c1.add(c2);
        System.out.println("\nc1 + c2 = " + sum);

        Complex product1 = c1.multiply(c2);
        System.out.println("c1 * c2 = " + product1);

        Complex product2 = c1.multiply(2.5);
        System.out.println("c1 * 2.5 = " + product2);
        
        
    }
}
