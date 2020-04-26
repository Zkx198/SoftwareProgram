package calculator;
//张凯鑫 2017111478
import java.awt.*;
import java.awt.Window.Type;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
public class EmotionalLifePage extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmotionalLifePage frame = new EmotionalLifePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public EmotionalLifePage() {
		setBackground(new Color(0, 0, 0));
		JPanel input_Panel,in0_Panel,in1_Panel,in2_Panel,in3_Panel,in4_Panel,in5_Panel,intergration_Panel,result1_Panel,result2_Panel;
		JLabel label_0,label_1,labei_2,label_3,label_4,label_5,blank2_Label,blank3_Label,lblNewLabel_4,lblNewLabel_5,lblNewLabel_3,
		       lblNewLabel_2,lblNewLabel_1,illustration1_Label,illustration2_Label,illustration3_Label,illustration4_Label,illustration5_Label,
		       label,lblX,label_2;
		JButton relation_Button,intimacy_Button,back_button;
		setTitle("情感计算器");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocation(200, 200);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/life4_1.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setSize(780, 440);
	    this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
	    Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		input_Panel = new JPanel(new FlowLayout());
		input_Panel.setOpaque(false);
		in0_Panel = new JPanel();
		in0_Panel.setOpaque(false);
		in0_Panel.setPreferredSize(new Dimension(280, 130));
		in1_Panel = new JPanel(new FlowLayout());
		in1_Panel.setOpaque(false);
		in1_Panel.setPreferredSize(new Dimension(260, 120));
		in2_Panel = new JPanel(new FlowLayout());
		in2_Panel.setOpaque(false);
		in2_Panel.setPreferredSize(new Dimension(260, 130));
		in3_Panel = new JPanel(new FlowLayout());
		in3_Panel.setOpaque(false);
		input_Panel.add(in0_Panel);
		
		label_0 = new JLabel("                           ");
		label_0.setFont(new Font("宋体", Font.PLAIN, 15));
		label_0.setPreferredSize(new Dimension(260, 50));
		in0_Panel.add(label_0);
		
		relation_Button = new JButton("\u4EB2\u621A\u79F0\u547C\u5173\u7CFB\u8BA1\u7B97");
		relation_Button.setForeground(Color.WHITE);
		relation_Button.setOpaque(false);
		relation_Button.setBackground(new Color(0, 0, 102));
		relation_Button.setFont(new Font("隶书", Font.BOLD, 24));
		in0_Panel.add(relation_Button);
		input_Panel.add(in1_Panel);
		
		blank2_Label = new JLabel("                           ");
		blank2_Label.setPreferredSize(new Dimension(260, 30));
		in1_Panel.add(blank2_Label);
		
		intimacy_Button = new JButton("\u4E24\u4EBA\u4EB2\u5BC6\u5173\u7CFB\u8BA1\u7B97");
		intimacy_Button.setForeground(Color.WHITE);
		intimacy_Button.setOpaque(false);
		intimacy_Button.setBackground(Color.WHITE);
		intimacy_Button.setFont(new Font("隶书", Font.BOLD, 24));	
		in1_Panel.add(intimacy_Button);
		
		input_Panel.add(in2_Panel);
		input_Panel.add(in3_Panel);
		
		blank3_Label = new JLabel("                                                                                                                                                   ");
		blank3_Label.setFont(new Font("宋体", Font.PLAIN, 16));
		in2_Panel.add(blank3_Label);
		
		back_button = new JButton("     \u8FD4\u56DE     ");
		back_button.setOpaque(false);
		in2_Panel.add(back_button);
		back_button.setForeground(Color.WHITE);
		back_button.setFont(new Font("隶书", Font.BOLD, 24));
		back_button.setBackground(new Color(255, 160, 122));
		intergration_Panel = new JPanel(new FlowLayout());
		intergration_Panel.setOpaque(false);
		result1_Panel = new JPanel();
		result1_Panel.setOpaque(false);
		result2_Panel = new JPanel(new FlowLayout());
		result2_Panel.setOpaque(false);
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
		illustration5_Label.setForeground(Color.WHITE);
		illustration5_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(illustration5_Label);
		
		lblNewLabel_3 = new JLabel("                                    ");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 10));
		result2_Panel.add(lblNewLabel_3);
		
		lblNewLabel_1 = new JLabel("    \u70B9\u51FB                              ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("   \u4E24\u4EBA\u4EB2\u5BC6\u5173\u7CFB\u8BA1\u7B97        ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(lblNewLabel_2);
		
		label = new JLabel("                      \u5FEB\u6765\u770B\u770B\u5427\uFF01");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("隶书", Font.BOLD, 23));
		result2_Panel.add(label);
		contain.add(input_Panel,BorderLayout.EAST);
		contain.add(intergration_Panel,BorderLayout.WEST);
		
		label_4 = new JLabel("                                                                                                                                                ");
		label_4.setFont(new Font("隶书", Font.PLAIN, 8));
		result1_Panel.add(label_4);
		
		illustration1_Label = new JLabel("  \u6211\u7684\u7237\u7237\u7684\u59D0\u59D0\u7684\u513F\u5B50\u7684\u5973\u513F=?       ");
		illustration1_Label.setForeground(Color.WHITE);
		illustration1_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration1_Label);
		
		label_2 = new JLabel("                                                                                                                                                ");
		label_2.setFont(new Font("隶书", Font.PLAIN, 10));
		result1_Panel.add(label_2);
		
		illustration2_Label = new JLabel("\u957F\u671F\u4E0D\u89C1\u7684\u4EB2\u621A           ");
		illustration2_Label.setForeground(Color.WHITE);
		illustration2_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration2_Label);
		
		illustration3_Label = new JLabel("              \u5982\u4F55\u79F0\u547C\u5462\uFF1F     ");
		illustration3_Label.setForeground(Color.WHITE);
		illustration3_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration3_Label);
		
		lblX = new JLabel("                                                                                                                                                ");
		lblX.setFont(new Font("隶书", Font.PLAIN, 10));
		result1_Panel.add(lblX);
		
		illustration4_Label = new JLabel("          \u4EB2\u621A\u5173\u7CFB\u8BA1\u7B97\u89E3\u51B3\u4E00\u5207\u95EE\u9898\uFF01    ");
		illustration4_Label.setForeground(Color.WHITE);
		illustration4_Label.setFont(new Font("隶书", Font.BOLD, 23));
		result1_Panel.add(illustration4_Label);
		
		relation_Button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  RelationshipCalculator newWindow=new RelationshipCalculator();
			  newWindow.Relationship();
		    }
	    });
		intimacy_Button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  IntimacyCalculator newWindow=new IntimacyCalculator();
		      newWindow.setVisible(true);
		    }
	    });
		back_button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  SecondaryPageTwo newWindow=new SecondaryPageTwo();
			  newWindow.setVisible(true);
		    }
	    });		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
