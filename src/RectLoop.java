
public class RectLoop extends MyFrame {
	public void run() {
	 setColor(0, 128, 0);
	 int a = 40;
	 int b = 100;
	 int c = 40 ;
	 int d = 10;
	 int e = 200;
	 for(int i = 0; i < 10; i++)
	 {
		 fillRect(a, 40, 10, b);
		 a = a + 20;
		 b = b - 10;
	 }
	 for(int i = 0; i < 10; i++)
	 {
		 fillRect(c, e, 10, d);
		 c = c + 20;
		 d = d + 10;
		 e = e - 10;
	 }
	}

}
