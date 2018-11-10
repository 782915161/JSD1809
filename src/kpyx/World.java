package kpyx;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	public static final int WIDTH =800;   //���ڵĿ�
	public static final int HEIGHT=700;	//���ڵĸ�
	
	private Sky sky=new Sky();
	private K1 k1=new K1();
	private Super[] sup=new Super[] {
		
	};
	
	public void action() {
		
	}
	public void paint(Graphics g) {
		sky.paintObject(g);//�����
		k1.paintObject(g);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		frame.add(world);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		
		world.action();
	}
}
