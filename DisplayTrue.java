import java.util.Scanner;
public class DisplayTrue{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number:");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number:");
	int secondNumber = inputScanner.nextInt();

	System.out.print("Enter third number:");
	int thirdNumber = inputScanner.nextInt();
	
	if(secondNumber > firstNumber){
	if(thirdNumber > secondNumber){
	System.out.println("The result is: true");
	} 
	}
}

}