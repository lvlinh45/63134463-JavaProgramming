package lab2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số điện sử dụng của tháng: ");
		float sodien = scanner.nextFloat();
		float tiendien;
		if(sodien < 0) {
			System.out.println("Tháng này bạn không sử dụng điện!");
		} else if(sodien >0 && sodien < 50){
			tiendien = 1000*sodien;
			System.out.printf("Do số điện của bạn là %.2f < 50 nên số tiền của bạn là: %.2f", sodien, tiendien);
		} else {
			tiendien = 50*1000 + (sodien-50)*1200;
			System.out.printf("Do số điện của bạn là %.2f > 50 nên số tiền của bạn là: %.2f", sodien, tiendien);
		}
	
	}

}
