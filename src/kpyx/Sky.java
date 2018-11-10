package kpyx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sky extends Super{
	public Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
	}
	private static BufferedImage image;
	static {
		image=loadImage("timg.jpg");
	}

	//��д��ȡͼƬgetImage()
	public BufferedImage getImage() {
		return image;
	}
	//��ʼ������ g:����
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);			
	}
}
