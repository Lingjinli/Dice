import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	noLoop();
}
public void draw()
{
	Die bob = new Die(25,25);
	bob.show();
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX;
	int myY;
	int roll;
	Die(int x, int y) 
	{
		myX = x;
		myY = y;
		roll();
	}
	public void roll()
	{
        roll = (int)(Math.random()*6+1);
	}
	public void show()
	{
		fill (255,255,255);
		rect (myX, myY, 50, 50);
		fill (0,0,0);
		if (roll == 1)
		{
			ellipse(myX + 25, myY +27, 15, 15);
		} 
		else if (roll == 2)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
		}
		else if (roll == 3)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 27, myY +27, 15, 15);
		} 
		else if (roll == 4)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 40, myY+15, 15, 15);
			ellipse(myX + 10, myY+40, 15, 15);
		} 
		else if (roll == 5)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 40, myY+15, 15, 15);
			ellipse(myX + 10, myY+40, 15, 15);
			ellipse(myX + 25, myY +27, 15, 15);
		} 
		else if (roll == 6)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 40, myY+15, 15, 15);
			ellipse(myX + 10, myY+40, 15, 15);
			ellipse(myX + 10, myY +27, 15, 15);
			ellipse(myX + 40, myY +27, 15, 15);
		} 

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
