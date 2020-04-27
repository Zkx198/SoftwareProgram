package calculator;
//张凯鑫 2017111478
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Window.Type;
public class HexadecimalConversion {
	private JFrame Hex_frame;
	private Panel input_output_Panel,Hex_Panel, key_Panel, word_Panel,i_o_H_Panel;
	private Button number1_Button, number2_Button, number3_Button, number4_Button, number5_Button, number6_Button, 
	               number7_Button, number8_Button, number9_Button, number0_Button, numberA_Button, numberB_Button, 
	               numberC_Button, numberD_Button, numberE_Button,numberF_Button;
    private Button in_Binary_Button, out_Binary_Button,in_Octal_Button, out_Octal_Button,
                   in_Decimalism_Button, out_Decimalism_Button, in_Hexadecimal_Button, out_Hexadecimal_Button;
    private Button Del_Button, C_Button, Back_Button;
    private JLabel input_1,output_1,input_2,output_2;
    private TextField display_Textfield_input,display_Textfield_output;
	private int temp;//判断输入为几进制
	
	Font fontOfNumber = new Font("华文行楷", Font.PLAIN, 30);
	Font fontOfWord = new Font("隶书", Font.PLAIN, 20);
	Font fontOfKey = new Font("Times New Roman", Font.ITALIC, 24);
	private JLabel label;
	
