package calculator;

//  李涢瑶 2017111147
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.awt.Window.Type;
import java.awt.*;
public class UnitConversionPage extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel in0_Panel, in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel,in6_Panel,in7_Panel, input_Panel, intergration_Panel, result1_Panel, result2_Panel;
	private ButtonGroup btg;
	private Button cvs1;
	private Button cvs4;
	private Button cvs3;
	private Button cvs2;
	private JLabel illustration1_Label;
	private JLabel title_Label;
	private JLabel length_Label;
	private JLabel label1;
	private JLabel space_label;
	private JLabel label2;
	private JLabel v_label;
	private JLabel label3;
	private JLabel g_label;
	private JLabel label4;
	private JLabel pressure_label;
	private JLabel label5;
	private JLabel t_label;
	private JLabel label6;
	private JLabel energy_label;
	private JLabel label7;
	private JLabel p_label;
	private JLabel label8;
	private Button back;
	private JLabel blank10;
	private JLabel lblNewLabel;
	private Button cvs5;
	private Button cvs6;
	private Button cvs7;
	private Button cvs8;
	private JLabel label;
	
	
	public void cal() {
		ImageIcon image = new ImageIcon("./src/image/UnitConversion.jpg");
		cal_Frame = new Frame("\u5355\u4F4D\u6362\u7B97\u5668");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(Color.BLACK);
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));

		input_Panel = new Panel(new GridLayout(8, 1, 4, 5));
		in0_Panel = new Panel(new FlowLayout());
		in1_Panel = new Panel(new FlowLayout());
		in2_Panel = new Panel(new FlowLayout());
		in3_Panel = new Panel(new FlowLayout());
		in4_Panel = new Panel(new FlowLayout());
		in5_Panel = new Panel(new FlowLayout());
		in6_Panel = new Panel(new FlowLayout());
		in7_Panel = new Panel(new FlowLayout());
		in1_Panel.setPreferredSize(new Dimension(200, 60));
		input_Panel.add(in0_Panel);
		
		cvs1 = new Button("   \u957F\u5EA6   ");
		cvs1.setBackground(UIManager.getColor("Button.background"));
		cvs1.setFont(new Font("隶书", Font.BOLD, 20));
		cvs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Length newWindow=new UnitConversion_Length();
				newWindow.cal();
			}
		});		
		in0_Panel.add(cvs1);
		input_Panel.add(in1_Panel);
		
		cvs2 = new Button("   \u9762\u79EF   ");
		cvs2.setBackground(UIManager.getColor("Button.background"));
		cvs2.setFont(new Font("隶书", Font.BOLD, 20));
		cvs2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Space newWindow=new UnitConversion_Space();
				newWindow.cal();
			}
		});		
		in1_Panel.add(cvs2);
		input_Panel.add(in2_Panel);
		
		cvs3 = new Button("   \u4F53\u79EF   ");
		cvs3.setBackground(UIManager.getColor("Button.background"));
		cvs3.setFont(new Font("隶书", Font.BOLD, 20));
		cvs3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Volume newWindow=new UnitConversion_Volume();
				newWindow.cal();
			}
		});	
		in2_Panel.add(cvs3);
		input_Panel.add(in3_Panel);
		
		cvs4 = new Button("   \u91CD\u91CF   ");
		cvs4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Quality newWindow=new UnitConversion_Quality();
				newWindow.cal();
			}
		});
		cvs4.setBackground(UIManager.getColor("Button.background"));
		in3_Panel.add(cvs4);
		cvs4.setFont(new Font("隶书", Font.BOLD, 21));
		
		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);
		
		cvs6 = new Button("   \u6E29\u5EA6   ");
		cvs6.setFont(new Font("隶书", Font.BOLD, 20));
		cvs6.setBackground(SystemColor.menu);
		cvs6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Tempetature newWindow=new UnitConversion_Tempetature();
				newWindow.cal();
			}
		});
		in5_Panel.add(cvs6);
		
		cvs5 = new Button("   \u538B\u5F3A   ");
		cvs5.setFont(new Font("隶书", Font.BOLD, 20));
		cvs5.setBackground(SystemColor.menu);
		cvs5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Pressure newWindow=new UnitConversion_Pressure();
				newWindow.cal();
			}
		});
		in4_Panel.add(cvs5);
		intergration_Panel = new Panel(new FlowLayout());
		result1_Panel = new Panel(new FlowLayout());
		result2_Panel = new Panel(new FlowLayout());
		input_Panel.setPreferredSize(new Dimension(160, 390));
		intergration_Panel.setPreferredSize(new Dimension(615, 420));
		result1_Panel.setPreferredSize(new Dimension(610, 105));
		result2_Panel.setPreferredSize(new Dimension(610, 340));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);
		
		length_Label = new JLabel("\u957F\u5EA6\u6362\u7B97\u5668\uFF1A");
		length_Label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(length_Label);
		
		label1 = new JLabel("\u53EF\u5B9E\u73B0\u7C73\u3001\u516C\u91CC\u3001\u4E08\u3001\u5C3A\u3001\u5BF8\u3001\u6D77\u91CC...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label1.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label1);
		
		space_label = new JLabel("\u9762\u79EF\u6362\u7B97\u5668\uFF1A");
		space_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(space_label);
		
		label2 = new JLabel("\u53EF\u5B9E\u73B0\u5E73\u65B9\u516C\u91CC\u3001\u516C\u9877\u3001\u5E02\u4EA9\u3001\u82F1\u4EA9...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label2.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label2);
		
		v_label = new JLabel("\u4F53\u79EF\u6362\u7B97\u5668\uFF1A");
		v_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(v_label);
		
		label3 = new JLabel("\u53EF\u5B9E\u73B0\u7ACB\u65B9\u7C73\u3001\u77F3\u3001\u52A0\u4ED1\u3001\u5347\u3001\u54C1\u8131...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label3.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label3);
		
		g_label = new JLabel("\u91CD\u91CF\u6362\u7B97\u5668\uFF1A");
		g_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(g_label);
		
		label4 = new JLabel("\u53EF\u5B9E\u73B0\u516C\u65A4\u3001\u94B1\u3001\u62C5\u3001\u4E24\u3001\u78C5\u3001\u76CE\u53F8...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label4.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label4);
		
		pressure_label = new JLabel("\u538B\u5F3A\u6362\u7B97\u5668\uFF1A");
		pressure_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(pressure_label);
		
		label5 = new JLabel("\u53EF\u5B9E\u73B0\u5DF4\u3001\u5E15\u3001\u6807\u51C6\u6C14\u538B\u3001\u6BEB\u7C73\u6C5E\u67F1...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label5.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label5);
		
		t_label = new JLabel("\u6E29\u5EA6\u6362\u7B97\u5668\uFF1A");
		t_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(t_label);
		
		label6 = new JLabel("\u53EF\u5B9E\u73B0\u6444\u6C0F\u5EA6\u3001\u534E\u6C0F\u5EA6\u3001\u5170\u6C0F\u3001\u5217\u6C0F...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label6.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label6);
		
		energy_label = new JLabel("\u70ED\u91CF\u6362\u7B97\u5668\uFF1A");
		energy_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(energy_label);
		
		label7 = new JLabel("\u53EF\u5B9E\u73B0\u7126\u8033\u3001\u5343\u74E6\u65F6\u3001\u5343\u5361\u3001\u516C\u65A4\u7C73...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label7.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label7);
		
		p_label = new JLabel("\u529F\u7387\u6362\u7B97\u5668\uFF1A");
		p_label.setFont(new Font("隶书", Font.BOLD, 20));
		result2_Panel.add(p_label);
		
		label8 = new JLabel("\u53EF\u5B9E\u73B0\u74E6\u3001\u9A6C\u529B\u3001\u5343\u5361/\u79D2\u3001\u7126\u8033/\u79D2...\u7B49\u4E4B\u95F4\u7684\u6362\u7B97\u3002");
		label8.setFont(new Font("隶书", Font.PLAIN, 19));
		result2_Panel.add(label8);
		
		blank10 = new JLabel("                                                                                                                ");
		blank10.setFont(new Font("宋体", Font.PLAIN, 10));
		result2_Panel.add(blank10);
		
		lblNewLabel = new JLabel("                                                ");
		result2_Panel.add(lblNewLabel);
		
		input_Panel.add(in6_Panel);
		
		cvs7 = new Button("   \u70ED\u91CF   ");
		cvs7.setFont(new Font("隶书", Font.BOLD, 20));
		cvs7.setBackground(SystemColor.menu);
		cvs7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Energy newWindow=new UnitConversion_Energy();
				newWindow.cal();
			}
		});
		in6_Panel.add(cvs7);
		input_Panel.add(in7_Panel);
		
		cvs8 = new Button("   \u529F\u7387   ");
		cvs8.setFont(new Font("隶书", Font.BOLD, 20));
		cvs8.setBackground(SystemColor.menu);
		cvs8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversion_Power newWindow=new UnitConversion_Power();
				newWindow.cal();
			}
		});
		in7_Panel.add(cvs8);
		
		back = new Button("     \u8FD4\u56DE     ");
		back.setForeground(Color.BLACK);
		back.setFont(new Font("Times New Roman", Font.BOLD, 22));
		back.setBackground(new Color(255, 160, 122));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				SecondaryPageTwo newWindow=new SecondaryPageTwo();
				newWindow.setVisible(true);
			}
		});
		result2_Panel.add(back);
		cal_Frame.add(input_Panel,BorderLayout.EAST);
		cal_Frame.add(intergration_Panel,BorderLayout.WEST);
		btg = new ButtonGroup();
		
		title_Label = new JLabel("   \u5EA6\u91CF\u8861\u8F6C\u6362\u5668                       ");
		title_Label.setFont(new Font("隶书", Font.BOLD, 28));
		result1_Panel.add(title_Label);
		
		illustration1_Label = new JLabel("                      \u4E3A\u60A8\u63D0\u4F9B\u5E38\u7528\u7684\u5355\u4F4D\u6362\u7B97\uFF0C\u5305\u62EC8\u79CD\u5EA6\u91CF");
		illustration1_Label.setFont(new Font("隶书", Font.ITALIC, 19));
		result1_Panel.add(illustration1_Label);
		
		label = new JLabel("                    \u8861\u300167\u79CD\u5355\u4F4D\uFF0C\u60A8\u53EF\u4E00\u952E\u83B7\u5F97\u60F3\u8981\u6570\u503C\uFF01");
		label.setFont(new Font("隶书", Font.ITALIC, 19));
		result1_Panel.add(label);
	
		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		

	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		UnitConversionPage new_cal = new UnitConversionPage();
		new_cal.cal();

	}
}
