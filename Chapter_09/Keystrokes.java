// Keystrokes.java

import javax.swing.*;
import java.awt.event.* ;	

class Keystrokes extends JFrame implements KeyListener 
{
	JPanel pnl = new JPanel();

	JTextField field  = new JTextField(38);	
	JTextArea textArea = new JTextArea(5, 38);

	public Keystrokes()
	{
		super("Swing Window");
		setSize(700,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		
		pnl.add(field);	
		pnl.add(textArea);
		
		field.addKeyListener(this) ; 
	
		setVisible(true);
	}

	public void keyPressed(KeyEvent event)	
	{
		textArea.setText("Key Pressed");
	}

	public void keyTyped(KeyEvent event)	
	{
		textArea.append("\nCharacter : " + event.getKeyChar());
	}
	
	public void keyReleased(KeyEvent event)	
	{
		int keyCode = event.getKeyCode();
		textArea.append("\nKey Code : " + keyCode);
		textArea.append("\nKey Text : " + event.getKeyText(keyCode));
	}


	public static void main (String[] args)
	{
		new Keystrokes();
	} 
}

