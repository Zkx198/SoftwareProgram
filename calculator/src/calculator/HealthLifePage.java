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
public class HealthLifePage extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	private Panel in0_Panel, in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel, input_Panel, intergration_Panel, result1_Panel, result2_Panel;
	private Label blank2, blank3, blank5;
	private ButtonGroup btg;
	private Button bmr_Button;
	private JLabel blank1_Label;
	private JLabel blank2_Label;
	private Button sport_Button;
	private JLabel blank5_Label;
	private Button food_Button;
	private Button back_button;
	private JLabel blank4_Label;
	private JLabel blank3_Label;
	private Button bmi_Button;
	private JLabel illustration2_Label;
	private JLabel illustration1_Label;
	private JLabel illustration3_Label;
	private JLabel illustration4_Label;
	private JLabel lblX;
	private JLabel lblNewLabel;
	private JLabel illustration5_Label;
	private JLabel label;
	private JLabel blank_Label;
	private JLabel label_1;
	
	public void cal() {
		cal_Frame = new Frame("\u5065\u5EB7\u751F\u6D3B\u8BA1\u7B97\u5668");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(SystemColor.desktop);
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));
		blank2 = new Label("             ");
		blank3 = new Label("  ");
		blank5 = new Label("                                                                                                                                                                                                                                                                                 ");
		blank5.setFont(new Font("Dialog", Font.PLAIN, 5));

		input_Panel = new Panel(new GridLayout(6, 1, 5, 5));
		in0_Panel = new Panel(new FlowLayout());
		in1_Panel = new Panel(new FlowLayout());
		in2_Panel = new Panel(new FlowLayout());
		in3_Panel = new Panel(new FlowLayout());
		in4_Panel = new Panel(new FlowLayout());
		in5_Panel = new Panel(new FlowLayout());
		in1_Panel.setPreferredSize(new Dimension(200, 60));
		input_Panel.add(in0_Panel);
		
		blank1_Label = new JLabel("                            \r\n");
		in0_Panel.add(blank1_Label);
		
		bmr_Button = new Button("\u4EBA\u4F53\u57FA\u7840\u4EE3\u8C22\u8BA1\u7B97");
		bmr_Button.setBackground(UIManager.getColor("Button.background"));
		bmr_Button.setFont(new Font("隶书", Font.BOLD, 24));
		bmr_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				HealthIndexCalculator newWindow=new HealthIndexCalculator();
				newWindow.cal();
			}
		});		
		in0_Panel.add(bmr_Button);
		input_Panel.add(in1_Panel);
		
		blank2_Label = new JLabel("                           ");
		in1_Panel.add(blank2_Label);
		
		bmi_Button = new Button("\u8EAB\u9AD8\u4F53\u91CD\u6307\u6570\u8BA1\u7B97");
		bmi_Button.setBackground(UIManager.getColor("Button.background"));
		bmi_Button.setFont(new Font("隶书", Font.BOLD, 24));
		bmi_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				HealthIndexCalculator newWindow=new HealthIndexCalculator();
				newWindow.cal();
			}
		});		
		in1_Panel.add(bmi_Button);
		input_Panel.add(in2_Panel);
		
		blank5_Label = new JLabel("                           ");
		in2_Panel.add(blank5_Label);
		
		food_Button = new Button("\u98DF\u7269\u6444\u5165\u70ED\u91CF\u8BA1\u7B97");
		food_Button.setBackground(UIManager.getColor("Button.background"));
		food_Button.setFont(new Font("隶书", Font.BOLD, 24));
		food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				FoodCaloriesCalculator newWindow=new FoodCaloriesCalculator();
				newWindow.cal();
			}
		});	
		in2_Panel.add(food_Button);
		input_Panel.add(in3_Panel);
		
		blank4_Label = new JLabel("                   ");
		in3_Panel.add(blank4_Label);
		
		sport_Button = new Button("\u4F53\u529B\u6D3B\u52A8\u70ED\u91CF\u6D88\u8017");
		sport_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				CaloriesConsumptionCalculator newWindow=new CaloriesConsumptionCalculator();
				newWindow.cal();
			}
		});
		sport_Button.setBackground(UIManager.getColor("Button.background"));
		in3_Panel.add(sport_Button);
		sport_Button.setFont(new Font("隶书", Font.BOLD, 24));
		
		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);
		
		blank3_Label = new JLabel("                                       ");
		in4_Panel.add(blank3_Label);
		
		blank_Label = new JLabel("      ");
		in4_Panel.add(blank_Label);
		
		back_button = new Button("    BACK    ");
		in4_Panel.add(back_button);
		back_button.setForeground(Color.BLACK);
		back_button.setFont(new Font("Times New Roman", Font.BOLD, 22));
		back_button.setBackground(new Color(219, 112, 147));
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal_Frame.setVisible(false);
				SecondaryPageTwo newWindow=new SecondaryPageTwo();
				newWindow.setVisible(true);
			}
		});			
		
		label_1 = new JLabel("      ");
		in4_Panel.add(label_1);
		intergration_Panel = new Panel(new FlowLayout());
		result1_Panel = new Panel(new FlowLayout());
		result2_Panel = new Panel(new FlowLayout());
		input_Panel.setPreferredSize(new Dimension(260, 400));
		intergration_Panel.setPreferredSize(new Dimension(490, 420));
		result1_Panel.setPreferredSize(new Dimension(500, 275));
		result2_Panel.setPreferredSize(new Dimension(500, 120));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);
		
		illustration5_Label = new JLabel(" \u51CF\u80A5\u671F\u95F4\u6BCF\u65E5\u6700\u5C11\u6444\u5165\u70ED\u91CF     ");
		illustration5_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(illustration5_Label);
		
		label = new JLabel("= \u6BCF\u65E5\u57FA\u672C\u6D88\u8017 - 500(\u6700\u591A)       ");
		label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(label);
		cal_Frame.add(input_Panel,BorderLayout.EAST);
		cal_Frame.add(intergration_Panel,BorderLayout.WEST);
		btg = new ButtonGroup();
		
		result1_Panel.add(blank5);
		
		illustration1_Label = new JLabel("\u6210\u4EBA\u6BCF\u65E5\u9700\u8981\u7684\u70ED\u91CF");
		illustration1_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration1_Label);
		result1_Panel.add(blank2);
		result1_Panel.add(blank3);
		
		illustration2_Label = new JLabel("= \u4EBA\u4F53\u57FA\u7840\u4EE3\u8C22\u6240\u9700\u6700\u4F4E\u70ED\u91CF        ");
		illustration2_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration2_Label);
		
		illustration3_Label = new JLabel(" + \u4F53\u529B\u6D3B\u52A8\u6240\u9700\u70ED\u91CF                ");
		illustration3_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration3_Label);
		
		illustration4_Label = new JLabel(" + \u6D88\u5316\u98DF\u7269\u6240\u9700\u70ED\u91CF                ");
		illustration4_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration4_Label);
		
		lblX = new JLabel("  = 1.1* (\u57FA\u7840\u4EE3\u8C22\u57FA\u672C\u70ED\u91CF           ");
		lblX.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(lblX);
		
		lblNewLabel = new JLabel("         + \u4F53\u529B\u6D3B\u52A8\u6D88\u8017\u70ED\u91CF ) ");
		lblNewLabel.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(lblNewLabel);
	
		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		

	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		HealthLifePage new_cal = new HealthLifePage();
		new_cal.cal();

	}
}
