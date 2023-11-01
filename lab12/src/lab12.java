
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  This file can be used to create very simple animations.  Just fill in
 *  the definition of drawFrame with the code to draw one frame of the 
 *  animation, and possibly change a few of the values in the rest of
 *  the program as noted below. Note that if you change the name of the
 *  class, you must also change the name in the main() routine!
 */
public class lab12 extends JPanel implements ActionListener {

    /**
     * Draws one frame of an animation. This subroutine is called re
     * second and is responsible for redrawing the entire drawing area.  The
     * parameter g is used for drawing. The frameNumber starts at zero and
     * increases by 1 each time this subroutine is called.  The parameters width
     * and height give the size of the drawing area, in pixels.  
     * The sizes and positions of the rectangles that are drawn depend
     * on the frame number, giving the illusion of motion.
     */
	Circle c = new Circle(600,450);
	Circle b = new Circle(600,450);
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
        
        /* NOTE:  To get a different animation, just erase the contents of this 
         * subroutine and substitute your own.  If you don't fill the picture
         * with some other color, the background color will be white.  The sample
         * code here just shows the frame number.
         */
    	
    	
    	
    	double num = Math.random();
    	int color = (int) (num * 11);
		if(color >= 5) {
			g.setColor(Color.cyan);
		}
		else {
			g.setColor(Color.red);
		}
		
		c.draw(g);
		b.draw(g);
		
		c.move(600,450);
		b.move(600, 450);	
		
        g.drawString( "Frame number " + frameNumber, 400, 400 );

    }
    public class Circle {
    	// Holds the location of the center of the circle
    	private int center_x;
    	private int center_y;
    	// the radius of the circle
    	private int radius;
    	// the velocity/direction of the circle's movement
    	private int velocity_x;
    	private int velocity_y;
    	// the color of the circle (using java.awt.Color class)
    	private Color color;
    	// The default constructor
    	public Circle(int maxX, int maxY){
    	// randomize the location of the circle so that the center has x coordinate
    	// within [0, maxX] and y coordinate within [0, maxY].
    	// also set the radius to be a random amount, but not too big or small
    	// Then set the color randomly (your choice how to implement this)
    	// Set each velocity to something reasonable, the range [-3, 3] is good
    		double num = Math.random();
    		double num2 = Math.random();
    		double num3 = Math.random();
    		center_x = (int) (num * (maxX - 50));
    		center_y = (int) (num2 * (maxY - 50));
    		radius = (int) (num3 * 75);
    		if(center_x < 50) {
    			center_x = 50;
    		}
    		if(center_y < 50) {
    			center_y = 50;
    		}
    		velocity_x = 1;
    		velocity_y = -1;
    	}
    	/**
    	* Moves the circle by adding its velocity to each respective coordinate
    	* of the center. If the edge of the circle would fall outside the x range
    	* [0, maxX] or the y coordinate outside [0, maxY], it should reverse
    	* its velocity along that coordinate.
    	* For debugging, you may output messages to System.out to help detect
    	* what your logic is doing.
    	*/
    	public void move(int maxX, int maxY){
    		if(center_x + radius > maxX || center_x < 0) {
    			velocity_x = velocity_x * -1;
    			System.out.println("Collision");
    		}
    		if(center_y + radius > maxY || center_y < 0) {
    			velocity_y = velocity_y * -1;
    			System.out.println("Collision");
    		}
    		if(overlapsWith(c) == true) {
    			velocity_x = velocity_x * -1;
    			velocity_y = velocity_y * -1;
    		}
    		if(overlapsWith(b) == true) {
    			velocity_x = velocity_x * -1;
    			velocity_y = velocity_y * -1;
    		}
    		center_x = center_x + velocity_x;
    		center_y = center_y + velocity_y;
    		
    	}
    	/**
    	* Render the circle to the canvas. Note that the java.awt.Graphics.fillCircle
    	* uses the top-left coordinates along with width and height. You'll
    	* have to translate your center_x, center_y and radius to values that will
    	* work for this.
    	*/
    	public void draw(Graphics canvas){
    	// draw the circle with the appropriate color, in the appropriate place
    	// For debug, print out (to System.out) the calculated top-left coordinates
    	// along with the circle attributes to see that it's done correctly.
    		
    		canvas.fillOval(center_x, center_y, radius, radius);
    		
    	}
    	/*** 
    	 * Returns true of this circle is logically overlapping with the one
		* pass as other. Keep in mind you can directly access the circle
		* attributes of other because this function is in the scope of the
		* Circle class.
		*/
		public boolean overlapsWith(Circle other){
		// your code here
			if( other.center_x + other.radius > center_x && 
					other.center_x + other.radius < center_x + radius &&
					other.center_y + other.radius < center_y + radius	&&
					other.center_y + other.radius > center_y	
				   ) {
					return true;
			}
			return false;
		}
		
    }
    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------
    
    
    public static void main(String[] args) {
        
        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("Simple Animation");
        
        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        lab12 drawingArea = new lab12();
        
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 600 and 450 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(600,450));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /*
         * Note:  In the following line, you can change true to
         * false.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(true);
        
        /* NOTE:  In the next line, the number 20 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can increase this number
         * to get a slower animation.  You can decrease it somewhat to get a
         * faster animation, but the speed is limited by the time it takes
         * for the computer to draw each frame. 
         */
        Timer frameTimer = new Timer(20,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;
    
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}