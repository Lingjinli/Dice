void setup()
{
	noLoop();
}
void draw()
{
	Die bob = new Die(25,25);
	bob.show();
}
void mousePressed()
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
	void roll()
	{
        roll = (int)(Math.random()*6+1);
	}
	void show()
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
