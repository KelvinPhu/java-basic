package Java_foundation;

import java.util.Scanner;

public class bai_18_19_whileLoop_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// sử dụng khi số lần lặp không xác định trước và phụ thuộc vào điều kiện
		
		int x =1;
		
		while(x != 0) {
			System.out.println("enter 0 to exit, else, press anything to continue");
			x = sc.nextInt();
		}
		
		
		// vòng lặp vô hạn
		while(true) {
			// statement
			int number;
			System.out.println("enter a number");
			number = sc.nextInt();
			number++;
			// wanna break give condition to break
			if(number == 2343) {
				break;
			}
		}
		
		
		
		// practice Chuyển số thập phân sang nhị phân
		
		/*structure
		 * chia liên tục cho 2 và lấy số dư
		 * đảo nguộc chuỗi là kết quả
		 * 10 / 2 = 5 dư 0
		 * 5 / 2 = 2 dư 1
		 * 2 / 2 = 1 dư 0
		 * 1 / 2 = 0 dư 1*/
		
		int n;
		System.out.println("enter n (n>0): ");
		n = sc.nextInt();
		
		String nhiPhan = "";
		
		
		while(n > 0) {
			nhiPhan = (n%2) +  nhiPhan;
			n =n/2;
			System.out.println("số thập phân sau khi đổi qua số nhị phân: "+nhiPhan);
		}
		
		
		
	}
}
