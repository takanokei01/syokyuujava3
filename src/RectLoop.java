
public class RectLoop extends MyFrame {
	public void run() {
		int x = 10;
		int y = 10;
		setColor(0, 128, 0);
		while(x <= 210) {
			fillRect(x, 60, 10, x);
			x +=20;
		    y +=20;
		}
			
		
		
	}

}
