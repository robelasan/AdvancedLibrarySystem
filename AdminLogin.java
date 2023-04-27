package javaSwing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class AdminLogin extends JFrame{

	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;
	private String username [] = {"Admin01", "Admin02", "Admin03",};
	private String password [] = {"AdminOne", "AdminTwo", "AdminThree",};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AdminLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JPanel usernamePanel = new JPanel();
		usernamePanel.setBounds(180, 129, 250, 40);
		usernamePanel.setBackground(new Color(255, 255, 255));
		contentPane.add(usernamePanel);
		usernamePanel.setLayout(null);
		
		userField = new JTextField();
		userField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(userField.getText().equals("Username")) {
					userField.setText("");
				}
				else {
					userField.selectAll();
				}
			}
			public void focusLost(FocusEvent e) {
				if(userField.getText().equals("")) {
					userField.setText("Username");
				}
			}
		});
		userField.setBorder(null);
		userField.setBackground(new Color(255, 255, 255));
		userField.setText("Username");
		userField.setBounds(10, 10, 160, 20);
		usernamePanel.add(userField);
		userField.setColumns(10);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setBounds(180, 179, 250, 40);
		passwordPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(passwordPanel);
		passwordPanel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("Password")) {
					passwordField.setEchoChar('●');
					passwordField.setText("");
				}
				else {
					passwordField.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals("")) {
					passwordField.setText("Password");
					passwordField.setEchoChar((char)0);
				}
			}
		});
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBorder(null);
		passwordField.setEchoChar((char)0);
		passwordField.setText("Password");
		passwordField.setBounds(10, 10, 160, 20);
		passwordPanel.add(passwordField);
		
		JLabel Xlabel = new JLabel("X");
		Xlabel.setBackground(new Color(0, 0, 0));
		Xlabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin.this.dispose();
				LibrarySystem lib = new LibrarySystem();
				lib.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Xlabel.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				Xlabel.setForeground(Color.BLACK);
			}
		});
		Xlabel.setForeground(new Color(24, 24, 24));
		Xlabel.setFont(new Font("Arial", Font.BOLD, 14));
		Xlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Xlabel.setBounds(560, 0, 40, 40);
		contentPane.add(Xlabel);
		
		JLabel credentialsLabel = new JLabel("");
		credentialsLabel.setForeground(new Color(0, 0, 0));
		credentialsLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		credentialsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		credentialsLabel.setBounds(180, 300, 250, 20);
		contentPane.add(credentialsLabel);
		
		JPanel loginPanel = new JPanel();
		loginPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String user = userField.getText();
				String pass = passwordField.getText();
				
				boolean correctUser = false;
				boolean correctPass = false;
				
				for (int i = 0; i < username.length; i++) {
				if (user.equals(username[i]) && pass.equals(password[i])) {
					AdminLogin.this.dispose();
					JOptionPane.showMessageDialog(null, "Welcome to NU Library.");
				}
				else if (user.equals(username[i])) {
					correctUser = true;
					if (correctUser == true) {
						credentialsLabel.setText("INCORRECT PASSWORD");
					}
					
				}
				else if (pass.equals(password[i])) {
					correctPass = true;
					if(correctPass == true) {
						credentialsLabel.setText("INCORRECT USERNAME");
					}
				}
				else {
					if(correctUser == false && correctPass == false) {
						credentialsLabel.setText("INCORRECT USERNAME AND PASSWORD");
					}
				}
				}
				
			}
			public void mouseEntered(MouseEvent e) {
				loginPanel.setBackground(new Color(10,10,10));
				loginPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseExited(MouseEvent e) {
				loginPanel.setBackground(new Color(0,0,0));
				loginPanel.setBorder(null);
			}
			public void mousePressed(MouseEvent e) {
				loginPanel.setBackground(new Color(51,51,51));
				loginPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseReleased(MouseEvent e) {
				loginPanel.setBackground(new Color(10,10,10));
				loginPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
		});
		loginPanel.setBackground(new Color(0, 0, 0));
		loginPanel.setBounds(180, 242, 250, 50);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);	
		
		
		
		JLabel loginLabel = new JLabel("LOG IN");
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setForeground(new Color(255, 255, 255));
		loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
		loginLabel.setBounds(85, 10, 82, 30);
		loginPanel.add(loginLabel);
		
		JLabel titleLbl = new JLabel("ADMIN");
		titleLbl.setForeground(new Color(0, 0, 0));
		titleLbl.setBackground(new Color(128, 128, 128));
		titleLbl.setFont(new Font("Arial", Font.BOLD, 20));
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setBounds(215, 50, 180, 50);
		contentPane.add(titleLbl);
		
		
	}
}
