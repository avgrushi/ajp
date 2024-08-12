import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class buttonClick extends JFrame implements ActionListener{
	JButton b;
	buttonClick(){
		b = new JButton("Click Me");
		b.addActionListener(this);

		add(b);
		setSize(300,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was Clicked!!!");
	}
		
	public static void main(String args[]){
		buttonClick b1 = new buttonClick();
		b1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}