
public class RectLoop extends MyFrame {
	public void run() {
		setColor(0, 128, 0);
		for(int x = 30 ; x <= 170 ; x +=120) {
			System.out.println(x);
		fillRect(x, 80, 10, 100);
		
		}
	}

}
