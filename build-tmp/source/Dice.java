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
	size(500,500);
	background(169,0,0);
}
public void draw()
{
	Die bob = new Die(25,25);
	bob.show();
	Die bobby = new Die(75,75);
	bobby.show();
	Die thomas = new Die(125,125);
	thomas.show();
	Die aidan = new Die(175,175);
	aidan.show();
	Die aaron = new Die(225,225);
	aaron.show();
	Die anya = new Die(275,275);
	anya.show();
	Die cole = new Die(325,325);
	cole.show();
	Die william = new Die(375,375);
	william.show();
	Die cooley = new Die(425,425);
	cooley.show();
	int total;
	total = bob.rolls + bobby.rolls + thomas.rolls + aidan.rolls + aaron.rolls + anya.rolls + cole.rolls + william.rolls + cooley.rolls;
	text ("Total: " + total, 210,490);

}

public void mousePressed()
{
	redraw();
	fill(169,0,0);
	noStroke();
	rect(207,475,55,35);
}
class Die //models one single dice cube
{
	int myX;
	int myY;
	int rolls;
	Die(int x, int y) 
	{
		myX = x;
		myY = y;
		roll();
	}
	public void roll()
	{
        rolls= (int)(Math.random()*6+1);
	}
	public void show()
	{
		fill (255,255,255);
		rect (myX, myY, 50, 50);
		fill (0,0,0);
		if (rolls == 1)
		{
			ellipse(myX + 25, myY +27, 15, 15);
		} 
		else if (rolls == 2)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
		}
		else if (rolls == 3)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 27, myY +27, 15, 15);
		} 
		else if (rolls == 4)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 40, myY+15, 15, 15);
			ellipse(myX + 10, myY+40, 15, 15);
		} 
		else if (rolls == 5)
		{
			ellipse (myX + 10, myY + 15,15,15);
			ellipse (myX + 40, myY + 40,15,15);
			ellipse(myX + 40, myY+15, 15, 15);
			ellipse(myX + 10, myY+40, 15, 15);
			ellipse(myX + 25, myY +27, 15, 15);
		}
		else if (rolls == 6)
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
