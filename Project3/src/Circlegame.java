import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import game.Circle;

import java.util.ArrayList;

/**
 *  This file can be used to create very simple animations.  Just fill in
 *  the definition of drawFrame with the code to draw one frame of the 
 *  animation, and possibly change a few of the values in the rest of
 *  the program as noted below. Note that if you change the name of the
 *  class, you must also change the name in the main() routine!
 */
public class Circlegame extends JPanel implements ActionListener,KeyListener 
  // track the current frame number being drawn
  private int frameNum;

  // Set the parameters of the game window
  private static int windowWidth = 1000;
  private static int windowHeight = 800;

  // Add any addional "global" game variables here
  private int center_x;
	private int center_y;
	// the radius of the circle
	private int radius;
	// the velocity/direction of the circle's movement
	private int velocity_x;
	private int velocity_y;
  // Note: this is the constructor, must match the class name
  public Circlegame(){
    // These commands use the ActionListener and KeyListener features
    // to take keyboard input events and process them
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);

    // Put any other code that you want to run at the start of the game here
    // This will get run when the main function creates a new GameStarter class
    
    
  }

  /**
   * Draws one frame of an animation. This subroutine is called re
   * second and is responsible for redrawing the entire drawing area.  The
   * parameter g is used for drawing. The frameNumber starts at zero and
   * increases by 1 each time this subroutine is called.  The parameters width
   * and height give the size of the drawing area, in pixels.  
   * The sizes and positions of the rectangles that are drawn depend
   * on the frame number, giving the illusion of motion.
   */
  Circle c = new Circle(1000,800);
  //circleArr mini = new circleArr();
  compCircle comp1 = new compCircle(1000,800);
  compCircle comp2 = new compCircle(1000,800);
  compCircle comp3 = new compCircle(1000,800);
  compCircle comp4 = new compCircle(1000,800);
  compCircle comp5 = new compCircle(1000,800);
  compCircle comp6 = new compCircle(1000,800);
  compCircle comp7 = new compCircle(1000,800);
  compCircle comp8 = new compCircle(1000,800);
  compCircle comp9 = new compCircle(1000,800);
  compCircle comp10 = new compCircle(1000,800);
  compCircle a = new compCircle(1000,800);
  compCircle b = new compCircle(1000,800);
  compCircle d = new compCircle(1000,800);
  compCircle e = new compCircle(1000,800);
  compCircle f = new compCircle(1000,800);
  compCircle G = new compCircle(1000,800);
  compCircle h = new compCircle(1000,800);
  compCircle i = new compCircle(1000,800);
  compCircle j = new compCircle(1000,800);
  compCircle k = new compCircle(1000,800);
  compCircle l = new compCircle(1000,800);
  compCircle m = new compCircle(1000,800);
  compCircle n = new compCircle(1000,800);
  compCircle o = new compCircle(1000,800);
  compCircle p = new compCircle(1000,800);
  compCircle q = new compCircle(1000,800);
  compCircle r = new compCircle(1000,800);
  compCircle s = new compCircle(1000,800);
  compCircle t = new compCircle(1000,800);
  compCircle u = new compCircle(1000,800);
  compCircle v = new compCircle(1000,800);
  public void drawFrame(Graphics g, int frameNumber, int width, int height) {
    // Add code to update the state of the game based on the simulation parameters
    // You'll have to calculate the positions of all the new blobs, as well as the new
    // player position. Then, check for any collisions or absorptions. You can also
    // test to see if the game needs to stop or not and then render an ending screen/message

    // Add code here to process the next state of the game...

    // Next, draw the new state of the game. Keep in mind that you can pass the "Graphics g"
    // parameter to other objects' methods and let them draw themselves on the canvas.
    // For example, if you have a global "player" variable, you can say player.draw(g)
    // to have the player render itself onto the screen

    // This will print a small counter to the bottom of the screen so that the
    // user can see when the frame updates.
    g.setColor(Color.BLACK);
    g.drawString("Frame number "+frameNumber, width-150, height-50);
    c.draw(g);
    g.setColor(Color.BLUE);
    //mini.draw(g);
    a.draw(g);
    b.draw(g);
    d.draw(g);
    e.draw(g);
    f.draw(g);
    G.draw(g);
    q.draw(g);
    r.draw(g);
    s.draw(g);
    t.draw(g);
    u.draw(g);
    v.draw(g);
    g.setColor(Color.RED);
    comp1.draw(g);
    comp2.draw(g);
    comp2.move(1000,800);
    comp1.move(1000, 800);
    comp3.draw(g);
    comp4.draw(g);
    comp4.move(1000,800);
    comp3.move(1000, 800);
    comp5.draw(g);
    comp5.move(1000, 800);
    comp6.draw(g);
    comp7.draw(g);
    comp7.move(1000,800);
    comp6.move(1000, 800);
    comp8.draw(g);
    comp9.draw(g);
    comp9.move(1000,800);
    comp8.move(1000, 800);
    comp10.draw(g);
    comp10.move(1000, 800);
   
    if(c.overlapsWith(comp1) == true) {
	    	if(c.radius > comp1.rad) {
	    		c.radius = c.radius + 15;
	    		comp1.rad = 0;
	    		comp1.circcenter_x = 999;
	    		
	    	}
	    	if(comp1.rad > c.radius) {
	    		comp1.rad = comp1.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp2) == true) {
	    	if(c.radius > comp2.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		comp2.rad = 0;
	    		comp2.circcenter_x = 999;
	    	}
	    	if(comp2.rad > c.radius) {
	    		comp2.rad = comp2.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp3) == true) {
	    	if(c.radius > comp3.rad) {
	    		c.radius = c.radius + 15;
	    		comp3.rad = 0;
	    		comp3.circcenter_x = 999;
	    		
	    	}
	    	if(comp3.rad > c.radius) {
	    		comp3.rad = comp3.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp4) == true) {
	    	if(c.radius > comp4.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		comp4.rad = 0;
	    		comp4.circcenter_x = 999;
	    	}
	    	if(comp4.rad > c.radius) {
	    		comp4.rad = comp4.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp5) == true) {
	    	if(c.radius > comp5.rad) {
	    		c.radius = c.radius + 15;
	    		comp5.rad = 0;
	    		comp5.circcenter_x = 999;
	    		
	    	}
	    	if(comp5.rad > c.radius) {
	    		comp5.rad = comp5.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp6) == true) {
	    	if(c.radius > comp6.rad) {
	    		c.radius = c.radius + 15;
	    		comp6.rad = 0;
	    		comp6.circcenter_x = 999;
	    		
	    	}
	    	if(comp6.rad > c.radius) {
	    		comp6.rad = comp6.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp7) == true) {
	    	if(c.radius > comp7.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		comp7.rad = 0;
	    		comp7.circcenter_x = 999;
	    	}
	    	if(comp7.rad > c.radius) {
	    		comp7.rad = comp7.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp8) == true) {
	    	if(c.radius > comp8.rad) {
	    		c.radius = c.radius + 15;
	    		comp8.rad = 0;
	    		comp8.circcenter_x = 999;
	    		
	    	}
	    	if(comp8.rad > c.radius) {
	    		comp8.rad = comp8.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp9) == true) {
	    	if(c.radius > comp9.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		comp9.rad = 0;
	    		comp9.circcenter_x = 999;
	    	}
	    	if(comp9.rad > c.radius) {
	    		comp9.rad = comp9.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }
	    if(c.overlapsWith(comp10) == true) {
	    	if(c.radius > comp10.rad) {
	    		c.radius = c.radius + 15;
	    		comp10.rad = 0;
	    		comp10.circcenter_x = 999;
	    		
	    	}
	    	if(comp10.rad > c.radius) {
	    		comp10.rad = comp10.rad + 15;
	    		c.radius = 0;
	    		c.center_x = 999;
	    		
	    	}
	    }

	    if(c.overlapsWith(a) == true) {
	    	if(c.radius > a.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		a.rad = 0;
	    		a.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(b) == true) {
	    	if(c.radius > b.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		b.rad = 0;
	    		b.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(d) == true) {
	    	if(c.radius > d.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		d.rad = 0;
	    		d.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(e) == true) {
	    	if(c.radius > e.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		e.rad = 0;
	    		e.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(f) == true) {
	    	if(c.radius > f.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		f.rad = 0;
	    		f.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(G) == true) {
	    	if(c.radius > G.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		G.rad = 0;
	    		G.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(h) == true) {
	    	if(c.radius > h.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		h.rad = 0;
	    		h.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(i) == true) {
	    	if(c.radius > i.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		i.rad = 0;
	    		i.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(j) == true) {
	    	if(c.radius > j.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		j.rad = 0;
	    		j.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(k) == true) {
	    	if(c.radius > k.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		k.rad = 0;
	    		k.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(l) == true) {
	    	if(c.radius > l.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		l.rad = 0;
	    		l.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(m) == true) {
	    	if(c.radius > m.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		m.rad = 0;
	    		m.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(n) == true) {
	    	if(c.radius > n.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		n.rad = 0;
	    		n.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(o) == true) {
	    	if(c.radius > o.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		o.rad = 0;
	    		o.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(p) == true) {
	    	if(c.radius > p.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		p.rad = 0;
	    		p.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(q) == true) {
	    	if(c.radius > q.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		q.rad = 0;
	    		q.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(r) == true) {
	    	if(c.radius > r.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		r.rad = 0;
	    		r.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(s) == true) {
	    	if(c.radius > s.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		s.rad = 0;
	    		s.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(t) == true) {
	    	if(c.radius > t.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		t.rad = 0;
	    		t.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(u) == true) {
	    	if(c.radius > u.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		u.rad = 0;
	    		u.circcenter_x = 1000000;
	    	}
	    	
	    }
	    if(c.overlapsWith(v) == true) {
	    	if(c.radius > v.rad) {
	    		c.radius = c.radius + 15;
	    		
	    		v.rad = 0;
	    		v.circcenter_x = 1000000;
	    	}
	    	
	    }
	    
	    if(c.radius == 0) {
	    	System.out.println("game over");
	    
	    }
	    
    
  }
  
   public class circleArr{
   //attemp at an array of circles had to go more primative for this
	  
	  private int[] centerx = new int[26];
	  private int[] centery = new int[26];
	  private int Radius;
	  public circleArr() {
		  
	  		double num3 = Math.random();
			  Radius = (int) (num3 * 25);
		  for(int i = 0; i < 25; i++)
		  {
			  
			  double num = Math.random();
		  		double num2 = Math.random();
		  		centerx[i] = (int) (num*1000);
		  		centery[i] = (int) (num2*800);
			  

		  }
	  }
	  public void draw(Graphics gr) {
		  for(int y = 0; y < 25; y++) {
			  gr.fillOval(centerx[y], centery[y], Radius, Radius);
		  }
		  
	  }
	  
  }
  public class Circle{
	  private int center_x;
	  	private int center_y;
	  	// the radius of the circle
	  	private int radius;
	  	
	  	
  
  public Circle(int maxX, int maxY){
  	
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
   * This function runs whenever a user presses the keyboard.
   * Use it to control the logic of the Player in the game.
   */
 
  public boolean overlapsWith(compCircle other){
		
	  /* this was a previous failed attempt at the overlaps with function
			if(other.circcenter_x + other.rad > center_x - radius && other.circcenter_y - other.rad < center_y + radius) {
				System.out.println("Collision!");
				return true;
			} else if( other.circcenter_x + other.rad > center_x - radius && other.circcenter_y - other.rad > center_y + radius ) {
				System.out.println("Collision!");
				return true;
			} else if(other.circcenter_x - other.rad < center_x +radius && other.circcenter_y - other.rad < center_y + radius) {
				System.out.println("Collision!");
				return true;
			} else if(other.circcenter_x - other.rad < center_x + radius && other.circcenter_y + other.rad > center_y - radius) {
				System.out.println("Collision!");
				return true;
			}
			return false;
			*/
	  if( other.circcenter_x + other.rad > center_x && 
				other.circcenter_x + other.rad < center_x + radius &&
				other.circcenter_y + other.rad < center_y + radius	&&
				other.circcenter_y + other.rad > center_y	
			   ) {
				return true;
		}
		return false;
		}
 /* public boolean overlaps(circleArr other){
		
	  for(int r = 0; r < 26; r++) {
		  
	  
	  if( other.centerx[r] + other.Radius > center_x && 
				other.centerx[r] + other.Radius < center_x + radius &&
				other.centery[r] + other.Radius < center_y + radius	&&
				other.centery[r] + other.Radius > center_y	
			   ) {
				return true;
		}
	  }
		return false;
		}
		*/
  public void draw(Graphics canvas){
  	
  		
  		canvas.fillOval(center_x, center_y, radius, radius);
  		
  	}
  }
  public void keyTyped(KeyEvent evt){
	    // Print out the key typed as an example of how to get information about the keyTyped event
	    System.out.println("Key pressed: " + evt.getKeyChar());
	    switch(evt.getKeyChar()) {
	    case 'w' :
			c.center_y -= 5;
			break;
		
		case 's' :
			c.center_y += 5;
			break;
		
		case 'd' :
			c.center_x += 5;
			break;
		
		case 'a' :
			c.center_x -= 5;
			break;
		}
	    
	  }
  
  public class compCircle {
  	// Holds the location of the center of the circle
  	private int circcenter_x;
  	private int circcenter_y;
  	// the radius of the circle
  	private int rad;
  	// the velocity/direction of the circle's movement
  	private int velocity_x;
  	private int velocity_y;
  	// the color of the circle (using java.awt.Color class)
  	private Color color;
  	// The default constructor
  	public compCircle(int maxX, int maxY){
  	// randomize the location of the circle so that the center has x coordinate
  	// within [0, maxX] and y coordinate within [0, maxY].
  	// also set the radius to be a random amount, but not too big or small
  	// Then set the color randomly (your choice how to implement this)
  	// Set each velocity to something reasonable, the range [-3, 3] is good
  		double num = Math.random();
  		double num2 = Math.random();
  		double num3 = Math.random();
  		circcenter_x = (int) (num * (maxX - 50));
  		circcenter_y = (int) (num2 * (maxY - 50));
  		rad = (int) (num3 * 75);
  		if(circcenter_x < 50) {
  			circcenter_x = 50;
  		}
  		if(circcenter_y < 50) {
  			circcenter_y = 50;
  		}
  		velocity_x = 1;
  		velocity_y = -1;
  	}
  	
  	public boolean overlapsWith(Circlegame other){
		// your code here
			if(other.center_x + other.radius > circcenter_x - rad && other.center_y - other.radius < circcenter_y + rad) {
				System.out.println("Collision!");
				return true;
			} else if( other.center_x + other.radius > circcenter_x - rad && other.center_y - other.radius > circcenter_y + rad ) {
				System.out.println("Collision!");
				return true;
			} else if(other.center_x - other.radius < circcenter_x +rad && other.center_y - other.radius < circcenter_y + rad) {
				System.out.println("Collision!");
				return true;
			} else if(other.center_x - other.radius < circcenter_x + rad && other.center_y + other.radius > circcenter_y - rad) {
				System.out.println("Collision!");
				return true;
			}
			return false;
  	}
  	public void move(int maxX, int maxY){
  		if(circcenter_x + rad > maxX || circcenter_x < 0) {
  			velocity_x = velocity_x * -1;
  			
  		}
  		if(circcenter_y + rad > maxY || circcenter_y < 0) {
  			velocity_y = velocity_y * -1;
  			
  		}
  		
  		circcenter_x = circcenter_x + velocity_x;
  		circcenter_y = circcenter_y + velocity_y;
  		
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
  		
  		canvas.fillOval(circcenter_x, circcenter_y, rad, rad);
  		
  	}
  	/*** 
  	 * Returns true of this circle is logically overlapping with the one
		* pass as other. Keep in mind you can directly access the circle
		* attributes of other because this function is in the scope of the
		* Circle class.
		*/
  }
		
  /* You should not need to modify anything below here unless you're changing the name of the class */


  //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------
  // You should not need to modify the main function. But it could be helpful
  // to try reading through it and looking at the Java documentation
  // to see what it is doing and why.
  public static void main(String[] args) {
    /* NOTE:  The string in the following statement goes in the title bar
     * of the window.
     */
    JFrame window = new JFrame("Game Starter");

    /*
     * NOTE: If you change the name of this class, you must change
     * the name of the class in the next line to match!
     */
    Circlegame drawingArea = new Circlegame();

    // Set up a blank drawing area
    drawingArea.setBackground(Color.WHITE);
    window.setContentPane(drawingArea);

    /* NOTE:  In the next line, the numbers 600 and 450 give the
     * initial width and height of the drawing array.  You can change
     * these numbers to get a different size.
     */
    drawingArea.setPreferredSize(new Dimension(windowWidth,windowHeight));

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
     * calls to paintComponent().  The time is given in milliseconds, where
     * one second equals 1000 milliseconds.  You can increase this number
     * to get a slower animation.  You can decrease it somewhat to get a
     * faster animation, but the speed is limited by the time it takes
     * for the computer to draw each frame. 
     */
    Timer frameTimer = new Timer(20,drawingArea);

    window.setVisible(true);
    frameTimer.start();

  } // end main


  // This function is what drives the graphic drawing.
  // You should not need to modify this.
  public void actionPerformed(ActionEvent evt) {
    frameNum++;
    repaint();

    // Need this on linux to force a sync.
    // Otherwise, will stutter unless the mouse is moving
    getToolkit().sync();
  }

  // Calls the drawFrame function, you should not need to modify this
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawFrame(g, frameNum, getWidth(), getHeight());
  }


  // These are needed for the override, but you should use keyTyped instead to
  // handle input events.
  public void keyPressed(KeyEvent evt){ }
  public void keyReleased(KeyEvent evt){ }
}