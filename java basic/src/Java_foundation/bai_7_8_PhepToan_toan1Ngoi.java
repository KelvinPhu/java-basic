package Java_foundation;
import java.util.Scanner;

public class bai_7_8_PhepToan_toan1Ngoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		/* toán cơ bản
		 * + cộng
		 * - trừ
		 * * nhân
		 * / chia
		 * % chia lấy dư*/
		
		System.out.println("Nhap vao a: ");
		a = sc.nextInt();
		System.out.println("NHap vao b: ");
		b = sc.nextInt();
		
		
		int tong = a + b;
		System.out.println("total: " +tong);
		
		int tru = a - b;
		System.out.println("total: " +tru);
		
		int nhan = a * b;
		System.out.println("total: " +nhan);
		
		float chia = (float)a / b;
		System.out.println("total: " +chia);
		
		int phanTram = a % b;
		System.out.println("total: " +phanTram);
		
		/*Toán 1 ngôi
		 * ++
		 * --
		 * --/++a: vị trí đặt trước biến thì biến sẽ tăng hoặc giảm rồi mới thực hiện câu lệnh tại vị trí đó
		 * a++/--: vị trí đặt sau biến thì giá trị của biến sẽ được thay đổi sau khi bạn kết thúc câu lệnh */
		
		int num1, num2;
		
		System.out.println("enter num2: ");
		num2 = sc.nextInt();
		
		num1 = num2++;
		
		System.out.println("num1: "+num1);
		
	}
}
