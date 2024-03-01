package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI {
	GameManager gm;
	JFrame window;
	
	
	// Tạo ra text Area
	public JTextArea messageText;
	// Tạo ra background Panel
	public JPanel bgPanel[] = new JPanel[10];
	public JLabel bgLabel[] = new JLabel[10];
	
	public UI(GameManager gm) {
		this.gm = gm;
		createMainField();
		createBackground();
		window.setVisible(true);
	}
	
	public void createMainField() {
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		
		messageText = new JTextArea("THIS IS SMAPLE TEXT");
		messageText.setBounds(50, 410, 700, 150);
		messageText.setBackground(Color.black);
		messageText.setForeground(Color.white);
		messageText.setEditable(false);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setFont(new Font("Book Antiqua", Font.PLAIN,26));
		window.add(messageText);
	}
	public void createBackground() {
		bgPanel[1] = new JPanel();
		bgPanel[1].setBounds(50,50,700,350);
		bgPanel[1].setBackground(Color.blue);
		bgPanel[1].setLayout(null);
		window.add(bgPanel[1]);
		
		
		bgLabel[1] = new JLabel();
		bgLabel[1].setBounds(0,0,700,350);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("forest.png"));
		
		  // Resize the image to 700x350
	    Image img = bgIcon.getImage().getScaledInstance(700, 350, Image.SCALE_SMOOTH);
	    
	    ImageIcon resizedIcon = new ImageIcon(img);
	    
	    
		bgLabel[1].setIcon(resizedIcon);
		
		bgPanel[1].add(bgLabel[1]);
	}
}
