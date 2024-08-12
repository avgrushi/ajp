import java.awt.*;
import java.applet.*;

public class prgm4 extends Frame{
	

	prgm4(){
		setTitle("Displaying 5 Btns");
		setLayout(new BorderLayout());
		Button b1,b2,b3,b4,b5;
		b1 = new Button("North");
		b2 = new Button("South");
		b3 = new Button("East");
		b4 = new Button("Center");
		b5 = new Button("West");
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4, BorderLayout.CENTER);
		add(b5,BorderLayout.WEST);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String args[]){
		prgm4 p = new prgm4();
	}
}