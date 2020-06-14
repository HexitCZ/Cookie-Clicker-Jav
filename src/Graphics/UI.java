package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Core.Economy;

public class UI // implements ActionListener
{

	public JButton cookie = new JButton("Click me!");
	public JButton upgrade = new JButton("Upgrade");  		// Pojmenování tlačítek

	public JButton RenderCookie()
	{
		cookie.setSize(20, 20);
		cookie.setVisible(true);

		cookie.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) //Metoda která se zavolá po stlačení tlačítka Click me!.
			{
				Economy.money += Economy.sellValue; //Přičtení vydělaných peněz za 1 kliknutí do celkových peněz.
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
			public void actionPerformed(ActionEvent e) //Metoda která se zavolá po kliknutí na tlačítko Upgrade.
			{
				if (Economy.money > Economy.sellValue * 10) //Pokud máte dostatek peněz na upgrade(10 * peníze za 1 klik). 
				{
					Economy.money -= Economy.sellValue * 10; //Odečtení ceny upgradu od celkových peněz.
					System.out.println("UPGRADED!");
					Economy.sellValue *= 2; //Zvýšení výdělku kliknutí na dvojnásobek. 
				}

			}
		});
		return upgrade;
	}

}
