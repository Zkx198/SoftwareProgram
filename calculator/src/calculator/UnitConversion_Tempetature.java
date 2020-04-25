package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class UnitConversion_Tempetature extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel explain_Panel, input_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel;
	private double result0, result1, result2, result3, result4 = 0.0;
	private JLabel explain_Label;
	private Button ce_Button;
	private Button back_Button;
	private Button conversion1, conversion2, conversion3, conversion4, conversion5;
	private JLabel Label1, Label2, Label3, Label4, Label5;
	private JTextField textField1, textField2, textField3, textField4, textField5;
	private JLabel blank1, blank2, blank3, blank4, blank5;
	private JLabel blank10;
	private JLabel blank9;

	public void cal() {
		cal_Frame = new Frame("\u6E29\u5EA6\u5355\u4F4D\u6362\u7B97\u5668");
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
		input_Panel = new Panel(new GridLayout(3, 2, 5, 5));
		input_Panel.setPreferredSize(new Dimension(770, 230));
		cal_Frame.add(input_Panel, BorderLayout.CENTER);
		result_Panel = new Panel();
		result_Panel.setPreferredSize(new Dimension(770, 65));
		cal_Frame.add(result_Panel, BorderLayout.SOUTH);

		in1_Panel = new Panel();
		input_Panel.add(in1_Panel);
		Label1 = new JLabel("         \u6444\u6C0F\u5EA6\uFF08C\uFF09        ");
		Label1.setFont(new Font("隶书", Font.BOLD, 24));
		in1_Panel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 19));
		in1_Panel.add(textField1);
		textField1.setColumns(19);
		blank1 = new JLabel(" ");
		in1_Panel.add(blank1);
		conversion1 = new Button("        C>       ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_Panel.add(conversion1);

		in2_Panel = new Panel();
		input_Panel.add(in2_Panel);
		Label2 = new JLabel("       \u534E\u6C0F\u5EA6\uFF08F\uFF09     ");
		Label2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_Panel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 19));
		in2_Panel.add(textField2);
		textField2.setColumns(19);
		blank2 = new JLabel(" ");
		in2_Panel.add(blank2);
		conversion2 = new Button("        F>       ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_Panel.add(conversion2);

		in3_Panel = new Panel();
		input_Panel.add(in3_Panel);
		Label3 = new JLabel("    \u5F00\u6C0F\u5EA6\uFF08K\uFF09  ");
		Label3.setFont(new Font("隶书", Font.BOLD, 24));
		in3_Panel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 19));
		in3_Panel.add(textField3);
		textField3.setColumns(19);
		blank3 = new JLabel(" ");
		in3_Panel.add(blank3);
		conversion3 = new Button("        K>       ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_Panel.add(conversion3);
		conversion3.addActionListener(this);

		in4_Panel = new Panel();
		input_Panel.add(in4_Panel);
		Label4 = new JLabel("       \u5170\u6C0F\u5EA6\uFF08Ra\uFF09       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 24));
		in4_Panel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 19));
		in4_Panel.add(textField4);
		textField4.setColumns(19);
		blank4 = new JLabel(" ");
		in4_Panel.add(blank4);
		conversion4 = new Button("       Ra>      ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_Panel.add(conversion4);

		in5_Panel = new Panel();
		input_Panel.add(in5_Panel);
		Label5 = new JLabel("       \u5217\u6C0F\u5EA6\uFF08Re\uFF09    ");
		Label5.setFont(new Font("隶书", Font.BOLD, 24));
		in5_Panel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 19));
		in5_Panel.add(textField5);
		textField5.setColumns(19);
		blank5 = new JLabel(" ");
		in5_Panel.add(blank5);
		conversion5 = new Button("       Re>      ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_Panel.add(conversion5);
		conversion5.addActionListener(this);

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
		//摄氏度
		if (e.getActionCommand() == "        C>       ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 1.8 + 32;
			this.result2 = result +  273.15;
			this.result3 = (result + 273.25) * 1.8 ;
			this.result4 = result * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//华氏度 
		if (e.getActionCommand() == "        F>       ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = (result - 32) * 5 / 9;
			this.result1 = result * 1;
			this.result2 = (result - 32) * 5 / 9 + 273.15;
			this.result3 = result * 2116.2167;
			this.result4 = (result - 32) * 5 / 9 * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//开尔文
		if (e.getActionCommand() == "        K>       ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result - 273.15;
			this.result1 = (result - 273.15) * 1.8 + 32;
			this.result2 = result * 1;
			this.result3 = result * 1.8;
			this.result4 = (result - 273.15) * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//兰氏度
		if (e.getActionCommand() == "       Ra>      ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result / 1.8 - 273.15;
			this.result1 = result - 459.67;
			this.result2 = result / 1.8;
			this.result3 = result * 1;
			this.result4 = (result / 1.8 - 273.15) * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//列氏度
		if (e.getActionCommand() =="       Re>      ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result / 0.8;
			this.result1 = result / 0.8 * 1.8 + 32;
			this.result2 = result * 1.25 + 273.5;
			this.result3 = (result * 1.25 + 273.5) * 1.8;
			this.result4 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
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
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		UnitConversion_Tempetature new_cal = new UnitConversion_Tempetature();
		new_cal.cal();

	}
}
