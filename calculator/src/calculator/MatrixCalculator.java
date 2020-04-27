package calculator;
//张凯鑫 2017111478
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Window.Type;

public class MatrixCalculator extends WindowAdapter {

	private Frame Matr_Frame;
	private Panel display_Panel,input_Panel,key_Panel,common_Panel,button_Panel;
	private TextArea display_input_TextField,display_output_TextField,input_TextField;
	private Button number0_Button,number1_Button,number2_Button,number3_Button,number4_Button,
	               number5_Button,number6_Button,number7_Button,number8_Button,number9_Button,
	               dot_Button,equal_Button,DEL_Button,C_Button,back_Button;
	private Button comma_Button;//逗号分隔输入的数字
	private Button inverse_Button,transpose_Button,deteminant_Button,adjoint_Button,rank_Button,
	               trace_Button,plus_Button,mins_Button,multiply_Button;//功能按键
	private Button choice_Button;//选择m*n矩阵
	private int a,b;//输入矩阵的行列数
	private int a_1;//*时存储结果的行数
	private String matrix_string,output_string,matrix_string_1;//存储输入A矩阵、结果、B矩阵的字符串
	private int up=0,down=0;
	private int symbol=0;//记录+-*
	private double [][]matrix_A={{0,0,0,0,0},
			                    {0,0,0,0,0},
			                    {0,0,0,0,0},
			                    {0,0,0,0,0},
			                    {0,0,0,0,0}};
	private double [][]matrix_B={{0,0,0,0,0},
                                 {0,0,0,0,0},
                                 {0,0,0,0,0},
                                 {0,0,0,0,0},
                                 {0,0,0,0,0}};
	private double [][]matrix_result={{0,0,0,0,0},
                                      {0,0,0,0,0},
                                      {0,0,0,0,0},
                                      {0,0,0,0,0},
                                      {0,0,0,0,0}};
	private double [][]bridge={{0,0,0,0,0,0,0,0,0,0},
			                   {0,0,0,0,0,0,0,0,0,0},
	                    	   {0,0,0,0,0,0,0,0,0,0},
			                   {0,0,0,0,0,0,0,0,0,0},
	                    	   {0,0,0,0,0,0,0,0,0,0}};
	private JLabel label;
	/**
	 * Create the frame.
	 */
	public void Matrix() {
		Matr_Frame=new Frame("矩阵计算器");
		Matr_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Matr_Frame.setType(Type.UTILITY);
		Matr_Frame.setForeground(Color.WHITE);
		Matr_Frame.setSize(420, 480);
		Matr_Frame.setBackground(Color.BLACK);
		Matr_Frame.setResizable(true);
		Matr_Frame.setLocationRelativeTo(null);
		Matr_Frame.setLayout(new BorderLayout(3,1));
		
		display_Panel= new Panel(new FlowLayout());
		display_Panel.setPreferredSize(new Dimension(70, 120));
		display_input_TextField=new TextArea("请选择矩阵阶数\n并在下方输入矩阵，\n用逗号分隔开");
		display_input_TextField.setFont(new Font("楷体", Font.PLAIN, 18));
		display_input_TextField.setPreferredSize(new Dimension(187, 112));
		display_input_TextField.setBackground(Color.GRAY);
		display_input_TextField.setEditable(false);
		display_output_TextField=new TextArea("结果");
		display_output_TextField.setPreferredSize(new Dimension(187, 112));
		display_output_TextField.setBackground(Color.GRAY);
		display_output_TextField.setEditable(false);
		display_Panel.add(display_input_TextField);
		display_Panel.add(display_output_TextField);
		
		input_Panel= new Panel(new FlowLayout());
		input_TextField= new TextArea();
		input_TextField.setPreferredSize(new Dimension(380, 35));
		input_TextField.setBackground(Color.BLACK);
		input_Panel.add(input_TextField);
		
		common_Panel=new Panel(new GridLayout(1,3,2,8));
		common_Panel.setPreferredSize(new Dimension(380, 37));
		DEL_Button= new Button("DEL");
		DEL_Button.setForeground(Color.BLACK);
		DEL_Button.setBackground(Color.GRAY);
		C_Button= new Button("C");
		C_Button.setForeground(Color.BLACK);
		C_Button.setBackground(Color.GRAY);
		choice_Button= new Button("阶数");
		choice_Button.setForeground(Color.WHITE);
		choice_Button.setBackground(new Color(0, 51, 51));
		common_Panel.add(DEL_Button);
		common_Panel.add(C_Button);
		common_Panel.add(choice_Button);
		
		key_Panel= new Panel(new GridLayout(4,6,4,10));
		key_Panel.setPreferredSize(new Dimension(380, 205));
		number0_Button= new Button("0");
		number0_Button.setBackground(Color.DARK_GRAY);
		number1_Button= new Button("1");
		number1_Button.setBackground(Color.DARK_GRAY);
		number2_Button= new Button("2");
		number2_Button.setBackground(Color.DARK_GRAY);
		number3_Button= new Button("3");
		number3_Button.setBackground(Color.DARK_GRAY);
		number4_Button= new Button("4");
		number4_Button.setBackground(Color.DARK_GRAY);
		number5_Button= new Button("5");
		number5_Button.setBackground(Color.DARK_GRAY);
		number6_Button= new Button("6");
		number6_Button.setBackground(Color.DARK_GRAY);
		number7_Button= new Button("7");
		number7_Button.setBackground(Color.DARK_GRAY);
		number8_Button= new Button("8");
		number8_Button.setBackground(Color.DARK_GRAY);
		number9_Button= new Button("9");
		number9_Button.setBackground(Color.DARK_GRAY);
		dot_Button= new Button(".");
		dot_Button.setFont(new Font("Dialog", Font.BOLD, 28));
		dot_Button.setBackground(Color.DARK_GRAY);
		equal_Button= new Button("=");
		equal_Button.setBackground(new Color(0, 0, 102));
		equal_Button.setForeground(Color.WHITE);
		inverse_Button= new Button("A-1");
		inverse_Button.setBackground(new Color(0, 0, 102));
		inverse_Button.setForeground(Color.WHITE);
		transpose_Button= new Button("Aт");
		transpose_Button.setBackground(new Color(0, 0, 102));
		transpose_Button.setForeground(Color.WHITE);
		deteminant_Button= new Button("|A|");
		deteminant_Button.setBackground(new Color(0, 0, 102));
		deteminant_Button.setForeground(Color.WHITE);
		adjoint_Button= new Button("A*");
		adjoint_Button.setBackground(new Color(0, 0, 102));
		adjoint_Button.setForeground(Color.WHITE);
		rank_Button= new Button("Ar");
		rank_Button.setBackground(new Color(0, 0, 102));
		rank_Button.setForeground(Color.WHITE);
		trace_Button= new Button("tr(A)");
		trace_Button.setBackground(new Color(0, 0, 102));
		trace_Button.setForeground(Color.WHITE);
		plus_Button= new Button("+");
		plus_Button.setBackground(new Color(0, 0, 102));
		plus_Button.setForeground(Color.WHITE);
		mins_Button= new Button("-");
		mins_Button.setBackground(new Color(0, 0, 102));
		mins_Button.setForeground(Color.WHITE);
		multiply_Button= new Button("*");
		multiply_Button.setBackground(new Color(0, 0, 102));
		multiply_Button.setForeground(Color.WHITE);
		back_Button= new Button("Back");
		back_Button.setForeground(Color.WHITE);
		back_Button.setBackground(new Color(160, 82, 45));
		key_Panel.add(number7_Button);
		key_Panel.add(number8_Button);
		key_Panel.add(number9_Button);
		key_Panel.add(inverse_Button);
		key_Panel.add(transpose_Button);
		key_Panel.add(deteminant_Button);
		key_Panel.add(number4_Button);
		key_Panel.add(number5_Button);
		key_Panel.add(number6_Button);
		key_Panel.add(adjoint_Button);
		key_Panel.add(rank_Button);
		key_Panel.add(trace_Button);
		key_Panel.add(number1_Button);
		key_Panel.add(number2_Button);
		key_Panel.add(number3_Button);
		key_Panel.add(plus_Button);
		key_Panel.add(mins_Button);
		key_Panel.add(multiply_Button);
		key_Panel.add(number0_Button);
		key_Panel.add(dot_Button);
		comma_Button= new Button(",");
		comma_Button.setFont(new Font("Dialog", Font.BOLD, 30));
		comma_Button.setBackground(Color.DARK_GRAY);
		key_Panel.add(comma_Button);
		comma_Button.addActionListener(new Listener_comma());
		key_Panel.add(equal_Button);
		label = new JLabel("");
		key_Panel.add(label);
		key_Panel.add(back_Button);
		
		button_Panel= new Panel(new FlowLayout());
		button_Panel.setPreferredSize(new Dimension(420, 258));
		button_Panel.add(common_Panel,BorderLayout.NORTH);
		button_Panel.add(key_Panel,BorderLayout.SOUTH);
		
		number0_Button.addActionListener(new Listener_0());
		number1_Button.addActionListener(new Listener_1());
		number2_Button.addActionListener(new Listener_2());
		number3_Button.addActionListener(new Listener_3());
		number4_Button.addActionListener(new Listener_4());
		number5_Button.addActionListener(new Listener_5());
		number6_Button.addActionListener(new Listener_6());
		number7_Button.addActionListener(new Listener_7());
		number8_Button.addActionListener(new Listener_8());
		number9_Button.addActionListener(new Listener_9());
		dot_Button.addActionListener(new Listener_dot());
		equal_Button.addActionListener(new Listener_equal());
		DEL_Button.addActionListener(new Listener_del());
		C_Button.addActionListener(new Listener_C());
		inverse_Button.addActionListener(new Listener_inverse());
		transpose_Button.addActionListener(new Listener_transpose());
		deteminant_Button.addActionListener(new Listener_determinant());
		adjoint_Button.addActionListener(new Listener_adjoint());
		rank_Button.addActionListener(new Listener_rank());
		trace_Button.addActionListener(new Listener_trace());
        plus_Button.addActionListener(new Listener_plus());
        mins_Button.addActionListener(new Listener_mins());
        multiply_Button.addActionListener(new Listener_multiply());
        choice_Button.addActionListener(new Listener_choice());
        back_Button.addActionListener(new Listener_back());
        
        Matr_Frame.add(input_Panel,BorderLayout.CENTER);
        Matr_Frame.add(display_Panel,BorderLayout.NORTH);
		Matr_Frame.add(button_Panel,BorderLayout.SOUTH);
		Matr_Frame.setVisible(true);
		Matr_Frame.setLocationRelativeTo(null);
		Matr_Frame.addWindowListener(this);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MatrixCalculator new_matr = new MatrixCalculator();
		new_matr.Matrix();
	}
    
