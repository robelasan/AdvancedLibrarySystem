package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class Library extends JFrame {

	private JPanel contentPane;
	
	private Home home;
	private SADbook sadbook;
	private AAbook aabook;
	private PCLFbook pclfbook;
	private JTextField indexTxtfield;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library frame = new Library();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Inventory book1 = new Inventory("System Analysis and Design", "Gary B. Shelly", 2);
	Inventory book2 = new Inventory("Android Application", "Corrine Hoisington", 3);
	Inventory book3 = new Inventory("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4);
	
	Inventory[] books = {book1,book2,book3};

	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 730);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.setLayout(null);
		
		home = new Home();
		home.setSize(730, 500);
		sadbook = new SADbook();
		sadbook.setSize(730, 500);
		aabook = new AAbook();
		aabook.setSize(730, 500);
		pclfbook = new PCLFbook();
		pclfbook.setSize(730, 500);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 350, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel homePanel = new JPanel();
		homePanel.addMouseListener(new ButtonMouseAdapter(homePanel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(home);
			}
		});
			
		homePanel.setLayout(null);
		homePanel.setBackground(new Color(15, 15, 15));
		homePanel.setBounds(0, 200, 350, 70);
		panel.add(homePanel);
		
		JLabel homeLabel = new JLabel("HOME");
		homeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		homeLabel.setForeground(Color.WHITE);
		homeLabel.setFont(new Font("Arial", Font.BOLD, 20));
		homeLabel.setBounds(10, 10, 330, 50);
		homePanel.add(homeLabel);
		
		JPanel book1Panel = new JPanel();
		book1Panel.addMouseListener(new ButtonMouseAdapter(book1Panel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(sadbook);
			}
		});
		book1Panel.setBackground(new Color(15, 15, 15));
		book1Panel.setBounds(0, 270, 350, 70);
		panel.add(book1Panel);
		book1Panel.setLayout(null);
		
		JLabel book1Label = new JLabel("SYSTEM ANALYSIS AND DESIGN");
		book1Label.setForeground(new Color(255, 255, 255));
		book1Label.setFont(new Font("Arial", Font.BOLD, 20));
		book1Label.setHorizontalAlignment(SwingConstants.CENTER);
		book1Label.setBounds(10, 10, 330, 50);
		book1Panel.add(book1Label);
		
		JPanel book2Panel = new JPanel();
		book2Panel.addMouseListener(new ButtonMouseAdapter(book2Panel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(aabook);
			}
		});
		book2Panel.setBackground(new Color(15, 15, 15));
		book2Panel.setBounds(0, 340, 350, 70);
		panel.add(book2Panel);
		book2Panel.setLayout(null);
		
		JLabel book2Label = new JLabel("ANDROID APPLICATION");
		book2Label.setFont(new Font("Arial", Font.BOLD, 20));
		book2Label.setForeground(new Color(255, 255, 255));
		book2Label.setHorizontalAlignment(SwingConstants.CENTER);
		book2Label.setBounds(10, 10, 330, 50);
		book2Panel.add(book2Label);
		
		JPanel book3Panel = new JPanel();
		book3Panel.addMouseListener(new ButtonMouseAdapter(book3Panel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pclfbook);
			}
		});
		book3Panel.setBackground(new Color(15, 15, 15));
		book3Panel.setBounds(0, 410, 350, 70);
		panel.add(book3Panel);
		book3Panel.setLayout(null);
		
		JLabel book3Label = new JLabel("PROGRAMMING CONCEPTS AND LOGIC FORMULATION");
		book3Label.setHorizontalTextPosition(SwingConstants.CENTER);
		book3Label.setFont(new Font("Arial", Font.BOLD, 12));
		book3Label.setForeground(new Color(255, 255, 255));
		book3Label.setHorizontalAlignment(SwingConstants.CENTER);
		book3Label.setBounds(10, 10, 340, 50);
		book3Panel.add(book3Label);
		
		JPanel logoutPanel = new JPanel();
		logoutPanel.addMouseListener(new ButtonMouseAdapter(logoutPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?") == 0) {
					LibrarySystem log = new LibrarySystem();
					log.setVisible(true);
					Library.this.dispose();
				}
			}
		});
		logoutPanel.setBackground(new Color(15, 15, 15));
		logoutPanel.setBounds(0, 480, 350, 70);
		panel.add(logoutPanel);
		logoutPanel.setLayout(null);
		
		JLabel logoutLabel = new JLabel("LOG OUT");
		logoutLabel.setFont(new Font("Arial", Font.BOLD, 20));
		logoutLabel.setForeground(new Color(255, 255, 255));
		logoutLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoutLabel.setBounds(10, 10, 330, 50);
		logoutPanel.add(logoutLabel);
		
		JLabel Xlabel = new JLabel("X");
		Xlabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					Library.this.dispose();
				}
			}
			@Override
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
		Xlabel.setBounds(1060, 0, 40, 40);
		contentPane.add(Xlabel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(51, 51, 51));
		mainPanel.setBounds(360, 10, 730, 710);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		setVisible(true);
		
		mainPanel.add(home);
		mainPanel.add(sadbook);
		mainPanel.add(aabook);
		mainPanel.add(pclfbook);
		
		menuClicked(home);
		
		JTextArea textArea = new JTextArea("0 System Analysis and Design by Gary B. Shelly\n\n"
				+ "1 Android Application by Corrine Hoisington\n\n"
				+ "2 Programming Concepts and Logic Formulation by Rosauro E. Manuel");
		textArea.setBackground(new Color(51, 51, 51));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setFont(new Font("Arial", Font.BOLD, 14));
		textArea.setBounds(10, 510, 710, 90);
		mainPanel.add(textArea);
		
		indexTxtfield = new JTextField();
		indexTxtfield.setBounds(340, 630, 180, 30);
		mainPanel.add(indexTxtfield);
		indexTxtfield.setColumns(10);
		
		JLabel questionLabel = new JLabel("Choose a number to rent your favorite book:");
		questionLabel.setForeground(new Color(255, 255, 255));
		questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
		questionLabel.setHorizontalAlignment(SwingConstants.LEFT);
		questionLabel.setBounds(10, 630, 325, 30);
		mainPanel.add(questionLabel);
		
		JLabel responseLabel = new JLabel("");
		responseLabel.setForeground(new Color(255, 255, 255));
		responseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		responseLabel.setFont(new Font("Arial", Font.BOLD, 14));
		responseLabel.setBounds(50, 670, 640, 30);
		mainPanel.add(responseLabel);
		
		JPanel rentPanel = new JPanel();
		rentPanel.addMouseListener(new ButtonMouseAdapter(rentPanel) {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userChoice = indexTxtfield.getText();
				
			    int num = Integer.parseInt(userChoice);
			    
			    if (num < 0 ) { 
					 responseLabel.setText("NO COPIES AVAILABLE");							
		         } 
			    else if (num >= books.length) { 
		        	 responseLabel.setText("INDEX DOES NOT EXIST. TRY AGAIN"); // if the input is less than the number of index
		         }
		        else {  
		        	 //borrow method
		             books[num].borrowBook(responseLabel);
		        }
			    JOptionPane.showConfirmDialog(null, "Do you like to rent again?", "Confirmation", JOptionPane.YES_NO_OPTION);
			    responseLabel.setText("");
			    
			}
		
		});
		rentPanel.setBackground(new Color(15, 15, 15));
		rentPanel.setBounds(540, 630, 90, 30);
		mainPanel.add(rentPanel);
		rentPanel.setLayout(null);
		
		JLabel rentLabel = new JLabel("RENT");
		rentLabel.setForeground(new Color(255, 255, 255));
		rentLabel.setFont(new Font("Arial", Font.BOLD, 14));
		rentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rentLabel.setBounds(0, 0, 90, 30);
		rentPanel.add(rentLabel);
		
	}
	
	public void menuClicked(JPanel panel) {
		home.setVisible(false);
		sadbook.setVisible(false);
		aabook.setVisible(false);
		pclfbook.setVisible(false);
		
		panel.setVisible(true);
	}
	
	private class ButtonMouseAdapter extends MouseAdapter {
		
		JPanel panel;
		public ButtonMouseAdapter (JPanel panel) {
			this.panel = panel;
		}
		@Override
		public void mouseEntered (MouseEvent e) {
			panel.setBackground(new Color(10, 10, 10));
			panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		}
		public void mouseExited (MouseEvent e) {
			panel.setBackground(new Color(15, 15, 15));
			panel.setBorder(null);
		}
		public void mousePressed (MouseEvent e) {
			panel.setBackground(new Color(51, 51, 51));
			panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		}
		public void mouseReleased (MouseEvent e) {
			panel.setBackground(new Color(10, 10, 10));
			panel.setBorder(new LineBorder(new Color(255, 255, 255)));
		}
	}
}
