package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	private static final int MAX_TERM_VALUE = 10000;

	public void run() {
		println("This program lists the Fibonacci sequence.");
		int Number1 = 0;
		int Number2 = 1;
		while (Number1 <= MAX_TERM_VALUE) {
		println(Number1);
		int Sum = Number1 + Number2;
		Number1 = Number2;
		Number2 = Sum;
		}
		}

}
