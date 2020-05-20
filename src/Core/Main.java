package Core;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Graphics.UI;

public class Main
{

	public static void main(String[] args)
	{
		boolean GameOn = true;
		UI ui = new UI();

		JFrame frame = new JFrame();

		JPanel cookiePanel = new JPanel();

		JLabel moneyTxt = new JLabel();

		cookiePanel.add(ui.RenderCookie());

		cookiePanel.add(moneyTxt, BorderLayout.CENTER);

		cookiePanel.setBounds(0, -100, 100, 100);

		cookiePanel.setLayout(new GridLayout(2, 1));

		frame.add(ui.RenderUpgrade(), BorderLayout.EAST);

		frame.add(cookiePanel, BorderLayout.NORTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);

		while (GameOn == true)
		{
			moneyTxt.setText(Integer.toString(Economy.money));
		}

	}

}
