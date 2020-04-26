package calculator;

//  李涢瑶 2017111147
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class HealthLifePage extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthLifePage frame = new HealthLifePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HealthLifePage() {
		setTitle("\u5065\u5EB7\u751F\u6D3B\u8BA1\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(800, 200);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/dl.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 0, 780, 480);
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);

		JPanel in0_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel, input_Panel, intergration_Panel,
				result1_Panel, result2_Panel;
		JLabel blank2, blank3, blank5;
		JButton bmr_Button;
		JLabel blank1_Label;
		JLabel blank2_Label;
		JButton sport_Button;
		JLabel blank5_Label;
		JButton food_Button;
		JButton back_button;
		JLabel blank4_Label;
		JButton bmi_Button;
		JLabel illustration2_Label;
		JLabel illustration1_Label;
		JLabel illustration3_Label;
		JLabel illustration4_Label;
		JLabel lblX;
		JLabel lblNewLabel;
		JLabel illustration5_Label;
		JLabel label;

		blank2 = new JLabel("             ");
		blank3 = new JLabel("  ");
		blank5 = new JLabel(
				"                                                                                                                                                                                                                                                                                 ");
		blank5.setFont(new Font("Dialog", Font.PLAIN, 5));

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

		blank1_Label = new JLabel("                            \r\n");
		in0_Panel.add(blank1_Label);

		bmr_Button = new JButton("\u4EBA\u4F53\u57FA\u7840\u4EE3\u8C22\u8BA1\u7B97");
		bmr_Button.setForeground(Color.WHITE);
		bmr_Button.setBackground(Color.ORANGE);
		bmr_Button.setFont(new Font("隶书", Font.BOLD, 24));
		bmr_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HealthIndexCalculator newWindow = new HealthIndexCalculator();
				newWindow.setVisible(true);
			}
		});
		in0_Panel.add(bmr_Button);
		input_Panel.add(in1_Panel);

		blank2_Label = new JLabel("                           ");
		in1_Panel.add(blank2_Label);

		bmi_Button = new JButton("\u8EAB\u9AD8\u4F53\u91CD\u6307\u6570\u8BA1\u7B97");
		bmi_Button.setForeground(Color.WHITE);
		bmi_Button.setBackground(Color.ORANGE);
		bmi_Button.setFont(new Font("隶书", Font.BOLD, 24));
		bmi_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HealthIndexCalculator newWindow = new HealthIndexCalculator();
				newWindow.setVisible(true);
			}
		});
		in1_Panel.add(bmi_Button);
		input_Panel.add(in2_Panel);

		blank5_Label = new JLabel("                           ");
		in2_Panel.add(blank5_Label);

		food_Button = new JButton("\u98DF\u7269\u6444\u5165\u70ED\u91CF\u8BA1\u7B97");
		food_Button.setForeground(Color.WHITE);
		food_Button.setBackground(Color.ORANGE);
		food_Button.setFont(new Font("隶书", Font.BOLD, 24));
		food_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FoodCaloriesCalculator newWindow = new FoodCaloriesCalculator();
				newWindow.setVisible(true);
			}
		});
		in2_Panel.add(food_Button);
		input_Panel.add(in3_Panel);

		blank4_Label = new JLabel("                   ");
		in3_Panel.add(blank4_Label);

		sport_Button = new JButton("\u4F53\u529B\u6D3B\u52A8\u70ED\u91CF\u6D88\u8017");
		sport_Button.setForeground(Color.WHITE);
		sport_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaloriesConsumptionCalculator newWindow = new CaloriesConsumptionCalculator();
				newWindow.setVisible(true);
			}
		});
		sport_Button.setBackground(Color.ORANGE);
		in3_Panel.add(sport_Button);
		sport_Button.setFont(new Font("隶书", Font.BOLD, 24));

		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);

		JLabel blank3_Label;
		blank3_Label = new JLabel(
				"                                                                                                                                            ");
		blank3_Label.setFont(new Font("宋体", Font.PLAIN, 16));
		in4_Panel.add(blank3_Label);

		back_button = new JButton("     \u8FD4\u56DE     ");
		in4_Panel.add(back_button);
		back_button.setForeground(Color.WHITE);
		back_button.setFont(new Font("隶书", Font.BOLD, 24));
		back_button.setBackground(new Color(255, 160, 122));
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SecondaryPageTwo newWindow = new SecondaryPageTwo();
				newWindow.setVisible(true);
			}
		});
		intergration_Panel = new JPanel(new FlowLayout());
		result1_Panel = new JPanel(new FlowLayout());
		result2_Panel = new JPanel(new FlowLayout());
		intergration_Panel.setOpaque(false);
		result1_Panel.setOpaque(false);
		result2_Panel.setOpaque(false);
		input_Panel.setPreferredSize(new Dimension(260, 400));
		intergration_Panel.setPreferredSize(new Dimension(490, 420));
		result1_Panel.setPreferredSize(new Dimension(500, 275));
		result2_Panel.setPreferredSize(new Dimension(500, 120));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);

		illustration5_Label = new JLabel(
				" \u51CF\u80A5\u671F\u95F4\u6BCF\u65E5\u6700\u5C11\u6444\u5165\u70ED\u91CF     ");
		illustration5_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(illustration5_Label);

		label = new JLabel("= \u6BCF\u65E5\u57FA\u672C\u6D88\u8017 - 500(\u6700\u591A)       ");
		label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(label);
		getContentPane().add(input_Panel, BorderLayout.WEST);
	//	getContentPane().add(intergration_Panel, BorderLayout.WEST);

		result1_Panel.add(blank5);

		illustration1_Label = new JLabel("\u6210\u4EBA\u6BCF\u65E5\u9700\u8981\u7684\u70ED\u91CF");
		illustration1_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration1_Label);
		result1_Panel.add(blank2);
		result1_Panel.add(blank3);

		illustration2_Label = new JLabel(
				"= \u4EBA\u4F53\u57FA\u7840\u4EE3\u8C22\u6240\u9700\u6700\u4F4E\u70ED\u91CF        ");
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

		blank2.setOpaque(false);; 
		blank3.setOpaque(false);; 
		blank5.setOpaque(false);;
		bmr_Button.setOpaque(false);;
		blank1_Label.setOpaque(false);;
		blank2_Label.setOpaque(false);;
		sport_Button.setOpaque(false);;
		blank5_Label.setOpaque(false);;
		food_Button.setOpaque(false);;
		back_button.setOpaque(false);;
		blank4_Label.setOpaque(false);;
		bmi_Button.setOpaque(false);;
		illustration2_Label.setOpaque(false);;
		illustration1_Label.setOpaque(false);;
		illustration3_Label.setOpaque(false);;
		illustration4_Label.setOpaque(false);;
		lblX.setOpaque(false);;
		lblNewLabel.setOpaque(false);;
		illustration5_Label.setOpaque(false);;
		label.setOpaque(false);;
		
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
