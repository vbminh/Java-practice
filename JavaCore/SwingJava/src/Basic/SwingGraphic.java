package Basic;

import java.awt.*;

import javax.swing.JFrame;

public class SwingGraphic extends Canvas {
	public SwingGraphic() {
	}
	
	public void paint(Graphics g) {
		g.drawString("Vu Binh Minh", 200, 50);
		setBackground(Color.white);
		
		g.fillOval(100, 70, 70, 70);
		setForeground(Color.blue);
		
		g.drawRect(200, 70, 100, 70);
		g.fillArc(350, 70, 70, 70, 100, 50);
		
		g.fillRect(100, 200, 100, 70);
		g.drawOval(250, 200, 70, 70);
		g.drawArc(350, 200, 70, 70, 100, 70);
		
	}
	
	public static void main(String[] args) {
		SwingGraphic gra = new SwingGraphic();
		JFrame f = new JFrame();
		f.getContentPane().add(gra);
		f.setSize(500,350);
		f.setVisible(true);
	}

}
