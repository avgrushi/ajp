import java.awt.*;

public class prgm4 extends Frame{
       prgm4(){

	//Label

	Label l1 = new Label("Select a language");
	Checkbox c1 = new Checkbox("Marathi");
	Checkbox c2 = new Checkbox("English");
	Checkbox c3 = new Checkbox("Hindi");
	Checkbox c4 = new Checkbox("Sanskrit");
	

	add(l1);
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm4 p = new prgm4();
	}

}