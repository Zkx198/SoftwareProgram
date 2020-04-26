package calculator;
//  李涢瑶 2017111147
// 张凯鑫 2017111478 添加背景，修改页面
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UnitConversionPage extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversionPage frame = new UnitConversionPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UnitConversionPage() {
		setBackground(new Color(0, 0, 0));
		setTitle("单位换算计算器");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(200, 200);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/life2.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setSize(780, 480);
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		JPanel cal_Frame;
		JPanel in0_JPanel, in1_JPanel,in2_JPanel,in3_JPanel,in4_JPanel,in5_JPanel,in6_JPanel,in7_JPanel, input_JPanel, intergration_JPanel, result1_JPanel, result2_JPanel;
		ButtonGroup btg;
		JButton cvs1;
		JButton cvs4;
		JButton cvs3;
		JButton cvs2;
		JLabel illustration1_Label;
		JLabel title_Label;
		JLabel length_Label;
		JLabel label1;
		JLabel space_label;
		JLabel label2;
		JLabel v_label;
		JLabel label3;
		JLabel g_label;
		JLabel label4;
		JLabel pressure_label;
		JLabel label5;
		JLabel t_label;
		JLabel label6;
		JLabel energy_label;
		JLabel label7;
		JLabel p_label;
		JLabel label8;
		JButton back;
		JLabel blank10;
		JLabel lblNewLabel;
		JButton cvs5;
		JButton cvs6;
		JButton cvs7;
		JButton cvs8;
		JLabel label;
		 
		cal_Frame = new JPanel();
        cal_Frame.setOpaque(false);
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setLayout(new BorderLayout(3, 3));

		input_JPanel = new JPanel(new GridLayout(8, 1, 4, 5));
		input_JPanel.setOpaque(false);
		in0_JPanel = new JPanel(new FlowLayout());
		in1_JPanel = new JPanel(new FlowLayout());
		in2_JPanel = new JPanel(new FlowLayout());
		in3_JPanel = new JPanel(new FlowLayout());
		in4_JPanel = new JPanel(new FlowLayout());
		in5_JPanel = new JPanel(new FlowLayout());
		in6_JPanel = new JPanel(new FlowLayout());
		in7_JPanel = new JPanel(new FlowLayout());
		in0_JPanel.setOpaque(false);
		in1_JPanel.setOpaque(false);
		in2_JPanel.setOpaque(false);
		in3_JPanel.setOpaque(false);
		in4_JPanel.setOpaque(false);
		in5_JPanel.setOpaque(false);
		in6_JPanel.setOpaque(false);
		in7_JPanel.setOpaque(false);
		in1_JPanel.setPreferredSize(new Dimension(200, 60));
		input_JPanel.add(in0_JPanel);
		
		cvs1 = new JButton("   \u957F\u5EA6   ");
		cvs1.setForeground(Color.WHITE);
		cvs1.setOpaque(false);
		cvs1.setBackground(SystemColor.menu);
		cvs1.setFont(new Font("隶书", Font.BOLD, 20));
		cvs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Length newWindow=new UnitConversion_Length();
				newWindow.cal();
			}
		});		
		in0_JPanel.add(cvs1);
		input_JPanel.add(in1_JPanel);
		
		cvs2 = new JButton("   \u9762\u79EF   ");
		cvs2.setForeground(Color.WHITE);
		cvs2.setOpaque(false);
		cvs2.setBackground(SystemColor.menu);
		cvs2.setFont(new Font("隶书", Font.BOLD, 20));
		cvs2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Space newWindow=new UnitConversion_Space();
				newWindow.cal();
			}
		});		
		in1_JPanel.add(cvs2);
		input_JPanel.add(in2_JPanel);
		
		cvs3 = new JButton("   \u4F53\u79EF   ");
		cvs3.setForeground(Color.WHITE);
		cvs3.setOpaque(false);
		cvs3.setBackground(SystemColor.menu);
		cvs3.setFont(new Font("隶书", Font.BOLD, 20));
		cvs3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Volume newWindow=new UnitConversion_Volume();
				newWindow.cal();
			}
		});	
		in2_JPanel.add(cvs3);
		input_JPanel.add(in3_JPanel);
		
		cvs4 = new JButton("   \u91CD\u91CF   ");
		cvs4.setForeground(Color.WHITE);
		cvs4.setOpaque(false);
		cvs4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Quality newWindow=new UnitConversion_Quality();
				newWindow.cal();
			}
		});
		cvs4.setBackground(UIManager.getColor("JButton.background"));
		in3_JPanel.add(cvs4);
		cvs4.setFont(new Font("隶书", Font.BOLD, 21));
		cvs4.setBackground(SystemColor.menu);
		
		input_JPanel.add(in4_JPanel);
		input_JPanel.add(in5_JPanel);
		
		cvs6 = new JButton("   \u6E29\u5EA6   ");
		cvs6.setForeground(Color.WHITE);
		cvs6.setOpaque(false);
		cvs6.setFont(new Font("隶书", Font.BOLD, 20));
		cvs6.setBackground(SystemColor.menu);
		cvs6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Tempetature newWindow=new UnitConversion_Tempetature();
				newWindow.cal();
			}
		});
		in5_JPanel.add(cvs6);
		
		cvs5 = new JButton("   \u538B\u5F3A   ");
		cvs5.setForeground(Color.WHITE);
		cvs5.setOpaque(false);
		cvs5.setFont(new Font("隶书", Font.BOLD, 20));
		cvs5.setBackground(SystemColor.menu);
		cvs5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Pressure newWindow=new UnitConversion_Pressure();
				newWindow.cal();
			}
		});
		in4_JPanel.add(cvs5);
		intergration_JPanel = new JPanel(new FlowLayout());
		intergration_JPanel.setOpaque(false);
		result1_JPanel = new JPanel(new FlowLayout());
		result1_JPanel.setOpaque(false);
		result2_JPanel = new JPanel(new FlowLayout());
		result2_JPanel.setOpaque(false);
		input_JPanel.setPreferredSize(new Dimension(160, 390));
		intergration_JPanel.setPreferredSize(new Dimension(615, 420));
		result1_JPanel.setPreferredSize(new Dimension(610, 105));
		result2_JPanel.setPreferredSize(new Dimension(610, 340));
		intergration_JPanel.add(result1_JPanel, BorderLayout.NORTH);
		intergration_JPanel.add(result2_JPanel, BorderLayout.SOUTH);
		
		length_Label = new JLabel("\u957F\u5EA6\u6362\u7B97\u5668\uFF1A");
		length_Label.setForeground(Color.WHITE);
		length_Label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(length_Label);
		
		label1 = new JLabel("\u53EF\u5B9E\u73B0\u7C73\u3001\u516C\u91CC\u3001\u4E08\u3001\u5C3A\u3001\u5BF8\u3001\u6D77\u91CC...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label1);
		
		space_label = new JLabel("\u9762\u79EF\u6362\u7B97\u5668\uFF1A");
		space_label.setForeground(Color.WHITE);
		space_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(space_label);
		
		label2 = new JLabel("\u53EF\u5B9E\u73B0\u5E73\u65B9\u516C\u91CC\u3001\u516C\u9877\u3001\u5E02\u4EA9\u3001\u82F1\u4EA9...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label2);
		
		v_label = new JLabel("\u4F53\u79EF\u6362\u7B97\u5668\uFF1A");
		v_label.setForeground(Color.WHITE);
		v_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(v_label);
		
		label3 = new JLabel("\u53EF\u5B9E\u73B0\u7ACB\u65B9\u7C73\u3001\u77F3\u3001\u52A0\u4ED1\u3001\u5347\u3001\u54C1\u8131...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label3);
		
		g_label = new JLabel("\u91CD\u91CF\u6362\u7B97\u5668\uFF1A");
		g_label.setForeground(Color.WHITE);
		g_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(g_label);
		
		label4 = new JLabel("\u53EF\u5B9E\u73B0\u516C\u65A4\u3001\u94B1\u3001\u62C5\u3001\u4E24\u3001\u78C5\u3001\u76CE\u53F8...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label4);
		
		pressure_label = new JLabel("\u538B\u5F3A\u6362\u7B97\u5668\uFF1A");
		pressure_label.setForeground(Color.WHITE);
		pressure_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(pressure_label);
		
		label5 = new JLabel("\u53EF\u5B9E\u73B0\u5DF4\u3001\u5E15\u3001\u6807\u51C6\u6C14\u538B\u3001\u6BEB\u7C73\u6C5E\u67F1...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label5);
		
		t_label = new JLabel("\u6E29\u5EA6\u6362\u7B97\u5668\uFF1A");
		t_label.setForeground(Color.WHITE);
		t_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(t_label);
		
		label6 = new JLabel("\u53EF\u5B9E\u73B0\u6444\u6C0F\u5EA6\u3001\u534E\u6C0F\u5EA6\u3001\u5170\u6C0F\u3001\u5217\u6C0F...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label6);
		
		energy_label = new JLabel("\u70ED\u91CF\u6362\u7B97\u5668\uFF1A");
		energy_label.setForeground(Color.WHITE);
		energy_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(energy_label);
		
		label7 = new JLabel("\u53EF\u5B9E\u73B0\u7126\u8033\u3001\u5343\u74E6\u65F6\u3001\u5343\u5361\u3001\u516C\u65A4\u7C73...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label7);
		
		p_label = new JLabel("\u529F\u7387\u6362\u7B97\u5668\uFF1A");
		p_label.setForeground(Color.WHITE);
		p_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_JPanel.add(p_label);
		
		label8 = new JLabel("\u53EF\u5B9E\u73B0\u74E6\u3001\u9A6C\u529B\u3001\u5343\u5361/\u79D2\u3001\u7126\u8033/\u79D2...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_JPanel.add(label8);
		
		blank10 = new JLabel("                                                                                                                ");
		blank10.setFont(new Font("宋体", Font.PLAIN, 10));
		result2_JPanel.add(blank10);
		
		lblNewLabel = new JLabel("                                                ");
		result2_JPanel.add(lblNewLabel);
		
		input_JPanel.add(in6_JPanel);
		
		cvs7 = new JButton("   \u70ED\u91CF   ");
		cvs7.setForeground(Color.WHITE);
		cvs7.setOpaque(false);
		cvs7.setFont(new Font("隶书", Font.BOLD, 20));
		cvs7.setBackground(SystemColor.menu);
		cvs7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Energy newWindow=new UnitConversion_Energy();
				newWindow.cal();
			}
		});
		in6_JPanel.add(cvs7);
		input_JPanel.add(in7_JPanel);
		
		cvs8 = new JButton("   \u529F\u7387   ");
		cvs8.setForeground(Color.WHITE);
		cvs8.setOpaque(false);
		cvs8.setFont(new Font("隶书", Font.BOLD, 20));
		cvs8.setBackground(SystemColor.menu);
		cvs8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversion_Power newWindow=new UnitConversion_Power();
				newWindow.cal();
			}
		});
		in7_JPanel.add(cvs8);
		
		back = new JButton("     \u8FD4\u56DE     ");
		back.setOpaque(false);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("隶书", Font.BOLD, 22));
		back.setBackground(new Color(255, 160, 122));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SecondaryPageTwo newWindow=new SecondaryPageTwo();
				newWindow.setVisible(true);
			}
		});
		result2_JPanel.add(back);
		cal_Frame.add(input_JPanel,BorderLayout.EAST);
		cal_Frame.add(intergration_JPanel,BorderLayout.WEST);
		btg = new ButtonGroup();
		
		title_Label = new JLabel("   \u5EA6\u91CF\u8861\u8F6C\u6362\u5668                       ");
		title_Label.setForeground(Color.WHITE);
		title_Label.setFont(new Font("隶书", Font.BOLD, 28));
		result1_JPanel.add(title_Label);
		
		illustration1_Label = new JLabel("                      \u4E3A\u60A8\u63D0\u4F9B\u5E38\u7528\u7684\u5355\u4F4D\u6362\u7B97\uFF0C\u5305\u62EC8\u79CD\u5EA6\u91CF");
		illustration1_Label.setForeground(Color.WHITE);
		illustration1_Label.setFont(new Font("隶书", Font.ITALIC, 19));
		result1_JPanel.add(illustration1_Label);
		
		label = new JLabel("                    \u8861\u300167\u79CD\u5355\u4F4D\uFF0C\u60A8\u53EF\u4E00\u952E\u83B7\u5F97\u60F3\u8981\u6570\u503C\uFF01");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("隶书", Font.ITALIC, 19));
		result1_JPanel.add(label);
		
		contain.add(cal_Frame);
	
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		

	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
