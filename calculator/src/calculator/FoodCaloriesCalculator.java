package calculator;

//  李涢瑶 2017111147
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
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 17));
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
		class1_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in1_Panel.add(class1_Label_2);
		cmb1 = new JComboBox<String>();
		cmb1.addActionListener(this);
		cmb1.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb1.addItem("--请选择--");
		cmb1.addItem("米饭200克");// 316大卡
		cmb1.addItem("莜麦面200克");// 385大卡
		cmb1.addItem("玉米100克");// 336大卡
		cmb1.addItem("馒头100克");// 233大卡
		cmb1.addItem("通心粉100克");// 350大卡
		cmb1.addItem("燕麦片100克");// 367大卡
		cmb1.addItem("方便面100克");// 472大卡
		cmb1.addItem("烧饼100克");// 302大卡
		cmb1.addItem("油条100克");// 386大卡
		cmb1.addItem("血糯米100克");// 313大卡
		cmb1.addItem("标准粉100克");// 344大卡
		cmb1.addItem("粉条100克");// 337大卡
		in1_Panel.add(cmb1, BorderLayout.CENTER);
		Button add1 = new Button("添加谷类");
		add1.setBackground(UIManager.getColor("Button.light"));
		add1.addActionListener(this);
		add1.setFont(new Font("隶书", Font.BOLD, 18));
		in1_Panel.add(add1, BorderLayout.SOUTH);

		in2_Panel = new JPanel();
		in2_Panel.setOpaque(false);
		input_Panel.add(in2_Panel);

		class2_Label_2 = new JLabel("\u852C\u679C\u7C7B ");
		class2_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_Panel.add(class2_Label_2);
		cmb2 = new JComboBox<String>();
		cmb2.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb2.addItem("--请选择--");
		cmb2.addItem("茄子90克");// 25大卡
		cmb2.addItem("青菜100克");// 20
		cmb2.addItem("黄豆芽100克");// 45
		cmb2.addItem("青椒100克");// 26
		cmb2.addItem("胡萝卜100克");// 37
		cmb2.addItem("洋葱100克");// 38
		cmb2.addItem("苋菜74克");// 25大卡
		cmb2.addItem("菠菜89克");// 24
		cmb2.addItem("油菜87克");// 23
		cmb2.addItem("西红柿97克");// 19
		cmb2.addItem("西葫芦73克");// 18
		cmb2.addItem("苦瓜81克");// 19
		cmb2.addItem("香菜81克");// 31
		cmb2.addItem("芹菜叶100克");// 31
		cmb2.addItem("刀豆92克");// 35
		cmb2.addItem("西兰花83克");// 33

		cmb2.addItem("橙子100克");// 47
		cmb2.addItem("橘子100克");// 43
		cmb2.addItem("杨梅100克");// 28
		cmb2.addItem("火龙果100克");// 51
		cmb2.addItem("柠檬100克");// 35
		cmb2.addItem("葡萄100克");// 43
		cmb2.addItem("葡萄柚100克");// 33
		cmb2.addItem("猕猴桃100克");// 56大卡
		cmb2.addItem("苹果100克");// 52
		cmb2.addItem("樱桃100克");// 46
		in2_Panel.add(cmb2, BorderLayout.CENTER);
		Button add2 = new Button("添加蔬果");
		add2.setBackground(UIManager.getColor("Button.light"));
		add2.setFont(new Font("隶书", Font.BOLD, 18));
		add2.addActionListener(this);
		in2_Panel.add(add2, BorderLayout.SOUTH);

		in3_Panel = new JPanel();
		in3_Panel.setOpaque(false);
		input_Panel.add(in3_Panel);

		class3_Label_2 = new JLabel("\u8C46\u5236\u54C1 ");
		class3_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in3_Panel.add(class3_Label_2);
		cmb3 = new JComboBox<String>();
		cmb3.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb3.addItem("--请选择--");
		cmb3.addItem("黑豆100克");// 381
		cmb3.addItem("蚕豆去皮100克");// 342
		cmb3.addItem("黄豆100克");// 359
		cmb3.addItem("绿豆100克");// 316
		cmb3.addItem("干豌豆100");// 313
		cmb3.addItem("卤干100克");// 336
		cmb3.addItem("黄豆粉100克");// 418
		cmb3.addItem("豆腐皮100克");// 409
		cmb3.addItem("油豆腐100克");// 244
		cmb3.addItem("土豆粉100克");// 337
		cmb3.addItem("绿豆面100克");// 330
		cmb3.addItem("豆沙100克");// 336
		cmb3.addItem("素鸡100克");// 193
		cmb3.addItem("香干100克");// 147
		cmb3.addItem("上海南乳50克");// 138
		in3_Panel.add(cmb3, BorderLayout.CENTER);
		Button add3 = new Button("添加豆制品");
		add3.setBackground(UIManager.getColor("Button.light"));
		add3.setFont(new Font("隶书", Font.BOLD, 18));
		add3.addActionListener(this);
		in3_Panel.add(add3, BorderLayout.SOUTH);

		in4_Panel = new JPanel();
		in4_Panel.setOpaque(false);
		input_Panel.add(in4_Panel);

		class4_Label_2 = new JLabel("\u6C34\u4EA7\u7C7B ");
		class4_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in4_Panel.add(class4_Label_2);
		cmb4 = new JComboBox<String>();
		cmb4.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb4.addItem("--请选择--");
		cmb4.addItem("桂鱼61克");// 117
		cmb4.addItem("鲈鱼58克");// 100
		cmb4.addItem("八爪鱼78克");// 135大卡
		cmb4.addItem("带鱼76克");// 127
		cmb4.addItem("鲍鱼65克");// 84
		cmb4.addItem("鳊鱼59克");// 135大卡
		cmb4.addItem("墨鱼69克");// 82
		cmb4.addItem("虹鳟鱼57克");// 99
		cmb4.addItem("鱿鱼干98克");// 313大卡
		cmb4.addItem("大黄鱼66克");// 96
		cmb4.addItem("河鳗84克");// 181
		cmb4.addItem("海螺59克");// 163
		cmb4.addItem("沙丁鱼67克");// 88
		cmb4.addItem("鲫鱼54克");// 108
		cmb4.addItem("乌贼97克");// 84
		cmb4.addItem("明虾57克");// 85
		cmb4.addItem("河虾86克");// 84
		cmb4.addItem("海虾51克");// 79大卡
		cmb4.addItem("龙虾46克");// 90
		cmb4.addItem("河蟹42克");// 103
		cmb4.addItem("基围虾60克");// 101
		cmb4.addItem("黄鳝88克");// 61
		cmb4.addItem("泥鳅60克");// 96
		cmb4.addItem("蛤蜊25克");// 97
		cmb4.addItem("干贝50克");// 132大卡
		cmb4.addItem("海参50克");// 131
		cmb4.addItem("鱼子酱50克");// 126
		cmb4.addItem("海蜇头100克");// 74
		cmb4.addItem("牡蛎100克");// 73
		in4_Panel.add(cmb4, BorderLayout.CENTER);
		Button add4 = new Button("添加水产");
		add4.setBackground(UIManager.getColor("Button.light"));
		add4.setFont(new Font("隶书", Font.BOLD, 18));
		add4.addActionListener(this);
		in4_Panel.add(add4, BorderLayout.SOUTH);

		in5_Panel = new JPanel();
		in5_Panel.setOpaque(false);
		input_Panel.add(in5_Panel);

		class5_Label_2 = new JLabel("\u8089\u7C7B ");
		class5_Label_2.setFont(new Font("隶书", Font.BOLD, 24));
		in5_Panel.add(class5_Label_2);
		cmb5 = new JComboBox<String>();
		cmb5.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb5.addItem("--请选择--");
		cmb5.addItem("猪肉100克");// 336大卡
		cmb5.addItem("香肠100克");// 508
		cmb5.addItem("牛肉100克");// 107
		cmb5.addItem("酱牛肉100克");// 246大卡
		cmb5.addItem("牛肉干100克");// 550
		cmb5.addItem("羊肉100克");// 203
		cmb5.addItem("鸡翅100克");// 191大卡
		cmb5.addItem("鸡腿100克");// 184
		cmb5.addItem("鸡爪100克");// 245
		cmb5.addItem("烧鸡100克");// 240大卡
		cmb5.addItem("鸭肉100克");// 240
		cmb5.addItem("鸭掌100克");// 150
		cmb5.addItem("烤鸭100克");// 436
		in5_Panel.add(cmb5, BorderLayout.CENTER);
		Button add5 = new Button("添加肉类");
		add5.setBackground(UIManager.getColor("Button.light"));
		add5.setFont(new Font("隶书", Font.BOLD, 18));
		add5.addActionListener(this);
		in5_Panel.add(add5, BorderLayout.SOUTH);

		in6_Panel = new JPanel();
		in6_Panel.setOpaque(false);
		input_Panel.add(in6_Panel);

		class6_Label = new JLabel("\u86CB\u5976\u7C7B");
		class6_Label.setFont(new Font("隶书", Font.BOLD, 24));
		in6_Panel.add(class6_Label);
		cmb6 = new JComboBox<String>();
		cmb6.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb6.addItem("--请选择--");
		cmb6.addItem("牛乳100克");// 54大卡
		cmb6.addItem("羊奶100克");// 59大卡
		cmb6.addItem("酸奶100克");// 72大卡
		cmb6.addItem("奶酪50克");// 164大卡
		cmb6.addItem("奶油50克");// 439
		cmb6.addItem("黄油50克");// 444
		cmb6.addItem("奶粉50克");// 242大卡
		cmb6.addItem("奶片50克");// 235大卡
		cmb6.addItem("奶豆腐100克");// 343大卡
		cmb6.addItem("炼乳50克");// 170
		cmb6.addItem("鸡蛋100克");// 144
		cmb6.addItem("鸡蛋黄50克");// 164
		cmb6.addItem("鸡蛋白50克");// 30大卡
		cmb6.addItem("鸭蛋87克");// 180大卡
		cmb6.addItem("咸鸭蛋88克");// 190大卡
		cmb6.addItem("松花蛋175克");// 90大卡
		cmb6.addItem("鹌鹑蛋89克");// 152
		cmb6.addItem("鹅蛋87克");// 196
		in6_Panel.add(cmb6, BorderLayout.CENTER);
		Button add6 = new Button("添加蛋奶");
		add6.setBackground(UIManager.getColor("Button.light"));
		add6.setFont(new Font("隶书", Font.BOLD, 18));
		add6.addActionListener(this);
		in6_Panel.add(add6, BorderLayout.SOUTH);

		in7_Panel = new JPanel();
		in7_Panel.setOpaque(false);
		input_Panel.add(in7_Panel);
		class7_Label = new JLabel("\u996E\u54C1\u7C7B ");
		class7_Label.setFont(new Font("隶书", Font.BOLD, 26));
		in7_Panel.add(class7_Label, BorderLayout.NORTH);
		cmb7 = new JComboBox<String>();
		cmb7.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb7.addItem("--请选择--");
		cmb7.addItem("啤酒1杯");// 80大卡
		cmb7.addItem("威士忌30毫升");// 70
		cmb7.addItem("日本酒1杯");// 110
		cmb7.addItem("红酒1杯");// 80
		cmb7.addItem("天然橙汁1杯");// 80
		cmb7.addItem("果菜汁350毫升");// 95
		cmb7.addItem("朱古力1杯");// 30大卡
		cmb7.addItem("可乐1罐");// 110
		cmb7.addItem("咖啡1罐");// 67
		cmb7.addItem("乳酸饮料1小瓶");// 154
		cmb7.addItem("甜豆奶250毫升");// 120
		cmb7.addItem("菊花茶250毫升");// 90
		in7_Panel.add(cmb7, BorderLayout.CENTER);
		Button add7 = new Button("添加饮料");
		add7.setBackground(UIManager.getColor("Button.light"));
		add7.setFont(new Font("隶书", Font.BOLD, 18));
		add7.addActionListener(this);
		in7_Panel.add(add7, BorderLayout.SOUTH);

		in8_Panel = new JPanel();
		in8_Panel.setOpaque(false);
		input_Panel.add(in8_Panel);
		class8_Label = new JLabel("\u5916\u5356\u65E5\u5E38");
		class8_Label.setFont(new Font("隶书", Font.BOLD, 24));
		in8_Panel.add(class8_Label);
		cmb8 = new JComboBox<String>();
		cmb8.setFont(new Font("隶书", Font.PLAIN, 20));
		cmb8.addItem("--请选择--");
		cmb8.addItem("鲜肉包1个");// 200大卡
		cmb8.addItem("水饺1个");// 50
		cmb8.addItem("炸臭豆腐1份");// 360
		cmb8.addItem("炸春卷1条");// 180大卡
		cmb8.addItem("煎荷包蛋1个");// 120
		cmb8.addItem("汉堡1个");// 540
		cmb8.addItem("炸薯条1小包");// 280
		cmb8.addItem("三明治1个");// 420
		cmb8.addItem("甜甜圈1个");// 150
		cmb8.addItem("布丁1个");// 160
		cmb8.addItem("冰激淋1个");// 280
		cmb8.addItem("鱿鱼丝120克");// 120
		cmb8.addItem("奶油蛋糕1小块");// 320
		cmb8.addItem("吐司面包1片");// 70
		cmb8.addItem("珍珠奶茶1杯");// 460
		in8_Panel.add(cmb8);
		
		button = new Button("\u6DFB\u52A0\u5C0F\u5403");
		button.setActionCommand("\u6DFB\u52A0\u5C0F\u5403");
		button.setFont(new Font("隶书", Font.BOLD, 18));
		button.setBackground(SystemColor.controlHighlight);
		in8_Panel.add(button);

		result1_Panel = new JPanel();
		result1_Panel.setOpaque(false);
		result1_Panel.setPreferredSize(new Dimension(318, 126));
		result_Panel.add(result1_Panel, BorderLayout.WEST);

		choose_Label = new JLabel("\u60A8\u9009\u62E9\u7684\u98DF\u7269\uFF1A            ");
		choose_Label.setFont(new Font("隶书", Font.PLAIN, 20));
		result1_Panel.add(choose_Label);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 18));
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
		cal_Button.setFont(new Font("隶书", Font.BOLD, 19));
		result2_Panel.add(cal_Button);

		ce_Button = new JButton("   \u6E05\u7A7A   ");
		ce_Button.setBackground(SystemColor.controlHighlight);
		ce_Button.setFont(new Font("隶书", Font.BOLD, 19));
		ce_Button.addActionListener(this);
		result2_Panel.add(ce_Button);

		back_Button = new JButton("   \u8FD4\u56DE   ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("隶书", Font.BOLD, 19));
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
		cal_Label_1.setFont(new Font("隶书", Font.PLAIN, 20));
		result3_Panel.add(cal_Label_1);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textField.setEditable(false);
		result3_Panel.add(textField);
		textField.setColumns(19);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// 谷类
		if (e.getActionCommand() == "添加谷类") {
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
		// 蔬果类
		if (e.getActionCommand() == "添加蔬果") {
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
		// 豆制品
		if (e.getActionCommand() == "添加豆制品") {
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

		// 水产类
		if (e.getActionCommand() == "添加水产") {
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
		// "添加肉类"
		if (e.getActionCommand() == "添加肉类") {
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
		//"添加蛋奶"
		if (e.getActionCommand() == "添加蛋奶") {
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
		// "添加饮料"
		if (e.getActionCommand() == "添加饮料") {
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
		//"添加小吃"
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
