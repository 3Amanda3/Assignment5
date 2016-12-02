import java.util.Scanner;


/*
 * @author a.schepp
 * Mr hardman
 * finding the max value of user inputted numbers
 * November 28
 *
 */
public class MaximumValue {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int[] userNum = new int[5];
		int max;
		
		System.out.println("Please enter 5 integers");
		
		for (int i = 0; i < userNum.length; i++){
			System.out.print("Please enter a Number: ");
			userNum[i] = userInput.nextInt();
	}
	
			max = userNum[0];
		
		for (int i = 0; i < userNum.length; i++){
		
			if (userNum [i] > max){
			
				max = userNum [i];
		}
	}
		for(int i=0; i < userNum.length; i++){		
			System.out.print(userNum[i] + "    ");
		}
		
		System.out.println("The max vaule is " +max);
		userInput.close();
	}

}


