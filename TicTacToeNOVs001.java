import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeNOVs001 extends JFrame {

	private JPanel contentPane;
	static TicTacToeNOVs001 frame = new TicTacToeNOVs001();
	
	static char[][] map = new char[3][3];
	static char turn = 'x';
	static boolean Tie = false;
	static int finished = 0;
	static int p1w = 0, p1l = 0, p2w = 0, p2l = 0;
	
	JButton button_0;
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	JButton button_6;
	JButton button_7;
	JButton button_8;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TicTacToeNOVs001() {
		Icon x = new ImageIcon(getClass().getResource("X1-icon.png"));
		Icon o = new ImageIcon(getClass().getResource("O1-icon.png"));
				
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pn = new JLabel("");
		pn.setBounds(256, 19, 83, 65);
		pn.setIcon(x);
		contentPane.add(pn);
		
		JLabel lblNewLabel = new JLabel("Playes Now: ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 34));
		lblNewLabel.setBounds(32, 25, 210, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(139, 0, 0));
		panel_1.setBounds(33, 94, 450, 347);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		button_0 = new JButton("");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(turn == 'o') {
					button_0.setIcon(o);
					button_0.setEnabled(false);
					finished = finished + 1;
					map[0][0] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_0.setIcon(x);
					button_0.setEnabled(false);
					finished = finished + 1;
					map[0][0] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
				
			}
		});
		button_0.setBounds(0, 0, 142, 107);
		panel_1.add(button_0);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_1.setIcon(o);
					button_1.setEnabled(false);
					finished = finished + 1;
					map[0][1] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_1.setIcon(x);
					button_1.setEnabled(false);
					finished = finished + 1;
					map[0][1] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';

				}
				
			}
		});
		button_1.setBounds(154, 0, 142, 107);
		panel_1.add(button_1);
		
		button_2 = new JButton("");
		button_2.setBounds(308, 0, 142, 107);
		panel_1.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_2.setIcon(o);
					button_2.setEnabled(false);
					finished = finished + 1;
					map[0][2] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
					
				}else if(turn == 'x') {
					button_2.setIcon(x);
					button_2.setEnabled(false);
					finished = finished + 1;
					map[0][2] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
					
				}
				
			}
		});
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_3.setIcon(o);
					button_3.setEnabled(false);
					finished = finished + 1;
					map[1][0] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_3.setIcon(x);
					button_3.setEnabled(false);
					finished = finished + 1;
					map[1][0] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
		});
		button_3.setBounds(0, 120, 142, 107);
		panel_1.add(button_3);
		
		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_4.setIcon(o);
					button_4.setEnabled(false);
					finished = finished + 1;
					map[1][1] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_4.setIcon(x);
					button_4.setEnabled(false);
					finished = finished + 1;
					map[1][1] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
		});
		button_4.setBounds(154, 120, 142, 107);
		panel_1.add(button_4);
		
		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_5.setIcon(o);
					button_5.setEnabled(false);
					finished = finished + 1;
					map[1][2] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_5.setIcon(x);
					button_5.setEnabled(false);
					finished = finished + 1;
					map[1][2] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
		});
		button_5.setBounds(308, 120, 142, 107);
		panel_1.add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_6.setIcon(o);
					button_6.setEnabled(false);					
					finished = finished + 1;
					map[2][0] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_6.setIcon(x);
					button_6.setEnabled(false);
					finished = finished + 1;
					map[2][0] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
		});
		button_6.setBounds(0, 240, 142, 107);
		panel_1.add(button_6);
		
		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_7.setIcon(o);
					button_7.setEnabled(false);
					finished = finished + 1;
					map[2][1] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_7.setIcon(x);
					button_7.setEnabled(false);
					finished = finished + 1;
					map[2][1] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
		});
		button_7.setBounds(154, 240, 142, 107);
		panel_1.add(button_7);
		
		
		
		button_8 = new JButton("");
		button_8.setBounds(308, 240, 142, 107);
		panel_1.add(button_8);
		
		lblNewLabel_1 = new JLabel("This game was created by: TG(Techno Group) You can contact us on (+966590106304)");
		lblNewLabel_1.setBounds(0, 443, 506, 21);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Version Number: Vs 0.0.1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(174, 467, 165, 21);
		contentPane.add(lblNewLabel_2);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn == 'o') {
					button_8.setIcon(o);
					button_8.setEnabled(false);
					finished = finished + 1;
					map[2][2] = 'o';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(x);
					turn = 'x';
				}else if(turn == 'x') {
					button_8.setIcon(x);
					button_8.setEnabled(false);
					finished = finished + 1;
					map[2][2] = 'x';
					if(isFinished(map,turn,finished)) {
						int a = JOptionPane.showConfirmDialog(null, "Do You Want to Play Again ??!");
						playAgain(a);
					}
					pn.setIcon(o);
					turn = 'o';
				}
			}
			
		});
	}
	
	
	boolean isFinished(char[][] map2, char turn1, int finished1) {
		boolean F = false;
		
		
			if((map2[0][0] == turn1)) {				//1st row
				if(map2[0][1] == turn1)
					if(map2[0][2] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[1][0] == turn1)) {			//2nd row
				if(map2[1][1] == turn1)
					if(map2[1][2] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[2][0] == turn1)) {			//3rd row
				if(map2[2][1] == turn1)
					if(map2[2][2] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[0][0] == turn1)) {			//1st col
				if(map2[1][0] == turn1)
					if(map2[2][0] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[0][1] == turn1)) {			//2nd col
				if(map2[1][1] == turn1)
					if(map2[2][1] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[0][2] == turn1)) {			//3rd col
				if(map2[1][2] == turn1)
					if(map2[2][2] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[0][0] == turn1)) {			//Horezontal from left
				if(map2[1][1] == turn1)
					if(map2[2][2] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}if((map2[0][2] == turn1)) {			//Horezontal from right
				if(map2[1][1] == turn1)
					if(map2[2][0] == turn1) {
						JOptionPane.showMessageDialog(null, "Congrats Mr. "+ turn1);
						F = true;
					}
			}
			if((finished1 == 9) && !F) {
				JOptionPane.showMessageDialog(null, "Tieeeeeee");
				Tie = true;
				F = true;
			}
		
		return F;
		
		
	}
	
	
	void playAgain(int a1) {
		if(a1 == 0) {
			button_0.setIcon(null);
			button_0.setEnabled(true);
			button_1.setIcon(null);
			button_1.setEnabled(true);
			button_2.setIcon(null);
			button_2.setEnabled(true);
			button_3.setIcon(null);
			button_3.setEnabled(true);
			button_4.setIcon(null);
			button_4.setEnabled(true);
			button_5.setIcon(null);
			button_5.setEnabled(true);
			button_6.setIcon(null);
			button_6.setEnabled(true);
			button_7.setIcon(null);
			button_7.setEnabled(true);
			button_8.setIcon(null);
			button_8.setEnabled(true);
			finished = 0;
			for(int i = 0; i < 3;i++) 
				for(int j = 0; j < 3;j++) 
					map[i][j] = '_';	
		}else {
			JOptionPane.showMessageDialog(null, "Thanks for Using The First Version of Our App");
			System.exit(0);
		}
	}
}





















