package Main;

public class SceneChanger {

	GameManager gm;
	public SceneChanger(GameManager gm) {
		this.gm = gm;
	}
	
	public void showScreen1() {
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messageText.setText("Let 's defeat the Demon Lord and save the world!");
	}
	
	public void showScreen2() {
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.messageText.setText("This is scene 2");
	}
	public void showScreen3() {
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.messageText.setText("You enter the cave. And a scare Monster is in front of you.\n"
				+ "Defeat the monser and save the world!");
	}
	
	public void showGameOverScreen(int currentBgNum) {
		gm.ui.bgPanel[currentBgNum].setVisible(false);
		gm.ui.titltLabel.setVisible(true);
		gm.ui.titltLabel.setText("YOU DIED!");
		gm.ui.restartButton.setVisible(true);
		gm.ui.restartButton.setText("Click here to restart");
	}
	
	public void showGameWinScreen(int currentBgNum) {
		  gm.ui.bgPanel[currentBgNum].setVisible(false);

		    if (gm.ui.titltLabelWin != null) {
		        gm.ui.titltLabelWin.setVisible(true);
		        gm.ui.titltLabelWin.setText("YOU WIN!");
		    } else {
		        System.out.println("titltLabelWin is null!");
		    }
	}
	
	
	
	public void existGameOverScreen() {
		gm.ui.titltLabel.setVisible(false);
		gm.ui.restartButton.setVisible(false);
		gm.player.setPlayerDefaultStatus();
	}
}
