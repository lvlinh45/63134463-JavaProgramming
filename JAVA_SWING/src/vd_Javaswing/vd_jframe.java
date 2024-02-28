package vd_Javaswing;

import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class vd_jframe {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // Tạo một thể hiên (đối tượng của lớp)
		f.setTitle("Ví dụ về frame"); // tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); // kích thước cửa sổ
		
		
		
		// Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnKhac = new JButton("Nhấn em đi");
		
		// Gắn lên form
		f.add(btnOK);
		f.add(btnKhac);
		// Chạy thử thì em đã ĐÈ lên tôi
		
		f.show(); // hiện cửa sổ
		
	}
}
