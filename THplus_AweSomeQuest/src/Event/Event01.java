package Event;

import Main.GameManager;

public class Event01 {
	GameManager gm;
	public Event01(GameManager gm) {
		this.gm = gm;
	}
	
	public void lookHut() {
		 gm.ui.messageText.setText("This is your house");
	}
	public void talkkHut() {
		 gm.ui.messageText.setText("Who are you talking to?");
	}
	public void restHut() {
		gm.ui.messageText.setText("You rest at the house.\n"
				+ "(Your life has cover)");
	}
	
	public void lookGuard() {
		 gm.ui.messageText.setText("A Dinosaur with Katana in front of you.");
	}
	public void talkGuard() {
		 gm.ui.messageText.setText("Don't go any further without weapon\n"
		 		+ "You should check the chest overthere!");
	}
	public void AttackGuard() {
		gm.ui.messageText.setText("Hey, don't be stupid!");
	}
	
	public void lookChest() {
		 gm.ui.messageText.setText("A chest is on the ground");
	}
	public void talkChest() {
		 gm.ui.messageText.setText("You talk to the chest but it says nothing");
	}
	public void openChest() {
		gm.ui.messageText.setText("You open the chest and find a sword.");
	}
}
