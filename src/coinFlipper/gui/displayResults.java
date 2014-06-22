package coinFlipper.gui;

import java.awt.*;

import javax.swing.*;

public class displayResults extends JFrame{
	
	private int numFlips;
	private int numHeads;
	private int numTails;
	
	private JTextField ftf;
	private JTextField htf;
	private JTextField ttf;
	
	
	public displayResults(){
		
		super("CoinFlipper v0.1.2");
		setLayout(new FlowLayout());
		
		coinFlipper.generateCoinSide gcs = new coinFlipper.generateCoinSide();
		
		numFlips = gcs.coinArray[0];
		numHeads = gcs.coinArray[1];
		numTails = numFlips - numHeads;
		
		ftf = new JTextField("Number of flips: " + numFlips, 30);
		htf = new JTextField("Number of heads: " + numHeads, 30);
		ttf = new JTextField("Number of tails: " + numTails, 30);
		
		ftf.setEditable(false);
		htf.setEditable(false);
		ttf.setEditable(false);
		
		add(ftf);
		add(htf);
		add(ttf);
	}
}
