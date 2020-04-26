package calculator;


//  李涢瑶 2017111147
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.awt.Window.Type;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class UnitConversion_Space extends JFrame implements ActionListener {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversion_Space frame = new UnitConversion_Space();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel explain_Panel, input_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel,
			in6_Panel, in7_Panel, in8_Panel, in9_Panel, in10_Panel;
	private double result0, result1, result2, result3, result4, result5, result6, result7,result8, result9;
	private JLabel explain_Label;
	private Button ce_Button;
	private Button back_Button;
	private Button conversion1, conversion2, conversion3, conversion4, conversion5, conversion6, conversion7,
			conversion8,conversion9,conversion10;
	private JLabel Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8,Label9,Label10;
	private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8,textField9,textField10;
	private JLabel blank1, blank2, blank3, blank4, blank5, blank6, blank7, blank8, blank9, blank10;
	private JLabel blank11;
	private JLabel lblNewLabel;

	public UnitConversion_Space() {
		setTitle("\u9762\u79EF\u5355\u4F4D\u6362\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setSize(780, 480);
		setLocation(800, 200);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		setLayout(new BorderLayout(3, 0));

		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL = new JLabel(img);
		imgL.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
		Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		explain_Panel = new JPanel();
		explain_Panel.setFont(new Font("Dialog", Font.PLAIN, 11));
		explain_Panel.setPreferredSize(new Dimension(770, 23));
		add(explain_Panel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u6765\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 16));
		explain_Panel.add(explain_Label);
		input_Panel = new JPanel(new GridLayout(5, 2, 5, 2));
		input_Panel.setPreferredSize(new Dimension(770, 245));
		add(input_Panel, BorderLayout.CENTER);
		result_Panel = new JPanel();
		result_Panel.setPreferredSize(new Dimension(770, 53));
		add(result_Panel, BorderLayout.SOUTH);

		in1_Panel = new JPanel();
		input_Panel.add(in1_Panel);
		Label1 = new JLabel("        \u5E73\u65B9\u516C\u91CC\uFF08km2\uFF09       ");
		Label1.setFont(new Font("隶书", Font.BOLD, 21));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 18));
		in1_Panel.add(textField1);
		textField1.setColumns(22);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("   \u5E73\u65B9\u516C\u91CC>   ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new JPanel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("        \u516C\u9877\uFF08ha\uFF09       ");
		Label2.setFont(new Font("隶书", Font.BOLD, 21));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 18));
		in2_Panel.add(textField2);
		textField2.setColumns(22);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button("      \u516C\u9877>      ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);

		in3_Panel = new JPanel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("       \u5E73\u65B9\u7C73\uFF08m2\uFF09     ");
		Label3.setFont(new Font("隶书", Font.BOLD, 21));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 18));
		in3_Panel.add(textField3);
		textField3.setColumns(22);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("    \u5E73\u65B9\u7C73>     ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new JPanel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("         \u5E73\u65B9\u7AFF\uFF08sq rd\uFF09       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 21));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 18));
		in4_Panel.add(textField4);
		textField4.setColumns(22);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button("     \u5E73\u65B9\u7AFF>    ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);

		in5_Panel = new JPanel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("       \u5E02 \u4EA9      ");
		Label5.setFont(new Font("隶书", Font.BOLD, 21));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 18));
		in5_Panel.add(textField5);
		textField5.setColumns(22);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button("     \u5E02\u4EA9>       ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

		in6_Panel = new JPanel();
		input_Panel.add(in6_Panel);
		Label6 = new JLabel("           \u5E73\u65B9\u82F1\u91CC\uFF08sq mi\uFF09        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 21));
		in6_Panel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 18));
		in6_Panel.add(textField6);
		textField6.setColumns(22);
		blank6 = new JLabel(" ");
		in6_Panel.add(blank6);
		conversion6 = new Button("   \u5E73\u65B9\u82F1\u91CC>   ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_Panel.add(conversion6);

		in7_Panel = new JPanel();
		input_Panel.add(in7_Panel);
		Label7 = new JLabel("        \u82F1 \u4EA9       ");
		Label7.setFont(new Font("隶书", Font.BOLD, 21));
		in7_Panel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 18));
		in7_Panel.add(textField7);
		textField7.setColumns(22);
		blank7 = new JLabel(" ");
		in7_Panel.add(blank7);
		conversion7 = new Button("     \u82F1\u4EA9>       ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_Panel.add(conversion7);

		in8_Panel = new JPanel();
		input_Panel.add(in8_Panel);
		Label8 = new JLabel("          \u5E73\u65B9\u82F1\u5C3A\uFF08sq ft\uFF09       ");
		Label8.setFont(new Font("隶书", Font.BOLD, 21));
		in8_Panel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 18));
		in8_Panel.add(textField8);
		textField8.setColumns(22);
		blank8 = new JLabel(" ");
		in8_Panel.add(blank8);
		conversion8 = new Button("   \u5E73\u65B9\u82F1\u5C3A>   ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_Panel.add(conversion8);
		
		in9_Panel = new JPanel();
		input_Panel.add(in9_Panel);
		Label9 = new JLabel("          \u5E73\u65B9\u7801 (sq yd)       ");
		Label9.setFont(new Font("隶书", Font.BOLD, 21));
		in9_Panel.add(Label9);
		textField9 = new JTextField();
		textField9.setFont(new Font("隶书", Font.PLAIN, 18));
		in9_Panel.add(textField9);
		textField9.setColumns(22);
		blank9 = new JLabel(" ");
		in9_Panel.add(blank9);
		conversion9 = new Button("    \u5E73\u65B9\u7801>    ");
		conversion9.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion9.setBackground(UIManager.getColor("Button.light"));
		conversion9.addActionListener(this);
		in9_Panel.add(conversion9);
		
		in10_Panel = new JPanel();
		input_Panel.add(in10_Panel);
		Label10 = new JLabel("          \u5E73\u65B9\u82F1\u5BF8\uFF08sq in\uFF09       ");
		Label10.setFont(new Font("隶书", Font.BOLD, 21));
		in10_Panel.add(Label10);
		textField10 = new JTextField();
		textField10.setFont(new Font("隶书", Font.PLAIN, 18));
		in10_Panel.add(textField10);
		textField10.setColumns(22);
		blank10 = new JLabel(" ");
		in10_Panel.add(blank10);
		conversion10 = new Button("   \u5E73\u65B9\u82F1\u5BF8>   ");
		conversion10.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion10.setBackground(UIManager.getColor("Button.light"));
		conversion10.addActionListener(this);
		in10_Panel.add(conversion10);

		ce_Button = new Button("     \u6E05\u7A7A     ");
		ce_Button.setBackground(UIManager.getColor("Button.background"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 19));
		ce_Button.addActionListener(this);
		
		lblNewLabel = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 5));
		result_Panel.add(lblNewLabel);
		result_Panel.add(ce_Button);

		back_Button = new Button("    \u8FD4\u56DE    ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("Times New Roman", Font.BOLD, 19));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UnitConversionPage newWindow=new UnitConversionPage();
				newWindow.setVisible(true);
			}
		});		

		blank11 = new JLabel("                     ");
		result_Panel.add(blank11);
		result_Panel.add(back_Button);

		explain_Panel.setOpaque(false);
		input_Panel.setOpaque(false);
		result_Panel.setOpaque(false);
		in1_Panel.setOpaque(false);
		in2_Panel.setOpaque(false);
		in3_Panel.setOpaque(false);
		in4_Panel.setOpaque(false);
		in5_Panel.setOpaque(false);

		in6_Panel.setOpaque(false);
		in7_Panel.setOpaque(false);
		in8_Panel.setOpaque(false);
		in9_Panel.setOpaque(false);
		in10_Panel.setOpaque(false);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// 平方公里
		if (e.getActionCommand() == "   \u5E73\u65B9\u516C\u91CC>   ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 100;
			this.result2 = result * 1000000;
			this.result3 = result * 39536.8610347;
			this.result4 = result * 1500;
			this.result5 = result * 0.3861022;
			this.result6 = result * 247.1053815;
			this.result7 = result * 10763910.4167097;
			this.result8 = result * 1195990.0463011;
			this.result9 = result * 1550003100.0061998;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// "公顷"
		if (e.getActionCommand() == "      \u516C\u9877>      ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result * 0.01;
			this.result1 = result * 1;
			this.result2 = result * 10000;
			this.result3 = result * 395.3686103;
			this.result4 = result * 15;
			this.result5 = result * 0.0038610;
			this.result6 = result * 2.4710538;
			this.result7 = result * 107639.1041671;
			this.result8 = result * 11959.9004630;
			this.result9 = result * 15500031.000062;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 平方米
		if (e.getActionCommand() == "    \u5E73\u65B9\u7C73>     ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result * 0.000001;
			this.result1 = result * 0.0001;
			this.result2 = result * 1;
			this.result3 = result * 0.0395369;
			this.result4 = result * 0.0015;
			this.result5 = result * 0.3861022/1000000;
			this.result6 = result * 0.0002471;
			this.result7 = result * 10.7639104;
			this.result8 = result * 1.1959900;
			this.result9 = result * 1550.0031000;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 平方竿
		if (e.getActionCommand() == "     \u5E73\u65B9\u7AFF>    ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 0.0000253;
			this.result1 = result * 0.0025293;
			this.result2 = result * 25.2928526;
			this.result3 = result * 1;
			this.result4 = result * 0.0379393;
			this.result5 = result * 0.0000098;
			this.result6 = result * 0.00625;
			this.result7 = result * 272.25;
			this.result8 = result * 30.25;
			this.result9 = result * 39204;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 市亩
		if (e.getActionCommand() =="     \u5E02\u4EA9>       ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result * 0.0006667;
			this.result1 = result * 0.0666667;
			this.result2 = result * 666.6666667;
			this.result3 = result * 26.3579074;
			this.result4 = result * 1;
			this.result5 = result * 0.0002574;
			this.result6 = result * 0.1647369;
			this.result7 = result * 7175.9402778;
			this.result8 = result * 797.3266975;
			this.result9 = result * 1033335.4000041;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 平方英里
		if (e.getActionCommand() == "   \u5E73\u65B9\u82F1\u91CC>   ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result * 2.5899881;
			this.result1 = result * 258.9988110;
			this.result2 = result * 2589988.110336;
			this.result3 = result * 102400;
			this.result4 = result * 3884.9821655;
			this.result5 = result * 1;
			this.result6 = result * 640;
			this.result7 = result * 27878400;
			this.result8 = result * 3097600;
			this.result9 = result * 4014489599.9999995;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 英亩
		if (e.getActionCommand() == "     \u82F1\u4EA9>       ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 0.0040469;
			this.result1 = result * 0.4046856;
			this.result2 = result * 4046.8564224;
			this.result3 = result * 160;
			this.result4 = result * 6.0702846;
			this.result5 = result * 0.0015625;
			this.result6 = result * 1;
			this.result7 = result * 43560;
			this.result8 = result * 4840;
			this.result9 = result * 6272640;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//平方英尺
		if (e.getActionCommand() == "   \u5E73\u65B9\u82F1\u5C3A>   ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 0.0929030/1000000;//
			this.result1 = result * 0.0000093;
			this.result2 = result * 0.0929030;
			this.result3 = result * 0.0036731;
			this.result4 = result * 0.0001394;
			this.result5 = result * 0.0358701/1000000;//
			this.result6 = result * 0.000023;
			this.result7 = result * 1;
			this.result8 = result * 0.1111111;
			this.result9 = result * 144;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		
		// 平方码
		if (e.getActionCommand() == "    \u5E73\u65B9\u7801>    ") {
			double result = Double.parseDouble(textField9.getText());
			this.result0 = result * 0.8361274 / 1000000;//
			this.result1 = result * 0.0000836;
			this.result2 = result * 0.8361274;
			this.result3 = result * 0.0330579;
			this.result4 = result * 0.0012542;
			this.result5 = result * 0.3228306 / 1000000;//
			this.result6 = result * 0.0002066;
			this.result7 = result * 9;
			this.result8 = result * 1;
			this.result9 = result * 1296;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 平方英寸
		if (e.getActionCommand() == "   \u5E73\u65B9\u82F1\u5BF8>   ") {
			double result = Double.parseDouble(textField10.getText());
			this.result0 = result * 0.0006452/1000000;
			this.result1 = result * 0.064516/1000000;
			this.result2 = result * 0.0006452;
			this.result3 = result * 0.0000255;
			this.result4 = result * 0.9677400/1000000;
			this.result5 = result * 0.0002491/1000000;
			this.result6 = result * 0.1594225/1000000;
			this.result7 = result * 0.1594225/1000000;
			this.result8 = result * 0.0007716;
			this.result9 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}

		// ce
		if (e.getActionCommand() == "     \u6E05\u7A7A     ") {
			this.textField1.setText(" ");
			this.result0 = 0.0;
			this.textField2.setText(" ");
			this.result1 = 0.0;
			this.textField3.setText(" ");
			this.result2 = 0.0;
			this.textField4.setText(" ");
			this.result3 = 0.0;
			this.textField5.setText(" ");
			this.result4 = 0.0;
			this.textField6.setText(" ");
			this.result5 = 0.0;
			this.textField7.setText(" ");
			this.result6 = 0.0;
			this.textField8.setText(" ");
			this.result7 = 0.0;
			this.textField9.setText(" ");
			this.result8 = 0.0;
			this.textField10.setText(" ");
			this.result9 = 0.0;

		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	
}
