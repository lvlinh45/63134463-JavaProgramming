package lab1;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Nhập vào cạnh của 1 khối lập phương: ");
		float canh = scanner.nextFloat();
//		float thetich = canh*canh*canh;
		float thetich = (float)Math.pow(canh, 3);
		System.out.printf("Thể tích của khối lập phương là: %.2f", thetich);
	}
}
