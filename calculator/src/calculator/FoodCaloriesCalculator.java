package calculator;

//  ����� 2017111147
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class FoodCaloriesCalculator extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodCaloriesCalculator frame = new FoodCaloriesCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel explain_Panel, input_Panel, result_Panel, in1_Panel, in2_Panel, in3_Panel, in4_Panel, in5_Panel,
			in6_Panel, in7_Panel;
	private JPanel result1_Panel, result2_Panel, result3_Panel;
	private double total_result = 0.0;
	private String choose_result = " ";
	private JLabel explain_Label, class7_Label;
	private JLabel choose_Label;
	private JTextArea textArea;
	private JButton cal_Button;
	private JButton ce_Button;
	private JButton back_Button;
	private JLabel cal_Label_1;
	private JTextField textField;
	private JLabel class1_Label_2;
	private JLabel class2_Label_2;
	private JLabel class5_Label_2;
	private JLabel class6_Label;
	private JLabel class3_Label_2;
	private JLabel class4_Label_2;
	private JPanel in8_Panel;
	private JLabel class8_Label;
	private JComboBox<String> cmb8, cmb1, cmb2, cmb3, cmb4, cmb5, cmb6, cmb7;
	private Button button;

	public FoodCaloriesCalculator() {
		setTitle("\u98DF\u7269\u70ED\u91CF\u8BA1\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocationRelativeTo(null);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setBounds(0, 0, this.getWidth(),this.getHeight());
        this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
        Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);

		explain_Panel = new JPanel();
		explain_Panel.setPreferredSize(new Dimension(770, 40));
		explain_Panel.setOpaque(false);
		getContentPane().add(explain_Panel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u590D\u9009\u6846\u5185\u9009\u62E9\u5404\u7C7B\u98DF\u7269\uFF0C\u8BA1\u7B97\u4EE5\u6807\u660E\u5355\u4F4D\u98DF\u7269\u4E2D\u7684\u5361\u8DEF\u91CC\u542B\u91CF\u4E3A\u57FA\u51C6\u3002");
		explain_Label.setFont(new Font("����", Font.PLAIN, 17));
		explain_Panel.add(explain_Label);
		input_Panel = new JPanel(new GridLayout(2, 4, 5, 5));
		input_Panel.setPreferredSize(new Dimension(770, 230));
		getContentPane().add(input_Panel, BorderLayout.CENTER);
		result_Panel = new JPanel();
		result_Panel.setPreferredSize(new Dimension(770, 140));
		getContentPane().add(result_Panel, BorderLayout.SOUTH);
		input_Panel.setOpaque(false);
		result_Panel.setOpaque(false);

		in1_Panel = new JPanel();
		in1_Panel.setOpaque(false);
		input_Panel.add(in1_Panel);

		class1_Label_2 = new JLabel("\u8C37\u7C7B ");
		class1_Label_2.setForeground(new Color(0, 0, 0));
		class1_Label_2.setFont(new Font("����", Font.BOLD, 24));
		in1_Panel.add(class1_Label_2);
		cmb1 = new JComboBox<String>();
		cmb1.addActionListener(this);
		cmb1.setFont(new Font("����", Font.PLAIN, 20));
		cmb1.addItem("--��ѡ��--");
		cmb1.addItem("�׷�200��");// 316��
		cmb1.addItem("ݯ����200��");// 385��
		cmb1.addItem("����100��");// 336��
		cmb1.addItem("��ͷ100��");// 233��
		cmb1.addItem("ͨ�ķ�100��");// 350��
		cmb1.addItem("����Ƭ100��");// 367��
		cmb1.addItem("������100��");// 472��
		cmb1.addItem("�ձ�100��");// 302��
		cmb1.addItem("����100��");// 386��
		cmb1.addItem("ѪŴ��100��");// 313��
		cmb1.addItem("��׼��100��");// 344��
		cmb1.addItem("����100��");// 337��
		in1_Panel.add(cmb1, BorderLayout.CENTER);
		Button add1 = new Button("��ӹ���");
		add1.setBackground(UIManager.getColor("Button.light"));
		add1.addActionListener(this);
		add1.setFont(new Font("����", Font.BOLD, 18));
		in1_Panel.add(add1, BorderLayout.SOUTH);

		in2_Panel = new JPanel();
		in2_Panel.setOpaque(false);
		input_Panel.add(in2_Panel);

		class2_Label_2 = new JLabel("\u852C\u679C\u7C7B ");
		class2_Label_2.setFont(new Font("����", Font.BOLD, 24));
		in2_Panel.add(class2_Label_2);
		cmb2 = new JComboBox<String>();
		cmb2.setFont(new Font("����", Font.PLAIN, 20));
		cmb2.addItem("--��ѡ��--");
		cmb2.addItem("����90��");// 25��
		cmb2.addItem("���100��");// 20
		cmb2.addItem("�ƶ�ѿ100��");// 45
		cmb2.addItem("�ཷ100��");// 26
		cmb2.addItem("���ܲ�100��");// 37
		cmb2.addItem("���100��");// 38
		cmb2.addItem("�Ȳ�74��");// 25��
		cmb2.addItem("����89��");// 24
		cmb2.addItem("�Ͳ�87��");// 23
		cmb2.addItem("������97��");// 19
		cmb2.addItem("����«73��");// 18
		cmb2.addItem("���81��");// 19
		cmb2.addItem("���81��");// 31
		cmb2.addItem("�۲�Ҷ100��");// 31
		cmb2.addItem("����92��");// 35
		cmb2.addItem("������83��");// 33

		cmb2.addItem("����100��");// 47
		cmb2.addItem("����100��");// 43
		cmb2.addItem("��÷100��");// 28
		cmb2.addItem("������100��");// 51
		cmb2.addItem("����100��");// 35
		cmb2.addItem("����100��");// 43
		cmb2.addItem("������100��");// 33
		cmb2.addItem("⨺���100��");// 56��
		cmb2.addItem("ƻ��100��");// 52
		cmb2.addItem("ӣ��100��");// 46
		in2_Panel.add(cmb2, BorderLayout.CENTER);
		Button add2 = new Button("����߹�");
		add2.setBackground(UIManager.getColor("Button.light"));
		add2.setFont(new Font("����", Font.BOLD, 18));
		add2.addActionListener(this);
		in2_Panel.add(add2, BorderLayout.SOUTH);

		in3_Panel = new JPanel();
		in3_Panel.setOpaque(false);
		input_Panel.add(in3_Panel);

		class3_Label_2 = new JLabel("\u8C46\u5236\u54C1 ");
		class3_Label_2.setFont(new Font("����", Font.BOLD, 24));
		in3_Panel.add(class3_Label_2);
		cmb3 = new JComboBox<String>();
		cmb3.setFont(new Font("����", Font.PLAIN, 20));
		cmb3.addItem("--��ѡ��--");
		cmb3.addItem("�ڶ�100��");// 381
		cmb3.addItem("�϶�ȥƤ100��");// 342
		cmb3.addItem("�ƶ�100��");// 359
		cmb3.addItem("�̶�100��");// 316
		cmb3.addItem("���㶹100");// 313
		cmb3.addItem("±��100��");// 336
		cmb3.addItem("�ƶ���100��");// 418
		cmb3.addItem("����Ƥ100��");// 409
		cmb3.addItem("�Ͷ���100��");// 244
		cmb3.addItem("������100��");// 337
		cmb3.addItem("�̶���100��");// 330
		cmb3.addItem("��ɳ100��");// 336
		cmb3.addItem("�ؼ�100��");// 193
		cmb3.addItem("���100��");// 147
		cmb3.addItem("�Ϻ�����50��");// 138
		in3_Panel.add(cmb3, BorderLayout.CENTER);
		Button add3 = new Button("��Ӷ���Ʒ");
		add3.setBackground(UIManager.getColor("Button.light"));
		add3.setFont(new Font("����", Font.BOLD, 18));
		add3.addActionListener(this);
		in3_Panel.add(add3, BorderLayout.SOUTH);

		in4_Panel = new JPanel();
		in4_Panel.setOpaque(false);
		input_Panel.add(in4_Panel);

		class4_Label_2 = new JLabel("\u6C34\u4EA7\u7C7B ");
		class4_Label_2.setFont(new Font("����", Font.BOLD, 24));
		in4_Panel.add(class4_Label_2);
		cmb4 = new JComboBox<String>();
		cmb4.setFont(new Font("����", Font.PLAIN, 20));
		cmb4.addItem("--��ѡ��--");
		cmb4.addItem("����61��");// 117
		cmb4.addItem("����58��");// 100
		cmb4.addItem("��צ��78��");// 135��
		cmb4.addItem("����76��");// 127
		cmb4.addItem("����65��");// 84
		cmb4.addItem("����59��");// 135��
		cmb4.addItem("ī��69��");// 82
		cmb4.addItem("������57��");// 99
		cmb4.addItem("�����98��");// 313��
		cmb4.addItem("�����66��");// 96
		cmb4.addItem("����84��");// 181
		cmb4.addItem("����59��");// 163
		cmb4.addItem("ɳ����67��");// 88
		cmb4.addItem("����54��");// 108
		cmb4.addItem("����97��");// 84
		cmb4.addItem("��Ϻ57��");// 85
		cmb4.addItem("��Ϻ86��");// 84
		cmb4.addItem("��Ϻ51��");// 79��
		cmb4.addItem("��Ϻ46��");// 90
		cmb4.addItem("��з42��");// 103
		cmb4.addItem("��ΧϺ60��");// 101
		cmb4.addItem("����88��");// 61
		cmb4.addItem("����60��");// 96
		cmb4.addItem("����25��");// 97
		cmb4.addItem("�ɱ�50��");// 132��
		cmb4.addItem("����50��");// 131
		cmb4.addItem("���ӽ�50��");// 126
		cmb4.addItem("����ͷ100��");// 74
		cmb4.addItem("ĵ��100��");// 73
		in4_Panel.add(cmb4, BorderLayout.CENTER);
		Button add4 = new Button("���ˮ��");
		add4.setBackground(UIManager.getColor("Button.light"));
		add4.setFont(new Font("����", Font.BOLD, 18));
		add4.addActionListener(this);
		in4_Panel.add(add4, BorderLayout.SOUTH);

		in5_Panel = new JPanel();
		in5_Panel.setOpaque(false);
		input_Panel.add(in5_Panel);

		class5_Label_2 = new JLabel("\u8089\u7C7B ");
		class5_Label_2.setFont(new Font("����", Font.BOLD, 24));
		in5_Panel.add(class5_Label_2);
		cmb5 = new JComboBox<String>();
		cmb5.setFont(new Font("����", Font.PLAIN, 20));
		cmb5.addItem("--��ѡ��--");
		cmb5.addItem("����100��");// 336��
		cmb5.addItem("�㳦100��");// 508
		cmb5.addItem("ţ��100��");// 107
		cmb5.addItem("��ţ��100��");// 246��
		cmb5.addItem("ţ���100��");// 550
		cmb5.addItem("����100��");// 203
		cmb5.addItem("����100��");// 191��
		cmb5.addItem("����100��");// 184
		cmb5.addItem("��צ100��");// 245
		cmb5.addItem("�ռ�100��");// 240��
		cmb5.addItem("Ѽ��100��");// 240
		cmb5.addItem("Ѽ��100��");// 150
		cmb5.addItem("��Ѽ100��");// 436
		in5_Panel.add(cmb5, BorderLayout.CENTER);
		Button add5 = new Button("�������");
		add5.setBackground(UIManager.getColor("Button.light"));
		add5.setFont(new Font("����", Font.BOLD, 18));
		add5.addActionListener(this);
		in5_Panel.add(add5, BorderLayout.SOUTH);

		in6_Panel = new JPanel();
		in6_Panel.setOpaque(false);
		input_Panel.add(in6_Panel);

		class6_Label = new JLabel("\u86CB\u5976\u7C7B");
		class6_Label.setFont(new Font("����", Font.BOLD, 24));
		in6_Panel.add(class6_Label);
		cmb6 = new JComboBox<String>();
		cmb6.setFont(new Font("����", Font.PLAIN, 20));
		cmb6.addItem("--��ѡ��--");
		cmb6.addItem("ţ��100��");// 54��
		cmb6.addItem("����100��");// 59��
		cmb6.addItem("����100��");// 72��
		cmb6.addItem("����50��");// 164��
		cmb6.addItem("����50��");// 439
		cmb6.addItem("����50��");// 444
		cmb6.addItem("�̷�50��");// 242��
		cmb6.addItem("��Ƭ50��");// 235��
		cmb6.addItem("�̶���100��");// 343��
		cmb6.addItem("����50��");// 170
		cmb6.addItem("����100��");// 144
		cmb6.addItem("������50��");// 164
		cmb6.addItem("������50��");// 30��
		cmb6.addItem("Ѽ��87��");// 180��
		cmb6.addItem("��Ѽ��88��");// 190��
		cmb6.addItem("�ɻ���175��");// 90��
		cmb6.addItem("���ȵ�89��");// 152
		cmb6.addItem("�쵰87��");// 196
		in6_Panel.add(cmb6, BorderLayout.CENTER);
		Button add6 = new Button("��ӵ���");
		add6.setBackground(UIManager.getColor("Button.light"));
		add6.setFont(new Font("����", Font.BOLD, 18));
		add6.addActionListener(this);
		in6_Panel.add(add6, BorderLayout.SOUTH);

		in7_Panel = new JPanel();
		in7_Panel.setOpaque(false);
		input_Panel.add(in7_Panel);
		class7_Label = new JLabel("\u996E\u54C1\u7C7B ");
		class7_Label.setFont(new Font("����", Font.BOLD, 26));
		in7_Panel.add(class7_Label, BorderLayout.NORTH);
		cmb7 = new JComboBox<String>();
		cmb7.setFont(new Font("����", Font.PLAIN, 20));
		cmb7.addItem("--��ѡ��--");
		cmb7.addItem("ơ��1��");// 80��
		cmb7.addItem("��ʿ��30����");// 70
		cmb7.addItem("�ձ���1��");// 110
		cmb7.addItem("���1��");// 80
		cmb7.addItem("��Ȼ��֭1��");// 80
		cmb7.addItem("����֭350����");// 95
		cmb7.addItem("�����1��");// 30��
		cmb7.addItem("����1��");// 110
		cmb7.addItem("����1��");// 67
		cmb7.addItem("��������1Сƿ");// 154
		cmb7.addItem("����250����");// 120
		cmb7.addItem("�ջ���250����");// 90
		in7_Panel.add(cmb7, BorderLayout.CENTER);
		Button add7 = new Button("�������");
		add7.setBackground(UIManager.getColor("Button.light"));
		add7.setFont(new Font("����", Font.BOLD, 18));
		add7.addActionListener(this);
		in7_Panel.add(add7, BorderLayout.SOUTH);

		in8_Panel = new JPanel();
		in8_Panel.setOpaque(false);
		input_Panel.add(in8_Panel);
		class8_Label = new JLabel("\u5916\u5356\u65E5\u5E38");
		class8_Label.setFont(new Font("����", Font.BOLD, 24));
		in8_Panel.add(class8_Label);
		cmb8 = new JComboBox<String>();
		cmb8.setFont(new Font("����", Font.PLAIN, 20));
		cmb8.addItem("--��ѡ��--");
		cmb8.addItem("�����1��");// 200��
		cmb8.addItem("ˮ��1��");// 50
		cmb8.addItem("ը������1��");// 360
		cmb8.addItem("ը����1��");// 180��
		cmb8.addItem("��ɰ���1��");// 120
		cmb8.addItem("����1��");// 540
		cmb8.addItem("ը����1С��");// 280
		cmb8.addItem("������1��");// 420
		cmb8.addItem("����Ȧ1��");// 150
		cmb8.addItem("����1��");// 160
		cmb8.addItem("������1��");// 280
		cmb8.addItem("����˿120��");// 120
		cmb8.addItem("���͵���1С��");// 320
		cmb8.addItem("��˾���1Ƭ");// 70
		cmb8.addItem("�����̲�1��");// 460
		in8_Panel.add(cmb8);
		
		button = new Button("\u6DFB\u52A0\u5C0F\u5403");
		button.setActionCommand("\u6DFB\u52A0\u5C0F\u5403");
		button.setFont(new Font("����", Font.BOLD, 18));
		button.setBackground(SystemColor.controlHighlight);
		in8_Panel.add(button);

		result1_Panel = new JPanel();
		result1_Panel.setOpaque(false);
		result1_Panel.setPreferredSize(new Dimension(318, 126));
		result_Panel.add(result1_Panel, BorderLayout.WEST);

		choose_Label = new JLabel("\u60A8\u9009\u62E9\u7684\u98DF\u7269\uFF1A            ");
		choose_Label.setFont(new Font("����", Font.PLAIN, 20));
		result1_Panel.add(choose_Label);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("����", Font.PLAIN, 18));
		textArea.setRows(2);
		textArea.setColumns(30);
		result1_Panel.add(textArea);
		result2_Panel = new JPanel();
		result2_Panel.setOpaque(false);
		result2_Panel.setPreferredSize(new Dimension(100, 118));
		result_Panel.add(result2_Panel, BorderLayout.CENTER);

		cal_Button = new JButton("   \u8BA1\u7B97   ");
		cal_Button.addActionListener(this);
		cal_Button.setBackground(SystemColor.controlHighlight);
		cal_Button.setFont(new Font("����", Font.BOLD, 19));
		result2_Panel.add(cal_Button);

		ce_Button = new JButton("   \u6E05\u7A7A   ");
		ce_Button.setBackground(SystemColor.controlHighlight);
		ce_Button.setFont(new Font("����", Font.BOLD, 19));
		ce_Button.addActionListener(this);
		result2_Panel.add(ce_Button);

		back_Button = new JButton("   \u8FD4\u56DE   ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("����", Font.BOLD, 19));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HealthLifePage newWindow=new HealthLifePage();
				newWindow.setVisible(true);
			}
		});		
		result2_Panel.add(back_Button);
		result3_Panel = new JPanel();
		result3_Panel.setOpaque(false);
		result3_Panel.setPreferredSize(new Dimension(317, 105));
		result_Panel.add(result3_Panel, BorderLayout.EAST);

		cal_Label_1 = new JLabel("\u70ED\u91CF\u6444\u53D6\u91CF\u4E3A\uFF1A                 ");
		cal_Label_1.setFont(new Font("����", Font.PLAIN, 20));
		result3_Panel.add(cal_Label_1);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textField.setEditable(false);
		result3_Panel.add(textField);
		textField.setColumns(19);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// ����
		if (e.getActionCommand() == "��ӹ���") {
			int choose_index = cmb1.getSelectedIndex() + 1;
			String choose1 = (String) cmb1.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose1;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 316;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 385;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 336;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 233;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 350;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 367;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 472;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 302;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 386;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 313;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 344;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 337;
			}
		}
		// �߹���
		if (e.getActionCommand() == "����߹�") {
			int choose_index = cmb2.getSelectedIndex() + 1;
			String choose2 = (String) cmb2.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose2;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 25;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 20;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 45;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 26;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 37;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 38;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 25;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 24;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 23;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 19;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 18;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 19;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 31;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 31;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 35;
			}
			if (choose_index == 17) {
				this.total_result = this.total_result + 33;
			}
			if (choose_index == 18) {
				this.total_result = this.total_result + 47;
			}
			if (choose_index == 19) {
				this.total_result = this.total_result + 43;
			}
			if (choose_index == 20) {
				this.total_result = this.total_result + 28;
			}
			if (choose_index == 21) {
				this.total_result = this.total_result + 51;
			}
			if (choose_index == 22) {
				this.total_result = this.total_result + 35;
			}
			if (choose_index == 23) {
				this.total_result = this.total_result + 43;
			}
			if (choose_index == 24) {
				this.total_result = this.total_result + 33;
			}
			if (choose_index == 25) {
				this.total_result = this.total_result + 56;
			}
			if (choose_index == 26) {
				this.total_result = this.total_result + 52;
			}
			if (choose_index == 27) {
				this.total_result = this.total_result + 46;
			}
		}
		// ����Ʒ
		if (e.getActionCommand() == "��Ӷ���Ʒ") {
			int choose_index = cmb3.getSelectedIndex() + 1;
			String choose3 = (String) cmb3.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose3;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 381;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 342;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 359;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 316;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 313;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 336;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 418;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 409;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 244;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 337;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 330;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 336;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 193;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 147;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 69;
			}
		}

		// ˮ����
		if (e.getActionCommand() == "���ˮ��") {
			int choose_index = cmb4.getSelectedIndex() + 1;
			String choose4 = (String) cmb4.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose4;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 117;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 100;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 135;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 127;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 84;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 135;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 82;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 99;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 313;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 96;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 181;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 163;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 88;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 108;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 84;
			}
			if (choose_index == 17) {
				this.total_result = this.total_result + 85;
			}
			if (choose_index == 18) {
				this.total_result = this.total_result + 84;
			}
			if (choose_index == 19) {
				this.total_result = this.total_result + 79;
			}
			if (choose_index == 20) {
				this.total_result = this.total_result + 90;
			}
			if (choose_index == 21) {
				this.total_result = this.total_result + 103;
			}
			if (choose_index == 22) {
				this.total_result = this.total_result + 101;
			}
			if (choose_index == 23) {
				this.total_result = this.total_result + 61;
			}
			if (choose_index == 24) {
				this.total_result = this.total_result + 96;
			}
			if (choose_index == 25) {
				this.total_result = this.total_result + 97;
			}
			if (choose_index == 26) {
				this.total_result = this.total_result + 132;
			}
			if (choose_index == 27) {
				this.total_result = this.total_result + 131;
			}
			if (choose_index == 28) {
				this.total_result = this.total_result + 126;
			}
			if (choose_index == 29) {
				this.total_result = this.total_result + 74;
			}
			if (choose_index == 30) {
				this.total_result = this.total_result + 73;
			}
		}
		// "�������"
		if (e.getActionCommand() == "�������") {
			int choose_index = cmb5.getSelectedIndex() + 1;
			String choose5 = (String) cmb5.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose5;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 336;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 508;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 107;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 246;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 550;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 203;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 191;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 184;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 245;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 240;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 240;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 150;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 436;
			}
		}
		//"��ӵ���"
		if (e.getActionCommand() == "��ӵ���") {
			int choose_index = cmb6.getSelectedIndex() + 1;
			String choose6 = (String) cmb6.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose6;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 54;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 59;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 72;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 164;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 439;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 444;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 242;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 235;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 343;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 170;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 144;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 164;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 30;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 180;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 190;
			}
			if (choose_index == 17) {
				this.total_result = this.total_result + 90;
			}
			if (choose_index == 18) {
				this.total_result = this.total_result + 152;
			}
			if (choose_index == 19) {
				this.total_result = this.total_result + 196;
			}
		}
		// "�������"
		if (e.getActionCommand() == "�������") {
			int choose_index = cmb7.getSelectedIndex() + 1;
			String choose7 = (String) cmb7.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose7;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 80;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 70;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 110;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 80;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 80;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 95;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 30;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 110;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 67;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 154;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 120;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 90;
			}
		}
		//"���С��"
		if (e.getActionCommand() == "\u6DFB\u52A0\u5C0F\u5403") {
			int choose_index = cmb8.getSelectedIndex() + 1;
			String choose8 = (String) cmb8.getSelectedItem().toString();
			this.choose_result = this.choose_result + "+" + choose8;
			this.textArea.setText(this.choose_result);
			if (choose_index == 2) {
				this.total_result = this.total_result + 200;
			}
			if (choose_index == 3) {
				this.total_result = this.total_result + 50;
			}
			if (choose_index == 4) {
				this.total_result = this.total_result + 360;
			}
			if (choose_index == 5) {
				this.total_result = this.total_result + 180;
			}
			if (choose_index == 6) {
				this.total_result = this.total_result + 120;
			}
			if (choose_index == 7) {
				this.total_result = this.total_result + 540;
			}
			if (choose_index == 8) {
				this.total_result = this.total_result + 280;
			}
			if (choose_index == 9) {
				this.total_result = this.total_result + 420;
			}
			if (choose_index == 10) {
				this.total_result = this.total_result + 150;
			}
			if (choose_index == 11) {
				this.total_result = this.total_result + 160;
			}
			if (choose_index == 12) {
				this.total_result = this.total_result + 280;
			}
			if (choose_index == 13) {
				this.total_result = this.total_result + 120;
			}
			if (choose_index == 14) {
				this.total_result = this.total_result + 320;
			}
			if (choose_index == 15) {
				this.total_result = this.total_result + 70;
			}
			if (choose_index == 16) {
				this.total_result = this.total_result + 460;
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
		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	
}
