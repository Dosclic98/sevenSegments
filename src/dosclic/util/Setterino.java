package dosclic.util;

import javax.swing.SwingUtilities;

public class Setterino {
	public static int[] setArr = new int[] {0x7E, 0x30, 0x6D, 0x79, 0x33, 0x5B, 0x5F, 0x70, 0x7F, 0x7B, 0x77, 0x1F, 0x4E, 0x3D, 0x4F, 0x47};
	public static int set;
	
	public static void main(String a[]) {
		set = setArr[0];
		ShapeTest gui = new ShapeTest();
		waiterino(1000);
		for(int i=1;i<16;i++) {
			set = setArr[i];
			SwingUtilities.updateComponentTreeUI(gui);
			waiterino(1000);
		}
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
