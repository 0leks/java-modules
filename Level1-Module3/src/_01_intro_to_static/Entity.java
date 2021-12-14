package _01_intro_to_static;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Entity {
	public int width;
	public int height;
	public BufferedImage image;
	public Entity(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	protected void setImage(BufferedImage img) {
		this.image = img;
	}
}
