import java.util.Scanner;

public class First {
	   static int number = 0;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("������� �������������� �����:");
	     if(sc.hasNextInt()){
	    	int number = sc.nextInt();
	    	System.out.println("���� ��������� �����: "+ number);
	    	if( number >9999){
	    	 System.out.println("�� ����� ������� ������� �����, ������� �������������� �����!!!");
	    	}
	    		if(number <1000){
	    	 System.out.println("�� ����� ������� ����� �����, ������� �������������� �����!!!");

	    		}
	     }	
	     else{
	    	 	System.out.println("�������� ����, ������� �������������� �����!!!");
	     } 
	     if (number / 1 % 10 + number / 10 % 10 == number / 100 % 10 + number / 1000 % 10) {
             System.out.println(true);
         } else {
             System.out.println(false);
         } 
	     
	     sc.close();
	}

}
