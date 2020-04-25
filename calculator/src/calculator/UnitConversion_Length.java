package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class UnitConversion_Length extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel explain_Panel, input_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel,
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

	public void cal() {
		cal_Frame = new Frame("\u957F\u5EA6\u5355\u4F4D\u6362\u7B97\u5668");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(new Color(0, 0, 0));
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 0));

		explain_Panel = new Panel();
		explain_Panel.setFont(new Font("Dialog", Font.PLAIN, 11));
		explain_Panel.setPreferredSize(new Dimension(770, 23));
		cal_Frame.add(explain_Panel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u7F6E\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 16));
		explain_Panel.add(explain_Label);
		input_Panel = new Panel(new GridLayout(5, 2, 5, 2));
		input_Panel.setPreferredSize(new Dimension(770, 245));
		cal_Frame.add(input_Panel, BorderLayout.CENTER);
		result_Panel = new Panel();
		result_Panel.setPreferredSize(new Dimension(770, 53));
		cal_Frame.add(result_Panel, BorderLayout.SOUTH);

		in1_Panel = new Panel();
		input_Panel.add(in1_Panel);
		Label1 = new JLabel("          \u7C73(metre)         ");
		Label1.setFont(new Font("隶书", Font.BOLD, 21));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 18));
		in1_Panel.add(textField1);
		textField1.setColumns(22);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("         m>         ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new Panel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("        \u516C\u91CC(kilometre)       ");
		Label2.setFont(new Font("隶书", Font.BOLD, 21));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 18));
		in2_Panel.add(textField2);
		textField2.setColumns(22);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button("         km>       ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);

		in3_Panel = new Panel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("        \u91CC         ");
		Label3.setFont(new Font("隶书", Font.BOLD, 21));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 18));
		in3_Panel.add(textField3);
		textField3.setColumns(22);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("         \u91CC>        ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new Panel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("         \u4E08       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 21));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 18));
		in4_Panel.add(textField4);
		textField4.setColumns(22);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button("         \u4E08>        ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);
		
		in5_Panel = new Panel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("        \u5C3A         ");
		Label5.setFont(new Font("隶书", Font.BOLD, 21));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 18));
		in5_Panel.add(textField5);
		textField5.setColumns(22);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button("         \u5C3A>        ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

		in6_Panel = new Panel();
		input_Panel.add(in6_Panel);
		Label6 = new JLabel("           \u5BF8        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 21));
		in6_Panel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 18));
		in6_Panel.add(textField6);
		textField6.setColumns(22);
		blank6 = new JLabel(" ");
		in6_Panel.add(blank6);
		conversion6 = new Button("         \u5BF8>        ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_Panel.add(conversion6);
		
		in7_Panel = new Panel();
		input_Panel.add(in7_Panel);
		Label7 = new JLabel("        \u6D77\u91CC(nautical mile)       ");
		Label7.setFont(new Font("隶书", Font.BOLD, 21));
		in7_Panel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 18));
		in7_Panel.add(textField7);
		textField7.setColumns(22);
		blank7 = new JLabel(" ");
		in7_Panel.add(blank7);
		conversion7 = new Button("        \u6D77\u91CC>     ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_Panel.add(conversion7);

		in8_Panel = new Panel();
		input_Panel.add(in8_Panel);
		Label8 = new JLabel("           \u82F1\u91CC(mile)        ");
		Label8.setFont(new Font("隶书", Font.BOLD, 21));
		in8_Panel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 18));
		in8_Panel.add(textField8);
		textField8.setColumns(22);
		blank8 = new JLabel(" ");
		in8_Panel.add(blank8);
		conversion8 = new Button("       \u82F1\u91CC>       ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_Panel.add(conversion8);
		
		in9_Panel = new Panel();
		input_Panel.add(in9_Panel);
		Label9 = new JLabel("          \u82F1\u5C3A(foot)       ");
		Label9.setFont(new Font("隶书", Font.BOLD, 21));
		in9_Panel.add(Label9);
		textField9 = new JTextField();
		textField9.setFont(new Font("隶书", Font.PLAIN, 18));
		in9_Panel.add(textField9);
		textField9.setColumns(22);
		blank9 = new JLabel(" ");
		in9_Panel.add(blank9);
		conversion9 = new Button("       \u82F1\u5C3A>      ");
		conversion9.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion9.setBackground(UIManager.getColor("Button.light"));
		conversion9.addActionListener(this);
		in9_Panel.add(conversion9);
		
		in10_Panel = new Panel();
		input_Panel.add(in10_Panel);
		Label10 = new JLabel("          \u82F1\u5BF8(inch)       ");
		Label10.setFont(new Font("隶书", Font.BOLD, 21));
		in10_Panel.add(Label10);
		textField10 = new JTextField();
		textField10.setFont(new Font("隶书", Font.PLAIN, 18));
		in10_Panel.add(textField10);
		textField10.setColumns(22);
		blank10 = new JLabel(" ");
		in10_Panel.add(blank10);
		conversion10 = new Button("       \u82F1\u5BF8>       ");
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
				cal_Frame.setVisible(false);
				UnitConversionPage newWindow=new UnitConversionPage();
				newWindow.cal();
			}
		});		

		blank11 = new JLabel("                     ");
		result_Panel.add(blank11);
		result_Panel.add(back_Button);

		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		//m
		if (e.getActionCommand() == "         m>         ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result / 1000;
			this.result2 = result / 500;
			this.result3 = result / 10 * 3;
			this.result4 = result * 3;
			this.result5 = result * 30;
			this.result6 = result / 4828.032000019;
			this.result7 = result / 1609.344;
			this.result8 = result * 100 / 30.48;
			this.result9 = result * 100 / 2.54;
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
		//km
		if (e.getActionCommand() == "         km>       ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result * 1000;
			this.result1 = result * 1;
			this.result2 = result * 1000 / 500;
			this.result3 = result * 1000 / 10 * 3;
			this.result4 = result * 1000 * 3;
			this.result5 = result * 1000 * 30;
			this.result6 = result * 1000 / 4828.032000019;
			this.result7 = result * 1000 / 1609.344;
			this.result8 = result * 1000 * 100 / 30.48;
			this.result9 = result * 1000 * 100 / 2.54;
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
		// 里
		if (e.getActionCommand() == "         \u91CC>        ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result * 500;
			this.result1 = result * 500 / 1000;
			this.result2 = result * 1;
			this.result3 = result * 500 / 10 * 3;
			this.result4 = result * 500 * 3;
			this.result5 = result * 500 * 30;
			this.result6 = result * 500 / 4828.032000019;
			this.result7 = result * 500 / 1609.344;
			this.result8 = result * 500 * 100 / 30.48;
			this.result9 = result * 500 * 100 / 2.54;
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
		// 丈
		if (e.getActionCommand() == "         \u4E08>        ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 10 / 3;
			this.result1 = result * 10 / 3 / 1000;
			this.result2 = result * 10 / 3 / 500;
			this.result3 = result * 1;
			this.result4 = result * 10 / 3 * 3;
			this.result5 = result * 10 / 3 * 30;
			this.result6 = result * 10 / 3 / 4828.032000019;
			this.result7 = result * 10 / 3 / 1609.344;
			this.result8 = result * 10 / 3 * 100 / 30.48;
			this.result9 = result * 10 / 3 * 100 / 2.54;
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
		//尺
		if (e.getActionCommand() =="         \u5C3A>        ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result / 3;
			this.result1 = result / 3 / 1000;
			this.result2 = result / 3 / 500;
			this.result3 = result / 3 / 10 * 3;
			this.result4 = result * 1;
			this.result5 = result / 3 * 30;
			this.result6 = result / 3 / 4828.032000019;
			this.result7 = result / 3 / 1609.344;
			this.result8 = result / 3 * 100 / 30.48;
			this.result9 = result / 3 * 100 / 2.54;
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
		// 寸
		if (e.getActionCommand() == "         \u5BF8>        ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result / 30;
			this.result1 = result / 30 / 1000;
			this.result2 = result / 30 / 500;
			this.result3 = result / 30 / 10 * 3;
			this.result4 = result / 30 * 3;
			this.result5 = result * 1;
			this.result6 = result / 30 / 4828.032000019;
			this.result7 = result / 30 / 1609.344;
			this.result8 = result / 30 * 100 / 30.48;
			this.result9 = result / 30 * 100 / 2.54;
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
		//海里
		if (e.getActionCommand() == "        \u6D77\u91CC>     ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 4828.032000019;
			this.result1 = result * 4828.032000019 / 1000;
			this.result2 = result * 4828.032000019 / 500;
			this.result3 = result * 4828.032000019 / 10 * 3;
			this.result4 = result * 4828.032000019 * 3;
			this.result5 = result * 4828.032000019 * 30;
			this.result6 = result * 1;
			this.result7 = result * 4828.032000019 / 1609.344;
			this.result8 = result * 4828.032000019 * 100 / 30.48;
			this.result9 = result * 4828.032000019 * 100 / 2.54;
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
		//英里
		if (e.getActionCommand() == "       \u82F1\u91CC>       ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 1609.344;
			this.result1 = result * 1609.344 / 1000;
			this.result2 = result * 1609.344 / 500;
			this.result3 = result * 1609.344 / 10 * 3;
			this.result4 = result * 1609.344 * 3;
			this.result5 = result * 1609.344 * 30;
			this.result6 = result * 1609.344 / 4828.032000019;
			this.result7 = result * 1;
			this.result8 = result * 1609.344 * 100 / 30.48;
			this.result9 = result * 1609.344 * 100 / 2.54;
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
		
		//英尺
		if (e.getActionCommand() == "       \u82F1\u5C3A>      ") {
			double result = Double.parseDouble(textField9.getText());
			this.result0 = result * 30.48 / 100;
			this.result1 = result * 30.48 / 100 / 1000;
			this.result2 = result * 30.48 / 100 / 500;
			this.result3 = result * 30.48 / 100 / 10 * 3;
			this.result4 = result * 30.48 / 100 * 3;
			this.result5 = result * 30.48 / 100 * 30;
			this.result6 = result * 30.48 / 100 / 4828.032000019;
			this.result7 = result * 30.48 / 100 / 1609.344;
			this.result8 = result * 1;
			this.result9 = result * 30.48 / 100 * 100 / 2.54;
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
		//英寸
		if (e.getActionCommand() == "       \u82F1\u5BF8>       ") {
			double result = Double.parseDouble(textField10.getText());
			this.result0 = result * 2.54 / 100;
			this.result1 = result * 2.54 / 100 / 1000;
			this.result2 = result * 2.54 / 100 / 500;
			this.result3 = result * 2.54 / 100 / 10 * 3;
			this.result4 = result * 2.54 / 100 * 3;
			this.result5 = result * 2.54 / 100 * 30;
			this.result6 = result * 2.54 / 100 / 4828.032000019;
			this.result7 = result * 2.54 / 100 / 1609.344;
			this.result8 = result * 2.54 / 100 * 100 / 30.48;
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

	public static void main(String[] args) {
		UnitConversion_Length new_cal = new UnitConversion_Length();
		new_cal.cal();

	}
}
