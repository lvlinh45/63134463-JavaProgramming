package Bai0;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textKetqua;
	private JTextField txtB;
	private JTextField txtA;



	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập số thứ nhất (a)");
		lblNhpSTh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(47, 73, 213, 38);
		contentPane.add(lblNhpSTh_1);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(47, 134, 213, 38);
		contentPane.add(lblNhpSTh);
		
		textKetqua = new JTextField();
		textKetqua.setEditable(false);
		textKetqua.setEnabled(false);
		textKetqua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textKetqua.setBounds(231, 301, 291, 31);
		contentPane.add(textKetqua);
		textKetqua.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setBounds(231, 134, 291, 31);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lí cộng ở đây
				// viết lệnh xử lí ở một thủ tục/hàm, rồi gọi ở đây
				hamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(47, 207, 130, 38);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lí trừ ở đây
				hamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(213, 207, 130, 38);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lí nhân ở đây
				hamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(386, 207, 130, 38);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lí chia ở đây
				hamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(550, 207, 130, 38);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("KẾT QUẢ TÍNH TOÁN: ");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(47, 297, 213, 38);
		contentPane.add(lblKtQuTnh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setColumns(10);
		txtA.setBounds(231, 77, 291, 31);
		contentPane.add(txtA);
	} //Hết hàm tạo
	void hamXuLyCong () {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tong = soA + soB;
		// Đưa ra hiển thị lên điều khiển 
		// valueOf => Chuyển về chuỗi
		textKetqua.setText(String.valueOf(tong));
	}
	void hamXuLyTru () {
		// Lấy dữ liệu từ điều khiển
				String str_soA = txtA.getText();
				String str_soB = txtB.getText();
				Double soA = Double.parseDouble(str_soA);
				Double soB = Double.parseDouble(str_soB);
				// Tính toán
				double tong = soA - soB;
				// Đưa ra hiển thị lên điều khiển 
				// valueOf => Chuyển về chuỗi
				textKetqua.setText(String.valueOf(tong));
	}
	void hamXuLyNhan() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		// Tính toán
		double tong = soA * soB;
		// Đưa ra hiển thị lên điều khiển 
		// valueOf => Chuyển về chuỗi
		textKetqua.setText(String.valueOf(tong));
	}		
	void hamXuLyChia() {
		// Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		
		if(soB==0) {
			textKetqua.setText("B không thể bằng 0!");
			return;
		} 
		// Tính toán
		double tong = soA / soB;
		// Đưa ra hiển thị lên điều khiển 
		// valueOf => Chuyển về chuỗi
		textKetqua.setText(String.valueOf(tong));
		
		
	}	
	
}
