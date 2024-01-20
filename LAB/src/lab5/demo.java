package lab5;

import java.util.ArrayList;

public class demo {

//	JAVA có 3 cách in là print, println và printf: 2 cái đầu thì 1 cái là in và in xuống hàng, printf thì có thêm đặc tả
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList: Như 1 mảng động, có thể tự động thêm bớt các phần tử, không fix cứng như mảng bình thường
		// => Ngoài ra còn có thể thực hiện 1 số phép toán như giao, hợp, hiệu,...
		/* 1. ArrayList không định kiểu: Add data kiểu gì vào cũng được
		 * - Nó sẽ tự động chuyển sang Lớp Wrapper khi add vào
		 * - Khi truy xuất dữ liệu thì cần ép về kiểu dữ liệu gốc nếu không sẽ lỗi
		 */	
		ArrayList a = new ArrayList();
		a.add("Hello ArrayList");
		a.add(true);
		a.add(1);
		a.add(2.5);
		
		// Cần phải ép kiểu về kiểu gốc của phần tử, và dùng đặc tả với printf nếu tạo 1 biến 
		Integer getA = (Integer)a.get(2);
		System.out.printf("%d\n",getA);
		// Khi in ra trong ArrayList thì không dùng printf nếu không tạo biến
		System.out.println(a.get(3));
		
		/* 2. ArrayList định kiểu: Add Data 1 kiểu nhất định
		 * - không cần ép về KDL gốc
		 * - Nên sử dụng vì nó mới hơn và tối ưu hơn
		 */
		ArrayList<Integer> b = new ArrayList<Integer>();
//		Ta có thể khai báo size cụ thể ArrayList VD: ArrayList<Integer> b = new ArrayList<Integer>(20);
		b.add(1);
		b.add(2);
		b.add(3);
		
		///////////////////////////////////////////////////////////////////////
		
		// Hiển thị các phần tử của ArrayList
		System.out.print("Các phần tử có trong ArrayList a là: ");
		System.out.println(a);
		
		// Duyệt các phần tử trong ArrayList - Vòng lặp for
		System.out.print("Duyệt các phần tử có trong ArrayList b bằng vòng lặp for là: ");
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}
		
		// Duyệt các phần tử trong ArrayList - Vòng lặp foreach
		System.out.print("Duyệt các phần tử có trong ArrayList b bằng vòng lặp foreach là: ");
		for(Integer item : b) {
			System.out.println(item);
		}
		
		// TEST CÁC PHƯƠNG THỨC
		System.out.println("CHECK CÁC PHƯƠNG THỨC");
		ArrayList<String> languages = new ArrayList<String>();
		languages.add("JS");
		languages.add("Ruby");
		languages.add("Dart");
		languages.add(0,"PHP");
		languages.remove("PHP"); // REMOVE THEO VỊ TRÍ INDEX HOẶC THEO OBJECT, VD theo vị trí languages.remove(0); 
//		languages.clear(); => Xóa sạch data trong arrayList
		
		languages.set(0, "Javascript"); // => Gán lại giá trị theo index
		languages.get(0); // => lấy ra giá trị theo index
		languages.size(); // => Lấy ra số phần tử, thường dùng để duyệt mảng
		boolean check =	languages.contains("Ruby"); // => Trả về true hoặc false, kiểm tra xem có tồn tại giá trị hay không
//		System.out.println(check);
		
		System.out.println(languages.isEmpty()); // Trả về true hoặc false, kiểm tra xem arrayList có rỗng hay không
		System.out.println(languages.indexOf("Ruby")); // Truyền vào dữ liệu, trả ra vị trí
		System.out.println(languages);
		
		// MỘT SỐ VÍ DỤ
		System.out.println("MỘT SỐ VÍ DỤ TRONG SLIDE: ");
		ArrayList<String> name = new ArrayList<String>();
		name.add("Cường");
		name.add("Tuấn");
		name.add("Phương");
		name.add("Hồng");
		name.add(1, "Hạnh");
		name.set(0, "Tèo");
		name.remove(3);
		name.remove("Phương");
		
		int x = name.size() - name.indexOf("Hồng");
		
		// LƯU Ý: Nếu thay name.indexOf("Hồng") = name.indexOf("Phương") thì kết quả sẽ là 5 vì Phương không tìm thấy -> trả về -1 mà 4 -- 1 = 5
		System.out.printf("Giá trị của biểu thức x là: %d", x);
		
	}

}
