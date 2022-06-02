import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Main extends Canvas implements Runnable {

	private int windowWidth = 1200;
	private int windowHeight = 675; 
	
	private Thread thread;
	private boolean running = false;
	
	private Handler handler;
	
	public Main() {
		new Window(windowWidth,  windowHeight, "GameTitle is comming soon", this);
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
		handler = new Handler();
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0.0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running) {
				render();
			}
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() {
		handler.tick();
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(2);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.gray);
		g.fillRect(0, 0, windowWidth, windowHeight);
		
		handler.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}

}
