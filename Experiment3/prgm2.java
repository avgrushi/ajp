import java.awt.*;
import java.applet.*;

public class prgm2 extends Frame{
	Button[] buttons = new Button[10];

	prgm2(){
		setTitle("Displaying buttons from 1 to 10");
		setLayout(new GridLayout(5,5));
		for(int a = 0; a < 10; a++){
			buttons[a] = new Button("Button" + (a+1));
			add(buttons[a]);
		}
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String args[]){
		prgm2 p = new prgm2();
	}
}