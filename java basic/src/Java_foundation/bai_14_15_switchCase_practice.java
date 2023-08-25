package Java_foundation;

import java.util.Scanner;

public class bai_14_15_switchCase_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// Nếu có tình huống rẻ nhánh nhiều và chung 1 đối tượng
		// Rút ngắn của if..else condition
		
		int number;
		
		
		System.out.println("Enter Number: ");
		number = sc.nextInt();
		
		switch (number) {
		case 2:{
			System.out.println("Monday");
			break;
		}
		case 3:{
			System.out.println("tuesday");
			break;
		}
		case 4:{
			System.out.println("wednesday");
			break;
		}
		case 5:{
			System.out.println("thursday");
			break;
		}
		case 6:{
			System.out.println("friday");
			break;
		}
		case 7:{
			System.out.println("saturday");
			break;
		}
		case 8:{
			System.out.println("sunday");
			break;
		}
		default:
			System.out.println("Error value");
		}
		
		
		
		
		//practice tính số ngày của tháng
		int month; 
		
		System.out.println("Enter month: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("there are 31 date in the month");
			break;
		case 2:
			int year;
			
			System.out.println("Enter year: ");
			year = sc.nextInt();
			
			if(year % 400 == 0) {
				System.out.println("This year is a leap year ");
				System.out.println("This month got 29 date");
			}else {
				System.out.println("This year i a normal year ");
				System.out.println("This month got 28 date");
			}
			break;
		case 4, 6, 9, 11:
			System.out.println("there are 30 date in the month");
			break;
		default:
			System.out.println("Error value, please enter again");
			break;
		}
		
		
	}
}
