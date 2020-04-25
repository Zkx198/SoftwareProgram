package calculator;
//张凯鑫 2017111478
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import java.awt.*;
public class EmotionalLifePage extends WindowAdapter{
	private Frame cal_Frame;
	private Panel in0_Panel, in1_Panel,in4_Panel,in5_Panel, input_Panel, intergration_Panel, result1_Panel, result2_Panel;
	private Button relation_Button;
	private JLabel blank2_Label;
	private Button back_button;
	private JLabel blank3_Label;
	private Button intimacy_Button;
	private JLabel illustration2_Label;
	private JLabel illustration1_Label;
	private JLabel illustration3_Label;
	private JLabel illustration4_Label;
	private JLabel lblX;
	private JLabel illustration5_Label;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	
	public void emotional() {
		cal_Frame = new Frame("情感生活计算器");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(Color.BLACK);
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));

		input_Panel = new Panel(new FlowLayout());
		in0_Panel = new Panel();
		in0_Panel.setPreferredSize(new Dimension(280, 130));
		in1_Panel = new Panel(new FlowLayout());
		in1_Panel.setPreferredSize(new Dimension(260, 120));
		in4_Panel = new Panel(new FlowLayout());
		in4_Panel.setPreferredSize(new Dimension(260, 130));
		in5_Panel = new Panel(new FlowLayout());
		input_Panel.add(in0_Panel);
		
		label_5 = new JLabel("                           ");
		label_5.setFont(new Font("宋体", Font.PLAIN, 15));
		label_5.setPreferredSize(new Dimension(260, 50));
		in0_Panel.add(label_5);
		
		relation_Button = new Button("\u4EB2\u621A\u79F0\u547C\u5173\u7CFB\u8BA1\u7B97");
		relation_Button.setBackground(UIManager.getColor("Button.background"));
		relation_Button.setFont(new Font("隶书", Font.BOLD, 24));
		in0_Panel.add(relation_Button);
		input_Panel.add(in1_Panel);
		
		blank2_Label = new JLabel("                           ");
		blank2_Label.setPreferredSize(new Dimension(260, 30));
		in1_Panel.add(blank2_Label);
		
		intimacy_Button = new Button("\u4E24\u4EBA\u4EB2\u5BC6\u5173\u7CFB\u8BA1\u7B97");
		intimacy_Button.setBackground(UIManager.getColor("Button.background"));
		intimacy_Button.setFont(new Font("隶书", Font.BOLD, 24));	
		in1_Panel.add(intimacy_Button);
		
		input_Panel.add(in4_Panel);
		input_Panel.add(in5_Panel);
		
		blank3_Label = new JLabel("                                                                                                                                                   ");
		blank3_Label.setFont(new Font("宋体", Font.PLAIN, 16));
		in4_Panel.add(blank3_Label);
		
		back_button = new Button("     \u8FD4\u56DE     ");
		in4_Panel.add(back_button);
		back_button.setForeground(Color.BLACK);
		back_button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		back_button.setBackground(new Color(255, 160, 122));
		intergration_Panel = new Panel(new FlowLayout());
		result1_Panel = new Panel();
		result2_Panel = new Panel(new FlowLayout());
		input_Panel.setPreferredSize(new Dimension(290, 400));
		intergration_Panel.setPreferredSize(new Dimension(490, 420));
		result1_Panel.setPreferredSize(new Dimension(500, 185));
		result2_Panel.setPreferredSize(new Dimension(500, 210));
		intergration_Panel.add(result1_Panel, BorderLayout.NORTH);
		intergration_Panel.add(result2_Panel, BorderLayout.SOUTH);
		
		lblNewLabel_4 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 5));
		result2_Panel.add(lblNewLabel_4);
		
		label_3 = new JLabel("                                                                                                                                                ");
		label_3.setFont(new Font("隶书", Font.PLAIN, 8));
		result2_Panel.add(label_3);
		
		illustration5_Label = new JLabel("\u662F\u5426\u597D\u5947\u4E24\u4EBA\u4E4B\u95F4\u5B58\u5728\u600E\u6837\u7684\u5173\u7CFB\u5462\uFF1F");
		illustration5_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(illustration5_Label);
		
		lblNewLabel_3 = new JLabel("                                    ");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 10));
		result2_Panel.add(lblNewLabel_3);
		
		lblNewLabel_1 = new JLabel("    \u70B9\u51FB                              ");
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("   \u4E24\u4EBA\u4EB2\u5BC6\u5173\u7CFB\u8BA1\u7B97        ");
		lblNewLabel_2.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(lblNewLabel_2);
		
		label = new JLabel("                      \u5FEB\u6765\u770B\u770B\u5427\uFF01");
		label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(label);
		cal_Frame.add(input_Panel,BorderLayout.EAST);
		cal_Frame.add(intergration_Panel,BorderLayout.WEST);
		
		label_4 = new JLabel("                                                                                                                                                ");
		label_4.setFont(new Font("隶书", Font.PLAIN, 8));
		result1_Panel.add(label_4);
		
		illustration1_Label = new JLabel("  \u6211\u7684\u7237\u7237\u7684\u59D0\u59D0\u7684\u513F\u5B50\u7684\u5973\u513F=?       ");
		illustration1_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration1_Label);
		
		label_2 = new JLabel("                                                                                                                                                ");
		label_2.setFont(new Font("隶书", Font.PLAIN, 10));
		result1_Panel.add(label_2);
		
		illustration2_Label = new JLabel("\u957F\u671F\u4E0D\u89C1\u7684\u4EB2\u621A           ");
		illustration2_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration2_Label);
		
		illustration3_Label = new JLabel("              \u5982\u4F55\u79F0\u547C\u5462\uFF1F     ");
		illustration3_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration3_Label);
		
		lblX = new JLabel("                                                                                                                                                ");
		lblX.setFont(new Font("隶书", Font.PLAIN, 10));
		result1_Panel.add(lblX);
		
		illustration4_Label = new JLabel("          \u4EB2\u621A\u5173\u7CFB\u8BA1\u7B97\u89E3\u51B3\u4E00\u5207\u95EE\u9898\uFF01    ");
		illustration4_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration4_Label);
		
		relation_Button.addActionListener(new Listener1());
		intimacy_Button.addActionListener(new Listener2());
		back_button.addActionListener(new Listener3());
	
		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);
	}
	class Listener1 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cal_Frame.setVisible(false);
			RelationshipCalculator newWindow=new RelationshipCalculator();
			newWindow.Relationship();
		}	
	}
	class Listener2 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cal_Frame.setVisible(false);
			IntimacyCalculator newWindow=new IntimacyCalculator();
			newWindow.Intimacy();
		}	
	}
	class Listener3 implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cal_Frame.setVisible(false);
			SecondaryPageTwo newWindow=new SecondaryPageTwo();
			newWindow.setVisible(true);
		}	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		EmotionalLifePage new_cal = new EmotionalLifePage();
		new_cal.emotional();

	}
}
