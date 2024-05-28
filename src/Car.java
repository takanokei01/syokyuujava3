
public class Car {
int a,b;

public void draw(MyFrame frame) {
	frame.fillOval(a+15,b+40,20,20);
	frame.fillOval(a+50,b+40,20,20);
	frame.fillRect(a+20,b,40,20);
	frame.fillRect(a,b+20,80,20);
	
}
}
