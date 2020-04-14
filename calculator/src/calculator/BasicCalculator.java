package calculator;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import java.awt.Window.Type;
//未完成品！！！！！！！！！！！！！！！
public class BasicCalculator extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel command_Panel, key_Panel, m_Panel, intergration_Panel, displayOutput_Panel, displayM_Panel;
	private TextField display_Textfield, m_Textfield;
	private Button number1_Button, number2_Button, number3_Button, number4_Button, number5_Button, number6_Button,
			number7_Button, number8_Button, number9_Button, number0_Button;
	private Button div_Button, sqrt_Button, multi_Button, minus_Button, percent_Button, plus_Button, reciprocal_Button,
			combi_Button, equal_Button, dot_Button, negative_Button, sin_Button, cos_Button, tan_Button, ln_Button,
			factorial_Button, exp_Button, square_Button;
	private Button Backspace_Button, CE_Button, C_Button, MR_Button, MS_Button, MC_Button, Mplus_Button;
	private double result = 0.0;
	private double inputContent = 0.0;
	private double memory = 0.0;
	private int numOfDecimal = 0; // 小数位数
	private int operator = 1; // 运算符类型
	private int numOfBit = 0; // 总共输入的位数
	private boolean alreadyHaveDot = false;
	private boolean keyAvailable = true;
	private boolean alreadyClickedEqual = false;
	private boolean isTempNowInput = false; // 是否在计算出结果后直接按运算符将结果赋给了当前输入值
	Font fontOfNumber = new Font("华文行楷", Font.PLAIN, 26);
	Font fontOfOutput = new Font("华文行楷", Font.PLAIN, 32);
	Font fontOfKey = new Font("Times New Roman", Font.ITALIC, 18);
	Font fontOfCommand = new Font("Times New Roman", Font.ITALIC, 18);

	public void cal() {
		cal_Frame = new Frame("基础计算器");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(SystemColor.desktop);
		cal_Frame.setSize(420, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));

		command_Panel = new Panel(new GridLayout(1, 3, 9, 10));
		key_Panel = new Panel(new GridLayout(4, 7, 4, 10));
		m_Panel = new Panel(new GridLayout(5, 1, 5, 5));
		intergration_Panel = new Panel(new FlowLayout());
		displayOutput_Panel = new Panel(new FlowLayout());
		displayM_Panel = new Panel(new FlowLayout());
		intergration_Panel.add(command_Panel, BorderLayout.NORTH);
		intergration_Panel.add(key_Panel,BorderLayout.SOUTH);
		displayOutput_Panel.setPreferredSize(new Dimension(280, 60));
		m_Panel.setPreferredSize(new Dimension(80, 300));
		key_Panel.setPreferredSize(new Dimension(310, 290));
		command_Panel.setPreferredSize(new Dimension(310, 55));
		intergration_Panel.setPreferredSize(new Dimension(320, 320));

		display_Textfield = new TextField(20);
		display_Textfield.setText("0");
		display_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 33));
		display_Textfield.setEditable(true);
		display_Textfield.setBounds(50, 30, 50, 30);
		displayOutput_Panel.add(display_Textfield);
		cal_Frame.add(displayOutput_Panel, BorderLayout.NORTH);
		cal_Frame.add(intergration_Panel, BorderLayout.EAST);
		cal_Frame.add(m_Panel, BorderLayout.CENTER);

		number1_Button = new Button("1");
		number2_Button = new Button("2");
		number3_Button = new Button("3");
		number4_Button = new Button("4");
		number5_Button = new Button("5");
		number6_Button = new Button("6");
		number7_Button = new Button("7");
		number8_Button = new Button("8");
		number9_Button = new Button("9");
		number0_Button = new Button("0");
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

		div_Button = new Button("/");
		sqrt_Button = new Button("sqrt");
		multi_Button = new Button("*");
		minus_Button = new Button("-");
		percent_Button = new Button("%");
		plus_Button = new Button("+");
		reciprocal_Button = new Button("1/x");
		equal_Button = new Button("=");
		dot_Button = new Button(".");
		negative_Button = new Button("+/-");
		square_Button = new Button("^2");
		sin_Button = new Button("sin");
		cos_Button = new Button("cos");
		factorial_Button = new Button("n!");
		tan_Button = new Button("tan");
		exp_Button = new Button("exp");
		ln_Button = new Button("ln");
		combi_Button = new Button("c");
		div_Button.setForeground(Color.red);
		multi_Button.setForeground(Color.red);
		minus_Button.setForeground(Color.red);
		plus_Button.setForeground(Color.red);
		equal_Button.setForeground(Color.red);
		dot_Button.setForeground(Color.red);
		negative_Button.setForeground(Color.red);
		sqrt_Button.setFont(fontOfKey);
		multi_Button.setFont(fontOfKey);
		minus_Button.setFont(fontOfKey);
		percent_Button.setFont(fontOfKey);
		plus_Button.setFont(fontOfKey);
		reciprocal_Button.setFont(fontOfKey);
		equal_Button.setFont(fontOfKey);
		dot_Button.setFont(fontOfKey);
		negative_Button.setFont(fontOfKey);
		square_Button.setFont(fontOfKey);
		sin_Button.setFont(fontOfKey);
		cos_Button.setFont(fontOfKey);
		factorial_Button.setFont(fontOfKey);
		tan_Button.setFont(fontOfKey);
		exp_Button.setFont(fontOfKey);
		ln_Button.setFont(fontOfKey);
		combi_Button.setFont(fontOfKey);
		combi_Button.addActionListener(this);
		div_Button.addActionListener(this);
		sqrt_Button.addActionListener(this);
		multi_Button.addActionListener(this);
		minus_Button.addActionListener(this);
		percent_Button.addActionListener(this);
		plus_Button.addActionListener(this);
		reciprocal_Button.addActionListener(this);
		equal_Button.addActionListener(this);
		dot_Button.addActionListener(this);
		negative_Button.addActionListener(this);
		ln_Button.addActionListener(this);
		exp_Button.addActionListener(this);
		tan_Button.addActionListener(this);
		sin_Button.addActionListener(this);
		cos_Button.addActionListener(this);
		factorial_Button.addActionListener(this);
		square_Button.addActionListener(this);

		key_Panel.add(number7_Button);
		key_Panel.add(number8_Button);
		key_Panel.add(number9_Button);
		key_Panel.add(div_Button);
		key_Panel.add(sqrt_Button);
		key_Panel.add(sin_Button);
		key_Panel.add(factorial_Button);
		key_Panel.add(number4_Button);
		key_Panel.add(number5_Button);
		key_Panel.add(number6_Button);
		key_Panel.add(multi_Button);
		key_Panel.add(square_Button);
		key_Panel.add(cos_Button);
		key_Panel.add(percent_Button);
		key_Panel.add(number1_Button);
		key_Panel.add(number2_Button);
		key_Panel.add(number3_Button);
		key_Panel.add(minus_Button);
		key_Panel.add(reciprocal_Button);
		key_Panel.add(tan_Button);
		key_Panel.add(exp_Button);
		key_Panel.add(number0_Button);
		key_Panel.add(negative_Button);
		key_Panel.add(dot_Button);
		key_Panel.add(plus_Button);
		key_Panel.add(equal_Button);
		key_Panel.add(combi_Button);
		key_Panel.add(ln_Button);

		Backspace_Button = new Button("DEL");
		CE_Button = new Button("CE");
		C_Button = new Button("C");
		Backspace_Button.setFont(fontOfCommand);
		CE_Button.setFont(fontOfCommand);
		C_Button.setFont(fontOfCommand);
		Backspace_Button.addActionListener(this);
		CE_Button.addActionListener(this);
		C_Button.addActionListener(this);

		command_Panel.add(Backspace_Button);
		command_Panel.add(CE_Button);
		command_Panel.add(C_Button);

		m_Textfield = new TextField(4);
		m_Textfield.setEnabled(false);
		m_Textfield.setBackground(Color.LIGHT_GRAY);
		m_Textfield.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		MC_Button = new Button("MC");
		MR_Button = new Button("MR");
		MS_Button = new Button("MS");
		Mplus_Button = new Button("M+");
		Mplus_Button.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		MC_Button.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		MR_Button.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		MS_Button.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		MC_Button.addActionListener(this);
		MR_Button.addActionListener(this);
		MS_Button.addActionListener(this);
		Mplus_Button.addActionListener(this);

		displayM_Panel.add(m_Textfield);
		displayM_Panel.setPreferredSize(new Dimension(80, 50));
		m_Panel.add(displayM_Panel,BorderLayout.NORTH);
		MC_Button.setBounds(50, 50, 10, 20);
		m_Panel.add(MC_Button);
		m_Panel.add(MR_Button);
		m_Panel.add(MS_Button);
		m_Panel.add(Mplus_Button);

		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// key 0 to 9
		if (this.keyAvailable && e.getActionCommand().length() == 1 && e.getActionCommand().compareTo("0") >= 0
				&& e.getActionCommand().compareTo("9") <= 0) {
			if (this.isTempNowInput) {
				this.inputContent = 0;
				this.isTempNowInput = false;
			}
			this.numOfBit++;
			if (this.alreadyHaveDot == false)
				this.inputContent = this.inputContent * 10 + Double.parseDouble(e.getActionCommand());
			else {
				double temp = Double.parseDouble(e.getActionCommand());
				for (int i = this.numOfDecimal; i < 0; i++) {
					temp *= 0.1;
				}
				this.inputContent += temp;
				this.numOfDecimal--;
			}
			this.display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key dot
		if (this.keyAvailable && e.getActionCommand() == ".") {
			if (this.alreadyHaveDot == false) {
				this.numOfBit++;
				this.alreadyHaveDot = true;
				this.numOfDecimal = -1;
			}
		}
		if (this.keyAvailable &&  e.getActionCommand() == "c" ) {
			if (this.alreadyClickedEqual) {
				display_Textfield.setText("请重新输入正整数！");
				this.keyAvailable = false;
				}
			else {
				this.result = this.inputContent;
				this.operator = 5;
				if (this.keyAvailable)
					display_Textfield.setText(Double.toString(this.result));
				this.inputContent = 0;
				this.numOfBit = 0;
				this.alreadyClickedEqual = false;
			}
		}
		// key "+","-","*","/"
		if (this.keyAvailable && e.getActionCommand() == "+" || e.getActionCommand() == "-"
				|| e.getActionCommand() == "*" || e.getActionCommand() == "/" ) {
			if (this.alreadyClickedEqual) {
				this.inputContent = this.result;
				this.isTempNowInput = true;
			} else {
				switch (this.operator) {
				case 1:
					this.result += this.inputContent;
					break;
				case 2:
					this.result -= this.inputContent;
					break;
				case 3:
					this.result *= this.inputContent;
					break;
				case 4: {
					if (this.inputContent == 0) {
						display_Textfield.setText("除数不能为零!");
						this.keyAvailable = false;
					} else
						this.result = this.result / this.inputContent;
				}
				}
				if (this.keyAvailable)
					display_Textfield.setText(Double.toString(this.result));
				this.inputContent = 0;
			}
			if (e.getActionCommand() == "+") {
				this.operator = 1;
			}
			if (e.getActionCommand() == "-") {
				this.operator = 2;
			}
			if (e.getActionCommand() == "*") {
				this.operator = 3;
			}
			if (e.getActionCommand() == "/") {
				this.operator = 4;
			}
			this.numOfBit = 0;
			this.alreadyClickedEqual = false;
		}
		// key "+/-"
		if (this.keyAvailable && e.getActionCommand() == "+/-") {
			this.inputContent = 0 - this.inputContent;
			display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key "sqrt"
		if (this.keyAvailable && e.getActionCommand() == "sqrt") {
			if (this.alreadyClickedEqual) {
				if (this.result >= 0) {
					this.result = Math.sqrt(this.result);
					display_Textfield.setText(Double.toString(this.result));
				} else {
					display_Textfield.setText("负数不得开方！");
					this.keyAvailable = false;
				}
			} else {
				if (this.inputContent >= 0) {
					this.inputContent = Math.sqrt(this.inputContent);
					display_Textfield.setText(Double.toString(this.inputContent));
				} else {
					display_Textfield.setText("函数输入无效!");
					this.keyAvailable = false;
				}
			}
		}
		// key "1/x"
		if (this.keyAvailable && e.getActionCommand() == "1/x") {
			if (this.inputContent == 0) {
				display_Textfield.setText("除数不能为零！");
				this.keyAvailable = false;
			} else {
				this.inputContent = 1 / this.inputContent;
				display_Textfield.setText(Double.toString(this.inputContent));
			}
		}
		// key "ln"
		if (this.keyAvailable && e.getActionCommand() == "ln") {
			if (this.inputContent == 0) {
				display_Textfield.setText("请输入正整数！");
				this.keyAvailable = false;
			} else {
				this.inputContent = Math.log(this.inputContent);
				display_Textfield.setText(Double.toString(this.inputContent));
			}
		}
		// key "exp"
		if (this.keyAvailable && e.getActionCommand() == "exp") {
			this.inputContent = Math.exp(this.inputContent);
			display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key "^2"
		if (this.keyAvailable && e.getActionCommand() == "^2") {
			this.inputContent = this.inputContent * this.inputContent;
			display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key "n！"
		if (this.keyAvailable && e.getActionCommand() == "n!") {
			if (this.inputContent >= 0 && this.inputContent == (int) this.inputContent) {
				this.inputContent = doFactorial((int) this.inputContent);
				display_Textfield.setText(Double.toString(this.inputContent));
			} else {
				display_Textfield.setText("请输入正整数！");
				this.keyAvailable = false;
			}
		}
		// key "%"
		if (this.keyAvailable && e.getActionCommand() == "%") {
			this.inputContent = (this.result * this.inputContent) / 100;
			display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key "="
		if (this.keyAvailable && e.getActionCommand() == "=") {
			this.alreadyClickedEqual = true;
			switch (this.operator) {
			case 1:
				this.result += this.inputContent;
				break;
			case 2:
				this.result -= this.inputContent;
				break;
			case 3:
				this.result *= this.inputContent;
				break;
			case 4: {
				if (this.inputContent == 0) {
					display_Textfield.setText("除数不能为零!");
					this.keyAvailable = false;
				} else
					this.result = this.result / this.inputContent;
			}
/*			case 5: {
				if (this.inputContent <= 0 || this.result <= 0 || this.inputContent != (int) this.inputContent
						|| this.result != (int) this.result) {
					display_Textfield.setText("=case5中调试！");
					this.keyAvailable = false;
				} else {
					this.result = Combinatorial((int) this.result, (int) this.inputContent);
				}
			}*/
			}
			if (this.keyAvailable)
				display_Textfield.setText(Double.toString(this.result));
		}
		// key "C"
		if (e.getActionCommand() == "C") {
			this.numOfBit = 0;
			this.result = 0;
			this.inputContent = 0;
			this.alreadyHaveDot = false;
			this.numOfDecimal = 0;
			this.operator = 1;
			this.keyAvailable = true;
			this.alreadyClickedEqual = false;
			display_Textfield.setText("0.");
		}
		// key "CE"
		if (e.getActionCommand() == "CE") {
			this.numOfBit = 0;
			this.inputContent = 0;
			this.alreadyHaveDot = false;
			this.numOfDecimal = 0;
			this.operator = 1;
			this.keyAvailable = true;
			display_Textfield.setText("0.");
		}

		// key "MS"
		if (this.keyAvailable && e.getActionCommand() == "MS") {
			this.memory = this.inputContent;
			if (this.memory != 0)
				m_Textfield.setText("M");
		}
		// key "MC"
		if (this.keyAvailable && e.getActionCommand() == "MC") {
			this.memory = 0;
			m_Textfield.setText("");
		}
		// key "MR"
		if (this.keyAvailable && e.getActionCommand() == "MR") {
			this.inputContent = this.memory;
			display_Textfield.setText(Double.toString(this.inputContent));
		}
		// key "M+"
		if (this.keyAvailable && e.getActionCommand() == "M+") {
			this.memory += this.inputContent;
			if (this.memory != 0)
				m_Textfield.setText("M");
			else
				m_Textfield.setText("");
		}
		// key "Delete"
		if (this.keyAvailable && e.getActionCommand() == "DEL") {
			if (!this.alreadyClickedEqual) {
				if (this.inputContent != 0) {
					if (this.alreadyHaveDot) {
						if (this.numOfDecimal == -1) {
							this.alreadyHaveDot = false;
							this.numOfDecimal = 0;
						} else {
							String str, str1;
							str = display_Textfield.getText();
							str1 = str.substring(0, this.numOfBit - 1);
							this.numOfBit--;
							this.numOfDecimal++;
							this.inputContent = Double.parseDouble(str1);
							display_Textfield.setText(Double.toString(this.inputContent));
						}
					} else {
						int temp;
						temp = (int) (this.inputContent / 10);
						this.inputContent = (double) temp;
						display_Textfield.setText(Double.toString(this.inputContent));
					}
				}
			}
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public int doFactorial(int n) {
		if (n < 0) {
			return -1;// 传入的数据不合法
		}
		if (n == 0) {
			return 1;
		} else if (n == 1) {// 递归结束的条件
			return 1;
		} else {
			return n * doFactorial(n - 1);
		}
	}

	public int Combinatorial(int n, int m) {
		int result = 0;
		result = doFactorial(n) / doFactorial(m) / doFactorial(n - m);
		return result;
	}

	public static void main(String[] args) {
		BasicCalculator new_cal = new BasicCalculator();
		new_cal.cal();

	}
}
