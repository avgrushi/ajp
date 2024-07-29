import java.awt.*;
import java.applet.*;

public class prgm3 extends Frame{
       prgm3(){

	//Label

	Label l1 = new Label("Welcome to Java");
	l1.setBounds(100,150,100,100);

	setSize(400,400);
	setLayout(null);

	add(l1);
	

	
	setVisible(true);
	
	}
       public static void main(String args[]){
	prgm3 p = new prgm3();
	}

}