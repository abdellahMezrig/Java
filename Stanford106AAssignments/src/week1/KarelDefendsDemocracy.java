package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		for(int i=0;i<5;i++) {
			move();
		}
		turnLeft();
		move();
		turnAround();
		pickBeeper();
		move();
		turnLeft();
		for(int i=0;i<4;i++) {
			move();
		}
		turnLeft();
		move();
		turnAround();
		pickBeeper();
		move();
		move();
		pickBeeper();
		pickBeeper();
		turnAround();
		move();
		turnRight();
		move();
		
				
	}
	
		
}
