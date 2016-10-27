import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToePanel extends JPanel implements ActionListener
{
	/************************
	* Variables declaration *
	************************/
	private JPanel pn1, pn2, pn3;
	private JLabel result;
	private JButton reset, exit, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private int turn = 0;
	private String XO = "";
	private boolean win = false;
	
	
	/**************
	* Constructor *
	**************/
	public TicTacToePanel()
	{
		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));

		//Initial the game board.
		pn1 = new JPanel();
		pn1.setLayout (new GridLayout (3, 3));
		pn1.setPreferredSize (new Dimension(600, 600));

	    b1 = new JButton("");
	    b1.setBackground(Color.white);
	    b1.addActionListener(this);	    
	    pn1.add(b1);

	    b2 = new JButton("");
	    b2.setBackground(Color.white);
	    b2.addActionListener(this);	    
	    pn1.add(b2);
	    
	    b3 = new JButton("");
	    b3.setBackground(Color.white);
	    b3.addActionListener(this);	    
	    pn1.add(b3);
	    
	    b4 = new JButton("");
	    b4.setBackground(Color.white);
	    b4.addActionListener(this);	    
	    pn1.add(b4);
	    
	    b5 = new JButton("");
	    b5.setBackground(Color.white);
	    b5.addActionListener(this);	    
	    pn1.add(b5);
	    
	    b6 = new JButton("");
	    b6.setBackground(Color.white);
	    b6.addActionListener(this);	    
	    pn1.add(b6);
	    
	    b7 = new JButton("");
	    b7.setBackground(Color.white);
	    b7.addActionListener(this);	    
	    pn1.add(b7);
	    
	    b8 = new JButton("");
	    b8.setBackground(Color.white);
	    b8.addActionListener(this);	    
	    pn1.add(b8);
	    
	    b9 = new JButton("");
	    b9.setBackground(Color.white);
	    b9.addActionListener(this);	    
	    pn1.add(b9);
	    
	    add(pn1);
	    
	    
	    //Result.
	    pn2 = new JPanel();	    
	    result = new JLabel("Result : ");
	    pn2.add(result);
	    add(pn2);
	    
	    
	    //Reset and Exit buttons.
	    pn3 = new JPanel();
	    
	    reset = new JButton("Reset");	    
	    reset.addActionListener(new ActionListener() 
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	        	resetToBegin(); //Clean by resetting all to default values.
	        	pressableForALL(true); //Re-enable the button for new game.
	        }
	    });
	    pn3.add(reset);
	    
	    exit = new JButton("Exit");
	    exit.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent event)
	        {
	            System.exit(0); //Close the window.
	        }
	    });	    
	    pn3.add(exit);
	    	    
	    add(pn3);	    	    
	}
	
	
	/*******************
	* Pressable method *
	*******************/
	public void pressableForALL(boolean b)
	{
		b1.setEnabled(b);
		b2.setEnabled(b);
		b3.setEnabled(b);
		b4.setEnabled(b);
		b5.setEnabled(b);
		b6.setEnabled(b);
		b7.setEnabled(b);
		b8.setEnabled(b);
		b9.setEnabled(b);
	}
	
	
	/************************
	* Reset to begin method *
	************************/
	public void resetToBegin()
	{
		b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        result.setText("Result : ");
        turn = 0;
        XO = "";
        win = false;
	}
	
	
	/*********************************
	* Design the game button actions *
	*********************************/		
	public void actionPerformed(ActionEvent event)
	{
		//Set play switch from user to user. X will play first.
		turn++;
		if(turn % 2 == 0) XO = "O";
		else XO = "X";
		
		//Design the Press to play buttons.
		//To prevent the users change, the pressed buttons will be disable.
		JButton pressed = (JButton) event.getSource();
		
		if(pressed == b1)
		{
			b1.setFont(new Font("Arial", Font.BOLD, 150));
			b1.setText(XO);
			b1.setEnabled(false);
		}
		
		else if(pressed == b2)
		{
			b2.setFont(new Font("Arial", Font.BOLD, 150));
			b2.setText(XO);
			b2.setEnabled(false);
		}
		
		else if(pressed == b3)
		{
			b3.setFont(new Font("Arial", Font.BOLD, 150));
			b3.setText(XO);
			b3.setEnabled(false);
		}
		
		else if(pressed == b4)
		{
			b4.setFont(new Font("Arial", Font.BOLD, 150));
			b4.setText(XO);
			b4.setEnabled(false);
		}
		
		else if(pressed == b5)
		{
			b5.setFont(new Font("Arial", Font.BOLD, 150));
			b5.setText(XO);
			b5.setEnabled(false);
		}
		
		else if(pressed == b6)
		{
			b6.setFont(new Font("Arial", Font.BOLD, 150));
			b6.setText(XO);
			b6.setEnabled(false);
		}
		
		else if(pressed == b7)
		{
			b7.setFont(new Font("Arial", Font.BOLD, 150));
			b7.setText(XO);
			b7.setEnabled(false);
		}
		
		else if(pressed == b8)
		{
			b8.setFont(new Font("Arial", Font.BOLD, 150));
			b8.setText(XO);
			b8.setEnabled(false);
		}
		
		else if(pressed == b9)
		{
			b9.setFont(new Font("Arial", Font.BOLD, 150));
			b9.setText(XO);
			b9.setEnabled(false);
		}
		
		//Decide when a player win.
		if
		(
			 //Horizontal win.
			    (b1.getText() != "" && b1.getText() == b2.getText() && b2.getText() == b3.getText())
			 || (b4.getText() != "" && b4.getText() == b5.getText() && b5.getText() == b6.getText())
			 || (b7.getText() != "" && b7.getText() == b8.getText() && b8.getText() == b9.getText())
			
			 //Vertical win.
			 || (b1.getText() != "" && b1.getText() == b4.getText() && b4.getText() == b7.getText())
			 || (b2.getText() != "" && b2.getText() == b5.getText() && b5.getText() == b8.getText())
			 || (b3.getText() != "" && b3.getText() == b6.getText() && b6.getText() == b9.getText())
			
			 //Diagonal win.
			 || (b1.getText() != "" && b1.getText() == b5.getText() && b5.getText() == b9.getText())
			 || (b3.getText() != "" && b3.getText() == b5.getText() && b5.getText() == b7.getText())
		)				
			 win = true;
		else win = false;
		
		//Set the result label that tell who was the winner or the game has tied. 
		if(win == true) 
		{
			pressableForALL(false); //Disable all other non-pressed buttons.
			result.setText("Result : " + XO + " won!");	//Tell who was the winner.							
		}
		else
		{
			//If no one win or win == false after the last turn, the game has tied.
			if(turn == 9) result.setText("Result : The game has tied!");
		}
	}	
}
