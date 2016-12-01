


import java.util.Scanner;

/*
 * @author a.schepp
 * Mr hardman
 * searchs in an array to find the index at a value
 * November 24
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int [] myArray = {1, 3, 5, 7, 9, 11, 15, 17, 27};
		int index = 0;
		int userValue;
				
	
		for(int i=0; i < myArray.length; i++){		
			System.out.print(myArray[i] + "    ");
					
		}
				
		System.out.println();
		System.out.println(" What value do you want the index of?");
		userValue = userInput.nextInt();
				
					
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i]==userValue){
				index = i;
			}	
		}
				
		if(index == 0){
			System.out.println("This is not in the Array");	
						
		} else {
			System.out.println(userValue + " is at index " + index);	
		}
		
					
			
						
					
		userInput.close();	
	   }			
	}


