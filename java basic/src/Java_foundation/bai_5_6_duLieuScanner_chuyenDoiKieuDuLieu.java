package Java_foundation;

//import khi sử dụng dữ liệu Scanner
import java.util.Scanner;

public class bai_5_6_duLieuScanner_chuyenDoiKieuDuLieu {
	
	/*Phương thước đc sữ dụng vs Scanner
	 * nextBoolean()
	 * nextByte()
	 * nextDouble()
	 * nextFloat
	 * nextInt()
	 * nextLine()
	 * nextLong()
	 * nextShort()*/
	
	
	
	public static void main(String[] args) {
		
		//cách khai báo Scanner
		Scanner s = new Scanner(/*nhập dữ liệu từ file, nếu ko có nhập System.in*/ System.in);
		System.out.println("Enter your fullName: ");
		String fullName = s.nextLine();
		
		System.out.println("Your age: ");
		int age = s.nextInt();
		
		System.out.println("Your score: ");
		float score = s.nextFloat();
		
		System.out.println("Your full Name: "+fullName);
		System.out.println("Your Age: "+age);
		System.out.println("Your Score: "+score);
		
		
		//chuyển đổi kiểu dữ liệu 
		/*
		 * Ép kiểu ngầm định
		 	* khi 1 kiểu đc gán cho 1 kiểu khác thì tự động chuyển kiểu dữ liệu 
		 	* 2 kiểu phải tương thích
		 	* kiểu đích phải lớn hơn kiểu nguồn
		 	* int ==> float
		 * 
		 * Ép kiểu tưởng minh
		 	* Khi cần chuyển qua kiểu có độ chính xác cao hơn
		 	* float ==> int*/
		
		// ép kiểu ngầm định int ==> float
		int a = 100;
		int b = 2;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		float c = a;
		float d = b;
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		
		//Ép kiểu tưởng minh float ==> int
		
		float e = 3.53232f;
		float f = 9.5f;
		System.out.println("e: "+e);
		System.out.println("f: "+f);
		
		int g = (int)e;
		int h = (int)f;
		System.out.println("g: "+g);
		System.out.println("h: "+h);
	}
	
	

}
