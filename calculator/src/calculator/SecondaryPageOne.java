package calculator;
import java.awt.*;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
//2017111147李涢瑶
public class SecondaryPageOne extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryPageOne frame = new SecondaryPageOne();
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
	public SecondaryPageOne() {
		setBackground(new Color(0, 0, 0));
		JPanel in6_Panel, in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel,south_Panel, west_Panel, east_Panel,center_Panel,north_Panel;
		JLabel titleLabel;
		JLabel southLabel;
		JLabel lblNewLabel;
		setTitle("科学计算器");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(200, 200);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/science5.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 10, 780, 480);
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		
		center_Panel = new JPanel();
		center_Panel.setOpaque(false);
		north_Panel = new JPanel();
		north_Panel.setOpaque(false);
		west_Panel = new JPanel(new GridLayout(3, 1, 12, 32));
		west_Panel.setOpaque(false);
		east_Panel = new JPanel(new GridLayout(3, 1, 12, 32));
		east_Panel.setOpaque(false);
		//east_Panel.setBackground(new Color(0, 0, 0));
		south_Panel = new JPanel();
		south_Panel.setOpaque(false);
		//south_Panel.setBackground(new Color(0, 0, 0));
		contain.add(west_Panel, BorderLayout.WEST);
		contain.add(east_Panel, BorderLayout.EAST);
		contain.add(north_Panel, BorderLayout.NORTH);
		contain.add(south_Panel, BorderLayout.SOUTH);
		contain.add(center_Panel, BorderLayout.CENTER);
	/*	getContentPane().add(west_Panel, BorderLayout.WEST);
		getContentPane().add(east_Panel, BorderLayout.EAST);
		getContentPane().add(north_Panel, BorderLayout.NORTH);
		getContentPane().add(south_Panel, BorderLayout.SOUTH);
		getContentPane().add(center_Panel, BorderLayout.CENTER);*/
		north_Panel.setPreferredSize(new Dimension(750, 58));
		
		in1_Panel = new JPanel();
		in1_Panel.setOpaque(false);
		in2_Panel = new JPanel();
		in2_Panel.setOpaque(false);
		in3_Panel = new JPanel();
		in3_Panel.setOpaque(false);
		in4_Panel = new JPanel();
		in4_Panel.setOpaque(false);
		in5_Panel = new JPanel();
		in5_Panel.setOpaque(false);
		in6_Panel = new JPanel();
		in6_Panel.setOpaque(false);
		
		lblNewLabel = new JLabel("                                                                                                                                                                                                                                  ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 7));
		north_Panel.add(lblNewLabel);
		
		titleLabel = new JLabel("\u79D1\u5B66\u8BA1\u7B97\u5668");
		titleLabel.setForeground(new Color(255, 255, 255));
		titleLabel.setFont(new Font("隶书", Font.BOLD, 29));
		north_Panel.add(titleLabel);
		south_Panel.setPreferredSize(new Dimension(750, 38));
		
		southLabel = new JLabel("\u6B64\u79D1\u5B66\u8BA1\u7B97\u5668\u4EC5\u4E3A\u8F6F\u4EF6\u5DE5\u7A0B\u5B9E\u8DF5\u8BFE\u7A0B\u53CC\u4EBA\u9879\u76EE\u4F5C\u4E1A\u6240\u505A\uFF0C\u7248\u6743\u4EE5\u53CA\u89E3\u91CA\u6743\u5F52\u751C\u7B52\u5C0F\u7EC4\u6240\u6709\u3002");
		southLabel.setForeground(new Color(255, 255, 255));
		southLabel.setFont(new Font("隶书", Font.ITALIC, 17));
		south_Panel.add(southLabel);
		west_Panel.setPreferredSize(new Dimension(150, 400));
		west_Panel.add(in1_Panel);
		west_Panel.add(in2_Panel);
		west_Panel.add(in3_Panel);
		east_Panel.setPreferredSize(new Dimension(150, 400));
		east_Panel.add(in4_Panel);
		east_Panel.add(in5_Panel);
		east_Panel.add(in6_Panel);
		center_Panel.setPreferredSize(new Dimension(510, 400));
		
		JLabel lblNewLabel_4 = new JLabel("\u57FA\u7840\u8BA1\u7B97\u5668\uFF1A                             ");
		lblNewLabel_4.setForeground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" -\u5305\u62EC\u8BB0\u5FC6\u3001\u57FA\u7840\u8FD0\u7B97\u3001\u7EC4\u5408\u6570\u8BA1\u7B97\u4E0E\u57FA\u7840\u51FD\u6570\u8BA1\u7B97\u3002");
		lblNewLabel_5.setForeground(SystemColor.control);
		lblNewLabel_5.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u89E3\u65B9\u7A0B\u4E0E\u4E0D\u7B49\u5F0F\uFF1A                         ");
		lblNewLabel_6.setForeground(SystemColor.control);
		lblNewLabel_6.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(lblNewLabel_6);
		
		JLabel label_1 = new JLabel("-\u89E3\u4E00\u5143\u4E8C\u6B21\u65B9\u7A0B\u4E0E\u4E00\u5143\u4E8C\u6B21\u5404\u8FD0\u7B97\u5173\u7CFB\u7684\u4E0D\u7B49\u5F0F\u3002 ");
		label_1.setForeground(SystemColor.control);
		label_1.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label_1);
		
		JLabel lblNewLabel_7 = new JLabel("\u590D\u6570\u8BA1\u7B97\u5668\uFF1A                            ");
		lblNewLabel_7.setForeground(SystemColor.control);
		lblNewLabel_7.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(lblNewLabel_7);
		
		JLabel label_3 = new JLabel(" -\u590D\u6570\u95F4\u7684\u52A0\u3001\u51CF\u3001\u4E58\u3001\u9664\u8BA1\u7B97\u3002                 ");
		label_3.setForeground(SystemColor.control);
		label_3.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label_3);
		
		JLabel label_5 = new JLabel("\u8FDB\u5236\u6362\u7B97\u5668\uFF1A                            ");
		label_5.setForeground(SystemColor.control);
		label_5.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label_5);
		
		JLabel label_2 = new JLabel("  -\u53EF\u5B9E\u73B0\u4E8C\u3001\u516B\u3001\u5341\u3001\u5341\u516D\u8FDB\u5236\u4E4B\u95F4\u7684\u4E92\u76F8\u8F6C\u6362\u3002     ");
		label_2.setForeground(SystemColor.control);
		label_2.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label_2);
		
		JLabel label_6 = new JLabel("\u77E9\u9635\u8BA1\u7B97\u5668\uFF1A                            ");
		label_6.setForeground(SystemColor.control);
		label_6.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label_6);
		
		JLabel label = new JLabel("-\u77E9\u9635\u52A0\u51CF\u4E58\u4EE5\u53CA\u8F6C\u7F6E\u3001\u6C42\u9006\u3001\u6C42\u8FF9\u3001\u6C42\u6A21\u7B49\u529F\u80FD\u3002 ");
		label.setForeground(SystemColor.control);
		label.setFont(new Font("隶书", Font.PLAIN, 19));
		center_Panel.add(label);
		
		JButton button = new JButton("       \u8FD4\u56DE       ");
		button.setOpaque(false);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("隶书", Font.BOLD, 18));
		button.setBackground(Color.ORANGE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage newWindow1=new MainPage();
				newWindow1.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("                                                                                                                                                                                              ");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 5));
		center_Panel.add(lblNewLabel_1);
		center_Panel.add(button);
		
		JButton btnNewButton = new JButton("基础计算");
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			BasicCalculator newWindow=new BasicCalculator();
			newWindow.cal();
		}
	});
		btnNewButton.setOpaque(false);
		in1_Panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" \u89E3\u65B9\u7A0B ");
		btnNewButton_1.setBackground(new Color(25, 25, 112));
		btnNewButton_1.setForeground(new Color(245, 255, 250));
		btnNewButton_1.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EquationCalculator newWindow=new EquationCalculator();
				newWindow.cal();
			}
		});
		btnNewButton_1.setOpaque(false);
		in2_Panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("解不等式");
		btnNewButton_2.setForeground(new Color(245, 255, 250));
		btnNewButton_2.setBackground(new Color(25, 25, 112));
		btnNewButton_2.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InequalitiesCalculator newWindow=new InequalitiesCalculator();
				newWindow.cal();
			}
		});
		btnNewButton_2.setOpaque(false);
		in3_Panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("矩阵计算");
		btnNewButton_3.setBackground(new Color(25, 25, 112));
		btnNewButton_3.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_3.setForeground(new Color(245, 255, 250));
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  MatrixCalculator newWindow=new MatrixCalculator();
			  newWindow.Matrix();
		    }
	    });
		btnNewButton_3.setOpaque(false);
		in6_Panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("复数计算");
		btnNewButton_4.setBackground(new Color(25, 25, 112));
		btnNewButton_4.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_4.setForeground(new Color(245, 255, 250));
		btnNewButton_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  PluralComputing newWindow=new PluralComputing();
				newWindow.plural();
		    }
	    });
		btnNewButton_4.setOpaque(false);
		in4_Panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("进制换算");
		btnNewButton_5.setBackground(new Color(25, 25, 112));
		btnNewButton_5.setForeground(new Color(245, 255, 250));
		btnNewButton_5.setFont(new Font("隶书", Font.BOLD, 23));
		btnNewButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  new HexadecimalConversion();
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
