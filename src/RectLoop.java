
public class RectLoop extends MyFrame {
	public void run() {
		int x = 30;
		setColor(0, 128, 0);
		for(int i = 0; i < 10; i++) {
			fillRect(x, 80, 10, 100);
			x +=20;
		}
			
		
		
	}

}
