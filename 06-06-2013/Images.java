import java.awt.*;
import java.applet.*;
import java.awt.image.*;
/*
<applet code="Images" width=800 height=600 align=middle>
</applet>
*/
public class Images extends Applet
{
	int x=10,y=10;
	public void init()
	{
		
	}
	public void start()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello",x,y);
		update(g);
	}
	public void stop()
	{
		
	}
	public void destroy()
	{
		
	}
	public void update(Graphics g)
	{	
		x++;
		y++;
		g.paint(this);
	}
}