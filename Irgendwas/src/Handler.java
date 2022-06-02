import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {

	private ArrayList<Entity> entities;
	
	public void tick() {
		for(Entity entity : entities) {
			entity.tick();
		}
	}
	
	public void render(Graphics g) {
		for(Entity entity : entities) {
			entity.render(g);
		}
	}
}
