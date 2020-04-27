package calculator;
//�ſ��� 2017111478
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class RelationshipCalculator extends JFrame implements ActionListener{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelationshipCalculator JPanel = new RelationshipCalculator();
					JPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JPanel Relation_JPanel;
	JPanel title_JPanel,input_JPanel,output_JPanel,key_JPanel,input_output_JPanel;
	JPanel relation_JPanel,common_JPanel;//����������ϵ������=��del��C����
	JTextArea input_TextField;//�����
	JTextField output_TextField;//�����
	JLabel Label_1,Label_2,Label_3,Label_4,Label_5;//��ʾ����
    Button baba_Button,mama_Button,erzi_Button,nver_Button,gege_Button,didi_Button,jiejie_Button,meimei_Button,zhangfu_Button,qizi_Button;//������ϵ����
    Button equal_Button,del_Button,C_Button,back_Button;//���ڡ�ɾ������ա����ذ���
    
    String[][] relationshipData = {
    		 {"��", "�ְ�", "����", "���", "�ܵ�", "���", "����", "����", "Ů��", "����", "�ɷ�", "δ֪����"},
    	     {"�ְ�", "үү", "����", "����", "����", "����", "����", "��", "����", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "�⹫", "����", "���", "С��", "������", "С����", "��", "����", "�����ڸ��ֹ�ϵ", "�ְ�", "δ֪����"},
    		 {"���", "�ְ�", "����", "���", "��", "���", "����", "ֶ��", "ֶŮ", "ɩ��", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"�ܵ�", "�ְ�", "����", "��", "�ܵ�", "���", "����", "ֶ��", "ֶŮ", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"���", "�ְ�", "����", "���", "��", "���", "����", "����", "����Ů", "�����ڸ��ֹ�ϵ", "���", "δ֪����"},
    		 {"����", "�ְ�", "����", "��", "�ܵ�", "���", "����", "����", "����Ů", "�����ڸ��ֹ�ϵ", "�÷�", "δ֪����"},
    		 {"����", "��", "����", "���", "�ܵ�", "���", "����", "����", "��Ů", "��ϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"Ů��", "��", "����", "���", "�ܵ�", "���", "����", "����", "����Ů", "�����ڸ��ֹ�ϵ", "Ů��", "δ֪����"},
    		 {"����", "����", "��ĸ", "�����", "С����", "������", "С����", "����", "Ů��", "�����ڸ��ֹ�ϵ", "��", "δ֪����"},
    		 {"�ɷ�", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ","�����ڸ��ֹ�ϵ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"үү", "���游", "����ĸ", "���游", "���游", "������", "������", "�ְ�", "����", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "�����游", "������ĸ", "�˹�", "�˹�", "������", "������", "�ְ�", "����", "�����ڸ��ֹ�ϵ", "үү", "δ֪����"},
    		 {"����", "үү", "����", "����", "����", "����", "����", "�ø�", "�ý�", "��ĸ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "үү", "����", "����", "����", "����", "����", "�õ�", "����", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "үү", "����", "����", "����", "����", "����", "�ñ��", "�ñ��", "�����ڸ��ֹ�ϵ", "����", "δ֪����"},
    		 {"�⹫", "�����游", "������ĸ", "�����游", "�����游", "������", "������", "�˾�", "����", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "�������游", "��������ĸ", "��˹�", "��˹�", "������", "������", "�˾�", "����", "�����ڸ��ֹ�ϵ", "�⹫", "δ֪����"},
    		 {"���", "�⹫", "����", "���", "�˾�", "����", "����", "�˱��", "�˱��", "�����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"С��", "�⹫", "����", "�˾�", "С��", "����", "С��", "�˱��", "�˱���", "С����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"������", "�⹫", "����", "���", "�˾�", "����", "����", "�̱��", "�̱��", "�����ڸ��ֹ�ϵ", "���̸�", "δ֪����"},
    		 {"С����", "�⹫", "����", "�˾�", "С��", "����", "С��", "�̱��", "�̱���", "�����ڸ��ֹ�ϵ", "С�̸�", "δ֪����"},
    		 {"ֶ��", "���", "ɩ��", "ֶ��", "ֶ��", "ֶŮ", "ֶŮ", "ֶ����", "ֶ��Ů", "ֶϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"ֶŮ", "���", "ɩ��", "ֶ��", "ֶ��", "ֶŮ", "ֶŮ", "��ֶ��", "��ֶ��Ů", "�����ڸ��ֹ�ϵ", "ֶŮ��", "δ֪����"},
    		 {"ɩ��", "������", "����ĸ", "����", "����", "����", "����", "ֶ��", "ֶŮ", "�����ڸ��ֹ�ϵ", "���", "δ֪����"},
    		 {"����", "���常", "����ĸ", "����", "����", "����", "����", "ֶ��", "ֶŮ", "�����ڸ��ֹ�ϵ", "�ܵ�", "δ֪����"},
    		 {"����", "���", "���", "����", "����", "����Ů", "����Ů", "������", "������Ů", "����ϱ��", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����Ů", "���", "���", "����", "����", "����Ů", "����Ů", "������", "������Ů", "�����ڸ��ֹ�ϵ", "����Ů��", "δ֪����"},
    		 {"���", "������", "����ĸ", "����", "����", "����", "����", "����", "����Ů", "���", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"�÷�", "������", "����ĸ", "����", "����", "����", "����", "����", "����Ů", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "����", "��ϱ", "����", "����", "��Ů", "��Ů", "����", "����Ů", "��ϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"��Ů", "����", "��ϱ", "����", "����", "��Ů", "��Ů", "������", "������Ů", "�����ڸ��ֹ�ϵ", "��Ů��", "δ֪����"},
    		 {"��ϱ", "�׼ҹ�", "�׼�ĸ", "��ֶ", "��ֶ", "��ֶŮ", "��ֶŮ", "����", "��Ů", "�����ڸ��ֹ�ϵ", "����", "δ֪����"},
    		 {"����Ů", "Ů��", "Ů��", "����", "����", "����Ů", "����Ů", "��������", "��������Ů", "�����ڸ��ֹ�ϵ", "����Ů��", "δ֪����"},
    		 {"����", "Ů��", "Ů��", "����", "����", "����Ů", "����Ů", "������", "������Ů", "����ϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"Ů��", "�׼ҹ�", "�׼�ĸ", "��ֶ", "��ֶ", "��ֶŮ", "��ֶŮ", "����", "����Ů", "Ů��", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����", "̫����", "̫��ĸ", "����", "����", "����ĸ", "����ĸ", "�����", "������", "��ĸ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"��ĸ", "��̫����", "��̫��ĸ", "������", "������", "����ĸ", "����ĸ", "С����", "С����", "�����ڸ��ֹ�ϵ", "����", "δ֪����"},
    		 {"�����", "����", "��ĸ", "�����", "С����", "������", "С����", "��ֶ", "��ֶŮ", "��ɩ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"С����", "����", "��ĸ", "�����", "С����", "����", "С����", "��ֶ", "��ֶŮ", "�˵�ϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"������", "����", "��ĸ", "�����", "С����", "������", "����", "����", "����Ů", "�����ڸ��ֹ�ϵ", "���̷�", "δ֪����"},
    		 {"С����", "����", "��ĸ", "�����", "С����", "����", "С����", "����", "����Ů", "�����ڸ��ֹ�ϵ", "С�̷�", "δ֪����"},
    		 {"���游", "���游", "����ĸ", "�����游", "�����游", "��������", "��������", "үү", "������", "����ĸ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"����ĸ", "�����游", "������ĸ", "�����游", "�����游", "������ĸ", "������ĸ", "үү", "������", "�����ڸ��ֹ�ϵ", "���游", "δ֪����"},
    		 {"���游", "���游", "����ĸ", "���游", "үү", "������", "������", "�ò�", "�ù�", "����ĸ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"������", "���游", "����ĸ", "үү", "���游", "������", "������", "�ñ���", "�ñ��ĸ", "�����ڸ��ֹ�ϵ", "��үү", "δ֪����"},
    		 {"�����游", "�������游", "��������ĸ", "�������游", "�������游", "��������ĸ", "��������ĸ", "�˹�", "����", "������ĸ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"������ĸ", "���������游", "����������ĸ", "�������游", "�������游", "��������ĸ", "��������ĸ", "�˹�", "����", "�����ڸ��ֹ�ϵ", "�����游", "δ֪����"},
    		 {"�˹�", "�����游", "������ĸ", "�˹�", "�˹�", "������", "����", "�˱���", "�˱��ĸ", "����", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"������", "�����游", "������ĸ", "�˹�", "�˹�", "������", "����", "�̱���", "�̱��ĸ", "�����ڸ��ֹ�ϵ", "��үү", "δ֪����"},
    		 {"�ø�", "����", "��ĸ", "�ø�", "�õ�", "�ý�", "����", "��ֶ", "��ֶŮ", "��ɩ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"�õ�", "����", "����", "�ø�", "�õ�", "�ý�", "����", "��ֶ", "��ֶŮ", "�õ�ϱ", "�����ڸ��ֹ�ϵ", "δ֪����"},
    		 {"�ý�", "����", "��ĸ", "�ø�", "�õ�", "�ý�", "����", "������", "������Ů", "�����ڸ��ֹ�ϵ", "�ý��", "δ֪����"},
    		 {"����", "����", "����", "�ø�", "�õ�", "�ý�", "����", "������", "������Ů", "�����ڸ��ֹ�ϵ", "���÷�", "δ֪����"},
    		 {"��ĸ", "������", "������", "������", "������", "����ĸ", "����ĸ", "�ø�", "�ý�", "�����ڸ��ֹ�ϵ", "����", "δ֪����"},
    		 {"����", "������", "������", "������", "������", "����ĸ", "����ĸ", "�õ�", "����", "�����ڸ��ֹ�ϵ", "����", "δ֪����"},
    		 {"�˱���", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱���", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˱��ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱��ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��үү", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ɩ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�õ�ϱ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ý��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���÷�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ñ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ñ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˾�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��˹�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"С����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˱���", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"С��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�̱���", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���̸�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"С�̸�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"ֶ����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"ֶ��Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ��Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"ֶϱ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"ֶŮ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���常", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ò�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ù�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ñ���", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�ñ��ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��үү", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�������游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�������游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�������游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�������游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ϱ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����Ů��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ʦ��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ϱ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��Ů��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�׼ҹ�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�׼�ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶŮ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����Ů��", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ϱ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"̫����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��̫����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"̫��ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��̫��ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ֶŮ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����Ů", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��ɩ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˵�ϱ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���̷�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"С�̷�", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"���游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"����ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�˲��游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"�����游", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"��������", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"������ĸ", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����", "δ֪����"}
    		 };
    JPanel JPanel;
	/**
	 * Create the JPanel.
	 */
	public RelationshipCalculator() {
		setBackground(new Color(0, 0, 0));
		setTitle("���ݹ�ϵ������");
		setFont(new Font("Times New Roman", Font.PLAIN, 20));
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setSize(780, 480);
		setLocationRelativeTo(null);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(3, 3));
		
		ImageIcon img = new ImageIcon("./src/image/123.jpg");
		JLabel imgL=new JLabel(img);
		imgL.setSize(780, 440);
	    this.getLayeredPane().add(imgL, new Integer(Integer.MIN_VALUE));
	    Container contain = this.getContentPane();
		((JPanel) contain).setOpaque(false);
		
		Relation_JPanel=new JPanel();
		Relation_JPanel.setOpaque(false);
		Relation_JPanel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Relation_JPanel.setForeground(Color.BLACK);
		Relation_JPanel.setSize(780, 480);
		Relation_JPanel.setBackground(Color.LIGHT_GRAY);
		Relation_JPanel.setLayout(new BorderLayout(3,1));
		
		title_JPanel=new JPanel(new GridLayout(2,1));
		title_JPanel.setOpaque(false);
		title_JPanel.setPreferredSize(new Dimension(390, 80));
		Label_1=new JLabel("  \u5047\u5B9A\u6211\u7684\u6027\u522B\u4E3A:\u7537");
		Label_1.setOpaque(false);
		Label_1.setFont(new Font("����", Font.BOLD, 22));
		Label_2=new JLabel("  \u7ED3\u679C\u4E3A\u6211\u5BF9\u5BF9\u65B9\u7684\u79F0\u547C");
		Label_2.setOpaque(false);
		Label_2.setFont(new Font("����", Font.BOLD, 22));
	    title_JPanel.add(Label_1);
	    title_JPanel.add(Label_2);
		
		relation_JPanel=new JPanel(new GridLayout(3,4,5,10));
		relation_JPanel.setOpaque(false);
		relation_JPanel.setPreferredSize(new Dimension(340, 185));
		baba_Button=new Button("�ְ�");
		baba_Button.setFont(new Font("����", Font.BOLD, 22));
		mama_Button=new Button("����");
		mama_Button.setFont(new Font("����", Font.BOLD, 22));
		erzi_Button=new Button("����");
		erzi_Button.setFont(new Font("����", Font.BOLD, 22));
		nver_Button=new Button("Ů��");
		nver_Button.setFont(new Font("����", Font.BOLD, 22));
		gege_Button=new Button("���");
		gege_Button.setFont(new Font("����", Font.BOLD, 22));
		didi_Button=new Button("�ܵ�");
		didi_Button.setFont(new Font("����", Font.BOLD, 22));
		jiejie_Button=new Button("���");
		jiejie_Button.setFont(new Font("����", Font.BOLD, 22));
		meimei_Button=new Button("����");
		meimei_Button.setFont(new Font("����", Font.BOLD, 22));
		zhangfu_Button=new Button("�ɷ�");
		zhangfu_Button.setFont(new Font("����", Font.BOLD, 22));
		qizi_Button=new Button("����");
		qizi_Button.setFont(new Font("����", Font.BOLD, 22));
		relation_JPanel.add(baba_Button);
		relation_JPanel.add(mama_Button);
		relation_JPanel.add(erzi_Button);
		relation_JPanel.add(nver_Button);
		relation_JPanel.add(gege_Button);
		relation_JPanel.add(didi_Button);
		relation_JPanel.add(jiejie_Button);
		relation_JPanel.add(meimei_Button);
		relation_JPanel.add(zhangfu_Button);
		relation_JPanel.add(qizi_Button);
		
		common_JPanel=new JPanel(new GridLayout(1,4,5,3));
		common_JPanel.setOpaque(false);
		common_JPanel.setPreferredSize(new Dimension(340, 56));
		equal_Button=new Button("����");
		equal_Button.setFont(new Font("����", Font.BOLD, 22));
		equal_Button.setForeground(Color.RED);
		del_Button=new Button("ɾ��");
		del_Button.setFont(new Font("����", Font.BOLD, 22));
		del_Button.setForeground(Color.RED);
		C_Button=new Button("���");
		C_Button.setFont(new Font("����", Font.BOLD, 22));
		C_Button.setForeground(Color.RED);
		back_Button=new Button("����");
		back_Button.setFont(new Font("����", Font.BOLD, 22));
		back_Button.setForeground(new Color(0, 0, 0));
		back_Button.setBackground(new Color(255, 160, 122));
		common_JPanel.add(equal_Button);
		common_JPanel.add(del_Button);
		common_JPanel.add(C_Button);
		common_JPanel.add(back_Button);
		
		Label_5=new JLabel(" \u5173\u7CFB\u6309\u952E");
		Label_5.setOpaque(false);
		Label_5.setFont(new Font("����", Font.BOLD, 23));
		Label_5.setPreferredSize(new Dimension(360, 65));
		
		key_JPanel=new JPanel(new FlowLayout());
		key_JPanel.setOpaque(false);
		key_JPanel.setPreferredSize(new Dimension(370, 135));
		key_JPanel.add(Label_5,BorderLayout.NORTH);
		key_JPanel.add(relation_JPanel,BorderLayout.CENTER);
		
		JPanel =  new JPanel();
		JPanel.setOpaque(false);
		JPanel.setBackground(Color.LIGHT_GRAY);
		JPanel.setForeground(Color.LIGHT_GRAY);
		JPanel.setPreferredSize(new Dimension(360, 40));
		key_JPanel.add(JPanel);
		key_JPanel.add(common_JPanel,BorderLayout.SOUTH);
		
		input_JPanel=new JPanel(new FlowLayout());
		input_JPanel.setOpaque(false);
		input_JPanel.setPreferredSize(new Dimension(390, 150));
		Label_3=new JLabel("  \u5173\u7CFB\uFF1A");
		Label_3.setOpaque(false);
		Label_3.setFont(new Font("����", Font.BOLD, 22));
		Label_3.setPreferredSize(new Dimension(380, 38));
		input_TextField=new JTextArea();
		input_TextField.setFont(new Font("����", Font.BOLD, 22));
		input_TextField.setText("\u6211");
		input_TextField.setPreferredSize(new Dimension(345, 98));
		input_JPanel.add(Label_3,BorderLayout.NORTH);
		input_JPanel.add(input_TextField,BorderLayout.SOUTH);
		
		output_JPanel=new JPanel(new FlowLayout());
		output_JPanel.setOpaque(false);
		output_JPanel.setPreferredSize(new Dimension(390, 150));
		Label_4=new JLabel("  \u7ED3\u679C\uFF1A");
		Label_4.setOpaque(false);
		Label_4.setFont(new Font("����", Font.BOLD, 22));
		Label_4.setPreferredSize(new Dimension(380, 38));
		output_TextField=new JTextField();
		output_TextField.setFont(new Font("����", Font.BOLD, 22));
		output_TextField.setPreferredSize(new Dimension(345, 90));
		output_JPanel.add(Label_4,BorderLayout.NORTH);
		output_JPanel.add(output_TextField,BorderLayout.SOUTH);
		
		input_output_JPanel=new JPanel(new FlowLayout());
		input_output_JPanel.setOpaque(false);
		input_output_JPanel.setPreferredSize(new Dimension(400, 100));
		input_output_JPanel.add(title_JPanel,BorderLayout.NORTH);
		input_output_JPanel.add(input_JPanel,BorderLayout.CENTER);
		input_output_JPanel.add(output_JPanel,BorderLayout.SOUTH);
		
		baba_Button.addActionListener(new Listener_baba());
		mama_Button.addActionListener(new Listener_mama());
		erzi_Button.addActionListener(new Listener_erzi());
		nver_Button.addActionListener(new Listener_nver());
		gege_Button.addActionListener(new Listener_gege());
		didi_Button.addActionListener(new Listener_didi());
		jiejie_Button.addActionListener(new Listener_jiejie());
		meimei_Button.addActionListener(new Listener_meimei());
		zhangfu_Button.addActionListener(new Listener_zhangfu());
		qizi_Button.addActionListener(new Listener_qizi());
	    equal_Button.addActionListener(new Listener_equal());
	    del_Button.addActionListener(new Listener_del());
	    C_Button.addActionListener(new Listener_C());
	    back_Button.addActionListener(new Listener_back());
		
		Relation_JPanel.add(input_output_JPanel,BorderLayout.WEST);
		Relation_JPanel.add(key_JPanel,BorderLayout.EAST);
		
		contain.add(Relation_JPanel);
		setVisible(true);
	}
	public boolean isExist(String value, String[][] array,int Length)
	{
		boolean flag=false; 
		for (int i = 0; i < Length; i++) 
		 {
			 if (value.equals(array[i][0]))
			 {
				 flag=true;
			 }
		 }
		 return flag;
    }
	class Listener_baba implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("�ְ�");
			}
			else
			{
				input_TextField.setText(str+"�İְ�");
			}
		}	
	}
	class Listener_mama implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("����");
			}
			else
			{
				input_TextField.setText(str+"������");
			}
		}	
	}
	class Listener_erzi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("����");
			}
			else
			{
				input_TextField.setText(str+"�Ķ���");
			}
		}	
	}
	class Listener_nver implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("Ů��");
			}
			else
			{
				input_TextField.setText(str+"��Ů��");
			}
		}	
	}
	class Listener_gege implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("���");
			}
			else
			{
				input_TextField.setText(str+"�ĸ��");
			}
		}	
	}
	class Listener_didi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("�ܵ�");
			}
			else
			{
				input_TextField.setText(str+"�ĵܵ�");
			}
		}	
	}
	class Listener_jiejie implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("���");
			}
			else
			{
				input_TextField.setText(str+"�Ľ��");
			}
		}	
	}
	class Listener_meimei implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("����");
			}
			else
			{
				input_TextField.setText(str+"������");
			}
		}	
	}
	class Listener_zhangfu implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("�ɷ�");
			}
			else
			{
				input_TextField.setText(str+"���ɷ�");
			}
		}	
	}
	class Listener_qizi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("����");
			}
			else
			{
				input_TextField.setText(str+"������");
			}
		}	
	}
	class Listener_equal implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String[] array=input_TextField.getText().split("��");
			for(int j=0; j<array.length;j++) System.out.println(array[j]+"\n");
			int column=0, row=0;
			String resultvalue=array[0];
			for(int i=1;i<array.length;i++)
			{
				for(int m=0;m<relationshipData.length;m++)
				{
					if(relationshipData[m][0].equals(resultvalue))
					{
						row=m;
					}
				}
				for(int n=0;n<relationshipData[0].length;n++)
				{
					if(relationshipData[0][n].equals(array[i]))
					{
						column=n;
					}
				}
				resultvalue = relationshipData[row][column];
				if(isExist(resultvalue,relationshipData,relationshipData.length)==false)
				{
					resultvalue="δ֪����";
					break;
				}
			}
			output_TextField.setText(resultvalue);
		}	
	}
	class Listener_del implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str.length()<4)
			{
				input_TextField.setText("��");
			}
			else
			{
				str=str.substring(0,str.length()-3);
				input_TextField.setText(str);
			}
		}	
	}
	class Listener_C implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText("��");
			output_TextField.setText("");
		}	
	}
	class Listener_back implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
			EmotionalLifePage newWindow=new EmotionalLifePage();
			newWindow.setVisible(true);
		}	
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}