package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Window.Type;;

public class UnitConversion_Volume extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel explain_Panel, input_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel,
			in6_Panel, in7_Panel, in8_Panel;
	private double result0, result1, result2, result3, result4, result5, result6, result7 = 0.0;
	private JLabel explain_Label;
	private Button ce_Button;
	private Button back_Button;
	private Button conversion1, conversion2, conversion3, conversion4, conversion5, conversion6, conversion7,
			conversion8;
	private JLabel Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8;
	private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
	private JLabel blank1, blank2, blank3, blank4, blank5, blank6, blank7, blank8;
	private JLabel blank10;
	private JLabel blank9;

	public void cal() {
		cal_Frame = new Frame("\u4F53\u79EF\u5355\u4F4D\u6362\u7B97\u5668");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(new Color(0, 0, 0));
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));

		explain_Panel = new Panel();
		explain_Panel.setPreferredSize(new Dimension(770, 40));
		cal_Frame.add(explain_Panel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u6765\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 17));
		explain_Panel.add(explain_Label);
		input_Panel = new Panel(new GridLayout(4, 2, 5, 5));
		input_Panel.setPreferredSize(new Dimension(770, 230));
		cal_Frame.add(input_Panel, BorderLayout.CENTER);
		result_Panel = new Panel();
		result_Panel.setPreferredSize(new Dimension(770, 65));
		cal_Frame.add(result_Panel, BorderLayout.SOUTH);

		in1_Panel = new Panel();
		input_Panel.add(in1_Panel);
		Label1 = new JLabel("        \u7ACB\u65B9\u7C73(m3)       ");
		Label1.setFont(new Font("隶书", Font.BOLD, 24));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 19));
		in1_Panel.add(textField1);
		textField1.setColumns(19);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("    \u7ACB\u65B9\u7C73>   ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new Panel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("        \u516C\u77F3(hl)        ");
		Label2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 19));
		in2_Panel.add(textField2);
		textField2.setColumns(19);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button("     \u516C\u77F3>     ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);
		
		in3_Panel = new Panel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("        \u5341\u5347(dal)        ");
		Label3.setFont(new Font("隶书", Font.BOLD, 24));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 19));
		in3_Panel.add(textField3);
		textField3.setColumns(19);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("     \u5341\u5347>     ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new Panel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("        \u5206\u5347(dl)        ");
		Label4.setFont(new Font("隶书", Font.BOLD, 24));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 19));
		in4_Panel.add(textField4);
		textField4.setColumns(19);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button("     \u5206\u5347>     ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);
		
		in5_Panel = new Panel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("             \u82F1\u5236-\u52A0\u4ED1(gal)             ");
		Label5.setFont(new Font("隶书", Font.BOLD, 24));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 19));
		in5_Panel.add(textField5);
		textField5.setColumns(19);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button("    \u82F1\u52A0\u4ED1>   ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

		in6_Panel = new Panel();
		input_Panel.add(in6_Panel);
		Label6 = new JLabel("        \u82F1\u5236-\u54C1\u8131(pt)        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 24));
		in6_Panel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 19));
		in6_Panel.add(textField6);
		textField6.setColumns(19);
		blank6 = new JLabel(" ");
		in6_Panel.add(blank6);
		conversion6 = new Button("    \u82F1\u54C1\u8131>   ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_Panel.add(conversion6);
		
		in7_Panel = new Panel();
		input_Panel.add(in7_Panel);
		Label7 = new JLabel("        \u7F8E\u5236\u6DB2\u91CF-\u52A0\u4ED1(gal)        ");
		Label7.setFont(new Font("隶书", Font.BOLD, 24));
		in7_Panel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 19));
		in7_Panel.add(textField7);
		textField7.setColumns(19);
		blank7 = new JLabel(" ");
		in7_Panel.add(blank7);
		conversion7 = new Button("    \u7F8E\u52A0\u4ED1>   ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_Panel.add(conversion7);

		in8_Panel = new Panel();
		input_Panel.add(in8_Panel);
		Label8 = new JLabel("        \u7F8E\u5236\u6DB2\u91CF-\u54C1\u8131(pt)        ");
		Label8.setFont(new Font("隶书", Font.BOLD, 24));
		in8_Panel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 19));
		in8_Panel.add(textField8);
		textField8.setColumns(19);
		blank8 = new JLabel(" ");
		in8_Panel.add(blank8);
		conversion8 = new Button("    \u7F8E\u54C1\u8131>   ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_Panel.add(conversion8);

		ce_Button = new Button("     \u6E05\u7A7A     ");
		ce_Button.setBackground(UIManager.getColor("Button.background"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		ce_Button.addActionListener(this);

		blank9 = new JLabel(
				"                                                                                                                                                                                                                                                                     ");
		blank9.setFont(new Font("宋体", Font.PLAIN, 5));
		result_Panel.add(blank9);
		result_Panel.add(ce_Button);

		back_Button = new Button("    \u8FD4\u56DE    ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				UnitConversionPage newWindow=new UnitConversionPage();
				newWindow.setVisible(true);
			}
		});		

		blank10 = new JLabel("             ");
		result_Panel.add(blank10);
		result_Panel.add(back_Button);

		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// 立方米
		if (e.getActionCommand() == "    \u7ACB\u65B9\u7C73>   ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 10;
			this.result2 = result * 100;
			this.result3 = result * 10000;
			this.result4 = result * 1000 / 9.9092;
			this.result5 = result * 1000 / 0.568;
			this.result6 = result * 1000 / 3.785;
			this.result7 = result * 1000 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 公石
		if (e.getActionCommand() == "        \u516C\u77F3(hl)        ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result / 10;
			this.result1 = result * 1;
			this.result2 = result * 10;
			this.result3 = result * 1000;
			this.result4 = result * 100 / 9.9092;
			this.result5 = result * 100 / 0.568;
			this.result6 = result * 100 / 3.785;
			this.result7 = result * 100 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 十升
		if (e.getActionCommand() == "     \u5341\u5347>     ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result / 100;
			this.result1 = result / 10;
			this.result2 = result * 1;
			this.result3 = result * 100;
			this.result4 = result * 10 / 9.9092;
			this.result5 = result * 10 / 0.568;
			this.result6 = result * 10 / 3.785;
			this.result7 = result * 10 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		//分升
		if (e.getActionCommand() == " \u78C5\u529B/\u82F1\u5C3A2>") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result / 10000;
			this.result1 = result / 1000;
			this.result2 = result / 100;
			this.result3 = result * 1;
			this.result4 = result / 10 / 9.9092;
			this.result5 = result / 10 / 0.568;
			this.result6 = result / 10 / 3.785;
			this.result7 = result / 10 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 英加仑
		if (e.getActionCommand() =="    \u82F1\u52A0\u4ED1>   ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result * 9.092 / 1000;
			this.result1 = result * 9.092 / 100;
			this.result2 = result * 9.092 / 10;
			this.result3 = result * 9.092 * 10;
			this.result4 = result * 1;
			this.result5 = result * 9.092 / 0.568;
			this.result6 = result * 9.092 / 3.785;
			this.result7 = result * 9.092 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 英品脱
		if (e.getActionCommand() == "    \u82F1\u54C1\u8131>   ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result * 0.568 / 1000;
			this.result1 = result * 0.568 / 100;
			this.result2 = result * 0.568 / 10;
			this.result3 = result * 0.568 * 10;
			this.result4 = result * 0.568 / 9.9092;
			this.result5 = result * 1;
			this.result6 = result * 0.568 / 3.785;
			this.result7 = result * 0.568 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 美加仑
		if (e.getActionCommand() == "    \u7F8E\u52A0\u4ED1>   ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 3.785 / 1000;
			this.result1 = result * 3.785 / 100;
			this.result2 = result * 3.785 / 10;
			this.result3 = result * 3.785 * 10;
			this.result4 = result * 3.785 / 9.9092;
			this.result5 = result * 3.785 / 0.568;
			this.result6 = result * 1;
			this.result7 = result * 3.785 / 0.473;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		//美品脱
		if (e.getActionCommand() == "    \u7F8E\u54C1\u8131>   ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 0.473 / 1000;
			this.result1 = result * 0.473 / 100;
			this.result2 = result * 0.473 / 10;
			this.result3 = result * 0.473 * 10;
			this.result4 = result * 0.473 / 9.9092;
			this.result5 = result * 0.473 / 0.568;
			this.result6 = result * 0.473 / 3.785;;
			this.result7 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
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

		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		UnitConversion_Volume new_cal = new UnitConversion_Volume();
		new_cal.cal();

	}
}
