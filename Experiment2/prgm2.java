import java.awt.*;

public class prgm2 extends Frame{
       prgm2(){

	//List
	Label l = new Label("Select Subject you like");
	
	List l1 = new List(5,true);
	String sub[] ={"Maths","Physics","Chemistry","C++","Java"};
	for(int i=0 ; i<5; i++){
		l1.add(sub[i]);
	}
	
	add(l1);

	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm2 p = new prgm2();
	}

}