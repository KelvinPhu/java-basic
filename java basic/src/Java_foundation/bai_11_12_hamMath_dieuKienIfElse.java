package Java_foundation;

import java.util.Scanner;

public class bai_11_12_hamMath_dieuKienIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Lớp Math cung cấp các phương thức hữu ích để thực hiện nhiều thao tác toán học khác nhau
		 * tự động nhập vào trình ứng dụng mà ko cần import
		 * các hằng và phương thức đều là static, dùng tham chiếu lớp và mà ko c6an2 khởi tạo*/
		
		double a, b;
		
		System.out.println("Enter a: ");
		a = sc.nextDouble();
		
		System.out.println("Enter b: ");
		b = sc.nextDouble();
		
		// Hàm trị tuyệt đối abs()
		System.out.println("|a| = " +Math.abs(a));
		
		//Hàm tìm min()
		System.out.println("min(a, b)" + Math.min(a, b));
		
		//Hàm tìm max()
		System.out.println("max(a, b)" + Math.max(a, b));
		
		//hàm làm tròn số lên ceil()
		System.out.println("ceil a: "+ Math.ceil(a));
		
		//hàm làm tròn số xuống floor()
		System.out.println("foor a: "+ Math.floor(a));
		
		// hàm căn bậc hai sqrt()
		System.out.println("căn bậc 2 a: "+Math.sqrt(a));
		
		// hàm a^b pow()
		System.out.println("so mu: "+Math.pow(a, b));
		
		
		//practice tính diện tích và chu vi hình tròn
		double r, chuVi, dienTich;
		
		System.out.println("Enter R: ");
		r = sc.nextInt();
		
		//Chu vi
		chuVi = 2 * Math.PI * r;
		System.out.println("chu vi: "+chuVi);
		
		//dienTich
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("dien tich: "+dienTich);
		
		
		
		// Câu lệnh điều kiện if..else
		/*là các ca6u lệnh được thực thi nếu biểu thức điều kiện trả về kết quả đúng true
		 *Có 2 dạng chính: if hoặc if..else */
		
		System.out.println("enter x: ");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("x is even");
		}else {
			System.out.println("x is odd");
		}
		
		//giải phương trình bậc nhất 
		/*phương trình bậc nhất ax + b = 0
		 * 
		 * a = 0
		 * b = 0 ==> PT vô số nghiệm
		 * b != 0 ==> PT vô nghiệm
		 * 
		 * a != 0 ==> PT có nghiệm x = -b/a*/
		
		double d,e,f;
		System.out.println("enter d: ");
		d = sc.nextDouble();
		System.out.println("enter e: ");
		e = sc.nextDouble();
		
		if(d == 0) {
			if(e == 0) {
				System.out.println("PT vô số nghiệm");
			}else {
				System.out.println("PT vô nghiệm");
			}
		}else {
			f = -e/d;
			System.out.println("ngiệm: "+f);
		}
	}
}
