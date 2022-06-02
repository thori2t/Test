import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity{

	public Player(int x, int y, int windowWidth, int windowHeight) {
		super(x, y, windowWidth, windowHeight);
		this.width = 1;
		this.height = 2;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		//(0|0) liegt auf einem JFrame oben links, nicht wie in Mathe
		g.setColor(Color.cyan);
		g.fillRect(x * windowWidth / 16, y * windowHeight / 9, width * windowWidth / 16, height * windowHeight / 9); // 16 = Vorläufige Anzahl an Tiles pro WindowWidth || 9 pro WindowHeight
	}

}
