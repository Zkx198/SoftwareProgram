package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UnitConversion_Tempetature extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversion_Tempetature frame = new UnitConversion_Tempetature();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JPanel cal_JPanel;
	JPanel explain_JPanel, input_JPanel, result_JPanel, in1_JPanel, in2_JPanel, in3_JPanel, in4_JPanel, in5_JPanel;
	double result0, result1, result2, result3, result4 = 0.0;
	JLabel explain_Label;
	Button ce_Button;
	Button back_Button;
	Button conversion1, conversion2, conversion3, conversion4, conversion5;
	JLabel Label1, Label2, Label3, Label4, Label5;
	JTextField textField1, textField2, textField3, textField4, textField5;
	JLabel blank1, blank2, blank3, blank4, blank5;
	JLabel blank10;
	JLabel blank9;

	public UnitConversion_Tempetature() {
		setBackground(new Color(0, 0, 0));
		setTitle("\u6E29\u5EA6\u5355\u4F4D\u6362\u7B97\u5668");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(800, 200);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setSize(780, 480);
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
		input_JPanel = new JPanel(new GridLayout(3, 2, 5, 5));
		input_JPanel.setOpaque(false);
		input_JPanel.setPreferredSize(new Dimension(770, 230));
		cal_JPanel.add(input_JPanel, BorderLayout.CENTER);
		result_JPanel = new JPanel();
		result_JPanel.setPreferredSize(new Dimension(770, 65));
		cal_JPanel.add(result_JPanel, BorderLayout.SOUTH);

		in1_JPanel = new JPanel();
		in1_JPanel.setOpaque(false);
		input_JPanel.add(in1_JPanel);
		Label1 = new JLabel("         \u6444\u6C0F\u5EA6\uFF08C\uFF09        ");
		Label1.setFont(new Font("隶书", Font.BOLD, 24));
		in1_JPanel.add(Label1);
		textField1 = new JTextField();
		textField1.setFont(new Font("隶书", Font.PLAIN, 19));
		in1_JPanel.add(textField1);
		textField1.setColumns(19);
		blank1 = new JLabel(" ");
		in1_JPanel.add(blank1);
		conversion1 = new Button("        C>       ");
		conversion1.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion1.setBackground(UIManager.getColor("Button.light"));
		conversion1.addActionListener(this);
		in1_JPanel.add(conversion1);

		in2_JPanel = new JPanel();
		in2_JPanel.setOpaque(false);
		input_JPanel.add(in2_JPanel);
		Label2 = new JLabel("       \u534E\u6C0F\u5EA6\uFF08F\uFF09     ");
		Label2.setFont(new Font("隶书", Font.BOLD, 24));
		in2_JPanel.add(Label2);
		textField2 = new JTextField();
		textField2.setFont(new Font("隶书", Font.PLAIN, 19));
		in2_JPanel.add(textField2);
		textField2.setColumns(19);
		blank2 = new JLabel(" ");
		in2_JPanel.add(blank2);
		conversion2 = new Button("        F>       ");
		conversion2.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion2.setBackground(UIManager.getColor("Button.light"));
		conversion2.addActionListener(this);
		in2_JPanel.add(conversion2);

		in3_JPanel = new JPanel();
		in3_JPanel.setOpaque(false);
		input_JPanel.add(in3_JPanel);
		Label3 = new JLabel("    \u5F00\u6C0F\u5EA6\uFF08K\uFF09  ");
		Label3.setFont(new Font("隶书", Font.BOLD, 24));
		in3_JPanel.add(Label3);
		textField3 = new JTextField();
		textField3.setFont(new Font("隶书", Font.PLAIN, 19));
		in3_JPanel.add(textField3);
		textField3.setColumns(19);
		blank3 = new JLabel(" ");
		in3_JPanel.add(blank3);
		conversion3 = new Button("        K>       ");
		conversion3.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion3.setBackground(UIManager.getColor("Button.light"));
		in3_JPanel.add(conversion3);
		conversion3.addActionListener(this);

		in4_JPanel = new JPanel();
		in4_JPanel.setOpaque(false);
		input_JPanel.add(in4_JPanel);
		Label4 = new JLabel("       \u5170\u6C0F\u5EA6\uFF08Ra\uFF09       ");
		Label4.setFont(new Font("隶书", Font.BOLD, 24));
		in4_JPanel.add(Label4);
		textField4 = new JTextField();
		textField4.setFont(new Font("隶书", Font.PLAIN, 19));
		in4_JPanel.add(textField4);
		textField4.setColumns(19);
		blank4 = new JLabel(" ");
		in4_JPanel.add(blank4);
		conversion4 = new Button("       Ra>      ");
		conversion4.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion4.setBackground(UIManager.getColor("Button.light"));
		conversion4.addActionListener(this);
		in4_JPanel.add(conversion4);

		in5_JPanel = new JPanel();
		in5_JPanel.setOpaque(false);
		input_JPanel.add(in5_JPanel);
		Label5 = new JLabel("       \u5217\u6C0F\u5EA6\uFF08Re\uFF09    ");
		Label5.setFont(new Font("隶书", Font.BOLD, 24));
		in5_JPanel.add(Label5);
		textField5 = new JTextField();
		textField5.setFont(new Font("隶书", Font.PLAIN, 19));
		in5_JPanel.add(textField5);
		textField5.setColumns(19);
		blank5 = new JLabel(" ");
		in5_JPanel.add(blank5);
		conversion5 = new Button("       Re>      ");
		conversion5.setFont(new Font("楷体", Font.PLAIN, 20));
		conversion5.setBackground(UIManager.getColor("Button.light"));
		in5_JPanel.add(conversion5);
		conversion5.addActionListener(this);

		ce_Button = new Button("     \u6E05\u7A7A     ");
		ce_Button.setBackground(UIManager.getColor("Button.background"));
		ce_Button.setFont(new Font("Times New Roman", Font.BOLD, 23));
		ce_Button.addActionListener(this);

		blank9 = new JLabel(
				"                                                                                                                                                                                                                                                                     ");
		blank9.setFont(new Font("宋体", Font.PLAIN, 5));
		result_JPanel.add(blank9);
		result_JPanel.setOpaque(false);
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
		//摄氏度
		if (e.getActionCommand() == "        C>       ") {
			double result = Double.parseDouble(textField1.getText());
			this.result0 = result * 1;
			this.result1 = result * 1.8 + 32;
			this.result2 = result +  273.15;
			this.result3 = (result + 273.25) * 1.8 ;
			this.result4 = result * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//华氏度 
		if (e.getActionCommand() == "        F>       ") {
			double result = Double.parseDouble(textField2.getText());
			this.result0 = (result - 32) * 5 / 9;
			this.result1 = result * 1;
			this.result2 = (result - 32) * 5 / 9 + 273.15;
			this.result3 = result * 2116.2167;
			this.result4 = (result - 32) * 5 / 9 * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//开尔文
		if (e.getActionCommand() == "        K>       ") {
			double result = Double.parseDouble(textField3.getText());
			this.result0 = result - 273.15;
			this.result1 = (result - 273.15) * 1.8 + 32;
			this.result2 = result * 1;
			this.result3 = result * 1.8;
			this.result4 = (result - 273.15) * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//兰氏度
		if (e.getActionCommand() == "       Ra>      ") {
			double result = Double.parseDouble(textField4.getText());
			this.result0 = result / 1.8 - 273.15;
			this.result1 = result - 459.67;
			this.result2 = result / 1.8;
			this.result3 = result * 1;
			this.result4 = (result / 1.8 - 273.15) * 0.8;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
		}
		//列氏度
		if (e.getActionCommand() =="       Re>      ") {
			double result = Double.parseDouble(textField5.getText());
			this.result0 = result / 0.8;
			this.result1 = result / 0.8 * 1.8 + 32;
			this.result2 = result * 1.25 + 273.5;
			this.result3 = (result * 1.25 + 273.5) * 1.8;
			this.result4 = result * 1;
			this.textField1.setText(Double.toString(result0));
			this.textField2.setText(Double.toString(result1));
			this.textField3.setText(Double.toString(result2));
			this.textField4.setText(Double.toString(result3));
			this.textField5.setText(Double.toString(result4));
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
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
