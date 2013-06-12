import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code=ListPro width=800 height=600>
</applet>
*/

public class ListPro extends Applet implements ActionListener
{
	List lt1,lt2;
	Button b1,b2;
	public void init()
	{
		lt1=new List (5,true);
		lt2=new List (5);
		b1=new Button (">>>");
		b2=new Button ("clear");
		add(lt1);
		add(b1);
		add(lt2);
		add(b2);
		lt1.add ("Benz");
		lt1.add ("Audi");
		lt1.add ("Skoda");
		lt1.add ("Volkswagen");
		lt1.add ("BMW");
		lt1.add ("Maruthi");
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String[] selitems = new String[10];
			int[] selindex = new int[10];
			selitems = lt1.getSelectedItems();
			selindex = lt1.getSelectedIndexes();
			for(int i=0;i<selitems.length;i++)
			{
				lt2.add(selitems[i]);
			}	
			int index = selindex.length;
			for(int i=0;i<index;i++)
			{
				selindex = lt1.getSelectedIndexes();
				lt1.delItem(selindex[0]);
			}
		}
		
		if(e.getSource()==b2)
		 lt2.clear();
	}
	public void start()
	{
		setBackground (new Color(181,117,119));
	}
	
	public void paint(Graphics g)
	{
	}
	
	public void stop()
	{
	}
	
	public void destroy()
	{
		removeAll();
	}
}