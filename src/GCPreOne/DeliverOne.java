package GCPreOne;

import java.util.Scanner;

public class DeliverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sampleOne = 0;
		int sampleTwo = 0;
		char digita1;
	    char digita2;
	    char digita3;
	    char digitb1;
	    char digitb2;
	    char digitb3;
		
		
		 Scanner scnr = new Scanner(System.in); // Setup to scan chars from System.in

	      System.out.println("Enter a three digit number: ");
	      sampleOne = scnr.nextInt();  // Read first integer from scanner
	      
	      digita1 = Integer.toString(sampleOne).charAt(0);
	      digita2 = Integer.toString(sampleOne).charAt(1);
	      digita3 = Integer.toString(sampleOne).charAt(2);
	      
	      
	      
	      System.out.println ("Enter a second three digit number: ");
	      sampleTwo = scnr.nextInt();  // Read second integer from scanner
	      
	      digitb1 = Integer.toString(sampleTwo).charAt(0);
	      digitb2 = Integer.toString(sampleTwo).charAt(1);
	      digitb3 = Integer.toString(sampleTwo).charAt(2);
	      
	      int lengthOne = String.valueOf(sampleOne).length(); 
	      int lengthTwo = String.valueOf(sampleTwo).length();
	      
	      
	      if (lengthOne != lengthTwo) { //check if the two numbers are the same length
	    	   System.out.print ("Please enter numbers of the same length");
	    	   }
	      
	      else  {
	    	  int sampleOneA = Integer.parseInt(String.valueOf(digita1));
	    	  int sampleOneB = Integer.parseInt(String.valueOf(digita2));
	    	  int sampleOneC = Integer.parseInt(String.valueOf(digita3));
	    	  int sampleTwoA = Integer.parseInt(String.valueOf(digitb1));
	    	  int sampleTwoB = Integer.parseInt(String.valueOf(digitb2));
	    	  int sampleTwoC = Integer.parseInt(String.valueOf(digitb3));
	    	  
	    	  int a = sampleOneA + sampleTwoA;
	    	  int b = sampleOneB + sampleTwoB;
	    	  int c = sampleOneC + sampleTwoC;
	      
	    	  {  if ((a==b) && (b==c) && (a==c))
	      {System.out.println("True");
	      
	      }      
	      else {System.out.println ("False"); //This occurs in the event that the calculations are false or that the sum of each set of numbers is not equal
	      

	      }  
	      
	      

	    	  }
	      
		
	}
		
		
	}

}
