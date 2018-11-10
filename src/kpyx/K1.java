package kpyx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class K1 extends Super{
	private static BufferedImage image;
	static {
		image=loadImage("19.png");
	}
	private int hurt;
	public K1() {
		super(120, 200,20, 430);
		this.hurt=1;
	}


	public BufferedImage getImage() {
		
		return image;
	}
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);			
	}
}
