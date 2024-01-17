package lab2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
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
					System.out.printf("phương trình có nghiệm là: %.2f", x);
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
				System.out.printf("Phương trình có 2 nghiệm là: %.2f và %.2f", x1, x2);
			}
		}
	}

}
