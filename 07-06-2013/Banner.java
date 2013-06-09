import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/*
<applet code="Banner" width=500 height=500>
<param name="name" value="Vivek Vijayan">
<param name="age" value="27">
<param name="Address" value="STDC, Technopark">
<param name="phone" value="+919446067530">
</applet>
*/
public class Banner extends Applet implements Runnable//,MouseListener,MouseMotionListener
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
		/*addMouseListener(this);
        addMouseMotionListener(this);*/
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
				repaint(304,103,664,47);
				//repaint();
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
		//g.drawString(cdac.getWidth(this)+" , "+getHeight(this),310,365);
		showStatus (x+","+y);
	}
	
	
 /* @Override
    public void mouseClicked(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       x = e.getX();
       y = e.getY();
    }*/
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