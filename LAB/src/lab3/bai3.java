package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		int n = scanner.nextInt();
		
		// KHAI BÁO MẢNG
		int[] a = new int[n];
		for(int i =0; i< n;i++) {
			System.out.printf("Nhập vào phần tử thứ %d: ", i+1);
			a[i] = scanner.nextInt();
		}
		
		// SẮP XẾP MẢNG
		// sau khi đã sort thì phần tử nhỏ nhất là a[0]
		Arrays.sort(a);
		
		// TÌM RA PHẦN TỬ NHỎ NHẤT	
		int min = a[0];	
		for(int i = 0; i<n;i++) {
			if(a[i]< min) {
				min = a[i];
			}
		}
		System.out.printf("Phần tử có giá trị nhỏ nhất là: %d\n", min);
		
		
		// TỔNG CÁC SỐ CHIA HẾT CHO 3
		int dem = 0;
		int tong = 0;
		for(int i =0; i< n;i++) {
			if(a[i]%3 == 0) {
				dem++;
				tong += a[i];
			}
		}
		 float tongchiahetcho3 = (float)tong/dem;
		  
		System.out.printf("Tổng các số chia hết cho 3 là: %.2f", tongchiahetcho3);
		
		// DUYỆT MẢNG
		/* 
		 * for(int i =0; i< n;i++) { System.out.printf("Phần tử thứ %d là: %d\n",i+1,
		 * a[i]); }
		 */
	
	}

}
