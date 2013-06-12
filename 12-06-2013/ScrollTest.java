import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=ScrollTest width=800 height=600>
</applet>
*/

public class ScrollTest extends Applet implements AdjustmentListener
{
	Scrollbar scroll1,scroll2;
	String msg;
	public void init()
	{
		scroll1 = new Scrollbar(Scrollbar.VERTICAL,1,10,1,300);
		scroll2 = new Scrollbar(Scrollbar.HORIZONTAL,1,10,1,300);
		add(scroll1);
		add(scroll2);
		scroll1.addAdjustmentListener(this);
	}
	
	public void start()
	{
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,400,300);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e){
		msg += scroll1.getValue();
	}
	
	public void destroy()
	{
	
	}

}