/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * 
 */
public class bai1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.print("Mời bạn nhập điểm trung bình: ");
		float diemTB = scanner.nextFloat();
		System.out.printf("%s: %.2f điểm", hoten, diemTB);
	}

}
