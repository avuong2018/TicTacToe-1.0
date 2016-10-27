import javax.swing.*;

public class TicTacToe
{
	public static void main(String[] args)
	{
		//Initial the frame.
		JFrame frame = new JFrame("Tic Tac Toe. Written by ANH VUONG. TROY UNIVERSITY");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		//Put the main container to frame and output.
		frame.getContentPane().add(new TicTacToePanel());	
		frame.pack();
		frame.setVisible(true);
	}
}
