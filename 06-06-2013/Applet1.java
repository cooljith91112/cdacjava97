import java.awt.*;
import java.applet.*;

/*
<applet code="Applet1" width=800 height=600 align=middle>
</applet>
*/

public class Applet1 extends Applet
{
	Font f;
	public void init()
	{
		f = new Font("Bauhaus 93",Font.BOLD,35);
		setFont(f);
		setBackground(Color.black);
		setForeground(Color.white);
	}
	
	public void start()
	{
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hello World",320,240);
	}
	
	public void stop()
	{
	}
	
	public void destroy()
	{
	}

}