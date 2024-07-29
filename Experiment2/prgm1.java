import java.awt.*;

public class prgm1 extends Frame{
       prgm1(){

	//List

	List l1 = new List(5);
	l1.add("Summer");
	l1.add("Winter");
	l1.add("Rainy");
	
	add(l1);

	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm1 p = new prgm1();
	}

}