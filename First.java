package MyPackage;

import java.util.Scanner;

public class First {
	   static int number = 0;
	   int a,b,c,d;


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter four-digit number:");
	     if(sc.hasNextInt()){
	    	int number = sc.nextInt();
	    	System.out.println("Your entered number: "+ number);
	    	if( number >9999){
	    	 System.out.println("You have entered too big number, enter four-digit number!!!");
	    	}
	    		if(number <1000){
	    	 System.out.println("You have entered very small number, enter four-digit number!!!");

	    		}
	     }	
	     else{
	    	 	System.out.println("Invalid input, enter four-digit number!!!");
	     } 
	     
	     if(){
	    	 
	     }
	     /*if (number / 1 % 10 + number / 10 % 10 == number / 100 % 10 + number / 1000 % 10) {
          System.out.println(true);
      } else {
          System.out.println(false);
      } */
	     
	     sc.close();
	}

}
