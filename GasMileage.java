// prompt the user to enter number of miles driven
// prompt the user to enter number of gallon used as second number
// divide number of miles driven by number of gallon used

import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int mileDriven = 0;
	int counter = 0;
	int gallonGallon = 0;
	int total = 0;
	int exitNumber;

	do {

	System.out.print("Enter the number of mile driven: ");
	mileDriven = scan.nextInt();

	System.out.print("Enter the number of gallons used: ");
	gallonGallon = scan.nextInt();	
	
	int dividedNumber = mileDriven / gallonGallon;
	System.out.println("Number of gallon used for each trip is: " + dividedNumber);

	System.out.println("Enter any number to continue or -1 to exit: ");
	exitNumber = scan.nextInt();

	total += dividedNumber;
	}
	while (exitNumber != -1); 
	
	System.out.print("Total gallon used: " + total);
	
	
	

 }

}