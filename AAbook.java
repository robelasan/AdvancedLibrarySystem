package javaSwing;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class AAbook extends JPanel {

	public AAbook() {
		setBackground(new Color(15, 15, 15));

		setBounds(0,0,730,600);
		setLayout(null);
		
		JLabel aabookLabel = new JLabel("ANDROID APPLICATION");
		aabookLabel.setHorizontalAlignment(SwingConstants.CENTER);
		aabookLabel.setForeground(Color.WHITE);
		aabookLabel.setFont(new Font("Arial", Font.BOLD, 20));
		aabookLabel.setBounds(200, 25, 330, 65);
		add(aabookLabel);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(AAbook.class.getResource("/images/aa.jpg")));
		imgLabel.setBounds(190, 80, 360, 473);
		add(imgLabel);
		
	}

}
