package calculator;
//张凯鑫 2017111478
import java.awt.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.awt.Window.Type;

import javax.swing.JLabel;
import java.util.ArrayList;

public class PluralComputing extends WindowAdapter implements ActionListener {
	private Frame plu_Frame;
	private Panel command_Panel, key_Panel, intergration_Panel, displayOutput_Panel_input;
	private TextField display_Textfield_input;
	private Button number1_Button, number2_Button, number3_Button, number4_Button, number5_Button, number6_Button,
			number7_Button, number8_Button, number9_Button, number0_Button;
	private Button plus_Button, minus_Button, multi_Button, div_Button, equal_Button, dot_Button, i_Button, negative_Button, back_Button;
	private Button Del_Button, C_Button;
	
	private ArrayList plural=new ArrayList();
	private ArrayList symbol=new ArrayList();	
	Font fontOfNumber = new Font("华文行楷", Font.PLAIN, 26);
	Font fontOfOutput = new Font("华文行楷", Font.PLAIN, 32);
	Font fontOfKey = new Font("Times New Roman", Font.ITALIC, 18);
	Font fontOfCommand = new Font("Times New Roman", Font.ITALIC, 18);
	private JLabel lblNewLabel;
	private JLabel label;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void plural() {
		plu_Frame = new Frame("复数计算器");
		plu_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		plu_Frame.setType(Type.UTILITY);
		plu_Frame.setForeground(new Color(0, 0, 0));
		plu_Frame.setSize(420, 480);
		plu_Frame.setLocation(200, 200);
		plu_Frame.setBackground(Color.LIGHT_GRAY);
		plu_Frame.setResizable(true);
		plu_Frame.setLayout(new BorderLayout(3, 1));

		command_Panel = new Panel(new GridLayout(1, 2, 9, 10));
		key_Panel = new Panel(new GridLayout(4, 5, 4, 10));
		FlowLayout fl_intergration_Panel = new FlowLayout();
		intergration_Panel = new Panel(fl_intergration_Panel);
		displayOutput_Panel_input = new Panel(new FlowLayout());
		intergration_Panel.add(command_Panel, BorderLayout.NORTH);
		intergration_Panel.add(key_Panel, BorderLayout.SOUTH);
		displayOutput_Panel_input.setPreferredSize(new Dimension(260, 90));
		key_Panel.setPreferredSize(new Dimension(380, 270));
		command_Panel.setPreferredSize(new Dimension(380, 55));
		intergration_Panel.setPreferredSize(new Dimension(380, 345));
		
		label = new JLabel("\u590D\u6570\u5185\u7684\u6B63\u8D1F\u53F7\u8BF7\u6309+/-\u6309\u952E\uFF0C\u6309\u4E00\u6B21\u4E3A-\uFF0C\u4E24\u6B21\u4E3A+");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("华文宋体", Font.BOLD, 16));
		label.setPreferredSize(new Dimension(400, 35));
		displayOutput_Panel_input.add(label);

