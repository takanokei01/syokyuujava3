import java.util.Vector;

public class DisPlayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10, 30, 3, 0));
		vehicles.add(new Car(50, 100, -5, 0));
		vehicles.add(new Car(10, 150, 7, 0));
		vehicles.add(new Car(50, 200,-5, 0));
		vehicles.add(new Car(10, 260, 5, 0));
		vehicles.add(new Car(10, 320, 6, 0));
		
		for(int i= 0; i<30; i++) {
			clear();
			for(int j= 0; j<vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}
}
