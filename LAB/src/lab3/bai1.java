package lab3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scannner = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Nhập vào số để kiểm tra nó có phải là số nguyên tố hay không: ");
			 n= scannner.nextInt();
		} while(n<=0);
		
		boolean flag = true;
		if(n<=2) {
			System.out.printf("Số bạn nhập không phải là số nguyên tố!");
		} else {
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.printf("Số bạn nhập là số nguyên tố!");
			} else {
				System.out.printf("Số bạn nhập không là số nguyên tố! ");
			}
		}
		
	
	}
}
