package week2;

import java.awt.Color;
import java.awt.Graphics;

import acm.graphics.GImage;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JFrame;

public class RobotFace extends GraphicsProgram {
	private static final int HEAD_WIDTH = 100;
	private static final int HEAD_HEIGHT = 120;
	private static final int EYE_RADIUS = 15;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
	
	public void run() {
		DrawHead(getWidth() / 2, getHeight() / 2);
		DrawEye((getWidth()/2)+25,(getHeight()/2)-30);
		DrawEye((getWidth()/2)-25,(getHeight()/2)-30);
		DrawMouth(getWidth() / 2, (getHeight() / 2) + 30);
	}
	
	public void DrawHead(double cx,double cy) {
		double x = cx - HEAD_WIDTH / 2;
		double y = cy - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
    public void DrawEye(double cx,double cy) {
    	double x = cx - EYE_RADIUS;
    	double y = cy - EYE_RADIUS;
    	GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
    	eye.setFilled(true);
    	eye.setColor(Color.YELLOW);
    	add(eye);
    	
	}
    public void DrawMouth(double cx,double cy) {
    	double x = cx - MOUTH_WIDTH / 2;
    	double y = cy - MOUTH_HEIGHT / 2;
    	GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
    	mouth.setFilled(true);
    	mouth.setColor(Color.WHITE);
    	add(mouth);
	}

}   
