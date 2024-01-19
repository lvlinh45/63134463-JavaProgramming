package lab4;


import java.util.Scanner;

// COMMENT NHIỀU DÒNG TRONG ECLIPE: CTRL + SHIFT + /

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	// CÁCH TẠO GETTER, SETTER NHANH TRONG ECLIPSE: DÙNG TỔ HỢP PHÍM ALT + SHIFT + S => Chọn generate GETTER, SETTER
	
	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}


	
	
	// DÙNG TỔ HỢP PHÍM ALT + SHIFT + S => Chọn generate Constructor
	public SanPham(String tenSP, double donGia, double giamGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	// CÁCH 1: TẠO RỒI CHỈ ADD 2 THAM SỐ, CÁC THAM SỐ KHÔNG ADD MẶC ĐỊNH LÀ 0
	public SanPham(String tenSP, double donGia) {
		super();
		this.tenSP = tenSP;
		this.donGia = donGia;
	}

	// CÁCH 2: this(tenSp, donGia, 0); => Gọi ra constructor cùng lớp, có 3 tham số, nếu không có thì nó sẽ bị lỗi 
	/* public SanPham(String tenSp, double donGia){
		this(tenSp, donGia, 0);
	} */



	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tên sản phẩm: ");
		tenSP = scanner.nextLine();
		System.out.print("Nhập vào giá: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhập vào giảm giá: ");
		giamGia = scanner.nextDouble();
		System.out.println();
	}
	
	private double getThueNhapKhau()  {
		return donGia*0.1;
	}
	
	public double xemThueNhapKhau()  {
		return getThueNhapKhau();
	}
	
	
	public void xuat() {
		System.out.printf("Tên sản phẩm: %s\n",tenSP);
		System.out.printf("Đơn giá: %.2f\n",donGia);
		System.out.printf("Giảm giá: %.2f\n",giamGia);
		System.out.printf("Thuế nhập khẩu: %.2f\n",getThueNhapKhau());
		System.out.println();
	}
	

	
}