	public  HexadecimalConversion(){
		Hex_frame=new JFrame("进制转换计算器");
		Hex_frame.setType(Type.UTILITY);
		Hex_frame.getContentPane().setBackground(Color.BLACK);
		Hex_frame.getContentPane().setForeground(Color.WHITE);
		Hex_frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Hex_frame.setForeground(Color.GRAY);
		Hex_frame.setSize(420, 480);
		Hex_frame.setLocationRelativeTo(null);
		Hex_frame.setBackground(Color.BLACK);
		Hex_frame.setResizable(true);
		Hex_frame.getContentPane().setLayout(new BorderLayout(3, 9));
		Hex_frame.getContentPane().setLayout(new FlowLayout());
		
		word_Panel = new Panel(new GridLayout(4,1,4,2));
		word_Panel.setPreferredSize(new Dimension(80, 178));
		input_output_Panel=new Panel(new GridLayout(2,2,2,6));
		input_output_Panel.setPreferredSize(new Dimension(380, 80));
		Hex_Panel=new Panel(new GridLayout(2,4,2,6));
		Hex_Panel.setPreferredSize(new Dimension(380, 80));
		i_o_H_Panel=new Panel(new GridLayout(2,1,2,8));
		i_o_H_Panel.setPreferredSize(new Dimension(295, 178));
		key_Panel=new Panel(new GridLayout(4,5,6,7));
		key_Panel.setPreferredSize(new Dimension(385, 240));
		
		input_1 =new JLabel(" \u8F93\u5165");
		input_1.setForeground(Color.WHITE);
		input_1.setVerticalAlignment(SwingConstants.BOTTOM);
		input_1.setFont(new Font("隶书", Font.PLAIN, 26));
		output_1=new JLabel(" \u8F93\u51FA");
		output_1.setForeground(Color.WHITE);
		output_1.setFont(new Font("隶书", Font.PLAIN, 26));
		display_Textfield_input=new TextField();
		display_Textfield_input.setForeground(Color.WHITE);
		display_Textfield_input.setBackground(Color.DARK_GRAY);
		display_Textfield_input.setFont(new Font("Times New Roman", Font.ITALIC, 31));
		display_Textfield_input.setEditable(true);
		display_Textfield_output=new TextField();
		display_Textfield_output.setForeground(Color.WHITE);
		display_Textfield_output.setBackground(Color.DARK_GRAY);
		display_Textfield_output.setFont(new Font("Times New Roman", Font.ITALIC, 31));
		display_Textfield_output.setEditable(true);
		word_Panel.add(input_1);
		input_output_Panel.add(display_Textfield_input);
		word_Panel.add(output_1);
		input_output_Panel.add(display_Textfield_output);
		
		input_2=new JLabel(" \u8F93\u5165");
		input_2.setForeground(Color.WHITE);
		input_2.setFont(new Font("隶书", Font.PLAIN, 26));
		output_2=new JLabel(" \u8F93\u51FA");
		output_2.setForeground(Color.WHITE);
		output_2.setFont(new Font("隶书", Font.PLAIN, 26));
		in_Binary_Button = new Button("2进制");
		in_Binary_Button.setBackground(new Color(0, 0, 102));
		out_Binary_Button = new Button("2进制");
		out_Binary_Button.setBackground(new Color(0, 0, 102));
		in_Octal_Button = new Button("8进制");
		in_Octal_Button.setBackground(new Color(0, 0, 102));
		out_Octal_Button = new Button("8进制");
		out_Octal_Button.setBackground(new Color(0, 0, 102));
        in_Decimalism_Button = new Button("10进制");
        in_Decimalism_Button.setBackground(new Color(0, 0, 102));
        out_Decimalism_Button = new Button("10进制");
        out_Decimalism_Button.setBackground(new Color(0, 0, 102));
        in_Hexadecimal_Button = new Button("16进制");
        in_Hexadecimal_Button.setBackground(new Color(0, 0, 102));
        out_Hexadecimal_Button = new Button("16进制");
        out_Hexadecimal_Button.setBackground(new Color(0, 0, 102));
        in_Binary_Button.setFont(new Font("隶书", Font.PLAIN, 20));
        out_Binary_Button.setFont(fontOfWord);
        in_Octal_Button.setFont(fontOfWord);
        out_Octal_Button.setFont(fontOfWord);
        in_Decimalism_Button.setFont(fontOfWord);
        out_Decimalism_Button.setFont(fontOfWord);
        in_Hexadecimal_Button.setFont(fontOfWord);
        out_Hexadecimal_Button.setFont(fontOfWord);
        word_Panel.add(input_2);
        Hex_Panel.add(in_Binary_Button);
        Hex_Panel.add(in_Octal_Button);
        Hex_Panel.add(in_Decimalism_Button);
        Hex_Panel.add(in_Hexadecimal_Button);
        word_Panel.add(output_2);
        Hex_Panel.add(out_Binary_Button);
        Hex_Panel.add(out_Octal_Button);
        Hex_Panel.add(out_Decimalism_Button);
        Hex_Panel.add(out_Hexadecimal_Button);
		
		number0_Button = new Button("0");
		number0_Button.setBackground(Color.DARK_GRAY);
		number0_Button.setForeground(Color.WHITE);
		number1_Button = new Button("1");
		number1_Button.setBackground(Color.DARK_GRAY);
		number2_Button = new Button("2");
		number2_Button.setBackground(Color.DARK_GRAY);
		number3_Button = new Button("3");
		number3_Button.setBackground(Color.DARK_GRAY);
		number4_Button = new Button("4");
		number4_Button.setBackground(Color.DARK_GRAY);
		number5_Button = new Button("5");
		number5_Button.setBackground(Color.DARK_GRAY);
		number6_Button = new Button("6");
		number6_Button.setBackground(Color.DARK_GRAY);
		number7_Button = new Button("7");
		number7_Button.setBackground(Color.DARK_GRAY);
		number8_Button = new Button("8");
		number8_Button.setBackground(Color.DARK_GRAY);
		number9_Button = new Button("9");
		number9_Button.setBackground(Color.DARK_GRAY);
		numberA_Button = new Button("A");
		numberA_Button.setBackground(Color.DARK_GRAY);
		numberB_Button = new Button("B");
		numberB_Button.setBackground(Color.DARK_GRAY);
		numberC_Button = new Button("C");
		numberC_Button.setBackground(Color.DARK_GRAY);
		numberD_Button = new Button("D");
		numberD_Button.setBackground(Color.DARK_GRAY);
		numberE_Button = new Button("E");
		numberE_Button.setBackground(Color.DARK_GRAY);
		numberF_Button = new Button("F");
		numberF_Button.setBackground(Color.DARK_GRAY);
		Back_Button = new Button("Back");
		Back_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		Back_Button.setForeground(Color.WHITE);
		Back_Button.setBackground(new Color(160, 82, 45));
		number0_Button.setFont(fontOfKey);
		number1_Button.setFont(fontOfKey);
		number2_Button.setFont(fontOfKey);
		number3_Button.setFont(fontOfKey);
		number4_Button.setFont(fontOfKey);
		number5_Button.setFont(fontOfKey);
		number6_Button.setFont(fontOfKey);
		number7_Button.setFont(fontOfKey);
		number8_Button.setFont(fontOfKey);
		number9_Button.setFont(fontOfKey);
		numberA_Button.setFont(fontOfKey);
		numberB_Button.setFont(fontOfKey);
		numberC_Button.setFont(fontOfKey);
		numberD_Button.setFont(fontOfKey);
		numberE_Button.setFont(fontOfKey);
		numberF_Button.setFont(fontOfKey);
		
		key_Panel.add(number0_Button);
		key_Panel.add(number1_Button);
		key_Panel.add(number2_Button);
		key_Panel.add(number3_Button);
		Del_Button = new Button("DEL");
		Del_Button.setBackground(new Color(0, 51, 102));
		Del_Button.setForeground(Color.WHITE);
		Del_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		key_Panel.add(Del_Button);
		Del_Button.addActionListener(new Listener24());
		key_Panel.add(number4_Button);
		key_Panel.add(number5_Button);
		key_Panel.add(number6_Button);
		key_Panel.add(number7_Button);
		C_Button = new Button("C");
		C_Button.setBackground(new Color(0, 51, 102));
		C_Button.setForeground(Color.WHITE);
		C_Button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		key_Panel.add(C_Button);
		C_Button.addActionListener(new Listener25());
		key_Panel.add(number8_Button);
		key_Panel.add(number9_Button);
		key_Panel.add(numberA_Button);
		key_Panel.add(numberB_Button);
		label = new JLabel("");
		key_Panel.add(label);
		key_Panel.add(numberC_Button);
		key_Panel.add(numberD_Button);
		key_Panel.add(numberE_Button);
		key_Panel.add(numberF_Button);
		key_Panel.add(Back_Button);
		
		in_Binary_Button.addActionListener(new Listener1());
		in_Octal_Button.addActionListener(new Listener2());
		in_Decimalism_Button.addActionListener(new Listener3());
		in_Hexadecimal_Button.addActionListener(new Listener4());
		out_Binary_Button.addActionListener(new Listener5());
		out_Octal_Button.addActionListener(new Listener6());
		out_Decimalism_Button.addActionListener(new Listener7());
		out_Hexadecimal_Button.addActionListener(new Listener8());
		number0_Button.addActionListener(new Listener9());
		number1_Button.addActionListener(new Listener10());
		number2_Button.addActionListener(new Listener11());
		number3_Button.addActionListener(new Listener12());
		number4_Button.addActionListener(new Listener13());
		number5_Button.addActionListener(new Listener14());
		number6_Button.addActionListener(new Listener15());
		number7_Button.addActionListener(new Listener16());
		number8_Button.addActionListener(new Listener17());
		number9_Button.addActionListener(new Listener18());
		numberA_Button.addActionListener(new Listener19());
		numberB_Button.addActionListener(new Listener20());
		numberC_Button.addActionListener(new Listener21());
		numberD_Button.addActionListener(new Listener22());
		numberE_Button.addActionListener(new Listener23());
		numberF_Button.addActionListener(new Listener26());
		Back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hex_frame.setVisible(false);
				SecondaryPageOne newWindow=new SecondaryPageOne();
				newWindow.setVisible(true);
			}
		});	
		
		i_o_H_Panel.add(input_output_Panel);
		i_o_H_Panel.add(Hex_Panel);
		
		Hex_frame.getContentPane().add(word_Panel,BorderLayout.WEST);
		Hex_frame.getContentPane().add(i_o_H_Panel,BorderLayout.CENTER);
		Hex_frame.getContentPane().add(key_Panel,BorderLayout.SOUTH);
		Hex_frame.setVisible(true);
		
	}
	
	public static boolean isBinary(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>49)
			return false;
			}
			return true;
	}
	public static boolean isOctal(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>55)
			return false;
			}
			return true;
	}
	
	public static boolean isDecimalism(String str){
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr<48 || chr>57)
			return false;
			}
			return true;
	}
	public static int isHexadecimal(String str){
		int temp_1 = 2;
		for(int i=str.length();--i>=0;){
			int chr=str.charAt(i);
			if(chr>47&chr<58)
			{
				temp_1= 1;
			}
			else if(chr>64&chr<70)
			{
				temp_1= 1;
			}
			else 
			{
				temp_1=0;
				break;
			}
	}
	return temp_1;
	}
	public String binary_to_binary(String str)
	{
		if(isBinary(str))
		{
			return str;
		}
		else return "请输入二进制数字！";
	}
	public String binary_to_octal(String str)
	{
		if(isBinary(str))
		{
			String result = binary_to_decimalism(str);
			String result_1 = decimalism_to_octal(result);
			return result_1;
		}
		else return "请输入二进制数字!";	
	}
	public String binary_to_decimalism(String str)
	{
		if(isBinary(str))
		{
			return Integer.parseInt(str,2)+"";
		}
		else return "请输入二进制数字！";
	}
	public String binary_to_hexadecimal(String str)
	{
		if(isBinary(str))
		{
			String result = binary_to_decimalism(str);
			String result_1 = decimalism_to_hexadecimal(result);
			return result_1;
		}
		else return "请输入二进制数字!";
	}
	public String octal_to_binary(String str)
	{
		if(isOctal(str))
		{
			String result = octal_to_decimalism(str);
			String result_1 = decimalism_to_binary(result);
			return result_1;
		}
		else return "请输入八进制数字";
	}
	public String octal_to_octal(String str)
	{
		if(isOctal(str))
		{
			return str;
		}
		else return "请输入八进制数字！";
	}
	public String octal_to_decimalism(String str)
	{
		if(isOctal(str))
		{	
		    return Integer.valueOf(str,8).toString();
		}
		else return "请输入八进制数字！";
	}
	public String octal_to_hexadecimal(String str)
	{
		if(isOctal(str))
		{
			String result = octal_to_decimalism(str);
			String result_1 = decimalism_to_hexadecimal(result);
			return result_1;
		}
		else return "请输入八进制数字";
	}
	public String decimalism_to_binary(String str){
		if(isDecimalism(str)) 
		{
			String binaryNum="";
			int num = Integer.parseInt(str);
			int [] arr=new int[32];
			int  v,j=0;
			if(num==0)
				return binaryNum=binaryNum+"0";
			else{
			for(int  i=31;i>=0;i--)
			{
				v=num&1;
				arr[i]=v;
				num=num>>1;
			}
			one:for(int i=0;i<32;i++)
			{
				if(arr[i]==0&&arr[i+1]!=0)
				{
					j=i+1;
					break one;
				}
			}
			for(int i=j;i<32;i++ )
			{
				binaryNum=binaryNum+arr[i];
			}
			return binaryNum;
			}
		}
		else return "请输入十进制数字！";
		
		
	}
	public String decimalism_to_octal(String str){
		if(isDecimalism(str)) 
		{
			String octalNum="0";
			int num = Integer.parseInt(str);
			int [] arr=new int[11];
			int  v,j=0;
			if(num==0)
				return octalNum=octalNum+"0";
			else{
			for(int  i=10;i>=0;i--)
			{
				v=num&7;
				arr[i]=v;
				num=num>>3;
			}
			one:for(int i=0;i<11;i++)
			{
				if(arr[i]==0&&arr[i+1]!=0)
				{
					j=i+1;
					break one;
				}
			}
			for(int i=j;i<11;i++ )
			{
				octalNum=octalNum+arr[i];
			}
			return octalNum;
			}
		}
		else return "请输入十进制数字！";
	}
	public String decimalism_to_decimalism(String str)
	{
		if(isDecimalism(str)) 
		{
			return str;
		}
		else return "请输入十进制数字！";
	}
    public String decimalism_to_hexadecimal(String str1){
    	if(isDecimalism(str1)) 
    	{
    		String hexadecimalNum="0x";
    		int num = Integer.parseInt(str1);
    	    char [] str={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    		int [] arr=new int[8];
    		int  v,j=0;
    		if(num==0)
    			return hexadecimalNum=hexadecimalNum+"0";
    		else
    		{
    		for(int  i=7;i>=0;i--)
    		{
    			v=num&15;
    			arr[i]=v;
    			num=num>>4;
    		}
    		one:for(int i=0;i<8;i++)
    		{
    			if(arr[i]==0&&arr[i+1]!=0)
    			{
    				j=i+1;
    				break one;
    			}
    		}
    		for(int i=j;i<8;i++ )
    		{
    			hexadecimalNum=hexadecimalNum+str[arr[i]];
    		}
    		return hexadecimalNum;
    		}
    	}
    	else return "请输入十进制数字！";
	}
	public String hexadecimal_to_binary(String str)
	{
		if(isHexadecimal(str)==1)
		{
			String result = hexadecimal_to_decimalism(str);
			String result_1 = decimalism_to_binary(result);
			return result_1;
		}
		else return "请输入十六进制数字";
	}
	public String hexadecimal_to_octal(String str)
	{
		if(isHexadecimal(str)==1)
		{
			String result = hexadecimal_to_decimalism(str);
			String result_1 = decimalism_to_octal(result);
			return result_1;
		}
		else return "请输入十六进制数字";
	}
	public String hexadecimal_to_decimalism(String str)
	{
		if(isHexadecimal(str)==1)
		{
			return Integer.parseInt(str,16)+"";
		}
		else return "请输入十六进制数字";
	}
	public String hexadecimal_to_hexadecimal(String str)
	{
		if(isHexadecimal(str)==1)
		{
			return str;
		}
		else return "请输入十六进制数字！";
	}
	
	public static void main(String[] args){
		new HexadecimalConversion();
	}
	class Listener1 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp = 2;
		}
		
	}
	class Listener2 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp = 8;
		}
		
	}
	class Listener3 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp = 10;
		}
		
	}
	class Listener4 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			temp = 16;
		}
		
	}
	
	class Listener5 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = display_Textfield_input.getText().trim();
			if(temp == 2) {display_Textfield_output.setText(binary_to_binary(num1));temp = 0;}
			if(temp == 8) {display_Textfield_output.setText(octal_to_binary(num1));temp = 0;}
			if(temp == 10) {display_Textfield_output.setText(decimalism_to_binary(num1));temp = 0;}
			if(temp == 16) {display_Textfield_output.setText(hexadecimal_to_binary(num1));temp = 0;}
		}
		
	}
	class Listener6 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = display_Textfield_input.getText().trim();
			if(temp == 2) {display_Textfield_output.setText(binary_to_octal(num1));temp = 0;}
			if(temp == 8) {display_Textfield_output.setText(octal_to_octal(num1));temp = 0;}
			if(temp == 10) {display_Textfield_output.setText(decimalism_to_octal(num1));temp = 0;}
			if(temp == 16) {display_Textfield_output.setText(hexadecimal_to_octal(num1));temp = 0;}
		}
		
	}
	
	class Listener7 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = display_Textfield_input.getText().trim();
			if(temp == 2) {display_Textfield_output.setText(binary_to_decimalism(num1));temp = 0;}
			if(temp == 8) {display_Textfield_output.setText(octal_to_decimalism(num1));temp = 0;}
			if(temp == 10) {display_Textfield_output.setText(decimalism_to_decimalism(num1));temp = 0;}
			if(temp == 16) {display_Textfield_output.setText(hexadecimal_to_decimalism(num1));temp = 0;}
		}
		
	}
	class Listener8 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 =display_Textfield_input.getText().trim();
			if(temp == 2) {display_Textfield_output.setText(binary_to_hexadecimal(num1));temp = 0;}
			if(temp == 8) {display_Textfield_output.setText(octal_to_hexadecimal(num1));temp = 0;}
			if(temp == 10) {display_Textfield_output.setText(decimalism_to_hexadecimal(num1));temp = 0;}
			if(temp == 16) {display_Textfield_output.setText(hexadecimal_to_hexadecimal(num1));temp = 0;}
		}
		
	}
	//0-E按键
	class Listener9 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"0");
		}
		
	}
	
	class Listener10 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"1");
		}
	}
	class Listener11 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"2");
		}
		
	}

	class Listener12 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"3");
		}
		
	}
	class Listener13 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"4");
		}
		
	}
	class Listener14 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"5");
		}
		
	}
	class Listener15 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"6");
		}
		
	}
	class Listener16 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"7");
		}
		
	}
	class Listener17 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"8");
		}
		
	}
	class Listener18 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"9");
		}
		
	}
	class Listener19 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"A");
		}
		
	}
	class Listener20 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"B");
		}
		
	}
	class Listener21 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"C");
		}
		
	}
	class Listener22 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"D");
		}
		
	}
	class Listener23 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"E");
		}
		
	}
	class Listener24 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = display_Textfield_input.getText();
			s = s.substring(0,s.length()-1);
			display_Textfield_input.setText(s);
		}
		
	}
	class Listener25 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText("");
			display_Textfield_output.setText("");
			temp=0;
			
		}
		
	}
	class Listener26 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			display_Textfield_input.setText(display_Textfield_input.getText()+"E");
		}
		
	}
}