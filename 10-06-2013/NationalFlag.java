import java.awt.*;
import java.applet.*;
/*
<applet code=NationalFlag width=800 height=600>
</applet>
*/

public class NationalFlag extends Applet 
{
	int x =260, y =160;
	double x1 =0 ,y1 = 0;
	public void init()
	{
	}
	
	public void start()
	{
		
	}

	public void paint(Graphics g)
	{
		g.setColor(new Color(255,153,51));
		g.fillRect(10,10,500,100);
		g.setColor(new Color(255,255,255));
		g.fillRect(10,110,500,100);
		g.setColor(new Color(19,136,8));
		g.fillRect(10,210,500,100);
		g.setColor(new Color( 0,0,128));
		g.drawArc(210,110,100,100,0,360);
		
		for(int angle=0;angle<=360;angle+=15)
		{
			x1 =x + 50*Math.cos(Math.toRadians(angle)); 
			y1 =y + 50*Math.sin(Math.toRadians(angle)); 
			System.out.println(x1+" "+y1);
			g.drawLine(x,y,(int)x1,(int)y1);
		}
	}
	
	
	public void stop()
	{
		
	}
	
	public void destroy()
	{
	
	}
}