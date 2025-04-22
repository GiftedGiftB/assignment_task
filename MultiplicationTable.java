import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a posive integer: ");
	int positiveN = scan.nextInt();
	if(positiveN < 0){
	System.out.println("positive numbers only, try again");

	}else{
	for(int i = 1; i <= 10; i = i + 1){
	System.out.println(positiveN + " * "+ i + " = "+ positiveN * i);
	}
	}
  }
}
