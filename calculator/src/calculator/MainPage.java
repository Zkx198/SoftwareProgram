package calculator;
//李涢瑶 2017111147
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MainPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("甜筒红茶");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 480);
		setLocation(800, 200);
		JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(3, 3));
        setContentPane(contentPane);
        
        ImageIcon img = new ImageIcon("./src/image/mp.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 0, 780, 480);
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		JPanel north = new JPanel();
        JPanel west = new JPanel();
        JPanel east = new JPanel();
        JPanel south = new JPanel();
        south.setOpaque(false);
        north.setOpaque(false);
        west.setOpaque(false);
        east.setOpaque(false);
      //  contain.add(east, BorderLayout.EAST);
		contain.add(north, BorderLayout.NORTH);
		contain.add(south, BorderLayout.SOUTH);
		contain.add(west, BorderLayout.EAST);
		north.setPreferredSize(new Dimension(750, 130));
		south.setPreferredSize(new Dimension(750, 45));
		
		JLabel lblNewLabel_1 = new JLabel("                        \u672C\u8BA1\u7B97\u5668\u4EC5\u4E3A\u8F6F\u4EF6\u5DE5\u7A0B\u5B9E\u8DF5\u8BFE\u7A0B\u4F5C\u4E1A\u6240\u505A\uFF0C\u7248\u6743\u4EE5\u53CA\u89E3\u91CA\u6743\u5F52\u751C\u7B52\u5C0F\u7EC4\u6240\u6709\u3002");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD | Font.ITALIC, 15));
		south.add(lblNewLabel_1);
		west.setPreferredSize(new Dimension(250, 150));
		
        
		JButton btnNewButton = new JButton("科学计算器");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 175, 175));
		btnNewButton.setFont(new Font("隶书", Font.BOLD, 28));
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SecondaryPageOne newWindow=new SecondaryPageOne();
				newWindow.setVisible(true);
			}
		});
		west.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("生活计算器");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("隶书", Font.BOLD, 28));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SecondaryPageTwo newWindow1=new SecondaryPageTwo();
				newWindow1.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("                                  ");
		west.add(lblNewLabel);
		west.add(btnNewButton_1);
	}
	

}
