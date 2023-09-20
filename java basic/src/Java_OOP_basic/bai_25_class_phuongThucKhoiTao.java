package Java_OOP_basic;

public class bai_25_class_phuongThucKhoiTao {
	// xây dựng lớp
	/* cần định nghĩa 
	 * các thuộc tính (biến)
	 * các hành vi (hàm)*/
	
//	public
//	abstract
//	class className
	
	private int day, month, year;
	
	//constructor
	public bai_25_class_phuongThucKhoiTao(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = month;
	}
	
	public void printDay() {
		System.out.println("day: "+this.day);
	}
	
	public void printMonth() {
		System.out.println("month: "+this.month);
	}
	
	public void printYear() {
		System.out.println("year: " +this.year);
	}

	// main method
	public static void main(String[] args) {
		bai_25_class_phuongThucKhoiTao classPT = new bai_25_class_phuongThucKhoiTao(25, 4, 2024);
		classPT.printDay();
		classPT.printMonth();
		classPT.printYear();
	}
}
