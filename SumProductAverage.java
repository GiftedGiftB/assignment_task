import java.util.Scanner;
    public class SumProductAverage{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	int sum = firstNumber + secondNumber;

	int product = firstNumber * secondNumber;

	double average = sum / 2;

	int difference = firstNumber - secondNumber;

	System.out.printf("The sum is %d%n:", sum);

	System.out.printf("The product is %d%n:", product);

	System.out.printf("The average is: %.2f%n", average);
	
	System.out.printf("The difference is: %d%n", difference);

	if(firstNumber > secondNumber){
	System.out.printf("The maximum number is: %d%n", firstNumber);
	} else {
	if(secondNumber > firstNumber);
	System.out.printf("The maximum number is: %d%n", secondNumber);
	}
	if(firstNumber < secondNumber){
	System.out.printf("The minimum number is: %d%n", firstNumber);
	} else {
	if(secondNumber < firstNumber);
	System.out.printf("The manimum number is: %d%n", secondNumber);
	}

	

}
}