		display_Textfield_input = new TextField();
		display_Textfield_input.setPreferredSize(new Dimension(380, 40));
		display_Textfield_input.setText("请输入复数,如1+1i");
		display_Textfield_input.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 33));
		displayOutput_Panel_input.add(display_Textfield_input);
		plu_Frame.add(displayOutput_Panel_input, BorderLayout.NORTH);
		plu_Frame.add(intergration_Panel, BorderLayout.SOUTH);
		
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
		number1_Button.addActionListener(new Listener1());
		number2_Button.addActionListener(new Listener2());
		number3_Button.addActionListener(new Listener3());
		number4_Button.addActionListener(new Listener4());
		number5_Button.addActionListener(new Listener5());
		number6_Button.addActionListener(new Listener6());
		number7_Button.addActionListener(new Listener7());
		number8_Button.addActionListener(new Listener8());
		number9_Button.addActionListener(new Listener9());
		number0_Button.addActionListener(new Listener0());

		div_Button = new Button("/");
		multi_Button = new Button("*");
		minus_Button = new Button("-");
		plus_Button = new Button("+");
		equal_Button = new Button("=");
		dot_Button = new Button(".");
		negative_Button = new Button("+/-");
		i_Button = new Button("i");
		back_Button = new Button("返回");
		back_Button.setForeground(new Color(0, 0, 0));
		back_Button.setBackground(new Color(219, 112, 147));
		div_Button.setForeground(Color.red);
		multi_Button.setForeground(Color.red);
		minus_Button.setForeground(Color.red);
		plus_Button.setForeground(Color.red);
		equal_Button.setForeground(Color.red);
		dot_Button.setForeground(Color.red);
		negative_Button.setForeground(Color.red);
		multi_Button.setFont(fontOfKey);
		minus_Button.setFont(fontOfKey);
		plus_Button.setFont(fontOfKey);
		equal_Button.setFont(fontOfKey);
		dot_Button.setFont(fontOfKey);
		negative_Button.setFont(fontOfKey);
		i_Button.setFont(fontOfKey);
		back_Button.setFont(fontOfKey);
		i_Button.addActionListener(new Listener10());
		dot_Button.addActionListener(new Listener11());
		negative_Button.addActionListener(new Listener12());	
		plus_Button.addActionListener(new Listener13());
		minus_Button.addActionListener(new Listener14());
		multi_Button.addActionListener(new Listener15());
		div_Button.addActionListener(new Listener16());
		equal_Button.addActionListener(new Listener17());
		back_Button.addActionListener(new Listener18());
		
		key_Panel.add(number7_Button);
		key_Panel.add(number8_Button);
		key_Panel.add(number9_Button);
		key_Panel.add(plus_Button);
		key_Panel.add(minus_Button);
		key_Panel.add(number4_Button);
		key_Panel.add(number5_Button);
		key_Panel.add(number6_Button);
		key_Panel.add(multi_Button);
		key_Panel.add(div_Button);
		key_Panel.add(number1_Button);
		key_Panel.add(number2_Button);
		key_Panel.add(number3_Button);
		key_Panel.add(i_Button);
		lblNewLabel = new JLabel("");
		key_Panel.add(lblNewLabel);
		key_Panel.add(number0_Button);
		key_Panel.add(negative_Button);
		key_Panel.add(dot_Button);
		
		key_Panel.add(equal_Button);
		key_Panel.add(back_Button);

		Del_Button = new Button("DEL");
		C_Button = new Button("C");
		Del_Button.setFont(fontOfCommand);
		C_Button.setFont(fontOfCommand);
		Del_Button.addActionListener(new Listener19());
		C_Button.addActionListener(new Listener20());

		command_Panel.add(Del_Button);
		command_Panel.add(C_Button);

		plu_Frame.setVisible(true);
		plu_Frame.addWindowListener(this);

	}
	
	class Listener0 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("0");
			}
			else
			{
				display_Textfield_input.setText(str+"0");
			}
		}	
	}
	class Listener1 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("1");
			}
			else
			{
				display_Textfield_input.setText(str+"1");
			}
		}	
	}
	class Listener2 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("2");
			}
			else
			{
				display_Textfield_input.setText(str+"2");
			}
			
		}	
	}
	class Listener3 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("3");
			}
			else
			{
				display_Textfield_input.setText(str+"3");
			}
		}	
	}
	class Listener4 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("4");
			}
			else
			{
				display_Textfield_input.setText(str+"4");
			}
		}	
	}
	class Listener5 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
            if(str.endsWith("i"))
			{
				display_Textfield_input.setText("5");
			}
			else
			{
				display_Textfield_input.setText(str+"5");
			}
		}	
	}
	class Listener6 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("6");
			}
			else
			{
				display_Textfield_input.setText(str+"6");
			}
		}	
	}
	class Listener7 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("数"))
			{
				display_Textfield_input.setText("7");
			}
			else
			{
				display_Textfield_input.setText(str+"7");
			}
		}	
	}
	class Listener8 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("8");
			}
			else
			{
				display_Textfield_input.setText(str+"8");
			}
		}	
	}
	class Listener9 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			String str1=str.substring(0,str.length()-1);
			if(str1=="i")
			{
				display_Textfield_input.setText("9");
			}
			else
			{
				display_Textfield_input.setText(str+"9");
			}
		}	
	}
	class Listener10 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("i");
			}
			else
			{
				display_Textfield_input.setText(str+"i");
			}
		}	
	}
	class Listener11 implements ActionListener{	//增加小数点	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText("0.");
			}
			else
			{
				display_Textfield_input.setText(str+".");
			}
		}	
	}
	class Listener12 implements ActionListener{	//+/-按键按一次为负号，按两次为正号	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			String str1=str.substring(0,str.length()-1);
			if(str.endsWith("-"))
			{
				display_Textfield_input.setText(str1+"+");
			}
			else
			{
				display_Textfield_input.setText(str+"-");
			}
		}	
	}
	class Listener13 implements ActionListener{	//加法按键，按下后存储输入为第一个复数，并清空	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			symbol.add("1");
			plural.add(display_Textfield_input.getText());
			display_Textfield_input.setText("请输入复数,如1+1i");
		}	
	}
	class Listener14 implements ActionListener{	//减法按键，按下后存储输入复数，并清空	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			symbol.add("2");
			plural.add(display_Textfield_input.getText());
			display_Textfield_input.setText("请输入复数,如1+1i");
		}	
	}
	class Listener15 implements ActionListener{	//乘法按键，按下后存储输入复数，并清空	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			symbol.add("3");
			plural.add(display_Textfield_input.getText());
			display_Textfield_input.setText("请输入复数,如1+1i");
		}	
	}
	class Listener16 implements ActionListener{	//除法按键，按下后存储输入复数，并清空	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			symbol.add("4");
			plural.add(display_Textfield_input.getText());
			display_Textfield_input.setText("请输入复数,如1+1i");
		}	
	}
	class Listener17 implements ActionListener{	//等号按键，按下后存储输入复数，并计算结果	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			plural.add(display_Textfield_input.getText());
			PluralComputingDetail z=new PluralComputingDetail((String)plural.get(0));
			for(int i=0; i< symbol.size(); i++)
			{
				PluralComputingDetail x = new PluralComputingDetail(z.toString());
				PluralComputingDetail y = new PluralComputingDetail((String)plural.get(i+1));
				if(symbol.get(i)=="1")
				{
				    z = PluralComputingDetail.Plus(x, y);
				}
				if(symbol.get(i)=="2")
				{
					z = PluralComputingDetail.Mins(x, y);
				}
				if(symbol.get(i)=="3")
				{
					z = PluralComputingDetail.Multi(x, y);
				}
				if(symbol.get(i)=="4")
				{
					z = PluralComputingDetail.Div(x, y);
				}
				
			}
			display_Textfield_input.setText(z+"");
			symbol.clear();
			plural.clear();
		}	
	}
	class Listener18 implements ActionListener{	//返回键 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			plu_Frame.setVisible(false);
			SecondaryPageOne newWindow=new SecondaryPageOne();
			newWindow.setVisible(true);
		}	
	}	
	class Listener19 implements ActionListener{	//删除键	 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = display_Textfield_input.getText();
			if(str.endsWith("i"))
			{
				display_Textfield_input.setText(str);
			}
			else
			{
				display_Textfield_input.setText(str.substring(0,str.length() - 1));
			}
		}	
	}
	class Listener20 implements ActionListener{	//清空键 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			symbol.clear();
			plural.clear();
			display_Textfield_input.setText("");
		}	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		PluralComputing new_plu = new PluralComputing();
		new_plu.plural();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
