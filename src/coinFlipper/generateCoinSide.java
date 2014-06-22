package coinFlipper;

import java.util.Random;

public class generateCoinSide {
	
	public int numHeads;
	public int numFlips;
	public static int[] coinArray = new int[2];
	
	public void genCoinSide(){
		coinFlipper.gui.getNumFlips gnf = new coinFlipper.gui.getNumFlips();
		
		numFlips = gnf.numFlips;
		Random rand = new Random();
		boolean x = true;
		
		for(int i = numFlips; i > 0; i-- ){
			x = rand.nextBoolean();
			if(x){
				numHeads++;
			}
		}
		coinArray[0] = numFlips;
		coinArray[1] = numHeads;
	}
}
