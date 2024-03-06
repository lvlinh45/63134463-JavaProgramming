package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	
	// PLAYER UI
	JPanel lifePanel;
	JLabel lifeLabel[] = new JLabel[6];
	JPanel inventoryPanel;
	
	public JLabel swordLabel, shieldLabel, lanternLabel;
	
	// GAME OVER UI
	public JLabel titltLabel;
	public JButton restartButton;
	
	public JLabel titltLabelWin;
	
	
	public UI(GameManager gm) {
		this.gm = gm;
		createMainField();
		createPlayerField();
		createGameOverField();
		createWinField();
		generateScene();
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
		bgPanel[bgNum].setVisible(false);
		window.add(bgPanel[bgNum]);
		
		
		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0,0,700,350);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		
		  // Resize the image to 700x350
	    Image img = bgIcon.getImage().getScaledInstance(700, 350, Image.SCALE_SMOOTH);
	    
	    ImageIcon resizedIcon = new ImageIcon(img);
	    
	    
		bgLabel[bgNum].setIcon(resizedIcon);
	}
	
	
	public void createGameOverField() {
		titltLabel = new JLabel("", JLabel.CENTER);
		titltLabel.setBounds(200,150,400,150);
		titltLabel.setForeground(Color.red);
		titltLabel.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		titltLabel.setVisible(false);
		window.add(titltLabel);
		
		
		restartButton = new JButton();
		restartButton.setBounds(340,320,120,50);
		restartButton.setBorder(null);
		restartButton.setBackground(null);
		restartButton.setForeground(Color.white);
		restartButton.setFocusPainted(false);
		restartButton.addActionListener(gm.aHandeler);
		restartButton.setActionCommand("Restart");
		restartButton.setVisible(false);
		window.add(restartButton);
		
	}
	
	public void createWinField() {
		titltLabelWin = new JLabel("", JLabel.CENTER);
		titltLabelWin.setBounds(200,150,400,150);
		titltLabelWin.setForeground(Color.white);
		titltLabelWin.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		titltLabelWin.setVisible(false);
		window.add(titltLabelWin);
		
		
	}
	
	
	
	
	public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, 
			String objFileName,int scaleX, int scaleY, String choice1Name, String choice2Name, String choice3Name,  String choice1Command
			,  String choice2Command,  String choice3Command) {
		// CREATE POP MENU
		// hiện menu khi click chuộc phải vào object
		JPopupMenu popMenu = new JPopupMenu();
		// CREATE POP MENU ITEM
		JMenuItem menuItem[] = new JMenuItem[4]; //use [1] [2] [3]
		
		menuItem[1] = new JMenuItem(choice1Name);
		menuItem[1].addActionListener(gm.aHandeler);
		menuItem[1].setActionCommand(choice1Command);
		// Add item vào popMenu
		popMenu.add(menuItem[1]);
		
		menuItem[2] = new JMenuItem(choice2Name);
		menuItem[2].addActionListener(gm.aHandeler);
		menuItem[2].setActionCommand(choice2Command);
		// Add item vào popMenu
		popMenu.add(menuItem[2]);
		
		menuItem[3] = new JMenuItem(choice3Name);
		menuItem[3].addActionListener(gm.aHandeler);
		menuItem[3].setActionCommand(choice3Command);
		// Add item vào popMenu
		popMenu.add(menuItem[3]);
		
		
		// CREATE OBJECTS
		JLabel objectLabel = new JLabel();
		// CHECK VỊ TRÍ CÁC ITEM
//		objectLabel.setOpaque(true);
//		objectLabel.setBackground(Color.blue);
		
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
	
	}
	
	public void createArrowButton(int bgNum, int x, int y, int width, int height, 
			String arrowFileName, String command) {
		ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));
		
		// SET lại kích thước
		 Image img = arrowIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		 ImageIcon resizedIcon = new ImageIcon(img);
		    
		JButton arrowButton = new JButton();
		arrowButton.setBounds(x,y,width,height);
		arrowButton.setContentAreaFilled(false);
		arrowButton.setFocusPainted(false);
		arrowButton.setIcon(resizedIcon);
		arrowButton.addActionListener(gm.aHandeler);
		arrowButton.setActionCommand(command);
		arrowButton.setBorderPainted(false);

		
		
		bgPanel[bgNum].add(arrowButton);
		
	}
	
	public void createPlayerField() {
		lifePanel = new JPanel();
		lifePanel.setBounds(50,0,250,50);
		lifePanel.setBackground(Color.black);
		lifePanel.setLayout(new GridLayout(1,5));
		window.add(lifePanel);
		
		ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("heart.png"));
		Image image = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		lifeIcon = new ImageIcon(image);
		
		
		int i=1;
		while(i<6) {
			lifeLabel[i] = new JLabel();
			lifeLabel[i].setIcon(lifeIcon);
			lifePanel.add(lifeLabel[i]);
			i++;
		}
		
		inventoryPanel = new JPanel();
		inventoryPanel.setBounds(650,0,100,50);
		inventoryPanel.setBackground(Color.black);
		inventoryPanel.setLayout(new GridLayout(1,3));
		window.add(inventoryPanel);
		
		//CREATE ITEMS
		swordLabel = new JLabel();
		ImageIcon swordIcon = new ImageIcon(getClass().getClassLoader().getResource("sword.png"));
		 image = swordIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		 swordIcon = new ImageIcon(image);
		 swordLabel.setIcon(swordIcon);
		 inventoryPanel.add(swordLabel);
		 
		 shieldLabel = new JLabel();
		 ImageIcon shieldIcon = new ImageIcon(getClass().getClassLoader().getResource("shield.png"));
		 image = shieldIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		 shieldIcon = new ImageIcon(image);
		 shieldLabel.setIcon(shieldIcon);
		 inventoryPanel.add(shieldLabel);
		 
		 lanternLabel = new JLabel();
		 ImageIcon lanternIcon = new ImageIcon(getClass().getClassLoader().getResource("lantern.png"));
		 image = lanternIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		 lanternIcon = new ImageIcon(image);
		 lanternLabel.setIcon(lanternIcon);
		 inventoryPanel.add(lanternLabel);
		
		
	}
	
	
	public void generateScene() {
		// SCENE 1
		createBackground(1, "forest.png");
		createObject(1, 440, 140, 200, 200, "house1.png",200,200, "Look", "Talk", "Rest", "lookHut", "talkHut", "restHut");
		createObject(1, 70, 180, 150, 150, "dinosaur.png",150,150, "Look", "Talk", "Attack", "lookGuard", "talkGuard","attackGuard");
		createObject(1, 300, 240, 70, 70, "chest.png",70,70,  "Look", "Talk", "Open", "lookChest", "talkChest", "openChest");
		createArrowButton(1,0,150,50,50,"arrowLeft.png", "goScene2");
		bgPanel[1].add(bgLabel[1]);
		
		
		// SCENE 2
		createBackground(2, "ouside.jpg");
		createObject(2, 200, 50, 320, 260, "blank.png",300,300, "Look", "Talk", "Enter", "lookCave", "talkCave", "enterCave");
		createObject(2, 0, 250, 150, 150, "blank.png",150,50, "Look", "Talk", "Search", "lookRoot", "talkRoot", "searchRoot");
		createArrowButton(2,650,150,50,50,"arrowright.png", "goScene1");
		bgPanel[2].add(bgLabel[2]);
		
		// SCENE 3
		createBackground(3, "cave.png");
		createArrowButton(3,650,150,50,50,"arrowright.png", "goScene1");
		createObject(3, 240, 140, 220, 220, "monster.png",220,220, "Look", "Talk", "Attack", "lookMonster", "talkMonster", "attackMonster");
		bgPanel[3].add(bgLabel[3]);
		
		
		
	}
}
