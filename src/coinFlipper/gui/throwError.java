package coinFlipper.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class throwError{
	public throwError() {
	  
      JFrame frame = new JFrame("JOptionPane showMessageDialog example");
      
      JOptionPane.showMessageDialog(frame, "You can't do that!", "Error", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
  }
}