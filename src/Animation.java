
public class Animation extends MyFrame {
	public void run() {
		int x = 30;
		int y = 100;
		
		while(true) {
			while(x<=170) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x +=5;
			sleep(0.1);
			}
			for(int i = 0; i<6; i++) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y +=5;
				sleep(0.1);
			}
			while(x>=30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x -=5;
				sleep(0.1);
			}
			for(int i = 0; i<6; i++) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				y +=5;
				sleep(0.1);
			}
			
		}
		
		
	
	}

}
