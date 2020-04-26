package calculator;

//  李涢瑶 2017111147
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.awt.Window.Type;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class CaloriesConsumptionCalculator extends JFrame implements ActionListener {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaloriesConsumptionCalculator frame = new CaloriesConsumptionCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel explain_Panel, input1_Panel, input2_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel;
	private JPanel result1_Panel, result2_Panel, result3_Panel;
	private double total_result = 0.0;
	private double weight = 0.0;
	private String choose_result = " ";
	private JLabel explain_Label;
	private JLabel choose_Label;
	private TextArea textArea;
	private Button cal_Button;
	private Button ce_Button;
	private Button back_Button;
	private JLabel cal_Label_1;
	private TextArea textField;
	private JLabel class1_Label_2;
	private JLabel class2_Label_2;
	private JComboBox cmb1, cmb3;
	private JLabel weight_Label;
	private JLabel blank1;
	private JTextField weight_textField;
	private JLabel blank2;
	private JTextField a1_textField;
	private JLabel blank3;
	private JTextField a2_textField;
	private JLabel lblNewLabel;
	private JLabel amount_Label_1;
	private JLabel label;

	public CaloriesConsumptionCalculator() {
		setTitle("\u80FD\u91CF\u6D88\u8017\u8BA1\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(800, 200);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		setLayout(new BorderLayout(3, 3));

		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL = new JLabel(img);
		imgL.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
		Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);

		explain_Panel = new JPanel();
		explain_Panel.setPreferredSize(new Dimension(770, 50));
		add(explain_Panel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u586B\u5199\u4F53\u91CD\u540E\u8BF7\u5728\u590D\u9009\u6846\u5185\u9009\u62E9\u6D3B\u52A8\uFF0C\u5E76\u5728\u5BF9\u5E94\u8F93\u5165\u6846\u4E2D\u6839\u636E\u586B\u5199\u6570\u91CF\uFF0C\u70B9\u51FB\u6DFB\u52A0\u5E76\u8BA1\u7B97\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 17));
		explain_Panel.add(explain_Label);
		input1_Panel = new JPanel();
		input1_Panel.setPreferredSize(new Dimension(145, 230));
		add(input1_Panel, BorderLayout.WEST);

		blank1 = new JLabel("       ");
		blank1.setFont(new Font("宋体", Font.PLAIN, 33));
		input1_Panel.add(blank1);

		weight_Label = new JLabel("\u4F53\u91CD(kg)");
		weight_Label.setFont(new Font("隶书", Font.PLAIN, 23));
		input1_Panel.add(weight_Label);

		blank2 = new JLabel("      ");
		blank2.setFont(new Font("宋体", Font.PLAIN, 23));
		input1_Panel.add(blank2);

		weight_textField = new JTextField();
		weight_textField.setEditable(true);
		weight_textField.setFont(new Font("隶书", Font.PLAIN, 20));
		input1_Panel.add(weight_textField);
		weight_textField.setColumns(10);
		input2_Panel = new JPanel(new GridLayout(4, 1, 5, 5));
		input2_Panel.setPreferredSize(new Dimension(620, 230));
		add(input2_Panel, BorderLayout.CENTER);
		result_Panel = new JPanel();
		result_Panel.setPreferredSize(new Dimension(770, 150));
		add(result_Panel, BorderLayout.SOUTH);

		in1_Panel = new JPanel();
		input2_Panel.add(in1_Panel);

		class1_Label_2 = new JLabel("\u65E5\u5E38\u6D3B\u52A8     ");
		class1_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in1_Panel.add(class1_Label_2);
		cmb1 = new JComboBox();
		cmb1.addActionListener(this);
		cmb1.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb1.addItem("----------请选择----------");
		cmb1.addItem("以1小时5公里在硬地上走路/半小时");// 316大卡
		cmb1.addItem("以1小时8公里在硬地上走路/半小时");// 385大卡
		cmb1.addItem("以1小时9公里骑单车/半小时");// 336大卡
		cmb1.addItem("以1小时16公里骑单车/半小时");// 336大卡
		cmb1.addItem("以1小时21公里骑单车/半小时");// 233大卡
		cmb1.addItem("工作/半小时");// 350大卡
		cmb1.addItem("开车/半小时");// 367大卡
		cmb1.addItem("读书/半小时");// 350大卡
		cmb1.addItem("午睡/半小时");// 367大卡
		cmb1.addItem("看电视/半小时");// 350大卡
		cmb1.addItem("泡澡/半小时");// 367大卡
		cmb1.addItem("逛街/半小时");// 350大卡
		cmb1.addItem("出门购物/半小时");// 367大卡
		cmb1.addItem("打扫/半小时");// 350大卡
		cmb1.addItem("洗碗/半小时");// 367大卡
		cmb1.addItem("遛狗/半小时");// 350大卡
		cmb1.addItem("郊游/半小时");// 367大卡

		in1_Panel.add(cmb1, BorderLayout.CENTER);

		in2_Panel = new JPanel();
		input2_Panel.add(in2_Panel);

		Button add2 = new Button("添加日常活动");
		add2.setBackground(UIManager.getColor("Button.light"));
		add2.setFont(new Font("隶书", Font.BOLD, 19));
		add2.addActionListener(this);

		amount_Label_1 = new JLabel("\u586B\u5199\u6570\u91CF\uFF1A");
		amount_Label_1.setFont(new Font("隶书", Font.PLAIN, 22));
		in2_Panel.add(amount_Label_1);

		a2_textField = new JTextField();
		a2_textField.setFont(new Font("隶书", Font.PLAIN, 20));
		in2_Panel.add(a2_textField);
		a2_textField.setColumns(17);

		lblNewLabel = new JLabel("        ");
		in2_Panel.add(lblNewLabel);
		in2_Panel.add(add2, BorderLayout.SOUTH);

		in3_Panel = new JPanel();
		input2_Panel.add(in3_Panel);

		class2_Label_2 = new JLabel("\u4F53\u80B2\u6D3B\u52A8     ");
		class2_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in3_Panel.add(class2_Label_2);
		cmb3 = new JComboBox();
		cmb3.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb3.addItem("----------请选择----------");
		cmb3.addItem("以5分钟400米在操场上跑步/400米");
		cmb3.addItem("以3分钟400米在操场上跑步/400米");
		cmb3.addItem("慢跑+长跑一次不少于3公里/1公里");
		cmb3.addItem("游泳随意游/10分钟");
		cmb3.addItem("游泳自由泳或仰泳/10分钟");
		cmb3.addItem("游泳蛙泳/10分钟");
		cmb3.addItem("游泳蝶泳/10分钟");
		cmb3.addItem("减肥健美操，强度较大/10分钟");// 316
		cmb3.addItem("以1分钟200下跳绳/1分钟");// 313
		cmb3.addItem("打高尔夫球/半小时");// 336
		cmb3.addItem("打篮球/15分钟");// 418
		cmb3.addItem("打网球/15分钟");// 418
		cmb3.addItem("打乒乓球/15分钟");// 418
		cmb3.addItem("打排球/15分钟");// 418
		cmb3.addItem("滑旱冰/15分钟");// 418
		cmb3.addItem("仰卧起坐/15分钟");// 418
		in3_Panel.add(cmb3, BorderLayout.CENTER);

		in4_Panel = new JPanel();
		input2_Panel.add(in4_Panel);

		Button add4 = new Button("添加体育运动");
		add4.setBackground(UIManager.getColor("Button.light"));
		add4.setFont(new Font("隶书", Font.BOLD, 19));
		add4.addActionListener(this);

		label = new JLabel("\u586B\u5199\u6570\u91CF\uFF1A");
		label.setFont(new Font("隶书", Font.PLAIN, 22));
		in4_Panel.add(label);

		a1_textField = new JTextField();
		a1_textField.setFont(new Font("隶书", Font.PLAIN, 20));
		in4_Panel.add(a1_textField);
		a1_textField.setColumns(17);

		blank3 = new JLabel("        ");
		in4_Panel.add(blank3);
		in4_Panel.add(add4, BorderLayout.SOUTH);

		result1_Panel = new JPanel();
		result1_Panel.setPreferredSize(new Dimension(325, 135));
		result_Panel.add(result1_Panel, BorderLayout.WEST);

		choose_Label = new JLabel("\u60A8\u6DFB\u52A0\u7684\u6D3B\u52A8\u91CF\uFF1A          ");
		choose_Label.setFont(new Font("隶书", Font.PLAIN, 20));
		result1_Panel.add(choose_Label);

		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 19));
		textArea.setRows(2);
		textArea.setColumns(25);
		result1_Panel.add(textArea);
		result2_Panel = new JPanel();
		result2_Panel.setPreferredSize(new Dimension(100, 118));
		result_Panel.add(result2_Panel, BorderLayout.CENTER);

		cal_Button = new Button("   \u8BA1\u7B97   ");
		cal_Button.addActionListener(this);
		cal_Button.setBackground(UIManager.getColor("Button.light"));
		cal_Button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		result2_Panel.add(cal_Button);

		ce_Button = new Button("   \u6E05\u7A7A   ");
		ce_Button.setBackground(UIManager.getColor("Button.light"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ce_Button.addActionListener(this);
		result2_Panel.add(ce_Button);

		back_Button = new Button("   \u8FD4\u56DE   ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HealthLifePage newWindow = new HealthLifePage();
				newWindow.setVisible(true);
			}
		});
		result2_Panel.add(back_Button);
		result3_Panel = new JPanel();
		result3_Panel.setPreferredSize(new Dimension(318, 135));
		result_Panel.add(result3_Panel, BorderLayout.EAST);

		cal_Label_1 = new JLabel("\u60A8\u7684\u70ED\u91CF\u6D88\u8017\u4E3A\uFF1A");
		cal_Label_1.setFont(new Font("隶书", Font.PLAIN, 20));
		result3_Panel.add(cal_Label_1);

		textField = new TextArea();
		textField.setRows(2);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textField.setEditable(false);
		result3_Panel.add(textField);
		textField.setColumns(20);

		explain_Panel.setOpaque(false);
		input1_Panel.setOpaque(false);
		input2_Panel.setOpaque(false);
		result_Panel.setOpaque(false);
		in1_Panel.setOpaque(false);
		in2_Panel.setOpaque(false);
		in3_Panel.setOpaque(false);
		in4_Panel.setOpaque(false);

		result1_Panel.setOpaque(false);
		result2_Panel.setOpaque(false);
		result3_Panel.setOpaque(false);
		;

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// 日常
		if (e.getActionCommand() == "添加日常活动") {
			int choose_index = cmb1.getSelectedIndex() + 1;
			double amount = Double.parseDouble(a2_textField.getText());
			weight = Double.parseDouble(weight_textField.getText());
			String choose1 = (String) cmb1.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+(" + choose1 + ")*" + amount;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + weight * amount * 1.875;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + weight * amount * 4.08;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + weight * amount * 1.80;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + weight * amount * 3.05;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + weight * amount * 4.81;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + weight * amount * 0.5588;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + weight * amount * 0.6029;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + weight * amount * 0.6471;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + weight * amount * 0.3529;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + weight * amount * 0.5294;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + weight * amount * 1.2352;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + weight * amount * 0.8088;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + weight * amount * 1.3235;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + weight * amount * 1.6764;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + weight * amount;
			}
			if (choose_index == 17) {
				this.total_result = this.total_result + weight * amount * 0.9558;
			}
			if (choose_index == 18) {
				this.total_result = this.total_result + weight * amount * 1.7647;
			}
		}
		// 体育活动
		if (e.getActionCommand() == "添加体育运动") {
			int choose_index = cmb3.getSelectedIndex() + 1;
			double amount = Double.parseDouble(a1_textField.getText());
			weight = Double.parseDouble(weight_textField.getText());
			String choose3 = (String) cmb3.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+(" + choose3 + ")*" + amount;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 6 * weight * amount / 12;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 10 * weight * amount / 20;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + weight * amount * 1.036;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 6 * weight * amount / 6;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 10 * weight * amount / 6;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 11 * weight * amount / 6;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 14 * weight * amount / 6;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 6.72 * weight * amount / 60;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 3 * amount * weight / 6;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 2.5 * amount * weight;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 2.5 * amount * weight;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 2.2 * amount * weight;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 1.75 * amount * weight;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 1.72 * amount * weight;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 1.72 * amount * weight;
			}
			if (choose_index == 17) {
				this.total_result = this.total_result + 1.5882 * amount * weight;
			}
		}

		// cal
		if (e.getActionCommand() == "   \u8BA1\u7B97   ") {
			this.textField
					.setText(Double.toString(total_result) + "kCal = " + Double.toString(total_result * 4.186) + "kJ");
		}
		// ce
		if (e.getActionCommand() == "   \u6E05\u7A7A   ") {
			this.textField.setText(" ");
			this.textArea.setText(" ");
			this.total_result = 0.0;
			this.choose_result = " ";
			this.weight = 0.0;
			this.a1_textField.setText("");
			this.a2_textField.setText("");
			this.weight_textField.setText(" ");
		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

}
