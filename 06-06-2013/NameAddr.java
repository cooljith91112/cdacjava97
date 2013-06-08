import java.awt.*;
import java.applet.*;
/*
<applet code="NameAddr" width=800 height=600 align=middle>
</applet>
*/
public class NameAddr extends Applet
{
	Font f;
	public void init()
	{
		f=new Font("Agency FB", Font.BOLD,25);
		setFont (f);
		setBackground (Color.black);
		setForeground (Color.white);
	}
	public void start()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString ("Indrajith K L", 50,50);
		g.drawString ("Krishna, B P Nagar, Peyad, TVM", 50,120);
	}
	public void stop()
	{
		
	}
	public void destroy()
	{
		
	}
}