package calculator;


//  李涢瑶 2017111147
import java.awt.*;
import javax.swing.JComboBox;
import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class UnitConversion_Pressure extends WindowAdapter implements ActionListener {
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
		cal_Frame = new Frame("\u538B\u5F3A\u5355\u4F4D\u6362\u7B97\u5668");
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
		Label1 = new JLabel("        \u5DF4\uFF08bar\uFF09       ");
		Label1.setFont(new Font("隶书", Font.BOLD, 24));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 19));
		in1_Panel.add(textField1);
		textField1.setColumns(19);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("        \u5DF4>       ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new Panel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("       \u6807\u51C6\u5927\u6C14\u538B\uFF08atm\uFF09     ");
		Label2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 19));
		in2_Panel.add(textField2);
		textField2.setColumns(19);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button(" \u6807\u51C6\u5927\u6C14\u538B>");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);

		in3_Panel = new Panel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("    \u5E15\u65AF\u5361\uFF08Pa=N/m2\uFF09  ");
		Label3.setFont(new Font("隶书", Font.BOLD, 24));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 19));
		in3_Panel.add(textField3);
		textField3.setColumns(19);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("    \u5E15\u65AF\u5361>    ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new Panel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("       \u78C5\u529B/\u82F1\u5C3A2\uFF08lbf/ft2\uFF09       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 24));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 19));
		in4_Panel.add(textField4);
		textField4.setColumns(19);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button(" \u78C5\u529B/\u82F1\u5C3A2>");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);

		in5_Panel = new Panel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("       \u6BEB\u7C73\u6C5E\u67F1\uFF08mmHg=Torr\uFF09    ");
		Label5.setFont(new Font("隶书", Font.BOLD, 24));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 19));
		in5_Panel.add(textField5);
		textField5.setColumns(19);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button(" \u6BEB\u7C73\u6C5E\u67F1>   ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

		in6_Panel = new Panel();
		input_Panel.add(in6_Panel);
		Label6 = new JLabel("        \u82F1\u540B\u6C5E\u67F1(in?Hg)        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 24));
		in6_Panel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 19));
		in6_Panel.add(textField6);
		textField6.setColumns(19);
		blank6 = new JLabel(" ");
		in6_Panel.add(blank6);
		conversion6 = new Button("  \u82F1\u540B\u6C5E\u67F1>  ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_Panel.add(conversion6);

		in7_Panel = new Panel();
		input_Panel.add(in7_Panel);
		Label7 = new JLabel("       \u6BEB\u7C73\u6C34\u67F1\uFF08mmH2O\uFF09    ");
		Label7.setFont(new Font("隶书", Font.BOLD, 24));
		in7_Panel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 19));
		in7_Panel.add(textField7);
		textField7.setColumns(19);
		blank7 = new JLabel(" ");
		in7_Panel.add(blank7);
		conversion7 = new Button("  \u6BEB\u7C73\u6C34\u67F1>  ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_Panel.add(conversion7);

		in8_Panel = new Panel();
		input_Panel.add(in8_Panel);
		Label8 = new JLabel("   \u516C\u65A4\u529B/\u7C732(kgf/m2)  ");
		Label8.setFont(new Font("隶书", Font.BOLD, 24));
		in8_Panel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 19));
		in8_Panel.add(textField8);
		textField8.setColumns(19);
		blank8 = new JLabel(" ");
		in8_Panel.add(blank8);
		conversion8 = new Button(" \u516C\u65A4\u529B/\u7C732>");
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
				newWindow.cal();
			}
		});		

		blank10 = new JLabel("             ");
		result_Panel.add(blank10);
		result_Panel.add(back_Button);

		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// bar
		if (e.getActionCommand() == "        \u5DF4>       ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 0.98692327;
			this.result2 = result * 100000;
			this.result3 = result * 2088.5435;
			this.result4 = result * 750.06168;
			this.result5 = result * 29.529988;
			this.result6 = result * 10197.2;
			this.result7 = result * 10197.162;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// atm
		if (e.getActionCommand() == " \u6807\u51C6\u5927\u6C14\u538B>") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result * 1.01325;
			this.result1 = result * 1;
			this.result2 = result * 101325;
			this.result3 = result * 2116.2167;
			this.result4 = result * 760;
			this.result5 = result * 29.92126;
			this.result6 = result * 10332.313;
			this.result7 = result * 10332.275;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// Pa
		if (e.getActionCommand() == "    \u5E15\u65AF\u5361>    ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result * 0.00001;
			this.result1 = result * 0.0000098692327;
			this.result2 = result * 1;
			this.result3 = result * 0.020885435;
			this.result4 = result * 0.0075006168;
			this.result5 = result * 0.00029529988;
			this.result6 = result * 0.10197162;
			this.result7 = result * 0.10197162;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 磅力/英尺2
		if (e.getActionCommand() == " \u78C5\u529B/\u82F1\u5C3A2>") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 0.00047880257;
			this.result1 = result * 0.0004725414;
			this.result2 = result * 47.880257;
			this.result3 = result * 1;
			this.result4 = result * 0.35913146;
			this.result5 = result * 0.014139034;
			this.result6 = result * 4.8824456;
			this.result7 = result * 4.8824274;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 毫米汞柱
		if (e.getActionCommand() ==" \u6BEB\u7C73\u6C5E\u67F1>   ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result * 0.0013332237;
			this.result1 = result * 0.0013157895;
			this.result2 = result * 133.32237;
			this.result3 = result * 2.7844957;
			this.result4 = result * 1;
			this.result5 = result * 0.039370079;
			this.result6 = result * 13.595149;
			this.result7 = result * 13.595098;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 英口寸汞柱
		if (e.getActionCommand() == "  \u82F1\u540B\u6C5E\u67F1>  ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result * 0.033863882;
			this.result1 = result * 0.033421053;
			this.result2 = result * 3386.3882;
			this.result3 = result * 70.72619;
			this.result4 = result * 25.4;
			this.result5 = result * 1;
			this.result6 = result * 345.31677;
			this.result7 = result * 345.31549;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 毫米水柱
		if (e.getActionCommand() == "  \u6BEB\u7C73\u6C34\u67F1>  ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 0.000098066136;
			this.result1 = result * 0.000096783751;
			this.result2 = result * 9.8066136;
			this.result3 = result * 0.20481539;
			this.result4 = result * 0.073555651;
			this.result5 = result * 0.0028958918;
			this.result6 = result * 1;
			this.result7 = result * 0.99999629;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		//公斤力/米2
		if (e.getActionCommand() == " \u516C\u65A4\u529B/\u7C732>") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 0.0000980665;
			this.result1 = result * 0.000096784111;
			this.result2 = result * 9.80665;
			this.result3 = result * 0.20481615;
			this.result4 = result * 0.073555924;
			this.result5 = result * 0.0028959025;
			this.result6 = result * 1.0000037;
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
		UnitConversion_Pressure new_cal = new UnitConversion_Pressure();
		new_cal.cal();

	}
}
