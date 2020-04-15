package calculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class HexadecimalConversion {
	JFrame f;
	JPanel [] p=new JPanel[4];
	JButton [] c=new JButton[15];
	JButton [] d=new JButton[8];
	JLabel [] t=new JLabel[4];
	JTextField [] tf=new JTextField[2];
	String [] bt_0 = {"2进制","8进制","10进制","16进制","2进制","8进制","10进制","16进制"};
	String [] bt={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E"};
	int temp;//判断输入为几进制
	public  HexadecimalConversion(){
		f=new JFrame("进制转换计算器");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,420,480);
		f.setLayout(new GridLayout(4,1));
		p[0]=new JPanel(new GridLayout(1,2));
		p[1]=new JPanel(new GridLayout(1,2));
		p[2]=new JPanel(new GridLayout(2,5));
		p[3]=new JPanel(new GridLayout(3,5));
		for(int i=0;i<8;i++)
		{
			d[i]=new JButton(bt_0[i]);
		}
		
		for(int i=0;i<15;i++)
		{
			c[i]=new JButton(bt[i]);
		}
		d[0].addActionListener(new Listener1());
		d[1].addActionListener(new Listener2());
		d[2].addActionListener(new Listener3());
		d[3].addActionListener(new Listener4());
		d[4].addActionListener(new Listener5());
		d[5].addActionListener(new Listener6());
		d[6].addActionListener(new Listener7());
		d[7].addActionListener(new Listener8());
		c[0].addActionListener(new Listener9());
		c[1].addActionListener(new Listener10());
		c[2].addActionListener(new Listener11());
		c[3].addActionListener(new Listener12());
		c[4].addActionListener(new Listener13());
		c[5].addActionListener(new Listener14());
		c[6].addActionListener(new Listener15());
		c[7].addActionListener(new Listener16());
		c[8].addActionListener(new Listener17());
		c[9].addActionListener(new Listener18());
		c[10].addActionListener(new Listener19());
		c[11].addActionListener(new Listener20());
		c[12].addActionListener(new Listener21());
		c[13].addActionListener(new Listener22());
		c[14].addActionListener(new Listener23());
		t[0]=new JLabel("输入");
		t[1]=new JLabel("输出");
		t[2]=new JLabel("输入");
		t[3]=new JLabel("输出");
		tf[0]=new JTextField();
		tf[1]=new JTextField();
		for(int i=0;i<2;i++)
		{
			p[i].add(t[i]);
			p[i].add(tf[i]);
		}
		p[2].add(t[2]);
		for(int i=0;i<4;i++)
		{
			p[2].add(d[i]);
		}
		p[2].add(t[3]);
		for(int i=4;i<8;i++)
		{
			p[2].add(d[i]);
		}
		for(int i=0;i<15;i++)
		{
			p[3].add(c[i]);
		}
		for(int i=0;i<4;i++)
		{
			f.add(p[i]);
		}
		f.setVisible(true);
		
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
			String num1 = tf[0].getText().trim();
			if(temp == 2) {tf[1].setText(binary_to_binary(num1));temp = 0;}
			if(temp == 8) {tf[1].setText(octal_to_binary(num1));temp = 0;}
			if(temp == 10) {tf[1].setText(decimalism_to_binary(num1));temp = 0;}
			if(temp == 16) {tf[1].setText(hexadecimal_to_binary(num1));temp = 0;}
		}
		
	}
	class Listener6 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = tf[0].getText().trim();
			if(temp == 2) {tf[1].setText(binary_to_octal(num1));temp = 0;}
			if(temp == 8) {tf[1].setText(octal_to_octal(num1));temp = 0;}
			if(temp == 10) {tf[1].setText(decimalism_to_octal(num1));temp = 0;}
			if(temp == 16) {tf[1].setText(hexadecimal_to_octal(num1));temp = 0;}
		}
		
	}
	
	class Listener7 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = tf[0].getText().trim();
			if(temp == 2) {tf[1].setText(binary_to_decimalism(num1));temp = 0;}
			if(temp == 8) {tf[1].setText(octal_to_decimalism(num1));temp = 0;}
			if(temp == 10) {tf[1].setText(decimalism_to_decimalism(num1));temp = 0;}
			if(temp == 16) {tf[1].setText(hexadecimal_to_decimalism(num1));temp = 0;}
		}
		
	}
	class Listener8 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String num1 = tf[0].getText().trim();
			if(temp == 2) {tf[1].setText(binary_to_hexadecimal(num1));temp = 0;}
			if(temp == 8) {tf[1].setText(octal_to_hexadecimal(num1));temp = 0;}
			if(temp == 10) {tf[1].setText(decimalism_to_hexadecimal(num1));temp = 0;}
			if(temp == 16) {tf[1].setText(hexadecimal_to_hexadecimal(num1));temp = 0;}
		}
		
	}
	class Listener9 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[0]);
		}
		
	}
	
	class Listener10 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[1]);
		}
	}
	class Listener11 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[2]);
		}
		
	}

	class Listener12 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[3]);
		}
		
	}
	class Listener13 implements ActionListener{
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[4]);
		}
		
	}
	class Listener14 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[5]);
		}
		
	}
	class Listener15 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[6]);
		}
		
	}
	class Listener16 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[7]);
		}
		
	}
	class Listener17 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[8]);
		}
		
	}
	class Listener18 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[9]);
		}
		
	}
	class Listener19 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[10]);
		}
		
	}
	class Listener20 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[11]);
		}
		
	}
	class Listener21 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[12]);
		}
		
	}
	class Listener22 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[13]);
		}
		
	}
	class Listener23 implements ActionListener{
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf[0].setText(tf[0].getText()+bt[14]);
		}
		
	}
		
}