package Main;

import Event.Event01;

public class GameManager {
	
	ActionHandler aHandeler = new ActionHandler(this);
	public UI ui = new UI(this);
	public SceneChanger schanger = new SceneChanger(this);
	
	public Event01 ev1 = new Event01(this);
	public static void main(String[] args) {
		new GameManager();

	}
	
	public GameManager() {
		schanger.showScreen1();
	}

}
