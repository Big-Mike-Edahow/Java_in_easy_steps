// Layout.java

import javax.swing.* ;
import java.awt.*;

class Layout extends JFrame
{
	Container contentPane = getContentPane();
	JPanel pnl = new JPanel();
	JPanel grid = new JPanel(new GridLayout(2,2));

	public Layout()
	{
		super("Swing Window");
		setSize(700, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
    		pnl.add(new JButton("Yes")); 
    		pnl.add(new JButton("No"));
		    pnl.add(new JButton("Cancel"));
    		grid.add(new JButton("Row 1 Col 1")); 
    		grid.add(new JButton("Row 1 Col 2")); 
    		grid.add(new JButton("Row 1 Col 3")); 
    		grid.add(new JButton("Row 2 Col 1"));
            grid.add(new JButton("Row 2 Col 2"));
            grid.add(new JButton("Row 2 Col 3"));
		    contentPane.add("North", pnl); 
    		contentPane.add("Center", grid); 
    		contentPane.add("West", new JButton("West"));
            contentPane.add("East", new JButton("East"));
		    setVisible( true );
	}
	public static void main (String[] args) 
	{
		new Layout() ;
	}	
}

