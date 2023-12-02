// Checkbox.java

import javax.swing.*;

class Checkbox extends JFrame 
{
	JPanel pnl = new JPanel();
	
	String[] toppings = {"Pepperoni", "Mushroom","Ham","Tomato", "Jalapenos"} ;

	JCheckBox chk1 = new JCheckBox(toppings[0], true);
	JCheckBox chk2 = new JCheckBox(toppings[1]); 
	JCheckBox chk3 = new JCheckBox(toppings[2]);
	JCheckBox chk4 = new JCheckBox(toppings[3]);
    JCheckBox chk5 = new JCheckBox(toppings[4]);

	String[] styles = {"Original", "Deep Dish", "Gourmet Style", "Thin & Crispy"} ;	

	JComboBox<String> box1 = new JComboBox<String>(styles) ;

	JList<String> lst1 = new JList<String>(toppings) ;

	public Checkbox()
	{
		super("Swing Window");
		setSize(800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);

		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		pnl.add(chk4);
        pnl.add(chk5);
		
		box1.setSelectedIndex(0);
		pnl.add(box1) ;
		
		pnl.add(lst1) ;

		setVisible(true);
	}

	public static void main (String[] args)
	{
		new Checkbox();
	} 
}

