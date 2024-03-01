package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

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
		generateScreen();
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
	public void createBackground(int bgNum, String bgFileName) {
		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50,50,700,350);
		bgPanel[bgNum].setBackground(Color.blue);
		bgPanel[bgNum].setLayout(null);
		window.add(bgPanel[bgNum]);
		
		
		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0,0,700,350);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		
		  // Resize the image to 700x350
	    Image img = bgIcon.getImage().getScaledInstance(700, 350, Image.SCALE_SMOOTH);
	    
	    ImageIcon resizedIcon = new ImageIcon(img);
	    
	    
		bgLabel[bgNum].setIcon(resizedIcon);
		
	
	}
	public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, 
			String objFileName,int scaleX, int scaleY, String choice1Name, String choice2Name, String choice3Name) {
		// CREATE POP MENU
		// hiện menu khi click chuộc phải vào object
		JPopupMenu popMenu = new JPopupMenu();
		// CREATE POP MENU ITEM
		JMenuItem menuItem[] = new JMenuItem[4]; //use [1] [2] [3]
		
		menuItem[1] = new JMenuItem(choice1Name);
		// Add item vào popMenu
		popMenu.add(menuItem[1]);
		
		menuItem[2] = new JMenuItem(choice2Name);
		// Add item vào popMenu
		popMenu.add(menuItem[2]);
		
		menuItem[3] = new JMenuItem(choice3Name);
		// Add item vào popMenu
		popMenu.add(menuItem[3]);
		
		
		// CREATE OBJECTS
		JLabel objectLabel = new JLabel();
//		objectLabel.setBounds(440, 140, 200, 200);
		objectLabel.setBounds(objx, objy, objWidth, objHeight);
		ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		
		Image img = objectIcon.getImage().getScaledInstance(scaleX, scaleY, Image.SCALE_SMOOTH);
	    
	    ImageIcon resizedIcon = new ImageIcon(img);
		
		objectLabel.setIcon(resizedIcon);
		
		
		
		// DÙNG MOUSE LISENER
		objectLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel, e.getX(), e.getY());
				}
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		bgPanel[bgNum].add(objectLabel);
		bgPanel[bgNum].add(bgLabel[1]);
	}
	public void generateScreen() {
		// SCREEN1
		createBackground(1, "forest.png");
		createObject(1, 440, 140, 200, 200, "house1.png",200,200, "Look", "Talk", "Rest");
		createObject(1, 70, 180, 150, 150, "dinosaur.png",150,150, "Look", "Talk", "Attack");
		createObject(1, 300, 240, 70, 70, "chest.png",70,70,  "Look", "Talk", "Open");
	}
}
