// TextFields.java

import javax.swing.*;

class TextFields extends JFrame 
{
	JPanel pnl = new JPanel();

	JTextField text1 = new JTextField(38) ;
	JTextField text2 = new JTextField("Default Text", 38) ;
	
	JTextArea textArea = new JTextArea(5, 37) ;
	
	JScrollPane pane = new JScrollPane(textArea) ;

	public TextFields()
	{
		super("Swing Window");
		setSize( 700,300 );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);

		textArea.setLineWrap(true) ;
		textArea.setWrapStyleWord(true) ;

		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		pnl.add(text1) ;
		pnl.add(text2) ;
		pnl.add(pane) ;

		setVisible(true);
	}

	public static void main (String[] args)
	{
		new TextFields();
	} 
}

