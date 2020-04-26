package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondaryPageTwo extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryPageTwo frame = new SecondaryPageTwo();
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
	public SecondaryPageTwo() {
		JPanel in6_Panel,in4_Panel,in5_Panel,in3_Panel,south_Panel, east_Panel,center_Panel,north_Panel;
		JLabel titleLabel;
		JLabel southLabel;
		JLabel lblNewLabel;
		setTitle("生活计算器");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(200, 200);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/life.png");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 0, 780, 480);
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		
		center_Panel = new JPanel();
		center_Panel.setOpaque(false);
		north_Panel = new JPanel();
		north_Panel.setOpaque(false);
		east_Panel = new JPanel(new GridLayout(4, 1, 12, 32));
		east_Panel.setOpaque(false);
		south_Panel = new JPanel();
		south_Panel.setOpaque(false);
		center_Panel.setOpaque(false);
		south_Panel.setOpaque(false);
		east_Panel.setOpaque(false);
		north_Panel.setOpaque(false);
		contain.add(east_Panel, BorderLayout.EAST);
		contain.add(north_Panel, BorderLayout.NORTH);
		contain.add(south_Panel, BorderLayout.SOUTH);
		contain.add(center_Panel, BorderLayout.CENTER);
		north_Panel.setPreferredSize(new Dimension(750, 65));
		
		in4_Panel = new JPanel();
		in4_Panel.setOpaque(false);
		in5_Panel = new JPanel();
		in5_Panel.setOpaque(false);
		in6_Panel = new JPanel();
		in6_Panel.setOpaque(false);
		in3_Panel = new JPanel();
		in3_Panel.setOpaque(false);
		
		lblNewLabel = new JLabel("                                                                                                                                                                                                                                  ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 8));
		north_Panel.add(lblNewLabel);
		
		titleLabel = new JLabel("\u751F\u6D3B\u8BA1\u7B97\u5668            ");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("隶书", Font.BOLD, 30));
		titleLabel.setOpaque(false);
		north_Panel.add(titleLabel);
		south_Panel.setPreferredSize(new Dimension(750, 42));
		
		southLabel = new JLabel("\u6B64\u751F\u6D3B\u8BA1\u7B97\u5668\u4EC5\u4E3A\u8F6F\u4EF6\u5DE5\u7A0B\u5B9E\u8DF5\u8BFE\u7A0B\u53CC\u4EBA\u9879\u76EE\u4F5C\u4E1A\u6240\u505A\uFF0C\u7248\u6743\u4EE5\u53CA\u89E3\u91CA\u6743\u5F52\u751C\u7B52\u5C0F\u7EC4\u6240\u6709\u3002");
		southLabel.setForeground(new Color(0, 0, 0));
		southLabel.setFont(new Font("隶书", Font.ITALIC, 17));
		south_Panel.add(southLabel);
		east_Panel.setPreferredSize(new Dimension(230, 400));
		east_Panel.add(in4_Panel);
		east_Panel.add(in5_Panel);
		east_Panel.add(in6_Panel);
		east_Panel.add(in3_Panel);
		
		JButton button = new JButton(" \u8FD4\u56DE ");
		button.setOpaque(false);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("隶书", Font.BOLD, 23));
		button.setBackground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage newWindow1=new MainPage();
				newWindow1.setVisible(true);
			}
		});
		in3_Panel.add(button);
		center_Panel.setPreferredSize(new Dimension(510, 400));
		
		JLabel label_5 = new JLabel("\u5355\u4F4D\u6362\u7B97\u5668\uFF1A                            ");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("隶书", Font.PLAIN, 22));
		label_5.setBackground(Color.BLACK);
		center_Panel.add(label_5);
		
		JLabel label_3 = new JLabel(" -8\u79CD\u5EA6\u91CF\u886167\u79CD\u5355\u4F4D\u6362\u7B97\u3002                   ");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("隶书", Font.PLAIN, 22));
		label_3.setBackground(Color.BLACK);
		center_Panel.add(label_3);
		
		JLabel lblNewLabel_4 = new JLabel(" \u5065\u5EB7\u8BA1\u7B97\u5668\uFF1A                             ");
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("隶书", Font.PLAIN, 22));
		center_Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("   -\u4F53\u8D28\u6307\u6570+\u57FA\u7840\u4EE3\u8C22                               ");
		lblNewLabel_5.setBackground(Color.BLACK);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("隶书", Font.PLAIN, 20));
		center_Panel.add(lblNewLabel_5);
		
		JLabel label_2 = new JLabel("   -\u98DF\u7269\u70ED\u91CF\u8BA1\u7B97                                    ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("隶书", Font.PLAIN, 20));
		label_2.setBackground(Color.BLACK);
		center_Panel.add(label_2);
		
		JLabel label_4 = new JLabel("   -\u5361\u8DEF\u91CC\u6D88\u8017\u8BA1\u7B97                                  ");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("隶书", Font.PLAIN, 20));
		label_4.setBackground(Color.BLACK);
		center_Panel.add(label_4);
		
		JLabel lblNewLabel_6 = new JLabel(" \u60C5\u611F\u8BA1\u7B97\u5668\uFF1A                             ");
		lblNewLabel_6.setBackground(Color.BLACK);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("隶书", Font.PLAIN, 22));
		center_Panel.add(lblNewLabel_6);
		
		JLabel label_1 = new JLabel("   -\u4EB2\u621A\u5173\u7CFB\u8BA1\u7B97                                ");
		label_1.setBackground(Color.BLACK);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("隶书", Font.PLAIN, 22));
		center_Panel.add(label_1);
		
		JLabel label = new JLabel("   -\u4E24\u4EBA\u4EB2\u5BC6\u5EA6\u8BA1\u7B97                              ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("隶书", Font.PLAIN, 22));
		label.setBackground(Color.BLACK);
		center_Panel.add(label);
		
		
		JButton btnNewButton_3 = new JButton("\u5355\u4F4D\u6362\u7B97\u5668");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  UnitConversionPage newWindow=new UnitConversionPage();
			  newWindow.setVisible(true);
		    }
	    });
		btnNewButton_3.setOpaque(false);
		in6_Panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u5065\u5EB7\u8BA1\u7B97\u5668");
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  HealthLifePage newWindow=new HealthLifePage();
			  newWindow.setVisible(true);
		    }
	    });
		btnNewButton_4.setOpaque(false);
		in4_Panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u60C5\u611F\u8BA1\u7B97\u5668");
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  new EmotionalLifePage();
		    }
	    });
		btnNewButton_5.setOpaque(false);
		in5_Panel.add(btnNewButton_5);
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	
}