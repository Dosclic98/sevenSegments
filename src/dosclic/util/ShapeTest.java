package dosclic.util;
import javax.swing.*;

import java.awt.*;

public class ShapeTest extends JFrame {
	private static final long serialVersionUID = 1L;

	public ShapeTest(){
		setSize(400,400);
		setTitle("Seven Segment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		
		if((Setterino.set >> 6 & 1) == 1) {
			// A
			g.fill3DRect(50, 50, 80, 10, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(50, 50, 80, 10, false);
			g.setColor(Color.RED);
		}
		
		if((Setterino.set >> 5 & 1) == 1) {
			// B
			g.fill3DRect(130, 60, 10, 80, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(130, 60, 10, 80, false);
			g.setColor(Color.RED);
		}
		
		if((Setterino.set >> 4 & 1) == 1) {
			// C
			g.fill3DRect(130, 150, 10, 80, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(130, 150, 10, 80, false);
			g.setColor(Color.RED);
		}

		if((Setterino.set >> 3 & 1) == 1) {
			// D
			g.fill3DRect(50, 230, 80, 10, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(50, 230, 80, 10, false);
			g.setColor(Color.RED);
		}

		if((Setterino.set >> 2 & 1) == 1) {
			// E
			g.fill3DRect(40, 150, 10, 80, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(40, 150, 10, 80, false);
			g.setColor(Color.RED);
		}

		if((Setterino.set >> 1 & 1) == 1) {
			// F
			g.fill3DRect(40, 60, 10, 80, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(40, 60, 10, 80, false);
			g.setColor(Color.RED);
		}

		if((Setterino.set >> 0 & 1) == 1) {
			// G
			g.fill3DRect(50, 140, 80, 10, true);
		}
		else {
			g.setColor(new Color(20,20,20,40));
			g.fill3DRect(50, 140, 80, 10, false);
			g.setColor(Color.RED);
		}
	
	}

}
