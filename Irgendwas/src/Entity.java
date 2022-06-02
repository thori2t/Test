import java.awt.Graphics;

public abstract class Entity {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	protected int speedX;
	protected int speedY;
	
	public Entity(int x, int y) {
		this.x = x;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getSpeedX() {
		return this.speedX;
	}
	
	public int getSpeedY() {
		return this.speedY;
	}
}
