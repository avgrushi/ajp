import java.awt.*;
import java.applet.*;

public prgm1 extends Frame{
	Button b[] = new Button[25];

	prgm1(){
		setTitle("Grids - P1");
		setLayout(new GridLayout(5,5));
		for(int a = 0; a<25; a++){
			Button b[a] = new Button("Button"+[a]);
			add(b[a]);
		}
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String args[]){
		prgm1 p = new prgm1();
	}
}