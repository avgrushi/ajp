import java.awt.*;
import java.applet.*;

public class prgm1 extends Frame{
       prgm1(){

	//Radio Button

	Label l = new Label("Select one : ");

	CheckboxGroup cb1 = new CheckboxGroup();

	Checkbox c1 = new Checkbox("Choice1",cb1,true);
	Checkbox c2 = new Checkbox("Choice2",cb1,false);
	Checkbox c3 = new Checkbox("Choice3",cb1,false);

	add(l);
	add(c1);
	add(c2);
	add(c3);

	setSize(400,400);
	setVisible(true);
	setLayout(new FlowLayout());
	}
       public static void main(String args[]){
	prgm1 p = new prgm1();
	}

}