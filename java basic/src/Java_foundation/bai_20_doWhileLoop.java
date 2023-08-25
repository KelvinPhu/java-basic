package Java_foundation;

import java.util.Scanner;

public class bai_20_doWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ko khác while loop là mấy
		// khối mã sẽ được thực thi ít nhất 1 lần trước khi xét đến điều kiện
		
		int i;
		
		do {
			System.out.println("Enter i: ");
			i = sc.nextInt();
		} while (i >= 0);
	}
}

