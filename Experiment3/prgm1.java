import java.awt.*;
import java.applet.*;

public class prgm1 extends Frame{
	Button[] buttons = new Button[25];

	prgm1(){
		setTitle("Grids - P1");
		setLayout(new GridLayout(5,5));
		for(int a = 0; a<25; a++){
			buttons[a] = new Button("Button" + (a+1));
			add(buttons[a]);
		}
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String args[]){
		prgm1 p = new prgm1();
	}
}