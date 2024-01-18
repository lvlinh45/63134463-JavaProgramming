package lab3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		try {
			System.out.print("Nhập số lượng sinh viên: ");
			n = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Vui lòng nhập số");
		}
		
		scanner.nextLine();
		String[] hoten = new String[n];
		float[] diem = new float[n];
		String[] hocLuc = new String[n];
		 // NHẬP HỌ TÊN VÀ ĐIỂM SINH VIÊN  
		
		for(int i = 0; i< n;i++) {
			System.out.printf("Nhập vào họ và tên sinh viên thứ %d: ", i+1);
			hoten[i] = scanner.nextLine();
			
			boolean validInput = false;
            do {
            	
            	// BẮT LỖI NHẬP VÀO KHÔNG PHẢI SỐ
                try {
                    System.out.printf("Nhập vào điểm sinh viên thứ %d: ", i + 1);
                    float inputDiem = scanner.nextFloat();
                    
                    // KIỂM TRA NẾU ĐIỂM KHÔNG PHẢI TỪ 0 -> 10 THÌ NHẬP LẠI
                    
                    if(inputDiem >= 0 && inputDiem <=10) {
                    	diem[i] = inputDiem;
                    	validInput = true; // Nếu nhập thành công, đánh dấu là đã nhập đúng                    	
                    } else {
                    	 System.out.println("Vui lòng nhập điểm từ 0 đến 10!");
                    }
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập điểm là số!");
                    scanner.nextLine(); // Đọc bỏ dòng nhập không hợp lệ
                }
            } while (!validInput);
            
			scanner.nextLine();
			System.out.println();
			
			// GÁN HỌC LỰC VÀO MẢNG HOCLUC DỰA VÀO ĐIỂM
			if(diem[i] < 5) {
				hocLuc[i] = "Yếu";
			} else if(diem[i] >= 5 && diem[i] < 6.5) {
				hocLuc[i] = "Trung bình";
			} else if(diem[i] >= 6.5 && diem[i] < 7.5) {
				hocLuc[i] = "Khá";
			} else if(diem[i] >= 7.5 && diem[i] < 9) {
				hocLuc[i] = "Giỏi";
			} else if(diem[i] >= 9) {
				hocLuc[i] = "Xuất sắc";
			} 
			
					
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < i + 1; j++) {
		        if (diem[i] < diem[j]) {
		            // Hoán đổi điểm
		            float tempDiem = diem[i];
		            diem[i] = diem[j];
		            diem[j] = tempDiem;

		            // Hoán đổi tên
		            String tempHoten = hoten[i];
		            hoten[i] = hoten[j];
		            hoten[j] = tempHoten;

		            // Hoán Học lực
		            String tempHocluc = hocLuc[i];
		            hocLuc[i] = hocLuc[j];
		            hocLuc[j] = tempHocluc;
		        }
		    }
		}

		
		scanner.close();
		// DUYỆT MẢNG
				 
		for(int i =0; i< n;i++) 
		{ 
			System.out.printf("Họ và tên:  %s\n", hoten[i]); 
			System.out.printf("Điểm: %.2f\n", diem[i]);
			System.out.printf("Học lực:  %s\n", hocLuc[i]); 
			System.out.println();
		}
				
	}
}
