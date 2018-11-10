package kpyx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public abstract class Super {
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	public Super(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;	 
	}
	public static BufferedImage loadImage(String fileName) {
		try {
			BufferedImage img= ImageIO.read(Super.class.getResource(fileName));//同包下读取图片
			return img;
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();			
		}
	}
	public abstract BufferedImage getImage();
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);
	}
}
