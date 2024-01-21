package lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
	// ĐẶT BIẾN TOÀN CỤC ĐỂ HÀM NÀO CŨNG TRUY CẬP ĐƯỢC
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> hotenList = new ArrayList<String>();
	
	public static void main(String[] args) {
		menu();
		
	}
	
	public static void menu() {
		System.out.println("BẢNG CHỨC NĂNG");
		System.out.println("----------------------------");
		System.out.println("1. Nhập danh sách họ và tên");
		System.out.println("2. Xuất danh sách vừa nhập");
		System.out.println("3. Xuất danh sách ngẫu nhiên");
		System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
		System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
		System.out.println("6. Kết thúc");
		System.out.println("----------------------------");
		
		
//		SWITCH 

			
			int value = 0;
			
			boolean validInput = false;
			
			do {
				try {
					System.out.print("Mời bạn chọn chức năng bạn muốn thức hiện: ");
					 value = scanner.nextInt();
					System.out.println();
					scanner.nextLine();
					
					switch (value) {
					case 1:
						nhap();
						break;
					case 2:
						xuat();
						break;
					case 3:
						ngaunhien();
						break;
					case 4:
						sapxep();
						break;
					case 5:
						xoa();
						break;
					default:
						System.out.println("Bạn đã không lựa chọn chức năng nào!");
						break;
					}	
					
					System.out.print("Bạn có muốn thực hiện chức năng khác?(Y/N): ");
					if(scanner.nextLine().equals("N")) {
						validInput = true;
						break;
					}
					
				} catch (Exception e) {
					 System.out.println("Vui lòng chọn số từ 1-6 để thực hiện chức năng!");
					 scanner.nextLine();
				}
			} while (!validInput);
		}

	
	// HÀM NHẬP
	public static void nhap() {
		while(true) {
			
			System.out.print("Nhập họ và tên: ");
			String hoten = scanner.nextLine();
			hotenList.add(hoten);

			
			System.out.print("Bạn có muốn nhập tiếp?(Y/N): ");
			if(scanner.nextLine().equals("N")) {
				break;
			}
			
		}
		System.out.println();
	}
	// HÀM XUẤT
	public static void xuat() {
	
		if(hotenList.isEmpty() == true) {
			System.out.println("Hiện tại danh sách không có thông tin gì!");
		} else {
			System.out.println("Danh sách là: ");
			for(String value : hotenList) {
				System.out.println(value);
			}
		}
		System.out.println();
	}
	public static void ngaunhien() {
//	 Collections.shuffle(list): Hoán đổi ngẫu nhiên các phần tử trong list
		
		if(hotenList.isEmpty() == true) {
			System.out.println("Hiện tại danh sách không có thông tin gì để sắp xếp ngẫu nhiên!");
		} else {
			Collections.shuffle(hotenList);
			System.out.println("Danh sách hoán đổi ngẫu nhiên các phần tử trong list là: ");
			for(String value : hotenList) {
				System.out.println(value);
			}
		}
		
		System.out.println();
	}
	
	public static void sapxep() {
//		Collections.sort(list): sắp xếp tăng dần
//		Collections.reverse(list): Đảo ngược các phần tử
	
		
		if(hotenList.isEmpty() == true) {
			System.out.println("Hiện tại danh sách không có thông tin gì để sắp xếp!");
		} else {
			Collections.sort(hotenList);
			Collections.reverse(hotenList);
			System.out.println("Sắp xếp giảm dần các phần tử trong list là: ");
			for(String value : hotenList) {
				System.out.println(value);
			}
		}
		
		System.out.println();
	}
	
	public static void xoa()
	{
		if(hotenList.isEmpty() == true) {
			System.out.println("Hiện tại danh sách không có thông tin gì để xóa!");
		} else {
			System.out.print("Nhập phần tử bạn muốn xóa: ");
			String itemDelete = scanner.nextLine();
			for(String value : hotenList) {
				if(itemDelete.equals(value)) {
					hotenList.remove(value);
					break;
				}
			}
		}
		System.out.println();
	}
}
