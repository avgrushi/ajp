import java.awt.*;

public class prgm4 extends Frame{
       prgm4(){

	//Program using list for 10cities 
	Label l = new Label("Select Newspaper : ");
	
	List l1 = new List(10,true);
	String sub[] ={"Times of India","Lokmat","Hindustan Times","The Hindu","The India Express","Dainik Bhaskar"};
	for(int i=0 ; i<6; i++){
		l1.add(sub[i]);
	}
	add(l);
	add(l1);

	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	}
       public static void main(String args[]){
	prgm4 p = new prgm4();
	}

}