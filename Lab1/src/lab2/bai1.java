package lab2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
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
				System.out.printf("phương trình có nghiệm là: %.2f", x);
			}
		}
	}

}
