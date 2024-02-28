package vd_Javaswing;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class vd_jframe {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Ví dụ về frame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.show();
		
	}
}
