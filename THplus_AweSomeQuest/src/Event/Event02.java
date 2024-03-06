package Event;

import Main.GameManager;

public class Event02 {
	public GameManager gm;
	public Event02(GameManager gm) {
		this.gm = gm;
	}

	public void lookCave() {
		gm.ui.messageText.setText("It'a cave!");
	}
	
	public void talkCave() {
		gm.ui.messageText.setText("You hear the echo of your voice.");
	}
	
	public void enterCave() {
		if(gm.player.hasLantern ==0) {
			gm.ui.messageText.setText("It 's too dark to enter.");			
		} else {
			gm.schanger.showScreen3();
		}
	}
	
	public void lookRoot() {
		gm.ui.messageText.setText("This is a large lawn.");
	}
	
	public void talkRoot() {
		gm.ui.messageText.setText("They say plant grow well if "
				+ "you talk to but this tree doesn't look like "
				+ "it needs encouragement.");
	}
	
	public void searchRoot() {
		if(gm.player.hasLantern ==0) {
			gm.ui.messageText.setText("You find a lantern!");	
			gm.player.hasLantern = 1;
			gm.player.updatePlayerStatus();
		} else {
			gm.ui.messageText.setText("You didn't find anything!");
		}
	}
	
	
	public void lookMonster() {
		gm.ui.messageText.setText("It'a enormous monster with a power!");
	}
	public void talkMonster() {
		gm.ui.messageText.setText("You will dead. It's not doubt!");
	}
	public void attackMonster() {
		if(gm.player.hasShield==0) {
			if(gm.player.hasSword==0) {
				if(gm.player.playerLife != 1) {
					gm.ui.messageText.setText("Monster: You fight with me without even a weapon?!\n(The monster hit you back and your life decrease by 1!)");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
				} else if(gm.player.playerLife ==1) {
					gm.ui.messageText.setText("Monster: See you next time!");
					gm.player.playerLife--;
					gm.schanger.showGameOverScreen(1);
					
				}
			}
			else if(gm.player.hasSword==1 && gm.player.hasShield==1) {
				gm.ui.messageText.setText("Monster: Oh, no!\n(You have defeat the monster");
				
			}
			gm.player.updatePlayerStatus();
		} else {
			gm.ui.messageText.setText("Monster: Noooo! I can't believe that you can defeat me!");
			gm.schanger.showGameWinScreen(1);
		}
	}
	
}
