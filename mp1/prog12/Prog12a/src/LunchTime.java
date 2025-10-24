
public class LunchTime {
	public static int minutesUntilLunch(int hour, int minute)
	{
		 int time = (int)((hour * 60) + minute);
		 int error = 780 - time;
		 return error;
		 
	}
}
