package Java_foundation;

import java.util.Scanner;

public class bai_23_arrayMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double array[] = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter 10 time value of array: ");
			array[i] = sc.nextDouble();
		}
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println("total: " +total);
		
		
		double array2[] = new double[] {32,43,54,235,3453,5345.435,45,3453,34534,53};
		for (int i = 0; i < array2.length; i++) {
			System.out.println("print out array 2: "+array2[i]);
		}
		
		// Giới thiệu về lập trình hướng đối tượng OOP & OOL
		// kế thừa và đa hình
		
		// Giới thiệu về phần mềm vẽ sơ đồ lớp UML
		
	}
}
