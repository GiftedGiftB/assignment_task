import java.util.Scanner;
public class HighestScore{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int counter = 0;
	String studentName = " ";
	int studentScore = 0;
	int nameAndScore = 0;
	int highestScore = 0;
	String highestStudent = " ";
	
	System.out.print("Enter the number of student: ");
	int studentNumber = scan.nextInt();

	while(counter != studentNumber){

	System.out.print("Enter student name: ");
	studentName = scan.next();

	System.out.print("Enter student score: ");
	studentScore = scan.nextInt();

	if(studentScore > highestScore){
	highestStudent = studentName;
	highestScore = studentScore;
	}
	counter++;
     }
	System.out.println("The highest score is: " + highestStudent + highestScore);
   }

}