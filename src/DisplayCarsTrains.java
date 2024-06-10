
public class DisplayCarsTrains extends MyFrame {

	public void run() {
		Vehicle[] vehicles = new Vehicle[6];
		vehicles[0] = new Car(10, 30, 3, 0);
		vehicles[1] = new Car(50, 100, -5, 0);
		vehicles[2] = new Train(10, 150, 7, 0);
		vehicles[3] = new Train(50, 200,-5, 0);
		vehicles[4] = new Track(10, 260, 5, 0);
		vehicles[5] = new Track(10, 320, 6, 0);
		for (int i = 0; i<30; i++) {
			clear();
			for(int j= 0; j<vehicles.length; j++) {
				vehicles[j].draw(this);
				vehicles[j].move();
			}
			sleep(0.1);
		}
	}

}
