package dosclic.util;

import javax.swing.SwingUtilities;

public class Setterino {
	public static int set;
	
	public static void main(String a[]) {
		set = 0x7E;
		ShapeTest gui = new ShapeTest();
		waiterino(1000);
		set = 0x30;
		SwingUtilities.updateComponentTreeUI(gui);
	}
	private static void waiterino(int n) {
		try
		{
		    Thread.sleep(n);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
}
