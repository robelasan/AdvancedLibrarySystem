package javaSwing;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Home extends JPanel {

	public Home() {
		setBackground(new Color(15, 15, 15));
		setVisible(true);
		setBounds(0,0,730,600);
		setLayout(null);
		
		JLabel homeLabel = new JLabel("WELCOME TO THE LIBRARY");
		homeLabel.setForeground(new Color(255, 255, 255));
		homeLabel.setFont(new Font("Arial", Font.BOLD, 20));
		homeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		homeLabel.setBounds(200, 100, 330, 65);
		add(homeLabel);
		
	}
}
