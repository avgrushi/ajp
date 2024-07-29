import java.awt.*;
import java.applet.*;

public class prgm2 extends Frame{
       prgm2(){

	//Form

	Label l1 = new Label("Username : ");
	Label l2 = new Label("Password : ");
	TextField t1 = new TextField(20);
	TextField t2 = new TextField(20);
	
	l1.setBounds(100,50,80,30);
	t1.setBounds(220,50,80,30);
	l2.setBounds(100,100,80,30);
	t2.setBounds(220,100,80,30);
	
	Button login = new Button("Login");
	Button sign = new Button("Sign Up");
	
	login.setBounds(100,150,80,30);
	sign.setBounds(220,150,80,30);

	setSize(400,400);
	setLayout(null);

	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(login);
	add(sign);

	
	setVisible(true);
	
	}
       public static void main(String args[]){
	prgm2 p = new prgm2();
	}

}