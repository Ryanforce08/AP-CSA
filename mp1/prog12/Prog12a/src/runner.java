import java.util.Scanner;
public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Time: ");
		String time = s.nextLine();
		int i = time.indexOf(":");
		int hours = Integer.parseInt(time.substring(0, i));
		int minutes = Integer.parseInt(time.substring(i+1));
		s.close();
		System.out.println("Minutes till lunch: " + LunchTime.minutesUntilLunch(hours, minutes));
		
	}
}