	public void ToMatrix(String string)
	{
        String[] temp = string.split(",");
        int num = temp.length;
        if(num!=a*b)
        {
        	display_input_TextField.setText("请重新输入完整的矩阵，\n用逗号分隔开");
        }
        else
        {
        	matrix_string="矩阵A\n";
        	for(int i=0; i<a; i++)
    		{
    			for(int j=0; j<b; j++)
    			{
    				matrix_A[i][j]=Double.parseDouble(temp[i*b+j]);
    				fracktion(matrix_A[i][j]);
    				if(down!=0){
    					matrix_string=matrix_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
					}else{
						matrix_string=matrix_string+String.valueOf(up)+" ";
					}
    			}
    			matrix_string=matrix_string+"\n";
    		}
        	display_input_TextField.setText(matrix_string);
        }
	}
	public void ToMatrix_1(String string)
	{
		String[] temp = string.split(",");
        int num = temp.length;
        if(num!=a*b)
        {
        	display_input_TextField.setText("请重新输入完整的矩阵，\n用逗号分隔开");
        }
        else
        {
        	matrix_string_1=matrix_string+"矩阵B\n";
        	for(int i=0; i<a; i++)
    		{
    			for(int j=0; j<b; j++)
    			{
    				matrix_B[i][j]=Double.parseDouble(temp[i*b+j]);
    				fracktion(matrix_B[i][j]);
    				if(down!=0){
    					matrix_string_1=matrix_string_1+String.valueOf(up)+"/"+String.valueOf(down)+" ";
					}else{
						matrix_string_1=matrix_string_1+String.valueOf(up)+" ";
					}
    			}
    			matrix_string_1=matrix_string_1+"\n";
    		}
        	display_input_TextField.setText(matrix_string_1);
        }
	}
	public void Inverse()
	{
		double Asum=0;
		int flag=0,p=1;
		for(int d=0;d<a;d++)
			for(int f=0;f<b;f++)
				flag+=(int)matrix_A[d][f];
		if(flag!=0)
		{
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
				{
					if(j!=i)
					for(int k=0;k<5;k++)
					{
						if(k!=i)
						if(k!=j)
						for(int m=0;m<5;m++)
						{
							if(m!=i)
							if(m!=j)
							if(m!=k)
							for(int n=0;n<5;n++)
							{
								if(n!=i)
								if(n!=j)
								if(n!=k)
								if(n!=m)
								{
									Asum+=Math.pow(-1, (int)(p/2))*matrix_A[0][i]*matrix_A[1][j]*matrix_A[2][k]*matrix_A[3][m]*matrix_A[4][n];
									p++;
									if(p==24){p=2;}
								}
							}
						}
					}
				}
			if((int)Asum==0){
				display_input_TextField.setText("|A|的值等于0，\n不能求A-1！");
			}
			else{
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						bridge[i][j]=matrix_A[i][j];
					}
				}
				for(int j=b;j<2*b;j++){
					bridge[j-b][j]=1;
				}
				b+=b;
				double flag11=0,p1=0;
				for(int i=0,n=0;(i<a-1)&&(n<b);i++,n++){
					for(int j=i+1;j<a;j++){
						if(bridge[i][n]==0){
							if(bridge[i+1][n]!=0){
								for(int m=0;m<b;m++){
									flag11=bridge[i][m];
									bridge[i][m]=bridge[i+1][m];
									bridge[i+1][m]=flag11;
								}	
							}
							i--;
						}else{
							flag11=(bridge[j][n]/bridge[i][n]);
							for(int k=n;k<b;k++){
								bridge[j][k]-=flag11*bridge[i][k];
							}
						}	
					}
				}
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						if(Math.abs(bridge[i][j])>0.0000001){
							flag11=bridge[i][j];
							for(int k=j;k<b;k++){
								bridge[i][k]/=flag11;
							}
							for(int m=i-1;m>=0;m--){
								p1=bridge[m][j]/bridge[i][j];
								for(int n=j;n<b;n++){
									bridge[m][n]-=p1*bridge[i][n];
								}
							}
							break;
						}
					}
				}
				output_string="";
				for(int i=0;i<a;i++){
					for(int j=b/2;j<b;j++){
						fracktion(bridge[i][j]);
						if(down!=0){
							output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
						}else{
							output_string=output_string+String.valueOf(up)+" ";
						}
					}
					output_string=output_string+"\n";
				}
				display_output_TextField.setText("A的逆矩阵为\n"+output_string);
			}
		}	
	}				
	public void Transpose()
	{
		int flag=0;
		
		for(int d=0;d<a;d++)
			for(int f=0;f<b;f++)
				flag+=(int)matrix_A[d][f];
		if(flag!=0)
		{
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++)
				{
					matrix_result[j][i]=matrix_A[i][j];
				}
			output_string="";
			for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
					fracktion(matrix_result[i][j]);
					if(down!=0){
						output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
					}else{
						output_string=output_string+String.valueOf(up)+" ";
					}
				}
				output_string=output_string+"\n";
			}
			display_output_TextField.setText("A的转置为\n"+output_string);
		}
	}
	public void Determinant()
	{
		double Asum=0;
		int p=1,flag=0;
		
		for(int d=0;d<a;d++)
			for(int f=0;f<b;f++)
				flag+=(int)matrix_A[d][f];
		if(flag!=0)
		{
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
				{
					if(j!=i)
					for(int k=0;k<5;k++)
					{
						if(k!=i)
						if(k!=j)
						for(int m=0;m<5;m++)
						{
							if(m!=i)
							if(m!=j)
							if(m!=k)
							for(int n=0;n<5;n++)
							{
								if(n!=i)
								if(n!=j)
								if(n!=k)
								if(n!=m)
								{
									Asum+=Math.pow(-1, (int)(p/2))*matrix_A[0][i]*matrix_A[1][j]*matrix_A[2][k]*matrix_A[3][m]*matrix_A[4][n];
									p++;
									if(p==24){p=2;}
								}
							}
						}
					}
				}
			fracktion(Asum);
			if(down!=0){
				display_output_TextField.setText("方阵A的行列式\n|A|="+String.valueOf(up)+"/"+String.valueOf(down));
			}else{
				display_output_TextField.setText("方阵A的行列式\n|A|="+String.valueOf(up));
			}
		}
	}
 	public void Adjoint()
 	{
 		double Asum=0;
		int p=1,flag=0;
		
		for(int d=0;d<a;d++)
			for(int f=0;f<b;f++)
				flag+=(int)matrix_A[d][f];
		if(flag!=0)
		{
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
				{
					if(j!=i)
					for(int k=0;k<5;k++)
					{
						if(k!=i)
						if(k!=j)
						for(int m=0;m<5;m++)
						{
							if(m!=i)
							if(m!=j)
							if(m!=k)
							for(int n=0;n<5;n++)
							{
								if(n!=i)
								if(n!=j)
								if(n!=k)
								if(n!=m)
								{
									Asum+=Math.pow(-1, (int)(p/2))*matrix_A[0][i]*matrix_A[1][j]*matrix_A[2][k]*matrix_A[3][m]*matrix_A[4][n];
									p++;
									if(p==24){p=2;}
								}
							}
						}
					}
				}
			if((int)Asum==0){
				display_input_TextField.setText("|A|的值等于0，\n不能求A*！");
			}
			else{
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						bridge[i][j]=matrix_A[i][j];
					}
				}
				for(int j=b;j<2*b;j++){
					bridge[j-b][j]=1;
				}
				b+=b;
				double flag11=0,p1=0;
				
				for(int i=0,n=0;(i<a-1)&&(n<b);i++,n++){
					for(int j=i+1;j<a;j++){
						if(bridge[i][n]==0){
							if(bridge[i+1][n]!=0){
								for(int m=0;m<b;m++){
									flag11=bridge[i][m];
									bridge[i][m]=bridge[i+1][m];
									bridge[i+1][m]=flag11;
								}	
							}
							i--;
						}else{
							flag11=(bridge[j][n]/bridge[i][n]);
							for(int k=n;k<b;k++){
								bridge[j][k]-=flag11*bridge[i][k];
							}
						}	
					}
				}
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						if(Math.abs(bridge[i][j])>0.0000001){
							flag11=bridge[i][j];
							for(int k=j;k<b;k++){
								bridge[i][k]/=flag11;
							}
							for(int m=i-1;m>=0;m--){
								p1=bridge[m][j]/bridge[i][j];
								for(int n=j;n<b;n++){
									bridge[m][n]-=p1*bridge[i][n];
								}
							}
							break;
						}
					}
				}
				output_string = "";
				for(int i=0;i<a;i++){
					for(int j=b/2;j<b;j++){
						fracktion(bridge[i][j]*Asum);
						if(down!=0){
							output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
						}else{
							output_string=output_string+String.valueOf(up)+" ";
						}
					}
					output_string=output_string+"\n";
				}
				display_output_TextField.setText("A的伴随矩阵为\n"+output_string);
			}
		}	
 	}
 	public void Rank()
 	{
 		double Asum=0;
		int p=1,flag=0;
		
		for(int d=0;d<a;d++)
			for(int f=0;f<b;f++)
				flag+=(int)matrix_A[d][f];
		if(flag!=0)
		{
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
				{
					if(j!=i)
					for(int k=0;k<5;k++)
					{
						if(k!=i)
						if(k!=j)
						for(int m=0;m<5;m++)
						{
							if(m!=i)
							if(m!=j)
							if(m!=k)
							for(int n=0;n<5;n++)
							{
								if(n!=i)
								if(n!=j)
								if(n!=k)
								if(n!=m)
								{
									Asum+=Math.pow(-1, (int)(p/2))*matrix_A[0][i]*matrix_A[1][j]*matrix_A[2][k]*matrix_A[3][m]*matrix_A[4][n];
									p++;
									if(p==24){p=2;}
								}
							}
						}
					}
				}
			if((int)Asum==0){
				display_input_TextField.setText("|A|的值等于0，\n不能求Ar！");
			}
			else{
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						bridge[i][j]=matrix_A[i][j];
					}
				}
				for(int j=b;j<2*b;j++){
					bridge[j-b][j]=1;
				}
				b+=b;
				double flag11=0,p1=0;
				
				for(int i=0,n=0;(i<a-1)&&(n<b);i++,n++){
					for(int j=i+1;j<a;j++){
						if(bridge[i][n]==0){
							if(bridge[i+1][n]!=0){
								for(int m=0;m<b;m++){
									flag11=bridge[i][m];
									bridge[i][m]=bridge[i+1][m];
									bridge[i+1][m]=flag11;
								}	
							}
							i--;
						}else{
							flag11=(bridge[j][n]/bridge[i][n]);
							for(int k=n;k<b;k++){
								bridge[j][k]-=flag11*bridge[i][k];
							}
						}	
					}
				}
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						if(Math.abs(bridge[i][j])>0.0000001){
							flag11=bridge[i][j];
							for(int k=j;k<b;k++){
								bridge[i][k]/=flag11;
							}
							for(int m=i-1;m>=0;m--){
								p1=bridge[m][j]/bridge[i][j];
								for(int n=j;n<b;n++){
									bridge[m][n]-=p1*bridge[i][n];
								}
							}
							break;
						}
						display_output_TextField.setText("A的秩\nR(A)="+String.valueOf(i));
					}
				}
			}
		}
 	}
 	public void Trace()
 	{
 		double result=0;
 		for(int i=0; i<a; i++)
 		{
 			result=result+matrix_A[i][i];
 		}
 		output_string="";
 		fracktion(result);
		if(down!=0){
			output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
		}else{
			output_string=output_string+String.valueOf(up)+" ";
		}
 		display_output_TextField.setText("A的迹\ntr(A)="+output_string);
 	}
	public void Add()
	{
		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
			{
				matrix_result[i][j]=matrix_A[i][j]+matrix_B[i][j];
			}
		output_string="";
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				fracktion(matrix_result[i][j]);
				if(down!=0){
					output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
				}else{
					output_string=output_string+String.valueOf(up)+" ";
				}
			}
			output_string=output_string+"\n";
		}
		display_output_TextField.setText("和为\n"+output_string);
	}
 	public void Mins()
 	{
 		for(int i=0;i<a;i++)
			for(int j=0;j<b;j++)
			{
				matrix_result[i][j]=matrix_A[i][j]-matrix_B[i][j];
			}
		output_string="";
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				fracktion(matrix_result[i][j]);
				if(down!=0){
					output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
				}else{
					output_string=output_string+String.valueOf(up)+" ";
				}
			}
			output_string=output_string+"\n";
		}
		display_output_TextField.setText("差为\n"+output_string);
 	}
 	public void Multiply()
 	{
 		 for (int i =0; i<a_1; i++)
 		 {
 			 for(int j =0; j<b; j++)
 			 {
 				 double total = 0;
 				 for(int k=0; k<a; k++)
 				 {
 					total += matrix_A[i][k] * matrix_B[k][j];
 			 		matrix_result[i][j] = total;
 				 }
 			 }
 		 }
 		output_string="";
		for(int i=0;i<a_1;i++){
			for(int j=0;j<b;j++){
				fracktion(matrix_result[i][j]);
				if(down!=0){
					output_string=output_string+String.valueOf(up)+"/"+String.valueOf(down)+" ";
				}else{
					output_string=output_string+String.valueOf(up)+" ";
				}
			}
			output_string=output_string+"\n";
		}
		display_output_TextField.setText("乘积为\n"+output_string);
 	}
 	public void fracktion(double num)
	{
		up=0;
		down=0;
		int flag=0;
		if(num<0){flag=1;}
		
		if((int)num-(int)(num+(int)(Math.pow(-1, flag))*0.000001)!=0)
		{
			num+=0.000001;
		}
		double f2=num-(int)num;
		int f1=(int)num;
		
		if(f2==0){
			up=f1;
			down=0;
		}
		else{
			t:for(up=1;up<10;up++){	
				for(down=up+1;down<10;down++){
					if(Math.abs((double)up/down-Math.abs(f2))>0.00000001){}
					else {break t;}
				}
			}
			up=f1*down+(int)Math.pow(-1, flag)*up;
		}			
	}
 	class Listener_0 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"0");
		}	
	}
	class Listener_1 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"1");
		}	
	}
	class Listener_2 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"2");
		}	
	}
	class Listener_3 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"3");
		}	
	}
	class Listener_4 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"4");
		}	
	}
	class Listener_5 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"5");
		}	
	}
	class Listener_6 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"6");
		}	
	}
	class Listener_7 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"7");
		}	
	}
	class Listener_8 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"8");
		}	
	}
	class Listener_9 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+"9");
		}	
	}
	class Listener_dot implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+".");
			matrix_string=matrix_string+".";
			
			String str =input_TextField.getText();
			if(str==null) {input_TextField.setText("0.");}
			else if(str.endsWith(";")||str.endsWith(",")) {input_TextField.setText(str+"0.");}
			     else{input_TextField.setText(str+".");}
		}	
	}
	class Listener_comma implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText(input_TextField.getText()+",");
		}	
	}
	class Listener_equal implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(symbol==1) {ToMatrix_1(input_TextField.getText().trim());Add();}
			if(symbol==2) {ToMatrix_1(input_TextField.getText().trim());Mins();}
			if(symbol==3) {ToMatrix_1(input_TextField.getText().trim());Multiply();}
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					bridge[i][j]=0;
			a=b=0;
			input_TextField.setText("");
		}	
	}
	class Listener_del implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = input_TextField.getText();
			s = s.substring(0,s.length()-1);
			input_TextField.setText(s);
			matrix_string=s;
		}	
	}
	class Listener_C implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText("");
			display_input_TextField.setText("");
			display_output_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					bridge[i][j]=0;
			a=b=symbol=0;
		}	
	}
	class Listener_inverse implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(a!=b)
			{
				display_output_TextField.setText("此矩阵不是方阵，\n不能求A-1！");
			}
			else {
				for(int i=0;i<5;i++)
					matrix_A[i][i]=1;
				ToMatrix(input_TextField.getText().trim());
				Inverse();
			}
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					bridge[i][j]=0;
			a=b=0;
		}	
	}
	class Listener_transpose implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ToMatrix(input_TextField.getText().trim());
			Transpose();
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					bridge[i][j]=0;
			a=b=0;
		}	
	}
	class Listener_determinant implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(a!=b)
			{
				display_output_TextField.setText("此矩阵不是方阵，\n不能求|A|！");
			}
			else {
				for(int i=0;i<5;i++)
					matrix_A[i][i]=1;
				ToMatrix(input_TextField.getText().trim());
				Determinant();
			}
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					bridge[i][j]=0;
			a=b=0;
		}	
	}
	class Listener_adjoint implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(a!=b)
			{
				display_output_TextField.setText("此矩阵不是方阵，\n不能求A*！");
			}
			else {
				for(int i=0;i<5;i++)
					matrix_A[i][i]=1;
				ToMatrix(input_TextField.getText().trim());
				Adjoint();
			}
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
			a=b=0;
		}	
	}
	class Listener_rank implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		    for(int i=0;i<5;i++)
			matrix_A[i][i]=1;
			ToMatrix(input_TextField.getText().trim());
			Rank();
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
			a=b=0;
		}	
	}
	class Listener_trace implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(a!=b)
			{
				display_output_TextField.setText("此矩阵不是方阵，\n不能求tr(A)！");
			}
			else {
			
				ToMatrix(input_TextField.getText().trim());
				Trace();
			}
			input_TextField.setText("");
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++)
					matrix_A[i][j]=matrix_B[i][j]=matrix_result[i][j]=0;
			matrix_string=output_string="";
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
			a=b=0;
		}	
	}
	class Listener_plus implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ToMatrix(input_TextField.getText().trim());
			input_TextField.setText("");
			symbol=1;
			input_TextField.setText("");
		}	
	}
	class Listener_mins implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ToMatrix(input_TextField.getText().trim());
			input_TextField.setText("");
			symbol=2;
		}	
	}
	class Listener_multiply implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ToMatrix(input_TextField.getText().trim());
			input_TextField.setText("");
			symbol=3;
			a_1=a;
			Object[] possibleValues={"2","3","4","5"};
			Object selectedValues=JOptionPane.showInputDialog(null, "矩阵B :  "+String.valueOf(b)+"*", "矩阵B列数选择", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
			
			String result=(String)selectedValues;
			a=b;
			if(result=="2"){b=2;}
			else if(result=="3"){b=3;}
			else if(result=="4"){b=4;}
			else if(result=="5"){b=5;}
		}	
	}
	class Listener_choice implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object[] possibleValues={"2*2","2*3","2*4","2*5","3*2","3*3","3*4","3*5","4*2","4*3","4*4","4*5","5*2","5*3","5*4","5*5"};
			Object selectedValues=JOptionPane.showInputDialog(null, "请选择要计算的矩阵：", "矩阵阶数选择", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
			
			String result=(String)selectedValues;
			if(result=="2*2"){a=2;b=2;}
			else if(result=="2*3"){a=2;b=3;}
			else if(result=="2*4"){a=2;b=4;}
			else if(result=="2*5"){a=2;b=5;}
			else if(result=="3*2"){a=3;b=2;}
			else if(result=="3*3"){a=3;b=3;}
			else if(result=="3*4"){a=3;b=4;}
			else if(result=="3*5"){a=3;b=5;}
			else if(result=="4*2"){a=4;b=2;}
			else if(result=="4*3"){a=4;b=3;}
			else if(result=="4*4"){a=4;b=4;}
			else if(result=="4*5"){a=4;b=5;}
			else if(result=="5*2"){a=5;b=2;}
			else if(result=="5*3"){a=5;b=3;}
			else if(result=="5*4"){a=5;b=4;}
			else if(result=="5*5"){a=5;b=5;}
		}	
	}
	class Listener_back implements ActionListener{	//返回键 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Matr_Frame.setVisible(false);
			SecondaryPageOne newWindow=new SecondaryPageOne();
			newWindow.setVisible(true);
		}	
	}	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
