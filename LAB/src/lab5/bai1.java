package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		ArrayList<Double> listDouble = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		// Vì nhập số lượng tùy ý nên sử dụng vòng lặp while mà có điều kiện dừng trong đó
		
		while(true) {
			System.out.print("Nhập giá trị: ");
			Double x = scanner.nextDouble();
			listDouble.add(x);
			
			System.out.println("Bạn có muốn nhập thêm giá trị không? (Y/N)");
			scanner.nextLine();
			if(scanner.nextLine().equals("N")) {
				break;
			}
		}
		System.out.println("Giá trị của các phần tử trong arrayList là: ");
		for(Double value : listDouble) {
			System.out.print(value + " ");
		}
	}

}
