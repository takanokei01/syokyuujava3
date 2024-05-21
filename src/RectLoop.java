
public class RectLoop extends MyFrame {
	public void run() {
		int x = 10;
		setColor(0, 0, 0);
		while(x <= 190) {
			fillRect(x, 60, 10, 100);
			setColor(x, x, x);
			x +=20;
		}
			
		
		
	}

}
