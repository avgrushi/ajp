import java.awt.*;
import javax.swing.*;

public class GridBagEx extends JFrame{
	GridBagEx(){

	//Grid Bag layout
	GridBagLayout layout = new GridBagLayout();
	setLayout(layout);
	
	GridBagConstraints g = new GridBagConstraints();
	
	//Creating Buttons
	JButton b1 = new JButton("Button1");
	JButton b2 = new JButton("Button2");
	JButton b3 = new JButton("Button 3");
	JButton b4 = new JButton("Button 4");
	JButton b5 = new JButton("Button 5");


	//b1 properties
	g.gridx = 0;
	g.gridy = 1;
	
	g.fill = GridBagConstraints.HORIZONTAL;
	add(b1,g);

	//b2 properties
	g.gridx = 1;
	g.gridy = 1;
	
	g.fill = GridBagConstraints.HORIZONTAL;
	add(b2,g);

	//b3 properites
	g.gridx = 0;
	g.gridy = 2;
	
	g.fill = GridBagConstraints.HORIZONTAL;
	add(b3,g);

	//b4 properites
	g.gridx = 1;
	g.gridy = 2;
	
	g.fill = GridBagConstraints.HORIZONTAL;
	add(b4,g);

	//b5 properites
	g.gridx = 0;
	g.gridy = 5;
	g.gridwidth = 2;
	g.fill = GridBagConstraints.HORIZONTAL;
	add(b5,g);
	
	setSize(400,400);
	setVisible(true);
	}
		
	public static void main(String args[]){
		GridBagEx b1 = new GridBagEx();
		b1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}