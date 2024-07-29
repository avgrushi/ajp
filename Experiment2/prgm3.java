import java.awt.*;

public class prgm3 extends Frame{
       prgm3(){

	//Program using list for 10cities 
	Label l = new Label("Select City : ");
	
	List l1 = new List(10,true);
	String sub[] ={"Pune","Delhi","Patna","Mumbai","New York","Paris","Sangli","Chennai","Banglore","Lukhnow"};
	for(int i=0 ; i<10; i++){
		l1.add(sub[i]);
	}
	add(l);
	add(l1);

	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm3 p = new prgm3();
	}

}