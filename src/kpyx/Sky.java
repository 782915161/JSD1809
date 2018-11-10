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

	//重写获取图片getImage()
	public BufferedImage getImage() {
		return image;
	}
	//开始画对象 g:画笔
	public void paintObject(Graphics g) {
		g.drawImage(getImage(),x,y,null);			
	}
}
