package Java_foundation;

import java.util.Scanner;

public class bai_16_17_forLoop_bangCuuChuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// sử dụng vòng lặp for dùng để lặp đi lặp lại các thao tác, chức năng
		
		for (int i = 0; i < 1; i++) {
			System.out.println("This is for loop");
			System.out.println("Print 2000 times");
		}
		
		
		
		// in bảng cửu chương
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println( i+ "x" +j+ "=" +(i*j));
			}
			System.out.println("-----");
		}
	}
}
