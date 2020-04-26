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

public class UnitConversion_Power extends JFrame implements ActionListener {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversion_Power frame = new UnitConversion_Power();
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

	public UnitConversion_Power() {
		setTitle("\u529F\u7387\u5355\u4F4D\u6362\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setSize(780, 480);
		setLocation(200, 200);
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
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u7F6E\u3002");
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
		Label1 = new JLabel("          \u74E6\uFF08W\uFF09         ");
		Label1.setFont(new Font("隶书", Font.BOLD, 21));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 18));
		in1_Panel.add(textField1);
		textField1.setColumns(22);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("        \u74E6>        ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new JPanel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("        \u5343\u74E6\uFF08kW\uFF09       ");
		Label2.setFont(new Font("隶书", Font.BOLD, 21));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 18));
		in2_Panel.add(textField2);
		textField2.setColumns(22);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button("      \u5343\u74E6>      ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);

		in3_Panel = new JPanel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("      \u82F1\u5236\u9A6C\u529B\uFF08HP\uFF09     ");
		Label3.setFont(new Font("隶书", Font.BOLD, 21));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 18));
		in3_Panel.add(textField3);
		textField3.setColumns(22);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("   \u82F1\u5236\u9A6C\u529B >  ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new JPanel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("         \u7C73\u5236\u9A6C\u529B\uFF08PS\uFF09       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 21));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 18));
		in4_Panel.add(textField4);
		textField4.setColumns(22);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button("  \u7C73\u5236\u9A6C\u529B>   ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);

		in5_Panel = new JPanel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("      \u516C\u65A4*\u7C73/\u79D2\uFF08kg*m/s\uFF09     ");
		Label5.setFont(new Font("隶书", Font.BOLD, 21));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 18));
		in5_Panel.add(textField5);
		textField5.setColumns(22);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button(" \u516C\u65A4*\u7C73/\u79D2>  ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

		in6_Panel = new JPanel();
		input_Panel.add(in6_Panel);
		Label6 = new JLabel("           \u5343\u5361/\u79D2\uFF08kcal/s\uFF09        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 21));
		in6_Panel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 18));
		in6_Panel.add(textField6);
		textField6.setColumns(22);
		blank6 = new JLabel(" ");
		in6_Panel.add(blank6);
		conversion6 = new Button("   \u5343\u5361/\u79D2>    ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_Panel.add(conversion6);

		in7_Panel = new JPanel();
		input_Panel.add(in7_Panel);
		Label7 = new JLabel("        \u82F1\u70ED\u5355\u4F4D/\u79D2\uFF08Btu/s\uFF09       ");
		Label7.setFont(new Font("隶书", Font.BOLD, 21));
		in7_Panel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 18));
		in7_Panel.add(textField7);
		textField7.setColumns(22);
		blank7 = new JLabel(" ");
		in7_Panel.add(blank7);
		conversion7 = new Button("\u82F1\u70ED\u5355\u4F4D/\u79D2> ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_Panel.add(conversion7);

		in8_Panel = new JPanel();
		input_Panel.add(in8_Panel);
		Label8 = new JLabel("          \u82F1\u5C3A*\u78C5/\u79D2\uFF08ft*lb/s\uFF09       ");
		Label8.setFont(new Font("隶书", Font.BOLD, 21));
		in8_Panel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 18));
		in8_Panel.add(textField8);
		textField8.setColumns(22);
		blank8 = new JLabel(" ");
		in8_Panel.add(blank8);
		conversion8 = new Button("\u82F1\u5C3A*\u78C5/\u79D2>  ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_Panel.add(conversion8);
		
		in9_Panel = new JPanel();
		input_Panel.add(in9_Panel);
		Label9 = new JLabel("          \u7126\u8033/\u79D2 (J/s)       ");
		Label9.setFont(new Font("隶书", Font.BOLD, 21));
		in9_Panel.add(Label9);
		textField9 = new JTextField();
		textField9.setFont(new Font("隶书", Font.PLAIN, 18));
		in9_Panel.add(textField9);
		textField9.setColumns(22);
		blank9 = new JLabel(" ");
		in9_Panel.add(blank9);
		conversion9 = new Button("    \u7126\u8033/\u79D2>    ");
		conversion9.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion9.setBackground(UIManager.getColor("Button.light"));
		conversion9.addActionListener(this);
		in9_Panel.add(conversion9);
		
		in10_Panel = new JPanel();
		input_Panel.add(in10_Panel);
		Label10 = new JLabel("          \u725B\u987F*\u7C73/\u79D2\uFF08N*m/s\uFF09       ");
		Label10.setFont(new Font("隶书", Font.BOLD, 21));
		in10_Panel.add(Label10);
		textField10 = new JTextField();
		textField10.setFont(new Font("隶书", Font.PLAIN, 18));
		in10_Panel.add(textField10);
		textField10.setColumns(22);
		blank10 = new JLabel(" ");
		in10_Panel.add(blank10);
		conversion10 = new Button(" \u725B\u987F*\u7C73/\u79D2> ");
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
		// 瓦
		if (e.getActionCommand() == "        \u74E6>        ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 0.001;
			this.result2 = result * 0.001341;
			this.result3 = result * 0.0013600;
			this.result4 = result * 0.1020000;
			this.result5 = result * 0.0002390;
			this.result6 = result * 0.0009478;
			this.result7 = result * 0.7376000;
			this.result8 = result * 1;
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
		// "千瓦"
		if (e.getActionCommand() == "      \u5343\u74E6>      ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result * 1000;
			this.result1 = result * 1;
			this.result2 = result * 1.341;
			this.result3 = result * 1.3600000;
			this.result4 = result * 102.0000007;
			this.result5 = result * 0.2390000;
			this.result6 = result * 0.9478000;
			this.result7 = result * 737.6000000;
			this.result8 = result * 1000;
			this.result9 = result * 1000;
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
		// 英制马力
		if (e.getActionCommand() == "   \u82F1\u5236\u9A6C\u529B >  ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result * 745.712172;
			this.result1 = result * 0.7457122;
			this.result2 = result * 1;
			this.result3 = result * 1.0141686;
			this.result4 = result * 76.0626421;
			this.result5 = result * 0.1782252;
			this.result6 = result * 0.706786;
			this.result7 = result * 550.0372981;
			this.result8 = result * 745.712172;
			this.result9 = result * 745.712172;
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
		// 米制马力
		if (e.getActionCommand() == "  \u7C73\u5236\u9A6C\u529B>   ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 735.2941;
			this.result1 = result * 0.7352941;
			this.result2 = result * 0.9860294;
			this.result3 = result * 1;
			this.result4 = result * 74.9999987;
			this.result5 = result * 0.1757353;
			this.result6 = result * 0.6969117;
			this.result7 = result * 542.3529282;
			this.result8 = result * 735.2941;
			this.result9 = result * 735.2941;
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
		// 公斤米/秒
		if (e.getActionCommand() ==" \u516C\u65A4*\u7C73/\u79D2>  ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result * 9.8039215;
			this.result1 = result * 0.0098039;
			this.result2 = result * 0.0131471;
			this.result3 = result * 0.0133333;
			this.result4 = result * 1;
			this.result5 = result * 0.0023431;
			this.result6 = result * 0.0092922;
			this.result7 = result * 7.2313725;
			this.result8 = result * 9.8039215;
			this.result9 = result * 9.8039215;
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
		// 千卡/秒
		if (e.getActionCommand() == "   \u5343\u5361/\u79D2>    ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result * 4184.1004;
			this.result1 = result * 4.1841004;
			this.result2 = result * 5.6108785;
			this.result3 = result * 5.6903767;
			this.result4 = result * 426.7782438;
			this.result5 = result * 1;
			this.result6 = result * 3.9656904;
			this.result7 = result * 3086.1924550;
			this.result8 = result * 4184.1004;
			this.result9 = result * 4184.1004;
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
		// 英热单位/秒
		if (e.getActionCommand() == "\u82F1\u70ED\u5355\u4F4D/\u79D2> ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 1055.07491;
			this.result1 = result * 1.0550749;
			this.result2 = result * 1.4148554;
			this.result3 = result * 1.4349019;
			this.result4 = result * 107.6176416;
			this.result5 = result * 0.2521629;
			this.result6 = result * 1;
			this.result7 = result * 778.2232536;
			this.result8 = result * 1055.07491;
			this.result9 = result * 1055.07491;
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
		//英尺磅/秒
		if (e.getActionCommand() == "\u82F1\u5C3A*\u78C5/\u79D2>  ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 1.3557484;//
			this.result1 = result * 0.0013557;
			this.result2 = result * 0.0018181;
			this.result3 = result * 0.0018438;
			this.result4 = result * 0.1382863;
			this.result5 = result * 0.0003240;//
			this.result6 = result * 0.001285;
			this.result7 = result * 1;
			this.result8 = result * 1.3557484;
			this.result9 = result * 1.3557484;
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
		
		// 焦耳/秒
		if (e.getActionCommand() == "    \u7126\u8033/\u79D2>    ") {
			double result = Double.parseDouble(textField9.getText());
			this.result0 = result * 1;//
			this.result1 = result * 0.001;
			this.result2 = result * 0.001341;
			this.result3 = result * 0.0013600;
			this.result4 = result * 0.1020000;
			this.result5 = result * 0.0002390;//
			this.result6 = result * 0.0009478;
			this.result7 = result * 0.7376000;
			this.result8 = result * 1;
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
		// 牛顿米/秒
		if (e.getActionCommand() == " \u725B\u987F*\u7C73/\u79D2> ") {
			double result = Double.parseDouble(textField10.getText());
			this.result0 = result * 1;//
			this.result1 = result * 0.001;
			this.result2 = result * 0.001341;
			this.result3 = result * 0.0013600;
			this.result4 = result * 0.1020000;
			this.result5 = result * 0.0002390;//
			this.result6 = result * 0.0009478;
			this.result7 = result * 0.7376000;
			this.result8 = result * 1;
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
