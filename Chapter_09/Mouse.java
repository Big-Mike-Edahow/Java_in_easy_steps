// Mouse.java

import javax.swing.* ;
import java.awt.event.* ;	

class Mouse extends JFrame implements MouseMotionListener, MouseListener 	
{
	JPanel pnl = new JPanel() ;

	JTextArea textArea = new JTextArea(8, 38) ;	
	int x, y ;

	public Mouse()
	{
		super("Swing Window");
		setSize(700,  300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);

		pnl.add(textArea);
		textArea.addMouseMotionListener(this);	
		textArea.addMouseListener(this);

		setVisible(true);
	}

	public void mouseMoved   (MouseEvent event) { x = event.getX(); y = event.getY();	}		
	public void mouseDragged (MouseEvent event) {	}

	public void mouseEntered (MouseEvent event) { textArea.setText( "Mouse Entered" );	}
	public void mousePressed (MouseEvent event) { textArea.append( "\nMouse Pressed at X : " + x + " Y : " + y );	}	
	public void mouseReleased(MouseEvent event) { textArea.append( "\nMouse Released");	}	
	public void mouseClicked (MouseEvent event) {	}	
	public void mouseExited  (MouseEvent event) {	}

	public static void main( String[] args )
	{
		new Mouse();
	}
}
