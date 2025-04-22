import java.util.Scanner;
    public class Difference{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	int difference = firstNumber - secondNumber;

	if(firstNumber > secondNumber){
	System.out.printf("Their difference is %d%n: ", difference);
}

}
}