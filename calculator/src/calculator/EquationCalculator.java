package calculator;
// 李涢瑶2017111147
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;

import calculator.SecondaryPageOne;

import java.awt.Window.Type;

public class EquationCalculator extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel input_integration_Panel, input_left_Panel,input_right_Panel, keyNum_Panel, output_Panel, intergration_Panel, keyOrder_Panel, x1_Panel,
			x2_Panel;
	private TextField a_Textfield, b_Textfield, c_Textfield;
	private TextField  result1_Textarea, result2_Textarea;
	private Button number1_Button, number2_Button, number3_Button, number4_Button, number5_Button, number6_Button,
			number7_Button, number8_Button, number9_Button, number0_Button;
	private Button dot_Button, negative_Button;
	private Button Backspace_Button, C_Button, Back_Button, Cal_Button;
	private Label a_Label, b_Label, c_Label, d_Label, result1_Label, result2_Label, position_Label;
	private JRadioButton a_Radio, b_Radio, c_Radio;
	private double a_inputContent = 0.0;
	private double b_inputContent = 0.0;
	private double c_inputContent = 0.0;
	private int a_numOfDecimal = 0, b_numOfDecimal = 0, c_numOfDecimal = 0; // 小数位数
	private int a_numOfBit = 0, b_numOfBit = 0, c_numOfBit = 0; // 总共输入的位数
	private boolean a_alreadyHaveDot = false, b_alreadyHaveDot = false, c_alreadyHaveDot = false;
	Font fontOfNumber = new Font("华文行楷", Font.PLAIN, 26);
	Font fontOfOutput = new Font("华文行楷", Font.PLAIN, 32);
	Font fontOfKey = new Font("Times New Roman", Font.ITALIC, 18);
	Font fontOfCommand = new Font("Times New Roman", Font.ITALIC, 18);
