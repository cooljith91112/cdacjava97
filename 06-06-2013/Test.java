import java.awt.*;
import java.applet.*;
/*
<applet code="Test" width=800 height=600 align=middle>
</applet>
*/
public class Test extends Applet
{
	String msg1="";
	String msg2="";
	public void init()
	{
		setBackground (Color.black);
		setForeground (Color.white);
		msg1="Inside init()--->";
	}
	public void start()
	{
		msg1+="Inside start()--->";
	}
	public void paint(Graphics g)
	{
		g.drawString (msg1, 50,50);
		g.drawString (msg2, 50,120);
	}
	public void stop()
	{
		msg2+="Inside stop()--->";
	}
	public void destroy()
	{
		msg2+="Inside destroy()--->";
	}
}