import java.util.Scanner;
    public class LargestValue{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	if(firstNumber > secondNumber){
	System.out.printf("The largest value is: %d%n", firstNumber);
	} else {
	System.out.printf("The largest value is: %d%n", secondNumber);
	}
 }
}