package coinFlipper.gui;

import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class getNumFlips extends JFrame{
	
	public int numFlips;
	public String flips;
	
	public getNumFlips(){
		
		super("CoinFlipper v0.1.2");
		
		String flips = JOptionPane.showInputDialog("How many flips to preform?");
		
		try{
			numFlips = Integer.parseInt(flips);
		}catch(Exception e){
			coinFlipper.gui.throwError te = new coinFlipper.gui.throwError();
		}
	}
}