// 界面开始！！！
	public void cal() {
		cal_Frame = new Frame("\u4E00\u5143\u4E8C\u6B21\u65B9\u7A0B\u6C42\u89E3\u8BA1\u7B97\u5668");
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setForeground(new Color(0, 0, 0));
		cal_Frame.setSize(420, 480);
		cal_Frame.setLocation(800, 200);
		cal_Frame.setBackground(new Color(0, 0, 0));
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(5, 3));

		input_integration_Panel = new Panel(new FlowLayout());
		input_left_Panel = new Panel(new FlowLayout());
		input_left_Panel.setPreferredSize(new Dimension(270, 124));
		input_left_Panel.setBackground(new Color(0, 51, 51));
		input_right_Panel = new Panel(new GridLayout(4, 1, 2, 2));
		input_right_Panel.setPreferredSize(new Dimension(100, 130));
		input_right_Panel.setBackground(new Color(220, 220, 220));
		input_integration_Panel.setBackground(SystemColor.menuText);
		input_integration_Panel.add(input_left_Panel,BorderLayout.WEST);
		input_integration_Panel.add(input_right_Panel,BorderLayout.EAST);
		output_Panel = new Panel(new GridLayout(1, 6, 3, 12));
		output_Panel.setBackground(new Color(0, 0, 0));
		x1_Panel = new Panel(new FlowLayout());
		x1_Panel.setBackground(new Color(0, 51, 51));
		x2_Panel = new Panel(new FlowLayout());
		x2_Panel.setBackground(new Color(0, 51, 51));
		output_Panel.add(x1_Panel, BorderLayout.WEST);
		output_Panel.add(x2_Panel, BorderLayout.EAST);
		intergration_Panel = new Panel(new FlowLayout());
		intergration_Panel.setBackground(Color.BLACK);
		keyNum_Panel = new Panel(new GridLayout(4, 3, 7, 8));
		keyNum_Panel.setBackground(Color.DARK_GRAY);
		keyOrder_Panel = new Panel(new GridLayout(4, 1, 3, 3));
		intergration_Panel.add(keyNum_Panel, BorderLayout.WEST);
		intergration_Panel.add(keyOrder_Panel, BorderLayout.EAST);
		x1_Panel.setPreferredSize(new Dimension(190, 76));
		x2_Panel.setPreferredSize(new Dimension(192, 76));
		input_integration_Panel.setPreferredSize(new Dimension(360, 140));
		output_Panel.setPreferredSize(new Dimension(400, 65));
		intergration_Panel.setPreferredSize(new Dimension(360, 235));
		keyNum_Panel.setPreferredSize(new Dimension(260, 220));
		keyOrder_Panel.setPreferredSize(new Dimension(120, 210));
		cal_Frame.add(input_integration_Panel, BorderLayout.NORTH);
		cal_Frame.add(output_Panel, BorderLayout.CENTER);
		cal_Frame.add(intergration_Panel, BorderLayout.SOUTH);

		a_Textfield = new TextField(8);
		a_Textfield.setBackground(Color.DARK_GRAY);
		a_Textfield.setForeground(Color.WHITE);
		b_Textfield = new TextField(8);
		b_Textfield.setBackground(Color.DARK_GRAY);
		b_Textfield.setForeground(Color.WHITE);
		c_Textfield = new TextField(8);
		c_Textfield.setForeground(Color.WHITE);
		c_Textfield.setBackground(Color.DARK_GRAY);
		a_Label = new Label(" *(X^2)   + ");
		a_Label.setForeground(Color.WHITE);
		a_Label.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		a_Label.setBackground(new Color(0, 51, 51));
		b_Label = new Label("   * X");
		b_Label.setForeground(Color.WHITE);
		b_Label.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		b_Label.setBackground(new Color(0, 51, 51));
		c_Label = new Label("  + ");
		c_Label.setForeground(Color.WHITE);
		c_Label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		c_Label.setBackground(new Color(0, 51, 51));
		d_Label = new Label("    =    0    ");
		d_Label.setForeground(Color.WHITE);
		d_Label.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		d_Label.setBackground(new Color(0, 51, 51));
		position_Label = new Label(" Position:");
		position_Label.setForeground(Color.WHITE);
		position_Label.setBackground(new Color(0, 51, 51));
		position_Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		a_Textfield.setText("0.");
		a_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		a_Textfield.setEditable(true);
		b_Textfield.setText("0.");
		b_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		b_Textfield.setEditable(true);
		c_Textfield.setText("0.");
		c_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		c_Textfield.setEditable(true);
		a_Textfield.setBounds(50, 50, 2, 2);
		a_Radio = new JRadioButton(" A",true);
		a_Radio.setBackground(new Color(0, 51, 51));
		a_Radio.setForeground(Color.WHITE);
		a_Radio.setFont(new Font("宋体", Font.PLAIN, 20));
		b_Radio = new JRadioButton(" B");
		b_Radio.setForeground(Color.WHITE);
		b_Radio.setBackground(new Color(0, 51, 51));
		b_Radio.setFont(new Font("宋体", Font.PLAIN, 20));
		c_Radio = new JRadioButton(" C");
		c_Radio.setBackground(new Color(0, 51, 51));
		c_Radio.setForeground(Color.WHITE);
		c_Radio.setFont(new Font("宋体", Font.PLAIN, 20));
		input_left_Panel.add(a_Textfield);
		input_left_Panel.add(a_Label);
		input_left_Panel.add(b_Textfield);
		input_left_Panel.add(b_Label);
		input_left_Panel.add(c_Label);
		input_left_Panel.add(c_Textfield);
		input_left_Panel.add(d_Label);
		input_right_Panel.add(position_Label);
		input_right_Panel.add(a_Radio);
		input_right_Panel.add(b_Radio);
		input_right_Panel.add(c_Radio);
		input_left_Panel.setVisible(true);
		

		result1_Textarea = new TextField(14);
		result1_Textarea.setForeground(new Color(255, 255, 255));
		result1_Textarea.setBackground(Color.DARK_GRAY);
		result2_Textarea = new TextField(14);
		result2_Textarea.setBackground(Color.DARK_GRAY);
		result2_Textarea.setForeground(new Color(255, 255, 255));
		result1_Textarea.setText("");
		result1_Textarea.setFont(new Font("华文楷体", Font.BOLD | Font.ITALIC, 17));
		result1_Textarea.setEditable(true);
		result2_Textarea.setText("");
		result2_Textarea.setFont(new Font("华文楷体", Font.BOLD | Font.ITALIC, 17));
		result2_Textarea.setEditable(true);
		result1_Label = new Label("X1");
		result1_Label.setForeground(new Color(255, 255, 255));
		result1_Label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		result1_Label.setBackground(new Color(0, 51, 51));
		result2_Label = new Label("X2");
		result2_Label.setForeground(new Color(255, 255, 255));
		result2_Label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		result2_Label.setBackground(new Color(0, 51, 51));
		x1_Panel.add(result1_Label);
		x1_Panel.add(result1_Textarea);
		x2_Panel.add(result2_Label);
		x2_Panel.add(result2_Textarea);

		number1_Button = new Button("1");
		number1_Button.setForeground(Color.WHITE);
		number1_Button.setBackground(Color.DARK_GRAY);
		number2_Button = new Button("2");
		number2_Button.setBackground(Color.DARK_GRAY);
		number2_Button.setForeground(Color.WHITE);
		number3_Button = new Button("3");
		number3_Button.setForeground(Color.WHITE);
		number3_Button.setBackground(Color.DARK_GRAY);
		number4_Button = new Button("4");
		number4_Button.setBackground(Color.DARK_GRAY);
		number4_Button.setForeground(Color.WHITE);
		number5_Button = new Button("5");
		number5_Button.setBackground(Color.DARK_GRAY);
		number5_Button.setForeground(Color.WHITE);
		number6_Button = new Button("6");
		number6_Button.setForeground(Color.WHITE);
		number6_Button.setBackground(Color.DARK_GRAY);
		number7_Button = new Button("7");
		number7_Button.setForeground(Color.WHITE);
		number7_Button.setBackground(Color.DARK_GRAY);
		number8_Button = new Button("8");
		number8_Button.setBackground(Color.DARK_GRAY);
		number8_Button.setForeground(Color.WHITE);
		number9_Button = new Button("9");
		number9_Button.setForeground(Color.WHITE);
		number9_Button.setBackground(Color.DARK_GRAY);
		number0_Button = new Button("0");
		number0_Button.setBackground(Color.DARK_GRAY);
		number0_Button.setForeground(Color.WHITE);
		negative_Button = new Button("+/-");
		negative_Button.setBackground(new Color(0, 0, 102));
		negative_Button.setForeground(Color.WHITE);
		dot_Button = new Button(".");
		dot_Button.setBackground(new Color(0, 0, 102));
		dot_Button.setForeground(Color.WHITE);
		number0_Button.setFont(fontOfNumber);
		number1_Button.setFont(fontOfNumber);
		number2_Button.setFont(fontOfNumber);
		number3_Button.setFont(fontOfNumber);
		number4_Button.setFont(fontOfNumber);
		number5_Button.setFont(fontOfNumber);
		number6_Button.setFont(fontOfNumber);
		number7_Button.setFont(fontOfNumber);
		number8_Button.setFont(fontOfNumber);
		number9_Button.setFont(fontOfNumber);
		dot_Button.setFont(new Font("华文行楷", Font.BOLD, 26));
		negative_Button.setFont(fontOfNumber);
		negative_Button.addActionListener(this);
		number1_Button.addActionListener(this);
		number2_Button.addActionListener(this);
		number3_Button.addActionListener(this);
		number4_Button.addActionListener(this);
		number5_Button.addActionListener(this);
		number6_Button.addActionListener(this);
		number7_Button.addActionListener(this);
		number8_Button.addActionListener(this);
		number9_Button.addActionListener(this);
		number0_Button.addActionListener(this);
		dot_Button.addActionListener(this);
		keyNum_Panel.add(number7_Button);
		keyNum_Panel.add(number8_Button);
		keyNum_Panel.add(number9_Button);
		keyNum_Panel.add(number4_Button);
		keyNum_Panel.add(number5_Button);
		keyNum_Panel.add(number6_Button);
		keyNum_Panel.add(number1_Button);
		keyNum_Panel.add(number2_Button);
		keyNum_Panel.add(number3_Button);
		keyNum_Panel.add(number0_Button);
		keyNum_Panel.add(negative_Button);
		keyNum_Panel.add(dot_Button);

		Backspace_Button = new Button("DEL");
		Backspace_Button.setBackground(new Color(0, 51, 102));
		Backspace_Button.setForeground(Color.WHITE);
		Back_Button = new Button("BACK");
		Back_Button.setForeground(new Color(255, 255, 255));
		Back_Button.setBackground(new Color(160, 82, 45));
		C_Button = new Button("C");
		C_Button.setBackground(new Color(0, 51, 102));
		C_Button.setForeground(Color.WHITE);
		Cal_Button = new Button("CAL");
		Cal_Button.setForeground(Color.WHITE);
		Cal_Button.setBackground(new Color(0, 51, 102));
		Backspace_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		Back_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		Cal_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		C_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		Backspace_Button.addActionListener(this);
		Cal_Button.addActionListener(this);
		C_Button.addActionListener(this);
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				SecondaryPageOne newWindow = new SecondaryPageOne();
				newWindow.setVisible(true);
			}
		});

		keyOrder_Panel.add(Cal_Button);
		keyOrder_Panel.add(Backspace_Button);
		keyOrder_Panel.add(C_Button);
		keyOrder_Panel.add(Back_Button);

		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);
	}

