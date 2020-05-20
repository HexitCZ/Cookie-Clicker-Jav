package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Core.Economy;

public class UI // implements ActionListener
{

	public JButton cookie = new JButton("Click me!");
	public JButton upgrade = new JButton("Upgrade");

	public JButton RenderCookie()
	{
		cookie.setSize(20, 20);
		cookie.setVisible(true);

		cookie.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Economy.money += Economy.sellValue;
				System.out.println(Economy.money);

			}
		});
		return cookie;
	}

	public JButton RenderUpgrade()
	{
		upgrade.setSize(20, 20);
		upgrade.setVisible(true);

		upgrade.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (Economy.money > Economy.sellValue * 10)
				{
					Economy.money -= Economy.sellValue * 10;
					System.out.println("UPGRADED!");
					Economy.sellValue *= 2;
				}

			}
		});
		return upgrade;
	}

}
