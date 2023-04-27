package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JPanel;

public class LibrarySystem extends JFrame{

	private JFrame frame;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarySystem frame = new LibrarySystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public LibrarySystem() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JPanel adminPanel = new JPanel();
		adminPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibrarySystem.this.dispose();
				AdminLogin adlog = new AdminLogin();
				adlog.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				adminPanel.setBackground(new Color(10,10,10));
				adminPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseExited(MouseEvent e) {
				adminPanel.setBackground(new Color(0,0,0));
				adminPanel.setBorder(null);
			}
			public void mousePressed(MouseEvent e) {
				adminPanel.setBackground(new Color(51,51,51));
				adminPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseReleased(MouseEvent e) {
				adminPanel.setBackground(new Color(10,10,10));
				adminPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
		});
		adminPanel.setBackground(new Color(15, 15, 15));
		adminPanel.setBounds(200, 150, 200, 50);
		contentPane.add(adminPanel);
		adminPanel.setLayout(null);
		
		JLabel adminLabel = new JLabel("ADMIN");
		adminLabel.setForeground(new Color(255, 255, 255));
		adminLabel.setFont(new Font("Arial", Font.BOLD, 20));
		adminLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminLabel.setBounds(10, 10, 180, 30);
		adminPanel.add(adminLabel);
		
		JPanel librarianPanel = new JPanel();
		librarianPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibrarySystem.this.dispose();
				LibrarianLogin liblog = new LibrarianLogin();
				liblog.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				librarianPanel.setBackground(new Color(10,10,10));
				librarianPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseExited(MouseEvent e) {
				librarianPanel.setBackground(new Color(0,0,0));
				librarianPanel.setBorder(null);
			}
			public void mousePressed(MouseEvent e) {
				librarianPanel.setBackground(new Color(51,51,51));
				librarianPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
			public void mouseReleased(MouseEvent e) {
				librarianPanel.setBackground(new Color(10,10,10));
				librarianPanel.setBorder(new LineBorder(new Color(255, 255, 255)));
			}
		});
		librarianPanel.setLayout(null);
		librarianPanel.setBackground(new Color(15, 15, 15));
		librarianPanel.setBounds(200, 224, 200, 50);
		contentPane.add(librarianPanel);
		
		JLabel librarianLabel = new JLabel("LIBRARIAN");
		librarianLabel.setHorizontalAlignment(SwingConstants.CENTER);
		librarianLabel.setForeground(Color.WHITE);
		librarianLabel.setFont(new Font("Arial", Font.BOLD, 20));
		librarianLabel.setBounds(10, 10, 180, 30);
		librarianPanel.add(librarianLabel);
		
		JLabel Xlabel = new JLabel("X");
		Xlabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				LibrarySystem.this.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				Xlabel.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				Xlabel.setForeground(Color.BLACK);
			}
		});
		Xlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Xlabel.setForeground(new Color(24, 24, 24));
		Xlabel.setFont(new Font("Arial", Font.BOLD, 14));
		Xlabel.setBackground(Color.BLACK);
		Xlabel.setBounds(560, 0, 40, 40);
		contentPane.add(Xlabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(200, 50, 200, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 200, 50);
		panel.add(lblNewLabel);
	}
}
