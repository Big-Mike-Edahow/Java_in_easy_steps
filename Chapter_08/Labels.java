// Labels.java

import javax.swing.*;

class Labels extends JFrame 
{
	JPanel pnl = new JPanel();

	ClassLoader ldr = this.getClass().getClassLoader();
	ImageIcon duke = new ImageIcon(ldr.getResource("Duke.png"));

	//ImageIcon duke = new ImageIcon("Duke.png");
	
	JLabel lbl1 = new JLabel(duke);
	JLabel lbl2 = new JLabel("Duke is the friendly mascot of Java technology.");
    JLabel lbl3 = new JLabel("Java offers cross-platform compatability.");
	JLabel lbl4 = new JLabel("Duke", duke, JLabel.CENTER);

	public Labels()
	{
		super("Swing Window");
		setSize(700,300);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		lbl4.setHorizontalTextPosition(JLabel.CENTER);
		lbl4.setVerticalTextPosition(JLabel.BOTTOM);
		

		lbl1.setToolTipText("Duke - the Java Mascot") ;
		
		pnl.add(lbl1);
		pnl.add(lbl2);
		pnl.add(lbl3);
        pnl.add(lbl4);

		setVisible(true);
	}

	public static void main (String[] args)
	{
		Labels gui = new Labels();
	} 
}

