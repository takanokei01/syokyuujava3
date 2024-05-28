
public class CarObject extends MyFrame{
	public void run() {
		Car car1 = new Car(50,50);
		
		Car car2 = new Car(200,100);
		for(int i= 0; i<30; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.a+= 5;
			car2.a-= 5;
			sleep(0.1);
		}
		
	}

}
