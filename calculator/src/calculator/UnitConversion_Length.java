package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Window.Type;

public class UnitConversion_Length extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversion_Length JPanel = new UnitConversion_Length();
					JPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JPanel cal_JPanel;
	JPanel explain_JPanel, input_JPanel, result_JPanel, in1_JPanel, in2_JPanel, in3_JPanel, in4_JPanel, in5_JPanel,
			in6_JPanel, in7_JPanel, in8_JPanel, in9_JPanel, in10_JPanel;
	double result0, result1, result2, result3, result4, result5, result6, result7,result8, result9;
	JLabel explain_Label;
	Button ce_Button;
	Button back_Button;
	Button conversion1, conversion2, conversion3, conversion4, conversion5, conversion6, conversion7,
			conversion8,conversion9,conversion10;
	JLabel Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8,Label9,Label10;
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8,textField9,textField10;
	JLabel blank1, blank2, blank3, blank4, blank5, blank6, blank7, blank8, blank9, blank10;
	JLabel blank11;
	JLabel lblNewLabel;

	public UnitConversion_Length() {
		setTitle("\u957F\u5EA6\u5355\u4F4D\u6362\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setSize(780, 480);
		setLocation(200, 200);
		setBackground(Color.LIGHT_GRAY);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));

		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL = new JLabel(img);
		imgL.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
		Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		cal_JPanel = new JPanel();
		cal_JPanel.setOpaque(false);
		cal_JPanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_JPanel.setForeground(new Color(0, 0, 0));
		cal_JPanel.setSize(780, 480);
		cal_JPanel.setLocation(200, 200);
		cal_JPanel.setBackground(Color.LIGHT_GRAY);
		cal_JPanel.setLayout(new BorderLayout(3, 0));

		explain_JPanel = new JPanel();
		explain_JPanel.setOpaque(false);
		explain_JPanel.setFont(new Font("Dialog", Font.PLAIN, 11));
		explain_JPanel.setPreferredSize(new Dimension(770, 23));
		cal_JPanel.add(explain_JPanel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u7F6E\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 16));
		explain_JPanel.add(explain_Label);
		input_JPanel = new JPanel(new GridLayout(5, 2, 5, 2));
		input_JPanel.setOpaque(false);
		input_JPanel.setPreferredSize(new Dimension(770, 245));
		cal_JPanel.add(input_JPanel, BorderLayout.CENTER);
		result_JPanel = new JPanel();
		result_JPanel.setOpaque(false);
		result_JPanel.setPreferredSize(new Dimension(770, 53));
		cal_JPanel.add(result_JPanel, BorderLayout.SOUTH);

		in1_JPanel = new JPanel();
		in1_JPanel.setOpaque(false);
		input_JPanel.add(in1_JPanel);
		Label1 = new JLabel("          \u7C73(metre)         ");
		Label1.setFont(new Font("隶书", Font.BOLD, 21));
		in1_JPanel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 18));
		in1_JPanel.add(textField1);
		textField1.setColumns(22);
		blank1 = new JLabel(" ");
		in1_JPanel.add(blank1);
		conversion1 = new Button("         m>         ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_JPanel.add(conversion1);

		in2_JPanel = new JPanel();
		in2_JPanel.setOpaque(false);
		input_JPanel.add(in2_JPanel);
		Label2 = new JLabel("        \u516C\u91CC(kilometre)       ");
		Label2.setFont(new Font("隶书", Font.BOLD, 21));
		in2_JPanel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 18));
		in2_JPanel.add(textField2);
		textField2.setColumns(22);
		blank2 = new JLabel(" ");
		in2_JPanel.add(blank2);
		conversion2 = new Button("         km>       ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_JPanel.add(conversion2);

		in3_JPanel = new JPanel();
		in3_JPanel.setOpaque(false);
		input_JPanel.add(in3_JPanel);
		Label3 = new JLabel("        \u91CC         ");
		Label3.setFont(new Font("隶书", Font.BOLD, 21));
		in3_JPanel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 18));
		in3_JPanel.add(textField3);
		textField3.setColumns(22);
		blank3 = new JLabel(" ");
		in3_JPanel.add(blank3);
		conversion3 = new Button("         \u91CC>        ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_JPanel.add(conversion3);
		conversion3.addActionListener(this);

		in4_JPanel = new JPanel();
		in4_JPanel.setOpaque(false);
		input_JPanel.add(in4_JPanel);
		Label4 = new JLabel("         \u4E08       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 21));
		in4_JPanel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 18));
		in4_JPanel.add(textField4);
		textField4.setColumns(22);
		blank4 = new JLabel(" ");
		in4_JPanel.add(blank4);
		conversion4 = new Button("         \u4E08>        ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_JPanel.add(conversion4);
		
		in5_JPanel = new JPanel();
		in5_JPanel.setOpaque(false);
		input_JPanel.add(in5_JPanel);
		Label5 = new JLabel("        \u5C3A         ");
		Label5.setFont(new Font("隶书", Font.BOLD, 21));
		in5_JPanel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 18));
		in5_JPanel.add(textField5);
		textField5.setColumns(22);
		blank5 = new JLabel(" ");
		in5_JPanel.add(blank5);
		conversion5 = new Button("         \u5C3A>        ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_JPanel.add(conversion5);
		conversion5.addActionListener(this);

		in6_JPanel = new JPanel();
		in6_JPanel.setOpaque(false);
		input_JPanel.add(in6_JPanel);
		Label6 = new JLabel("           \u5BF8        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 21));
		in6_JPanel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 18));
		in6_JPanel.add(textField6);
		textField6.setColumns(22);
		blank6 = new JLabel(" ");
		in6_JPanel.add(blank6);
		conversion6 = new Button("         \u5BF8>        ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_JPanel.add(conversion6);
		
		in7_JPanel = new JPanel();
		in7_JPanel.setOpaque(false);
		input_JPanel.add(in7_JPanel);
		Label7 = new JLabel("        \u6D77\u91CC(nautical mile)       ");
		Label7.setFont(new Font("隶书", Font.BOLD, 21));
		in7_JPanel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 18));
		in7_JPanel.add(textField7);
		textField7.setColumns(22);
		blank7 = new JLabel(" ");
		in7_JPanel.add(blank7);
		conversion7 = new Button("        \u6D77\u91CC>     ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_JPanel.add(conversion7);

		in8_JPanel = new JPanel();
		in8_JPanel.setOpaque(false);
		input_JPanel.add(in8_JPanel);
		Label8 = new JLabel("           \u82F1\u91CC(mile)        ");
		Label8.setFont(new Font("隶书", Font.BOLD, 21));
		in8_JPanel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 18));
		in8_JPanel.add(textField8);
		textField8.setColumns(22);
		blank8 = new JLabel(" ");
		in8_JPanel.add(blank8);
		conversion8 = new Button("       \u82F1\u91CC>       ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_JPanel.add(conversion8);
		
		in9_JPanel = new JPanel();
		in9_JPanel.setOpaque(false);
		input_JPanel.add(in9_JPanel);
		Label9 = new JLabel("          \u82F1\u5C3A(foot)       ");
		Label9.setFont(new Font("隶书", Font.BOLD, 21));
		in9_JPanel.add(Label9);
		textField9 = new JTextField();
		textField9.setFont(new Font("隶书", Font.PLAIN, 18));
		in9_JPanel.add(textField9);
		textField9.setColumns(22);
		blank9 = new JLabel(" ");
		in9_JPanel.add(blank9);
		conversion9 = new Button("       \u82F1\u5C3A>      ");
		conversion9.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion9.setBackground(UIManager.getColor("Button.light"));
		conversion9.addActionListener(this);
		in9_JPanel.add(conversion9);
		
		in10_JPanel = new JPanel();
		in10_JPanel.setOpaque(false);
		input_JPanel.add(in10_JPanel);
		Label10 = new JLabel("          \u82F1\u5BF8(inch)       ");
		Label10.setFont(new Font("隶书", Font.BOLD, 21));
		in10_JPanel.add(Label10);
		textField10 = new JTextField();
		textField10.setFont(new Font("隶书", Font.PLAIN, 18));
		in10_JPanel.add(textField10);
		textField10.setColumns(22);
		blank10 = new JLabel(" ");
		in10_JPanel.add(blank10);
		conversion10 = new Button("       \u82F1\u5BF8>       ");
		conversion10.setFont(new Font("楷体", Font.PLAIN, 18));
		conversion10.setBackground(UIManager.getColor("Button.light"));
		conversion10.addActionListener(this);
		in10_JPanel.add(conversion10);

		ce_Button = new Button("     \u6E05\u7A7A     ");
		ce_Button.setBackground(UIManager.getColor("Button.background"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 19));
		ce_Button.addActionListener(this);
		
		lblNewLabel = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 5));
		result_JPanel.add(lblNewLabel);
		result_JPanel.add(ce_Button);

		back_Button = new Button("    \u8FD4\u56DE    ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("Times New Roman", Font.BOLD, 19));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversionPage newWindow=new UnitConversionPage();
				newWindow.setVisible(true);
			}
		});		

		blank11 = new JLabel("                     ");
		result_JPanel.add(blank11);
		result_JPanel.add(back_Button);

		contain.add(cal_JPanel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		//m
		if (e.getActionCommand() == "         m>         ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result / 1000;
			this.result2 = result / 500;
			this.result3 = result / 10 * 3;
			this.result4 = result * 3;
			this.result5 = result * 30;
			this.result6 = result / 4828.032000019;
			this.result7 = result / 1609.344;
			this.result8 = result * 100 / 30.48;
			this.result9 = result * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//km
		if (e.getActionCommand() == "         km>       ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result * 1000;
			this.result1 = result * 1;
			this.result2 = result * 1000 / 500;
			this.result3 = result * 1000 / 10 * 3;
			this.result4 = result * 1000 * 3;
			this.result5 = result * 1000 * 30;
			this.result6 = result * 1000 / 4828.032000019;
			this.result7 = result * 1000 / 1609.344;
			this.result8 = result * 1000 * 100 / 30.48;
			this.result9 = result * 1000 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 里
		if (e.getActionCommand() == "         \u91CC>        ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result * 500;
			this.result1 = result * 500 / 1000;
			this.result2 = result * 1;
			this.result3 = result * 500 / 10 * 3;
			this.result4 = result * 500 * 3;
			this.result5 = result * 500 * 30;
			this.result6 = result * 500 / 4828.032000019;
			this.result7 = result * 500 / 1609.344;
			this.result8 = result * 500 * 100 / 30.48;
			this.result9 = result * 500 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 丈
		if (e.getActionCommand() == "         \u4E08>        ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 10 / 3;
			this.result1 = result * 10 / 3 / 1000;
			this.result2 = result * 10 / 3 / 500;
			this.result3 = result * 1;
			this.result4 = result * 10 / 3 * 3;
			this.result5 = result * 10 / 3 * 30;
			this.result6 = result * 10 / 3 / 4828.032000019;
			this.result7 = result * 10 / 3 / 1609.344;
			this.result8 = result * 10 / 3 * 100 / 30.48;
			this.result9 = result * 10 / 3 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//尺
		if (e.getActionCommand() =="         \u5C3A>        ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result / 3;
			this.result1 = result / 3 / 1000;
			this.result2 = result / 3 / 500;
			this.result3 = result / 3 / 10 * 3;
			this.result4 = result * 1;
			this.result5 = result / 3 * 30;
			this.result6 = result / 3 / 4828.032000019;
			this.result7 = result / 3 / 1609.344;
			this.result8 = result / 3 * 100 / 30.48;
			this.result9 = result / 3 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		// 寸
		if (e.getActionCommand() == "         \u5BF8>        ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result / 30;
			this.result1 = result / 30 / 1000;
			this.result2 = result / 30 / 500;
			this.result3 = result / 30 / 10 * 3;
			this.result4 = result / 30 * 3;
			this.result5 = result * 1;
			this.result6 = result / 30 / 4828.032000019;
			this.result7 = result / 30 / 1609.344;
			this.result8 = result / 30 * 100 / 30.48;
			this.result9 = result / 30 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//海里
		if (e.getActionCommand() == "        \u6D77\u91CC>     ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 4828.032000019;
			this.result1 = result * 4828.032000019 / 1000;
			this.result2 = result * 4828.032000019 / 500;
			this.result3 = result * 4828.032000019 / 10 * 3;
			this.result4 = result * 4828.032000019 * 3;
			this.result5 = result * 4828.032000019 * 30;
			this.result6 = result * 1;
			this.result7 = result * 4828.032000019 / 1609.344;
			this.result8 = result * 4828.032000019 * 100 / 30.48;
			this.result9 = result * 4828.032000019 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//英里
		if (e.getActionCommand() == "       \u82F1\u91CC>       ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 1609.344;
			this.result1 = result * 1609.344 / 1000;
			this.result2 = result * 1609.344 / 500;
			this.result3 = result * 1609.344 / 10 * 3;
			this.result4 = result * 1609.344 * 3;
			this.result5 = result * 1609.344 * 30;
			this.result6 = result * 1609.344 / 4828.032000019;
			this.result7 = result * 1;
			this.result8 = result * 1609.344 * 100 / 30.48;
			this.result9 = result * 1609.344 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		
		//英尺
		if (e.getActionCommand() == "       \u82F1\u5C3A>      ") {
			double result = Double.parseDouble(textField9.getText());
			this.result0 = result * 30.48 / 100;
			this.result1 = result * 30.48 / 100 / 1000;
			this.result2 = result * 30.48 / 100 / 500;
			this.result3 = result * 30.48 / 100 / 10 * 3;
			this.result4 = result * 30.48 / 100 * 3;
			this.result5 = result * 30.48 / 100 * 30;
			this.result6 = result * 30.48 / 100 / 4828.032000019;
			this.result7 = result * 30.48 / 100 / 1609.344;
			this.result8 = result * 1;
			this.result9 = result * 30.48 / 100 * 100 / 2.54;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}
		//英寸
		if (e.getActionCommand() == "       \u82F1\u5BF8>       ") {
			double result = Double.parseDouble(textField10.getText());
			this.result0 = result * 2.54 / 100;
			this.result1 = result * 2.54 / 100 / 1000;
			this.result2 = result * 2.54 / 100 / 500;
			this.result3 = result * 2.54 / 100 / 10 * 3;
			this.result4 = result * 2.54 / 100 * 3;
			this.result5 = result * 2.54 / 100 * 30;
			this.result6 = result * 2.54 / 100 / 4828.032000019;
			this.result7 = result * 2.54 / 100 / 1609.344;
			this.result8 = result * 2.54 / 100 * 100 / 30.48;
			this.result9 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
			this.textField9.setText(Double.toString(result8));
			this.textField10.setText(Double.toString(result9));
		}

		// ce
		if (e.getActionCommand() == "     \u6E05\u7A7A     ") {
			this.textField1.setText(" ");
			this.result0 = 0.0;
			this.textField2.setText(" ");
			this.result1 = 0.0;
			this.textField3.setText(" ");
			this.result2 = 0.0;
			this.textField4.setText(" ");
			this.result3 = 0.0;
			this.textField5.setText(" ");
			this.result4 = 0.0;
			this.textField6.setText(" ");
			this.result5 = 0.0;
			this.textField7.setText(" ");
			this.result6 = 0.0;
			this.textField8.setText(" ");
			this.result7 = 0.0;
			this.textField9.setText(" ");
			this.result8 = 0.0;
			this.textField10.setText(" ");
			this.result9 = 0.0;

		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
