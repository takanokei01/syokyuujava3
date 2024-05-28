
public class Car {
int a,b,c,d;

public Car(int a,int b,int c) {
	this.a = a;
	this.b = b;
	this.c = c;
	
}
public void draw(MyFrame frame) {
	frame.fillOval(a+15,b+40,20,20);
	frame.fillOval(a+50,b+40,20,20);
	frame.fillRect(a+20,b,40,20);
	frame.fillRect(a,b+20,80,20);
	
}
public void move() {
	a+= c;
	
}
}
