package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// FORMAT CODE: CTRL SHIFT F
public class bai3 {
	// ĐẶT BIẾN TOÀN CỤC ĐỂ HÀM NÀO CŨNG TRUY CẬP ĐƯỢC
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<String> tenspList = new ArrayList<String>();
	public static ArrayList<Integer> giaList = new ArrayList<Integer>();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("BẢNG CHỨC NĂNG");
		System.out.println("----------------------------");
		System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
		System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
		System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
		System.out.println("4. Xuất giá trung bình của các sản phẩm");
		System.out.println("5. Kết thúc");
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
					xoa();
					break;
				case 4:
					xuatGiaTB();
					break;
				default:
					System.out.println("Bạn đã không lựa chọn chức năng nào!");
//						System.exit(0);
					break;
				}

				System.out.print("Bạn có muốn thực hiện chức năng khác?(Y/N): ");
				if (scanner.nextLine().equals("N")) {
					validInput = true;
					break;
				}

			} catch (Exception e) {
				System.out.println("Vui lòng chọn số từ 1-5 để thực hiện chức năng!");
				scanner.nextLine();
			}
		} while (!validInput);
	}

	// HÀM NHẬP
	public static void nhap() {
		while (true) {

			System.out.print("Nhập tên sản phẩm: ");
			String tenSP = scanner.nextLine();
			tenspList.add(tenSP);

			System.out.print("Nhập giá sản phẩm: ");
			int giaSP = scanner.nextInt();
			giaList.add(giaSP);

			scanner.nextLine();
			System.out.print("Bạn có muốn nhập tiếp?(Y/N): ");
			if (scanner.nextLine().equals("N")) {
				break;
			}
		}
		System.out.println();
	}

	// HÀM XUẤT
	public static void xuat() {
		// SẮP XẾP THEO THÔNG THƯỜNG
		if (giaList.isEmpty()) {
			System.out.println("Không có thông tin nào để sắp xếp và xuất! Vui lòng nhập trước!");
			System.out.println();
		} else {
			for (int i = 0; i < giaList.size() - 1; i++) {
				for (int j = i + 1; j < giaList.size(); j++) {
					if (giaList.get(i) < giaList.get(j)) {
						Collections.swap(giaList, i, j);
						Collections.swap(tenspList, i, j);
					}
				}
			}

			// Xuất danh sách
			for (int i = 0; i < giaList.size(); i++) {
				System.out.printf("Tên sản phẩm: %s\n", giaList.get(i));
				System.out.printf("Giá sản phẩm: %s\n", tenspList.get(i));
				System.out.println();
			}
		}
	}

	public static void xoa() {
		if (tenspList.isEmpty() == true) {
			System.out.println("Hiện tại danh sách không có thông tin gì để xóa!");
		} else {
			System.out.print("Nhập phần tử bạn muốn xóa: ");
			String itemDelete = scanner.nextLine();
			for (int i = 0; i < tenspList.size(); i++) {
				if (itemDelete.equals(tenspList.get(i))) {
					tenspList.remove(i);
					giaList.remove(i);
					break;
				}
			}
		}
		System.out.println();
	}

	public static void xuatGiaTB() {
		if (giaList.isEmpty()) {
			System.out.println("Không có thông tin nào để xuất giá trung bình! Vui lòng nhập trước!");
			System.out.println();
		} else {
			int dem = 0;
			int tong = 0;
			float trungBinh;
			for (int i = 0; i < giaList.size(); i++) {
				tong += giaList.get(i);
				dem++;
			}
			trungBinh = (float) tong / dem;
			System.out.printf("Giá trị trung bình của sản phẩm là: %.2f", trungBinh);
			System.out.println();
		}
	}
}
