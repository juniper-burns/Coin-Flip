package coinFlipper;

import javax.swing.JFrame;

public class mainClass {
	public static void main(String args[]){
		coinFlipper.generateCoinSide gcs = new coinFlipper.generateCoinSide();
		
		gcs.genCoinSide();
		
		coinFlipper.gui.displayResults dr = new coinFlipper.gui.displayResults();
		dr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dr.setSize(500,200);
		dr.setVisible(true);
		
	}
}
