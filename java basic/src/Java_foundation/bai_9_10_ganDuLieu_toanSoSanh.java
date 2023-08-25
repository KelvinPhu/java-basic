package Java_foundation;
import java.util.Scanner;

public class bai_9_10_ganDuLieu_toanSoSanh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Gán dữ liệu
		 * a = b
		 * a += b
		 * a -= b
		 * a *= b
		 * a /= b
		 * a %= b*/
		
		float a;
		
		
		System.out.println("enter a: ");
		a = sc.nextFloat();
		
		System.out.println("a = " +a);
		
		a +=3;
		System.out.println("a += " +a);
		
		a -=3;
		System.out.println("a -= " +a);
		
		a *=3;
		System.out.println("a *= " +a);
		
		a /=3;
		System.out.println("a /= " +a);
		
		a %=3;
		System.out.println("a %= " +a);
		
		
		
		
		/*toán so sánh
		 * == bằng nha
		 * != khác nhau
		 * > lớn hơn
		 * < nhỏ hơn
		 * >= lớn hơn hoặc bằng
		 * <= bé hơn hoặc bằng
		 * */
		
		/*Toán điều kiện
		 * && AND, điều kiện và 
		 * || OR, điều kiện hoặc*/
		
		int num, num1;
		
		System.out.println("enter num: ");
		num = sc.nextInt();
		
		System.out.println("enter num1: ");
		num1 = sc.nextInt();
		
		System.out.println("num == num1 "+(num==num1));
		System.out.println("num != num1 "+(num!=num1));
		System.out.println("num < num1 "+(num<num1));
		System.out.println("num > num1 "+(num>num1));
		System.out.println("num <= num1 "+(num<=num1));
		System.out.println("num >= num1 "+(num>=num1));
		System.out.println("cả 2 là số chẳng:  "+(num % 2 == 0 && num1 % 2 == 0));
		System.out.println("1 trong 2 là số chẳng:  "+(num % 2 == 0 || num1 % 2 == 0));
	}
}
