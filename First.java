import java.util.Scanner;

public class First {
	   static int number = 0;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Введите четырехзначное число:");
	     if(sc.hasNextInt()){
	    	int number = sc.nextInt();
	    	System.out.println("Ваше введенное число: "+ number);
	    	if( number >9999){
	    	 System.out.println("Вы ввели слишком большое число, введите четырехзначное число!!!");
	    	}
	    		if(number <1000){
	    	 System.out.println("Вы ввели слишком малое число, введите четырехзначное число!!!");

	    		}
	     }	
	     else{
	    	 	System.out.println("Неверный ввод, введите четырехзначное число!!!");
	     } 
	     if (number / 1 % 10 + number / 10 % 10 == number / 100 % 10 + number / 1000 % 10) {
             System.out.println(true);
         } else {
             System.out.println(false);
         } 
	     
	     sc.close();
	}

}
