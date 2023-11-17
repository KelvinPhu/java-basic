package Java_foundation;

import java.util.Scanner;

public class bai_22_try_catch_finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		try {
			// cố gắng thực thi các khối lệnh try
			System.out.println("enter n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			// nếu có lỗi xảy ra sẽ thực thi các khối lệnh catch
			System.out.println("Error input");
		}finally {
			//đc thực thi kể cả khi có ngoại lệ hay ko có ngoại lệ
			System.out.println("finally!");
		}
		System.out.println("n is "+n);
		System.out.println("end!");
	}
}
