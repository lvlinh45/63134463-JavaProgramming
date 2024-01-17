package lab1;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		float dai = scanner.nextFloat();
		System.out.print("Nhập chiều rộng: ");
		float rong = scanner.nextFloat();
		
		float chuvi = (dai + rong)*2;
		float dientich = dai * rong;
		float canhnhonhat = Math.min(dai, rong);
		
		System.out.printf("Chu vi của hình chữ nhật là: %.2f\n", chuvi);
		System.out.printf("Diện tích của hình chữ nhật là: %.2f\n", dientich);
		System.out.printf("Cạnh nhỏ nhất của hình chữ nhật là: %.2f\n", canhnhonhat);
	}

}
