package lab1;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhập b: ");
		float b = scanner.nextFloat();
		System.out.print("Nhập c: ");
		float c = scanner.nextFloat();

//		Tính delta
		float delta = (float)Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("Giá trị của delta là: %.2f\n", delta);
	
//		Tính căn delta
		if(delta <= 0) {
			System.out.println("Delta nhỏ hơn hoặc bằng 0 nên không thể khai căn!");
		} else {
			float canDelta = (float)Math.sqrt(delta);
			System.out.printf("Giá trị của căn delta là: %.2f", canDelta);
			
		}
		
		
	
	}

}
