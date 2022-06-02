import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {

	private int windowWidth;
	private int windowHeight;
	
	private ArrayList<Entity> entities;
	
	public Handler(int windowWidth, int windowHeight) {
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		entities = new ArrayList<Entity>();
		
		entities.add(new Player(1, 2, windowWidth, windowHeight));
	}
	
	public void tick() {
		//führt die tick funktionen aller entities aus
		for(Entity entity : entities) {
			entity.tick();
		}
	}
	
	public void render(Graphics g) {
		//malt alle Entities, später kann man auf bilder Laden und die malen
		for(Entity entity : entities) {
			entity.render(g);
		}
	}
}
