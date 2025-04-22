import java.util.Scanner;
    public class PositiveOrNegative{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	int product = firstNumber * secondNumber;
	int sum = firstNumber + secondNumber;

	if(firstNumber > 0 && secondNumber > 0){
	System.out.printf("Their product is %d%n: ", product);
	} else{
	System.out.printf("Their sum is %d%n: ", sum);
	}


}
}