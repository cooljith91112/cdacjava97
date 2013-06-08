import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Banner" width=500 height=500>
<param name="name" value="Vivek Vijayan">
<param name="age" value="27">
<param name="Address" value="STDC, Technopark">
<param name="phone" value="+919446067530">
</applet>
*/
public class Banner extends Applet implements Runnable
{
	String msg=" Software Trainning and Development Center  ";
	Thread t=null;
	Color cob=new Color(30,170,210);
	String name,age,address,phno;
	Image cdac;
	int x=0,y=0;
	boolean stopFlag;
	public void init()
	{
		setBackground(cob);
		setForeground(Color.white);
		name = getParameter("name");
		age = getParameter("age");
		address = getParameter("address");
		phno = getParameter("phone");
		cdac = getImage(getCodeBase(),"cdac.jpg");
	}
	public void start()
	{
		t=new Thread (this);
		stopFlag=false;
		
		t.start();
	}
	public void run()
	{
		char ch;
		for(;;)
		{
			try
			{
				//repaint(0,310,100,100);
				repaint();
				Thread.sleep(500);
				ch=msg.charAt(0);
				msg=msg.substring(1,msg.length());
				msg+=ch;
				if (stopFlag)
					break;
			}
			catch (Exception e)
			{}
		}
	}
	public void stop()
	{
		stopFlag=true;
		t=null;
	}
	public void paint (Graphics g)
	{
		g.drawImage(cdac,150,360,this);
		g.setFont(new Font ("Arial", Font.BOLD,30));
		g.drawString(msg,310,130);
		g.setFont(new Font ("Calibri", Font.BOLD,16));
		g.drawString(name,310,200);
		g.drawString(age,310,250);
		g.drawString(address,310,300);
		g.drawString(phno,310,350);
		
		showStatus (x+","+y);
	}
}
/*
public class MyMouse extends MouseAdapter
{
	public void mouseClicked(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
	}
}
*/		