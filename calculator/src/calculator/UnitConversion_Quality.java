package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UnitConversion_Quality extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversion_Quality JJPanel = new UnitConversion_Quality();
					JJPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JPanel cal_JPanel;
	JPanel explain_JPanel, input_JPanel, result_JPanel, in1_JPanel, in2_JPanel, in3_JPanel, in4_JPanel, in5_JPanel,
			in6_JPanel, in7_JPanel, in8_JPanel;
	double result0, result1, result2, result3, result4, result5, result6, result7 = 0.0;
	JLabel explain_Label;
	Button ce_Button;
	Button back_Button;
	Button conversion1, conversion2, conversion3, conversion4, conversion5, conversion6, conversion7,
			conversion8;
	JLabel Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8;
	JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
	JLabel blank1, blank2, blank3, blank4, blank5, blank6, blank7, blank8;
	JLabel blank10;
	JLabel blank9;

	public UnitConversion_Quality() {
		setTitle("\u91CD\u91CF\u5355\u4F4D\u6362\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(new Color(0, 0, 0));
		setSize(780, 480);
		setLocationRelativeTo(null);
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
		cal_JPanel.setLayout(new BorderLayout(3, 3));

		explain_JPanel = new JPanel();
		explain_JPanel.setOpaque(false);
		explain_JPanel.setPreferredSize(new Dimension(770, 40));
		cal_JPanel.add(explain_JPanel, BorderLayout.NORTH);

		explain_Label = new JLabel(
				"\u4F7F\u7528\u8BF4\u660E\uFF1A\u8BF7\u5728\u5BF9\u5E94\u5355\u4F4D\u4E4B\u524D\u7684\u8F93\u5165\u6846\u5185\u586B\u5199\u6570\u5B57\u5E76\u70B9\u51FB\u8BE5\u8F93\u5165\u6846\u540E\u7684\u6309\u94AE\u8FDB\u884C\u6362\u7B97\uFF0C\u70B9\u51FBCE\u91CD\u6765\u3002");
		explain_Label.setFont(new Font("隶书", Font.PLAIN, 17));
		explain_JPanel.add(explain_Label);
		input_JPanel = new JPanel(new GridLayout(4, 2, 5, 5));
		input_JPanel.setOpaque(false);
		input_JPanel.setPreferredSize(new Dimension(770, 230));
		cal_JPanel.add(input_JPanel, BorderLayout.CENTER);
		result_JPanel = new JPanel();
		result_JPanel.setOpaque(false);
		result_JPanel.setPreferredSize(new Dimension(770, 65));
		cal_JPanel.add(result_JPanel, BorderLayout.SOUTH);

		in1_JPanel = new JPanel();
		in1_JPanel.setOpaque(false);
		input_JPanel.add(in1_JPanel);
		Label1 = new JLabel("        \u516C\u65A4(kg)       ");
		Label1.setFont(new Font("隶书", Font.BOLD, 24));
		in1_JPanel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 19));
		in1_JPanel.add(textField1);
		textField1.setColumns(19);
		blank1 = new JLabel(" ");
		in1_JPanel.add(blank1);
		conversion1 = new Button("      \u516C\u65A4>     ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_JPanel.add(conversion1);

		in2_JPanel = new JPanel();
		in2_JPanel.setOpaque(false);
		input_JPanel.add(in2_JPanel);
		Label2 = new JLabel("        \u514B(g)        ");
		Label2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_JPanel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 19));
		in2_JPanel.add(textField2);
		textField2.setColumns(19);
		blank2 = new JLabel(" ");
		in2_JPanel.add(blank2);
		conversion2 = new Button("       \u514B>       ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_JPanel.add(conversion2);
		
		in3_JPanel = new JPanel();
		in3_JPanel.setOpaque(false);
		input_JPanel.add(in3_JPanel);
		Label3 = new JLabel("        \u5E02\u65A4        ");
		Label3.setFont(new Font("隶书", Font.BOLD, 24));
		in3_JPanel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 19));
		in3_JPanel.add(textField3);
		textField3.setColumns(19);
		blank3 = new JLabel(" ");
		in3_JPanel.add(blank3);
		conversion3 = new Button("      \u5E02\u65A4>     ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_JPanel.add(conversion3);
		conversion3.addActionListener(this);

		in4_JPanel = new JPanel();
		in4_JPanel.setOpaque(false);
		input_JPanel.add(in4_JPanel);
		Label4 = new JLabel("        \u62C5        ");
		Label4.setFont(new Font("隶书", Font.BOLD, 24));
		in4_JPanel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 19));
		in4_JPanel.add(textField4);
		textField4.setColumns(19);
		blank4 = new JLabel(" ");
		in4_JPanel.add(blank4);
		conversion4 = new Button("       \u62C5>       ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_JPanel.add(conversion4);
		
		in5_JPanel = new JPanel();
		in5_JPanel.setOpaque(false);
		input_JPanel.add(in5_JPanel);
		Label5 = new JLabel("             \u4E24             ");
		Label5.setFont(new Font("隶书", Font.BOLD, 24));
		in5_JPanel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 19));
		in5_JPanel.add(textField5);
		textField5.setColumns(19);
		blank5 = new JLabel(" ");
		in5_JPanel.add(blank5);
		conversion5 = new Button("       \u4E24>       ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_JPanel.add(conversion5);
		conversion5.addActionListener(this);
		
		in6_JPanel = new JPanel();
		in6_JPanel.setOpaque(false);
		input_JPanel.add(in6_JPanel);
		Label6 = new JLabel("        \u94B1        ");
		Label6.setFont(new Font("隶书", Font.BOLD, 24));
		in6_JPanel.add(Label6);
		textField6 = new JTextField();
		textField6.setFont(new Font("隶书", Font.PLAIN, 19));
		in6_JPanel.add(textField6);
		textField6.setColumns(19);
		blank6 = new JLabel(" ");
		in6_JPanel.add(blank6);
		conversion6 = new Button("       \u94B1>       ");
		conversion6.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion6.setBackground(UIManager.getColor("Button.light"));
		conversion6.addActionListener(this);
		in6_JPanel.add(conversion6);
		
		in7_JPanel = new JPanel();
		in7_JPanel.setOpaque(false);
		input_JPanel.add(in7_JPanel);
		Label7 = new JLabel("        \u78C5(lb)        ");
		Label7.setFont(new Font("隶书", Font.BOLD, 24));
		in7_JPanel.add(Label7);
		textField7 = new JTextField();
		textField7.setFont(new Font("隶书", Font.PLAIN, 19));
		in7_JPanel.add(textField7);
		textField7.setColumns(19);
		blank7 = new JLabel(" ");
		in7_JPanel.add(blank7);
		conversion7 = new Button("       \u78C5>       ");
		conversion7.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion7.setBackground(UIManager.getColor("Button.light"));
		conversion7.addActionListener(this);
		in7_JPanel.add(conversion7);

		in8_JPanel = new JPanel();
		in8_JPanel.setOpaque(false);
		input_JPanel.add(in8_JPanel);
		Label8 = new JLabel("        \u76CE\u53F8(oz)        ");
		Label8.setFont(new Font("隶书", Font.BOLD, 24));
		in8_JPanel.add(Label8);
		textField8 = new JTextField();
		textField8.setFont(new Font("隶书", Font.PLAIN, 19));
		in8_JPanel.add(textField8);
		textField8.setColumns(19);
		blank8 = new JLabel(" ");
		in8_JPanel.add(blank8);
		conversion8 = new Button("      \u76CE\u53F8>     ");
		conversion8.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion8.setBackground(UIManager.getColor("Button.light"));
		conversion8.addActionListener(this);
		in8_JPanel.add(conversion8);

		ce_Button = new Button("     \u6E05\u7A7A     ");
		ce_Button.setBackground(UIManager.getColor("Button.background"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		ce_Button.addActionListener(this);

		blank9 = new JLabel(
				"                                                                                                                                                                                                                                                                     ");
		blank9.setFont(new Font("宋体", Font.PLAIN, 5));
		result_JPanel.add(blank9);
		result_JPanel.add(ce_Button);

		back_Button = new Button("    \u8FD4\u56DE    ");
		back_Button.setBackground(new Color(255, 160, 122));
		back_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		back_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UnitConversionPage newWindow=new UnitConversionPage();
				newWindow.setVisible(true);
			}
		});		

		blank10 = new JLabel("             ");
		result_JPanel.add(blank10);
		result_JPanel.add(back_Button);

		contain.add(cal_JPanel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// 公斤
		if (e.getActionCommand() == "      \u516C\u65A4>     ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 1000;
			this.result2 = result * 2;
			this.result3 = result / 50;
			this.result4 = result * 20;
			this.result5 = result * 200;
			this.result6 = result / 0.4535924;
			this.result7 = result / 0.0283495;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 克
		if (e.getActionCommand() == "       \u514B>       ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = result / 1000;
			this.result1 = result * 1;
			this.result2 = result * 2 / 1000;
			this.result3 = result / 50000;
			this.result4 = result * 20 / 1000;
			this.result5 = result * 200 / 1000;
			this.result6 = result / 0.4535924 / 1000;
			this.result7 = result / 0.0283495 / 1000;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 市斤
		if (e.getActionCommand() == "      \u5E02\u65A4>     ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result / 2;
			this.result1 = result * 500;
			this.result2 = result * 1;
			this.result3 = result / 100;
			this.result4 = result * 10;
			this.result5 = result * 100;
			this.result6 = result / 0.4535924 / 2;
			this.result7 = result / 0.0283495 / 2;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 担
		if (e.getActionCommand() == "       \u62C5>       ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result * 50;
			this.result1 = result * 50000;
			this.result2 = result * 100;
			this.result3 = result * 1;
			this.result4 = result * 1000;
			this.result5 = result * 10000;
			this.result6 = result / 0.4535924 * 50;
			this.result7 = result / 0.0283495 * 50;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 两
		if (e.getActionCommand() =="       \u4E24>       ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result * 0.05;
			this.result1 = result * 50;
			this.result2 = result * 0.1;
			this.result3 = result * 0.001;
			this.result4 = result * 1;
			this.result5 = result * 10;
			this.result6 = result / 0.4535924 * 0.05;
			this.result7 = result / 0.0283495 * 0.05;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 钱
		if (e.getActionCommand() ==   "       \u94B1>       ") {
			double result = Double.parseDouble(textField6.getText());
			this.result0 = result * 0.005;
			this.result1 = result * 5;
			this.result2 = result * 0.01;
			this.result3 = result * 0.0001;
			this.result4 = result * 0.01;
			this.result5 = result * 1;
			this.result6 = result / 0.4535924 * 0.005;
			this.result7 = result / 0.0283495 * 0.005;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		// 磅
		if (e.getActionCommand() == "       \u78C5>       ") {
			double result = Double.parseDouble(textField7.getText());
			this.result0 = result * 0.4535924;
			this.result1 = result * 0.4535924 * 1000;
			this.result2 = result * 0.4535924 * 2;
			this.result3 = result * 0.4535924 / 50;
			this.result4 = result * 0.4535924 * 20;
			this.result5 = result * 0.4535924 * 200;
			this.result6 = result * 1;
			this.result7 = result * 0.4535924 / 0.0283495;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
		}
		//盎司
		if (e.getActionCommand() == "      \u76CE\u53F8>     ") {
			double result = Double.parseDouble(textField8.getText());
			this.result0 = result * 0.0283495;
			this.result1 = result * 0.0283495 * 1000;
			this.result2 = result * 0.0283495 * 2;
			this.result3 = result * 0.0283495 / 50;
			this.result4 = result * 0.0283495 * 20;
			this.result5 = result * 0.0283495 * 200;
			this.result6 = result * 0.0283495 / 0.4535924;
			this.result7 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
			this.textField6.setText(Double.toString(result5));
			this.textField7.setText(Double.toString(result6));
			this.textField8.setText(Double.toString(result7));
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

		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
