package Java_foundation;

import java.util.Scanner;

public class bai_21_break_continue_return {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*break
		 * thoát khỏi vòng lặp hoặc kết thúc một khối mã một cách đột ngột.
		 * Khi gặp "break" trong vòng lặp, nó sẽ kết thúc vòng lặp ngay lập tức và tiếp tục
		   thực hiện lệnh sau vòng lặp.
		 * Label & unlabel*/
		
		for (int i = 1; i <= 10; i++) {
		    if (i == 5) {
		        break; // Break the loop when i equals 5
		    }
		    System.out.println(i);
		}
		
		
		// break with label
		outloop: for (int i = 0; i < 5; i++) {
			inloop: for (int j = 0; j < 3; j++) {
				System.out.println("i: "+i);
				System.out.println("j: "+j);
				if(i == 2 && j == 2) {
					break outloop;
				}
			}
		}
		
		
		// continue
		/* bỏ qua phần còn lại của khối mã hiện tại và tiếp tục vòng lặp.
		 * các lệnh trong khối mã lệnh còn lại không được thực hiện và vòng lặp sẽ tiếp tục
		   với lần lặp tiếp theo.
		 * có 2 dạng label và unlabel*/
		
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        continue; // Skip the iteration when i equals 3
		    }
		    System.out.println(i);
		}
		
		
		
		// return
		/* trả về giá trị từ 1 phưng thức và kết thúc thực thi phương thức đó
		 * cũng có thể dùng để thoát khỏi vòng lặp */
		
		for (int i = 1; i <= 10; i++) {
	        if (i > 5.5) {
	            return; // Exit the method when i equals 5
	        }
	        System.out.println(i);
	    }
	    System.out.println("This line will not be executed");
		
	}
}
