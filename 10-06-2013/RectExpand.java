import java.awt.*;
import java.applet.*;
/*
<applet code=RectExpand width=800 height=600>
</applet>
*/

public class RectExpand extends Applet implements Runnable
{

	Thread t;
	boolean stopFlag;
	int x,y,centre_x,centre_y,width,height,old_width,old_height;
	public void init()
	{
	}
	
	public void start()
	{
		stopFlag = false;
		t = new Thread(this);
		x = 0;
		y = 0;
		width = 4;
		height = 2;
		centre_x = 402;
		centre_y = 301;
		t.start();
	}
	
	public void run()
	{
		for(;;)
		{
			try{
				Thread.sleep(50);
				repaint();
				x = centre_x - (width/2);
				y = centre_y - (height/2);
				width+=2;
				height+=2;
				
				
			}
			catch(Exception e){}
		}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(131,213,70));
		g.fillRect(x,y,width,height);
	}
	
	public void stop()
	{
		stopFlag=true;
		t = null;
	}
	
	public void destroy()
	{
	
	}
}