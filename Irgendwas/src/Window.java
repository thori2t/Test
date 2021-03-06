import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas{

	private JFrame window;
	
	public Window(int width, int height, String title, Main main) {
		window = new JFrame();
		window.setSize(width, height);
		window.setTitle(title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		window.add(main);
		
		main.start();
	}
}
