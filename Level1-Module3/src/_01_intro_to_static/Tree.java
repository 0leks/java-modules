package _01_intro_to_static;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tree extends Entity{
	
	private static BufferedImage image;
	
	public Tree(int w, int h) {
		super(w, h);
		try {
			if(image == null) {
				image = ImageIO.read(this.getClass().getResourceAsStream("tree.png"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		setImage(image);
	}
}
