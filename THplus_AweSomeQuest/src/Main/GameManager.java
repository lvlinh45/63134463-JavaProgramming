package Main;

import Event.Event01;
import Event.Event02;

public class GameManager {
	
	ActionHandler aHandeler = new ActionHandler(this);
	public UI ui = new UI(this);
	public Player player = new Player(this);
	public SceneChanger schanger = new SceneChanger(this);
	
	public Event01 ev1 = new Event01(this);
	public Event02 ev2 = new Event02(this);
	public static void main(String[] args) {
		new GameManager();

	}
	
	public GameManager() {
		player.setPlayerDefaultStatus();
		schanger.showScreen1();
	}

}
