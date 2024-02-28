package vd_Javaswing;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class vd_jframe {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // Tạo một thể hiên (đối tượng của lớp)
		f.setTitle("Ví dụ về frame"); // tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); // kích thước cửa sổ
		
		// Quy định bố cục (Layout)
		
		f.setLayout(new FlowLayout());
		
		// Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnKhac = new JButton("Nhấn em đi");
		
		// Tạo tai nghe
		BoLangNgheOK ok = new BoLangNgheOK();
		btnOK.addActionListener(ok);
		
		
		
		// Anonymous
		btnKhac.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setTitle("Hi keoo");
				dialog.setSize(200,300);
				dialog.show();	
			}
		});
		
		
		
		// Gắn lên form
		f.add(btnOK);
		f.add(btnKhac);
		// Chạy thử thì em đã "HẾT ĐÈ" lên tôi
		
		f.show(); // hiện cửa sổ
	}
	
	private static class BoLangNgheOK implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó về btnOK");
			dialog.setSize(200,300);
			dialog.show();
			
		}
		
	}
	
	
}
