package javaSwing;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class SADbook extends JPanel {

	
	
	public SADbook() {
		setBackground(new Color(15, 15, 15));

		setBounds(0,0,730,600);
		setLayout(null);
		
		JLabel sadbookLabel = new JLabel("SYSTEM ANALYSIS AND DESIGN");
		sadbookLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sadbookLabel.setForeground(Color.WHITE);
		sadbookLabel.setFont(new Font("Arial", Font.BOLD, 20));
		sadbookLabel.setBounds(200, 25, 330, 65);
		add(sadbookLabel);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(SADbook.class.getResource("/images/sad.jpg")));
		imgLabel.setBounds(190, 80, 374, 501);
		add(imgLabel);
		
	}

}
