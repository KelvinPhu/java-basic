package Java_foundation;

import java.util.Scanner;

public class bai_13_PTBac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*PT bậc 2: ax^2 + bx + c = 0
		 * 
		 * các biến: a, b, c, x1, x2, delta*/
		
		double a, b, c, x1, x2, delta;

		System.out.println("enter a: ");
		a = sc.nextDouble();
		System.out.println("enter b: ");
		b = sc.nextDouble();
		System.out.println("enter c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if(a == 0) {
			System.out.println("Enter wrong, please try again");
		}else {
			if(delta > 0) {
				x1 = (-b - Math.sqrt(delta)) / (2*a);
				x2 = (-b + Math.sqrt(delta)) / (2*a);
				System.out.println("Phương trình có 2 nghiệm x1: "+x1);
				System.out.println("Phương trình có 2 nghiệm x2: "+x2);
			}else if(delta == 0) {
				x1 = x2 = -b / 2*a;
				System.out.println("Phương trình có nghiệm kép: "+x1);
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
	}
}
