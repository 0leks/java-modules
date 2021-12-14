package _01_intro_to_static;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World {
	private static JFrame window;
	private static JPanel panel;
	private static BufferedImage worldImage;
	private static HashMap<Entity, Integer> entities = new HashMap<Entity, Integer>();
	
	private World() {}
	
	public static void show() {
		if(window != null) {
			window.dispose();
		}
		window = new JFrame();
		panel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(worldImage, 0, 0,  700, 700, null);
				
				for(Entity e : entities.keySet()) {
					int xy = entities.get(e);
					int x = xy >> 16;
					int y = xy & 0x0000ffff;
					g.drawImage(e.image, x,  y, e.width, e.height, null);
				}
			}
		};
		
		try {
			worldImage = ImageIO.read(new World().getClass().getResourceAsStream("earth.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		panel.setPreferredSize(new Dimension(700, 700));

		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(!window.isVisible());
	}
	
	public static void addEntity(Entity e, int x, int y) {
		int xy = (x << 16) | (y & 0x0000ffff);
		entities.put(e, xy);
	}
	
	public static void reset() {
		entities.clear();
	}
}
