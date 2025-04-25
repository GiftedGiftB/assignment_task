// prompt the user to enter miles driven as first number and gallon used as second number
//

import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int mileDriven = 0;
	int counter = 0;
	int gallonGallon = 0;
	int total = 0;
	int num;

	//System.out.print("Enter the number of mile driven: ");
	//mileDriven = scan.nextInt();

	do {
	System.out.print("Enter the number of mile driven: ");
	mileDriven = scan.nextInt();

	System.out.print("Enter the number of gallons used: ");
	gallonGallon = scan.nextInt();	
	
	int dividedNumber = mileDriven / gallonGallon;
	System.out.println("Number of gallon used for each trip is: " + dividedNumber);

	System.out.println("Enter any number to continue or -1 to exit: ");
	num= scan.nextInt();

	total += dividedNumber;
	}
	while (num != -1); 
	
	System.out.print("Total gallon used: " + total);
	
	
	

 }

}