package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testMang {
	public static void main(String[] args) {
		int[] soNguyen = {3,2,41,5};
		
		
		// Gọi từ lớp Arrays
		Arrays.sort(soNguyen);
		// chuyển mảng thành chuỗi ngăn cách bởi dấu phẩy
		Arrays.toString(soNguyen);
		// Gán 1 giá trị cho tất cả phần tử trong 1 mảng
		Arrays.fill(soNguyen,3);		
		for(int i = 0; i < soNguyen.length; i++) {
			System.out.printf("%d ", soNguyen[i]);
		}
		
		
	}

}
