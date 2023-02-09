import java.util.Scanner;
public class GradeClassifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numGrade =0;
		char letterGrade = ' ';
		Scanner scn = new Scanner(System.in);
		
	
		System.out.println("Please enter your current grade # ( hit enter):");
		numGrade = scn.nextInt();
		
		System.out.printf("you entered %d number\n",numGrade);
		
		if( numGrade < 0|| numGrade > 100)
		{
			System.out.println("Invalid numerical grade entered");
		return;
		}
		else if(numGrade > 90)
		{
			letterGrade = 'A';
			
		}
		
		else if(numGrade > 80)
		{
			letterGrade = 'B';
		
		}
		else if(numGrade > 70)
		{
			letterGrade = 'C';
		
		}
		else if(numGrade > 60)
		{
			letterGrade = 'D';
			
		}
		else if(numGrade >= 0)
		{
			letterGrade = 'E';
		
		
		}
	
		System.out.printf("You will receive a %c", letterGrade);
		

	}

}
