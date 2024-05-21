
public class RectLoop extends MyFrame {
	public void run() {
		int x = 30;
		int y = 30;
		setColor(0, 128, 0);
		for(int i = 0; i < 9; i++) {
			if(i ==0)
			fillRect(x, 60, 10, 100);
			else if(i==8) {
				fillRect(x, 100, 10, 100);
			}
			else {
				fillRect(x, 80, 10, 100);
			}
		while(x <= 210) {
			fillRect(x, y, 10, 100);
			x +=20;
		    y +=20;
		}
			
		
		
	}

}