// 功能开始！！！
	public void actionPerformed(ActionEvent e) {
		// key 0 to 9
		if (e.getActionCommand().length() == 1 && e.getActionCommand().compareTo("0") >= 0
				&& e.getActionCommand().compareTo("9") <= 0 && a_Radio.isSelected()) {
			this.a_numOfBit++;
			this.a_inputContent = Double.parseDouble(a_Textfield.getText());
			if (this.a_alreadyHaveDot == false)
				this.a_inputContent = this.a_inputContent * 10 + Double.parseDouble(e.getActionCommand());
			else {
				double temp = Double.parseDouble(e.getActionCommand());
				for (int i = this.a_numOfDecimal; i < 0; i++) {
					temp *= 0.1;
				}
				this.a_inputContent += temp;
				this.a_numOfDecimal--;
			}
			this.a_Textfield.setText(Double.toString(this.a_inputContent));
		}
		if (e.getActionCommand().length() == 1 && e.getActionCommand().compareTo("0") >= 0
				&& e.getActionCommand().compareTo("9") <= 0 && b_Radio.isSelected()) {
			this.b_numOfBit++;
			if (this.b_alreadyHaveDot == false)
				this.b_inputContent = this.b_inputContent * 10 + Double.parseDouble(e.getActionCommand());
			else {
				double temp = Double.parseDouble(e.getActionCommand());
				for (int i = this.b_numOfDecimal; i < 0; i++) {
					temp *= 0.1;
				}
				this.b_inputContent += temp;
				this.b_numOfDecimal--;
			}
			this.b_Textfield.setText(Double.toString(this.b_inputContent));
		}
		if (e.getActionCommand().length() == 1 && e.getActionCommand().compareTo("0") >= 0
				&& e.getActionCommand().compareTo("9") <= 0 && c_Radio.isSelected()) {
			this.c_numOfBit++;
			if (this.c_alreadyHaveDot == false)
				this.c_inputContent = this.c_inputContent * 10 + Double.parseDouble(e.getActionCommand());
			else {
				double temp = Double.parseDouble(e.getActionCommand());
				for (int i = this.c_numOfDecimal; i < 0; i++) {
					temp *= 0.1;
				}
				this.c_inputContent += temp;
				this.c_numOfDecimal--;
			}
			this.c_Textfield.setText(Double.toString(this.c_inputContent));
		}

		// key dot
		if (e.getActionCommand() == ".") {
			if (a_Radio.isSelected()) {
				if (this.a_alreadyHaveDot == false) {
					this.a_numOfBit++;
					this.a_alreadyHaveDot = true;
					this.a_numOfDecimal = -1;
				}
			}
			if (b_Radio.isSelected()) {
				if (this.b_alreadyHaveDot == false) {
					this.b_numOfBit++;
					this.b_alreadyHaveDot = true;
					this.b_numOfDecimal = -1;
				}
			}
			if (b_Radio.isSelected()) {
				if (this.c_alreadyHaveDot == false) {
					this.c_numOfBit++;
					this.c_alreadyHaveDot = true;
					this.c_numOfDecimal = -1;
				}
			}
		}

		// key "+/-"
		if (e.getActionCommand() == "+/-" && a_Radio.isSelected()) {
			this.a_inputContent = 0 - this.a_inputContent;
			a_Textfield.setText(Double.toString(this.a_inputContent));
		}
		if (e.getActionCommand() == "+/-" && b_Radio.isSelected()) {
			this.b_inputContent = 0 - this.b_inputContent;
			b_Textfield.setText(Double.toString(this.b_inputContent));
		}
		if (e.getActionCommand() == "+/-" && c_Radio.isSelected()) {
			this.c_inputContent = 0 - this.c_inputContent;
			c_Textfield.setText(Double.toString(this.c_inputContent));
		}

		//key "CAL" 计算啦！！！！！
		if (e.getActionCommand() == "CAL") {
			Double result1,result2;
			Double a,b,c;
			a = this.a_inputContent;
			b = this.b_inputContent;
			c = this.c_inputContent;
			Double limit = b*b-4*a*c;
			if(a!=0) {
			if(limit<0) {
				result1_Textarea.setText("无实数解。");
				result2_Textarea.setText("无实数解。");
			}else {
			    result1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			    result2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			    result1_Textarea.setText(Double.toString(result1));
			    result2_Textarea.setText(Double.toString(result2));
			    }
			}else {
				if(b==0) {
					result1_Textarea.setText("无解");
				    result2_Textarea.setText("无解");
				}else {
					result1 = -c/b;
				    result2 = 0.0;
				    result1_Textarea.setText(Double.toString(result1));
				    result2_Textarea.setText("仅有一解");
				}
			}
		}
		
		//key "C"
		if (e.getActionCommand() == "C"){
			this.a_numOfBit = 0;
			this.b_numOfBit = 0;
			this.c_numOfBit = 0;
			this.a_inputContent = 0; 
			this.a_alreadyHaveDot = false; 
			this.a_numOfDecimal =0; 
			a_Textfield.setText("0.");
			this.b_inputContent = 0; 
			this.b_alreadyHaveDot = false; 
			this.b_numOfDecimal =0; 
			b_Textfield.setText("0.");
			this.c_inputContent = 0; 
			this.c_alreadyHaveDot = false; 
			this.c_numOfDecimal =0; 
			c_Textfield.setText("0.");
			result1_Textarea.setText("");
		    result2_Textarea.setText("");
		}
	
		// key "Delete"
		if (e.getActionCommand() == "DEL" && a_Radio.isSelected()) {
			if (this.a_inputContent != 0) {
				if (this.a_alreadyHaveDot) {
					if (this.a_numOfDecimal == -1) {
						this.a_alreadyHaveDot = false;
						this.a_numOfDecimal = 0;
					} else {
						String str, str1;
						str = a_Textfield.getText();
						str1 = str.substring(0, this.a_numOfBit - 1);
						this.a_numOfBit--;
						this.a_numOfDecimal++;
						this.a_inputContent = Double.parseDouble(str1);
						a_Textfield.setText(Double.toString(this.a_inputContent));
					}
				} else {
					int temp;
					temp = (int) (this.a_inputContent / 10);
					this.a_inputContent = (double) temp;
					a_Textfield.setText(Double.toString(this.a_inputContent));
				}
			}
		}
		if (e.getActionCommand() == "DEL" && b_Radio.isSelected()) {
			if (this.b_inputContent != 0) {
				if (this.b_alreadyHaveDot) {
					if (this.b_numOfDecimal == -1) {
						this.b_alreadyHaveDot = false;
						this.b_numOfDecimal = 0;
					} else {
						String str, str1;
						str = b_Textfield.getText();
						str1 = str.substring(0, this.b_numOfBit - 1);
						this.b_numOfBit--;
						this.b_numOfDecimal++;
						this.b_inputContent = Double.parseDouble(str1);
						b_Textfield.setText(Double.toString(this.b_inputContent));
					}
				} else {
					int temp;
					temp = (int) (this.b_inputContent / 10);
					this.b_inputContent = (double) temp;
					b_Textfield.setText(Double.toString(this.b_inputContent));
				}
			}
		}
		if (e.getActionCommand() == "DEL" && c_Radio.isSelected()) {
			if (this.c_inputContent != 0) {
				if (this.c_alreadyHaveDot) {
					if (this.c_numOfDecimal == -1) {
						this.c_alreadyHaveDot = false;
						this.c_numOfDecimal = 0;
					} else {
						String str, str1;
						str = c_Textfield.getText();
						str1 = str.substring(0, this.c_numOfBit - 1);
						this.c_numOfBit--;
						this.c_numOfDecimal++;
						this.c_inputContent = Double.parseDouble(str1);
						c_Textfield.setText(Double.toString(this.c_inputContent));
					}
				} else {
					int temp;
					temp = (int) (this.c_inputContent / 10);
					this.c_inputContent = (double) temp;
					c_Textfield.setText(Double.toString(this.c_inputContent));
				}
			}
		}		
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		EquationCalculator new_cal = new EquationCalculator();
		new_cal.cal();
	}
}
