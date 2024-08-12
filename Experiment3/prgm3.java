import java.awt.*;
import java.applet.*;

public class prgm3 extends Frame{
	Button[] buttons = new Button[10];

	prgm3(){
		setTitle("Displaying 5 Btns");
		setLayout(new GridLayout(3,2));
		for(int a = 0; a < 5; a++){
			buttons[a] = new Button("Button" + (a+1));
			add(buttons[a]);
		}
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String args[]){
		prgm3 p = new prgm3();
	}
}