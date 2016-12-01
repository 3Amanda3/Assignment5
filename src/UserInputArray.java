import java.util.Scanner;


/*
 * @author a.schepp
 *  Mr.hardman
 *November 28
 *finding the number of times a number was entered in the array
 *
 */
public class UserInputArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] userValues = new int[10];

		Scanner userInput = new Scanner(System.in);
		
		int search;
		int count=0;
		
		
		System.out.println("Please enter 10 integers");
		
		for (int i = 0; i < userValues.length; i++){
			System.out.print("Please enter a Number: ");
			userValues[i] = userInput.nextInt();
			
		}
		
		System.out.print("What value woudl you like to search for?");
		search = userInput.nextInt();
		
		for(int i = 0; i < userValues.length; i++){
			if(userValues[i]==search){
				count++;
			}	
		}
		
		
		System.out.println("This value was found " +count+ " times");
		userInput.close();
	}

}
