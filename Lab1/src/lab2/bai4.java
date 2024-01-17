package lab2;

import java.util.Scanner;

public class bai4 {

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		// Thông báo chọn thực đơn
		System.out.println("THỰC ĐƠN");
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Xin mời bạn chọn thực đơn: ");
		int value = scanner.nextInt();
		switch (value) {
		case 1: {
			System.out.println("Nhập a: ");
			float a = scanner.nextFloat();
			System.out.println("Nhập b: ");
			float b = scanner.nextFloat();
			float x;
			// y = ax+b;
			if(a==0) {
				if(b==0) {
					System.out.println("Phương trình có vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				x = -b/a;
				if(x==0) {
					System.out.println("Phương trình có nghiệm là 0!");
				} else {
					System.out.printf("phương trình có nghiệm là: %.2f\n", x);
				}
			}
			System.out.printf("Cảm ơn bạn đã chọn thực đơn %d!", value);
			break;
		}
		case 2: {
			System.out.print("Nhập a: ");
			float a = scanner.nextFloat();
			System.out.print("Nhập b: ");
			float b = scanner.nextFloat();
			System.out.print("Nhập c: ");
			float c = scanner.nextFloat();
			float x, x1, x2;
			float delta = (float)Math.pow(b, 2) - 4*a*c;
			// y = ax^2 + bx +c;
			if (a ==0) {
				if(b==0) {
					if(c==0) {
						System.out.println("Phương trình có vô số nghiệm");
					} else {
						System.out.println("Phương trình vô nghiệm");
					}
				} else {
					x = -c/b;
					if(x==0) {
						System.out.println("Phương trình có nghiệm là 0!");
					} else {
						System.out.printf("phương trình có nghiệm là: %.2f\n", x);
					}
				}
			} else {
				if(delta < 0) {
					System.out.println("Phương trình vô nghiệm!");
				} else if(delta == 0) {
					x = -b/(2*a);
					System.out.printf("Phương trình có 1 nghiệm là: %f", x);
				} else {
					x1 = (float)(-b + Math.sqrt(delta)) / (2*a); 
					x2 = (float)(-b - Math.sqrt(delta)) / (2*a); 
					System.out.printf("Phương trình có 2 nghiệm là: %.2f và %.2f\n", x1, x2);
				}
			}
			System.out.printf("Cảm ơn bạn đã chọn thực đơn %d!", value);
			break;
		}
		case 3: {
			System.out.print("Nhập vào số điện sử dụng của tháng: ");
			float sodien = scanner.nextFloat();
			float tiendien;
			if(sodien < 0) {
				System.out.println("Tháng này bạn không sử dụng điện!");
			} else if(sodien >0 && sodien < 50){
				tiendien = 1000*sodien;
				System.out.printf("Do số điện của bạn là %.2f < 50 nên số tiền của bạn là: %.2f\n", sodien, tiendien);
			} else {
				tiendien = 50*1000 + (sodien-50)*1200;
				System.out.printf("Do số điện của bạn là %.2f > 50 nên số tiền của bạn là: %.2f\n", sodien, tiendien);
			}
			System.out.printf("Cảm ơn bạn đã chọn thực đơn %d!", value);
			break;
		}
		default:
			System.out.printf("Bạn đã không chọn thực đơn nào!");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	
	}

}
