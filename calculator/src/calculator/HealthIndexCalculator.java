package calculator;

//  李涢瑶 2017111147
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import java.awt.*;
public class HealthIndexCalculator extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel in0_Panel, in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel, input_Panel, intergration_Panel, result1_Panel, result2_Panel;
	private TextField weight_Textfield, height_Textfield, age_Textfield, bmi_Textfield, bmr_Textfield;
	private TextArea advise1_Textfield;
	private Button cal_Button, bmi_standard, bmr_standard;
	private Button Back_Button, C_Button, next_Button;
	private Label bmi_Label,bmr_Label,age_Label, weight_Label, height_Label, gender_Label, input_Label, blank2, blank3, blank4, blank5, blank6, blank7, blank8;
	private JRadioButton female_Radio, male_Radio;
	private ButtonGroup btg;
	private double bmi_result = 0.0, bmr_result = 0.0;
	private double weight_inputContent = 0.0, height_inputContent = 0.0, age_inputContent = 0.0;
	private int gender=0;
	private boolean w_inputstate = false, h_inputstate = false, a_inputstate = false;
	
	public void cal() {
		cal_Frame = new Frame("健康指数计算器");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(new Color(0, 0, 0));
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 0));
		blank2 = new Label("             ");
		blank3 = new Label("  ");
		blank4 = new Label("                                                                                        ");
		blank4.setFont(new Font("Dialog", Font.PLAIN, 5));
		blank5 = new Label("                                                                                                                                                                                                                                                                                 ");
		blank5.setFont(new Font("Dialog", Font.PLAIN, 5));
		blank6 = new Label("                                                                                                                                                                                                                                                               ");
		blank6.setFont(new Font("Dialog", Font.PLAIN, 5));
		blank7 = new Label("  ");
		blank8 = new Label("                                                                                                                                           ");
		blank8.setFont(new Font("Dialog", Font.PLAIN, 6));

		input_Panel = new Panel(new GridLayout(6, 1, 5, 5));
		in0_Panel = new Panel(new FlowLayout());
		in1_Panel = new Panel(new FlowLayout());
		in2_Panel = new Panel(new FlowLayout());
		in3_Panel = new Panel(new FlowLayout());
		in4_Panel = new Panel(new FlowLayout());
		in5_Panel = new Panel(new FlowLayout());
		in1_Panel.setPreferredSize(new Dimension(200, 60));
		input_Panel.add(in0_Panel);
		input_Panel.add(in1_Panel);
		input_Panel.add(in2_Panel);
		input_Panel.add(in3_Panel);
		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);
		intergration_Panel = new Panel(new GridLayout(2, 1, 4, 6));
		result1_Panel = new Panel(new FlowLayout());
		result2_Panel = new Panel(new FlowLayout());
		input_Panel.setPreferredSize(new Dimension(280, 420));
		intergration_Panel.setPreferredSize(new Dimension(470, 420));
		result1_Panel.setPreferredSize(new Dimension(310, 285));
		result2_Panel.setPreferredSize(new Dimension(310, 55));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);
		cal_Frame.add(input_Panel,BorderLayout.WEST);
		cal_Frame.add(intergration_Panel,BorderLayout.EAST);
		
		input_Label = new Label("  \u8BF7\u6309\u8981\u6C42\u8F93\u5165\u8EAB\u4F53\u4FE1\u606F\uFF1A");
		input_Label.setFont(new Font("隶书", Font.BOLD, 22));
		in0_Panel.add(input_Label);
		gender_Label = new Label("  \u6027\u522B  ");
		gender_Label.setFont(new Font("隶书", Font.BOLD, 21));
		female_Radio = new JRadioButton(" \u5973 ");
		female_Radio.setFont(new Font("隶书", Font.PLAIN, 20));
		male_Radio = new JRadioButton(" \u7537 ");
		male_Radio.setFont(new Font("隶书", Font.PLAIN, 20));
		btg = new ButtonGroup();
		btg.add(female_Radio);
		btg.add(male_Radio);
		female_Radio.addActionListener(this);
		male_Radio.addActionListener(this);
		
		in1_Panel.add(gender_Label);
		in1_Panel.add(female_Radio);
		in1_Panel.add(male_Radio);

		weight_Label= new Label(" \u4F53\u91CD(kg) ");
		weight_Label.setFont(new Font("隶书", Font.BOLD, 21));
		weight_Textfield = new TextField(10);
		weight_Textfield.setText("");
		weight_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		weight_Textfield.setEditable(true);
		weight_Textfield.setBounds(50, 30, 50, 30);
		in2_Panel.add(weight_Label);
		in2_Panel.add(weight_Textfield);
		
		height_Label= new Label(" \u8EAB\u9AD8(cm)");
		height_Label.setFont(new Font("隶书", Font.BOLD, 21));
		height_Textfield = new TextField(10);
		height_Textfield.setText("");
		height_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		height_Textfield.setEditable(true);
		height_Textfield.setBounds(50, 30, 50, 30);
		in3_Panel.add(height_Label);
		in3_Panel.add(height_Textfield);
		
		age_Label= new Label("    \u5E74\u9F84    ");
		age_Label.setFont(new Font("隶书", Font.BOLD, 21));
		age_Textfield = new TextField(10);
		age_Textfield.setText("");
		age_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		age_Textfield.setEditable(true);
		age_Textfield.setBounds(50, 30, 50, 30);
		in4_Panel.add(age_Label);
		in4_Panel.add(age_Textfield);
		
		weight_Textfield.addActionListener(this);
		height_Textfield.addActionListener(this);
		age_Textfield.addActionListener(this);

		C_Button = new Button("     CE     ");
		C_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		cal_Button = new Button("   CAL    ");
		cal_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		Back_Button = new Button("BACK");
		Back_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		Back_Button.setForeground(new Color(0, 0, 0));
		Back_Button.setBackground(new Color(219, 112, 147));
		
		C_Button.addActionListener(this);
		cal_Button.addActionListener(this);
		Back_Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cal_Frame.setVisible(false);
			HealthLifePage newWindow=new HealthLifePage();
			newWindow.cal();
		}
	});		
		next_Button =new Button("Calorie Calculation");
		next_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		next_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});		
	
		in5_Panel.add(C_Button);
		in5_Panel.add(cal_Button);
		
		bmi_Label = new Label("          \u4F53\u8D28\u6307\u6570\uFF08BMI\uFF09:");
		bmi_Label.setFont(new Font("隶书", Font.BOLD, 22));
		bmr_Label = new Label(" \u57FA\u7840\u4EE3\u8C22\u7387\uFF08BMR\uFF09: ");
		bmr_Label.setFont(new Font("隶书", Font.BOLD, 22));
		bmi_Textfield= new TextField(12);
		bmi_Textfield.setBounds(50, 30, 50, 30);
		bmi_Textfield.setFont(new Font("隶书", Font.BOLD, 23));
		bmr_Textfield= new TextField(24);
		bmr_Textfield.setFont(new Font("隶书", Font.BOLD, 23));
		bmi_Textfield.setText(" ");
		bmr_Textfield.setText(" ");
		bmi_Textfield.setEditable(false);
		bmr_Textfield.setEditable(false);
		advise1_Textfield= new TextArea(2,28);
		advise1_Textfield.setFont(new Font("隶书", Font.BOLD, 23));
		advise1_Textfield.setText("每格输入完成后请按回车键！");
		advise1_Textfield.setEditable(false);
		
		bmi_standard = new Button(" BMI_Standard ");
		bmi_standard.setFont(new Font("Times New Roman", Font.BOLD, 22));
		bmi_standard.addActionListener(this);
		
		result1_Panel.add(blank5);
		result1_Panel.add(bmi_Label);
		result1_Panel.add(blank2);
		result1_Panel.add(bmi_Textfield);
		result1_Panel.add(blank3);
		result1_Panel.add(bmi_standard);
		result1_Panel.add(blank4);
		result1_Panel.add(advise1_Textfield);
		result2_Panel.add(blank8);
		result2_Panel.add(bmr_Label);
		result2_Panel.add(bmr_Textfield);
		result2_Panel.add(blank6);
		result2_Panel.add(next_Button);
		result2_Panel.add(blank7);
        result2_Panel.add(Back_Button);
	
		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == " BMI_Standard ") {
			ImageIcon image = new ImageIcon("./src/image/a1.jpg");
			JOptionPane.showConfirmDialog(null, image, "BMI指数中国标准", JOptionPane.INFORMATION_MESSAGE); 
				}
		if(male_Radio.isSelected()) {
			this.gender=1;
		}
        if(female_Radio.isSelected()) {
        	this.gender=2;
		}
		if(e.getSource()==age_Textfield) {
			this.age_inputContent = Double.parseDouble(age_Textfield.getText());
			age_Textfield.setText("age="+Double.toString(this.age_inputContent));
			if(this.age_inputContent>0) {
				this.a_inputstate=true;
			}
		}
		if(e.getSource()==height_Textfield) {
			this.height_inputContent = Double.parseDouble(height_Textfield.getText());
			height_Textfield.setText("height="+Double.toString(this.height_inputContent)+"ok");
			if(this.height_inputContent>0&&this.height_inputContent<=250) {
				this.h_inputstate = true;
			}
		}
		if(e.getSource()==weight_Textfield) {
			this.weight_inputContent = Double.parseDouble(weight_Textfield.getText());
			weight_Textfield.setText("weight="+Double.toString(this.weight_inputContent)+"ok");
			if(this.weight_inputContent>0&&this.weight_inputContent<=300) {
				this.w_inputstate=true;
			}
		}
		
		// key "CAL"
		if (e.getActionCommand() == "   CAL    ") {
			if(this.w_inputstate==true && this.h_inputstate==true && this.gender!=0 && this.a_inputstate==true) {
				if(male_Radio.isSelected()) {
					this.bmr_result = 66+(13.7*this.weight_inputContent)+(5*this.height_inputContent)-(6.8*this.age_inputContent);
					bmr_Textfield.setText("   "+Double.toString(this.bmr_result)+"  KJ/m2/h");
					this.bmi_result = this.weight_inputContent/(this.height_inputContent*this.height_inputContent/10000);
					bmi_Textfield.setText(Double.toString(this.bmi_result));
				}
	            if(female_Radio.isSelected()) {
	            	this.bmr_result = 655+(9.6*this.weight_inputContent)+(1.8*this.height_inputContent)-(4.7*this.age_inputContent);
	            	bmr_Textfield.setText(" "+Double.toString(this.bmr_result)+" KJ/m2/h");
	            	this.bmi_result = this.weight_inputContent/(this.height_inputContent*this.height_inputContent/10000);
					bmi_Textfield.setText(Double.toString(this.bmi_result));
				}
	            if(this.bmi_result<=18.4) {
	            	advise1_Textfield.setText("体质类型偏瘦，肥胖相关疾病发病危险性低，其他疾病危险性增加。如何应对：每天吃完午饭后吃一点甜品，多吃一些鱼肉，牛肉和鸡肉。");
	            }
	            if(this.bmi_result>18.4&&this.bmi_result<=21&&this.gender==1) {
	            	advise1_Textfield.setText("体质类型处于正常范围内较精瘦区域，体重还有上升空间，肥胖相关疾病发病危险性低。可根据爱好适量吃点甜筒红茶轻松一刻，但不要忘记适量运动增加肌肉。");
	            }
	            if(this.bmi_result>18.4&&this.bmi_result<=21&&this.gender==2) {
	            	advise1_Textfield.setText("体质类型处于正常范围内较苗条区域，体重还有上升空间，肥胖相关疾病发病危险性低。可根据爱好适量吃点甜筒红茶轻松一刻，但不要忘记适量运动增加肌肉。");
	            }
	            if(this.bmi_result<23.9&&this.bmi_result>21&&this.gender==2) {
	            	advise1_Textfield.setText("珠圆玉润。体质类型处于正常范围内较壮区域，体重有下降空间，肥胖相关疾病发病危险性低。或者肌肉结实或者有微胖风险，甜筒红茶类请控制食量，适量肉类以及运动量有益身体健康。");
	            }
	            if(this.bmi_result<23.9&&this.bmi_result>21&&this.gender==1) {
	            	advise1_Textfield.setText("身强力壮。体质类型处于正常范围内较壮区域，体重有下降空间，肥胖相关疾病发病危险性低。或者肌肉结实或者有微胖风险，甜筒红茶类请控制食量，适量肉类以及运动量有益身体健康。");
	            }
	            if(this.bmi_result>23.9&&this.bmi_result<28) {
	            	advise1_Textfield.setText("体质类型偏胖，已有超重风险，肥胖相关疾病发病危险性正在增加。请控制饮食，适量肉类以及运动量有益身体健康。");
	            }
	            if(this.bmi_result>=28) {
	            	advise1_Textfield.setText("体质类型为肥胖，肥胖相关疾病发病危险性较高，建议控制体重，注意饮食习惯，保持适当的运动量。");
	            }
	 
			}else {
				advise1_Textfield.setText("请正确输入身高、体重、年龄、性别！");
				bmr_Textfield.setText("每次文本框输入后请按回车键!!!");
			}			
		}
		
		// key "CE"
		if (e.getActionCommand() == "     CE     ") {
			this.w_inputstate=false;
			this.h_inputstate=false;
			this.a_inputstate=false;
			this.gender = 0;
			this.bmi_result = 0.0;
			this.bmr_result = 0.0;
			this.weight_inputContent = 0.0;
			this.height_inputContent = 0.0;
			this.age_inputContent = 0.0;
			bmi_Textfield.setText(" ");
			bmr_Textfield.setText(" ");
			age_Textfield.setText(" ");
			height_Textfield.setText(" ");
			weight_Textfield.setText(" ");
			advise1_Textfield.setText(" ");
		}

	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}


	public static void main(String[] args) {
		HealthIndexCalculator new_cal = new HealthIndexCalculator();
		new_cal.cal();

	}
}
