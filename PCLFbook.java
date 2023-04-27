package javaSwing;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PCLFbook extends JPanel {
	
	public PCLFbook() {
		setBackground(new Color(15, 15, 15));

		setBounds(0,0,730,600);
		setLayout(null);
		
		JLabel pclfbookLabel = new JLabel("PROGRAMMING CONCEPTS AND LOGIC FORMULATION");
		pclfbookLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pclfbookLabel.setForeground(Color.WHITE);
		pclfbookLabel.setFont(new Font("Arial", Font.BOLD, 20));
		pclfbookLabel.setBounds(90, 25, 550, 65);
		add(pclfbookLabel);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(PCLFbook.class.getResource("/images/blackbook.png")));
		imgLabel.setBounds(205, 110, 300, 350);
		add(imgLabel);
		
	}

}
