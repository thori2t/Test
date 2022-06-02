import java.awt.Graphics;

public abstract class Entity {

	protected int windowWidth;
	protected int windowHeight;
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	protected int speedX;
	protected int speedY;
	
	public Entity(int x, int y, int windowWidth, int windowHeight) {
		this.x = x;
		this.y = y;
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
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
