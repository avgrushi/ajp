import java.awt.*;

public class prgm5 extends Frame{
       prgm5(){

	//Label

	Button b1,b2,b3;
	
	b1=new Button("OK");
	b2 = new Button("RESET");
	b3 = new Button("CANCEL");

	add(b1);
	add(b2);
	add(b3);

	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm5 p = new prgm5();
	}

}