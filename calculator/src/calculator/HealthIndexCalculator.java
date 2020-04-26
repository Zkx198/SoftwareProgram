package calculator;

//  李涢瑶 2017111147
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.awt.Window.Type;
import java.awt.*;
public class HealthIndexCalculator extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthIndexCalculator frame = new HealthIndexCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JPanel in0_Panel, in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel, input_Panel, intergration_Panel, result1_Panel, result2_Panel;
	TextField weight_Textfield, height_Textfield, age_Textfield, bmi_Textfield, bmr_Textfield;
	TextArea advise1_Textfield;
	Button cal_Button, bmi_standard, bmr_standard;
	Button Back_Button, C_Button, next_Button;
	JLabel bmi_Label,bmr_Label,age_Label, weight_Label, height_Label, gender_Label, input_Label, blank2, blank3, blank5, blank6, blank7, blank8;
	JRadioButton female_Radio, male_Radio;
	ButtonGroup btg;
	private double bmi_result = 0.0, bmr_result = 0.0;
	private double weight_inputContent = 0.0, height_inputContent = 0.0, age_inputContent = 0.0;
	private int gender=0;
	private boolean w_inputstate = false, h_inputstate = false, a_inputstate = false;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	
	public HealthIndexCalculator() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("健康指数计算器");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setSize(780, 480);
		setLocation(800, 200);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 0));
		
		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 0, this.getWidth(),this.getHeight());
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		
		blank2 = new JLabel("                                                  ");
		blank2.setFont(new Font("宋体", Font.PLAIN, 13));
		blank3 = new JLabel("  ");
		blank5 = new JLabel("                                                                                                                                                                                                                                                                                 ");
		blank2.setOpaque(false);
		blank3.setOpaque(false);
		blank5.setOpaque(false);
		blank5.setFont(new Font("Dialog", Font.PLAIN, 11));
		blank6 = new JLabel("                                                                                                                                                                                                                                                                                                                                             ");
		blank6.setFont(new Font("Dialog", Font.PLAIN, 7));
		blank7 = new JLabel("  ");
		blank8 = new JLabel("                                                                                                                                           ");
		blank8.setFont(new Font("Dialog", Font.PLAIN, 6));
		blank6.setOpaque(false);
		blank7.setOpaque(false);
		blank8.setOpaque(false);

		input_Panel = new JPanel(new GridLayout(6, 1, 5, 5));
		in0_Panel = new JPanel(new FlowLayout());
		in1_Panel = new JPanel(new FlowLayout());
		in2_Panel = new JPanel(new FlowLayout());
		in3_Panel = new JPanel(new FlowLayout());
		in4_Panel = new JPanel(new FlowLayout());
		in5_Panel = new JPanel(new FlowLayout());
		input_Panel.setOpaque(false);
		in0_Panel.setOpaque(false);
		in1_Panel.setOpaque(false);
		in2_Panel.setOpaque(false);
		in3_Panel.setOpaque(false);
		in4_Panel.setOpaque(false);
		in5_Panel.setOpaque(false);
		in1_Panel.setPreferredSize(new Dimension(200, 60));
		input_Panel.add(in0_Panel);
		input_Panel.add(in1_Panel);
		input_Panel.add(in2_Panel);
		input_Panel.add(in3_Panel);
		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);
		intergration_Panel = new JPanel(new GridLayout(2, 1, 4, 6));
		result1_Panel = new JPanel(new FlowLayout());
		result2_Panel = new JPanel(new FlowLayout());
		intergration_Panel.setOpaque(false);
		result1_Panel.setOpaque(false);
		result2_Panel.setOpaque(false);
		
		input_Panel.setPreferredSize(new Dimension(280, 420));
		intergration_Panel.setPreferredSize(new Dimension(470, 420));
		result1_Panel.setPreferredSize(new Dimension(320, 285));
		result2_Panel.setPreferredSize(new Dimension(300, 55));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);
		contain.add(input_Panel,BorderLayout.WEST);
		contain.add(intergration_Panel,BorderLayout.EAST);
		
		lblNewLabel_1 = new JLabel("                                           ");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 11));
		lblNewLabel_1.setOpaque(false);
		in0_Panel.add(lblNewLabel_1);
		
		input_Label = new JLabel(" \u8BF7\u6309\u8981\u6C42\u8F93\u5165\u8EAB\u4F53\u4FE1\u606F\uFF1A");
		input_Label.setFont(new Font("隶书", Font.BOLD, 23));
		input_Label.setOpaque(false);
		in0_Panel.add(input_Label);
		gender_Label = new JLabel("  \u6027\u522B  ");
		gender_Label.setOpaque(false);
		gender_Label.setFont(new Font("隶书", Font.BOLD, 21));
		female_Radio = new JRadioButton(" \u5973 ");
		female_Radio.setFont(new Font("隶书", Font.PLAIN, 20));
		male_Radio = new JRadioButton(" \u7537 ");
		male_Radio.setFont(new Font("隶书", Font.PLAIN, 20));
		female_Radio.setOpaque(false);
		male_Radio.setOpaque(false);
		btg = new ButtonGroup();
		btg.add(female_Radio);
		btg.add(male_Radio);
		female_Radio.addActionListener(this);
		male_Radio.addActionListener(this);
		
		in1_Panel.add(gender_Label);
		in1_Panel.add(female_Radio);
		in1_Panel.add(male_Radio);

		weight_Label= new JLabel(" \u4F53\u91CD(kg) ");
		weight_Label.setFont(new Font("隶书", Font.BOLD, 21));
		weight_Textfield = new TextField(10);
		weight_Textfield.setText("");
		weight_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		weight_Textfield.setEditable(true);
		weight_Textfield.setBounds(50, 30, 50, 30);
		in2_Panel.add(weight_Label);
		in2_Panel.add(weight_Textfield);
		
		height_Label= new JLabel(" \u8EAB\u9AD8(cm) ");
		height_Label.setFont(new Font("隶书", Font.BOLD, 21));
		height_Textfield = new TextField(10);
		height_Textfield.setText("");
		height_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		height_Textfield.setEditable(true);
		height_Textfield.setBounds(50, 30, 50, 30);
		in3_Panel.add(height_Label);
		in3_Panel.add(height_Textfield);
		
		age_Label= new JLabel("   \u5E74\u9F84   ");
		age_Label.setFont(new Font("隶书", Font.BOLD, 21));
		age_Textfield = new TextField(10);
		age_Textfield.setText("");
		age_Textfield.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		age_Textfield.setEditable(true);
		age_Textfield.setBounds(50, 30, 50, 30);
		in4_Panel.add(age_Label);
		in4_Panel.add(age_Textfield);
		
		weight_Textfield.addActionListener(this);
		height_Textfield.addActionListener(this);
		age_Textfield.addActionListener(this);

		C_Button = new Button("    \u6E05\u7A7A    ");
		C_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		cal_Button = new Button("   \u8BA1\u7B97   ");
		cal_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		Back_Button = new Button("  \u8FD4\u56DE  ");
		Back_Button.setFont(new Font("隶书", Font.BOLD, 23));
		Back_Button.setForeground(new Color(0, 0, 0));
		Back_Button.setBackground(new Color(255, 160, 122));
		
		C_Button.addActionListener(this);
		cal_Button.addActionListener(this);
		Back_Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			HealthLifePage newWindow=new HealthLifePage();
			newWindow.setVisible(true);
		}
	});		
		next_Button =new Button("  \u5361\u8DEF\u91CC\u8BA1\u7B97  ");
		next_Button.setFont(new Font("隶书", Font.BOLD, 23));
		next_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaloriesConsumptionCalculator newWindow=new CaloriesConsumptionCalculator();
				newWindow.setVisible(true);
			}
		});		
	
		in5_Panel.add(C_Button);
		in5_Panel.add(cal_Button);
		
		bmi_Label = new JLabel("\u4F53\u8D28\u6307\u6570\uFF08BMI\uFF09:");
		bmi_Label.setFont(new Font("隶书", Font.BOLD, 25));
		bmr_Label = new JLabel(" \u57FA\u7840\u4EE3\u8C22\u7387\uFF08BMR\uFF09: ");
		bmr_Label.setFont(new Font("隶书", Font.BOLD, 25));
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
		advise1_Textfield.setFont(new Font("隶书", Font.BOLD, 21));
		advise1_Textfield.setText("每格输入完成后请按回车键！");
		advise1_Textfield.setEditable(false);
		
		bmi_standard = new Button("\u4F53\u8D28\u6307\u6570\u4E9A\u6D32\u6807\u51C6");
		bmi_standard.setFont(new Font("楷体", Font.BOLD, 22));
		bmi_standard.addActionListener(this);
		
		result1_Panel.add(blank5);
		result1_Panel.add(bmi_Label);
		result1_Panel.add(blank2);
		result1_Panel.add(bmi_Textfield);
		result1_Panel.add(blank3);
		result1_Panel.add(bmi_standard);
		
		lblNewLabel = new JLabel("                                                    ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 5));
		result1_Panel.add(lblNewLabel);
		result1_Panel.add(advise1_Textfield);
		result2_Panel.add(blank8);
		result2_Panel.add(bmr_Label);
		
		label = new JLabel("                                                  ");
		label.setOpaque(false);
		label.setFont(new Font("宋体", Font.PLAIN, 13));
		result2_Panel.add(label);
		result2_Panel.add(bmr_Textfield);
		result2_Panel.add(blank6);
		result2_Panel.add(next_Button);
		result2_Panel.add(blank7);
        result2_Panel.add(Back_Button);
	
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "\u4F53\u8D28\u6307\u6570\u4E9A\u6D32\u6807\u51C6") {
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
		if (e.getActionCommand() == "   \u8BA1\u7B97   ") {
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
		if (e.getActionCommand() == "    \u6E05\u7A7A    ") {
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
}
