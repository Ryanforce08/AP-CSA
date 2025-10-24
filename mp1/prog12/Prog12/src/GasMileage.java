//Chapter 5 Question 18

//This program prompts the user to enter miles traveled and
//gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
public static double getGasSpent(int miles, double mileage)
{
 return miles/mileage;
}

public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);
 
 System.out.print("Miles traveled: ");
 int miles = input.nextInt();
 System.out.print("Gas Mileage ");
 double mileage = input.nextDouble();
 
 input.close();
 
 double mpg = getGasSpent(miles, mileage);
 System.out.printf("Your car used %.1f gallons of gas\n", mpg);
}
}