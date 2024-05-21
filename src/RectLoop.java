
public class RectLoop extends MyFrame {
	public void run() {
	 int x = 5;
	 int y = 5;
	
	 while(x<= 100)
	 {   
		 fillRect(y, y , x, x);
		 y = y + x;
		 x = x + 10;
      }
	}

}
