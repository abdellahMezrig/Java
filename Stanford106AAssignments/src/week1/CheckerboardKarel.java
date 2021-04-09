package week1;
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		 move();
		 pickBeeper();
		 move();
		 turnLeft();
		 move();
		 turnRight();
		 move();
		 move();
		 putBeeper();
		 move();
		 }
		/**
		 * Turns Karel 90 degrees to the right.
		 */
		 public void turnRightt() {
		 turnLeft();
		 turnLeft();
		 turnLeft();
		 move();
		 move();
		 }
	}

