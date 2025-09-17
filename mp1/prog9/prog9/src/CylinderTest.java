import java.util.Scanner;

public class CylinderTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Give me the radius: ");
        int r = s.nextInt();
        System.out.print("Give me the height: ");
        int h = s.nextInt();
        s.close();

        Cylinder cyl = new Cylinder(r, h);
        System.out.println(cyl.getVolume());
    }
}
