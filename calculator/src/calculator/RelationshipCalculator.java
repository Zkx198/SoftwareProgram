package calculator;
//�ſ��� 2017111478
import java.awt.event.*;
import java.awt.*;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class RelationshipCalculator extends WindowAdapter{

	private Frame Relation_Frame;
	private Panel title_Panel,input_Panel,output_Panel,key_Panel,input_output_Panel;
	private Panel relation_Panel,common_Panel;//����������ϵ������=��del��C����
	private TextArea input_TextField;//�����
	private TextField output_TextField;//�����
	private Label Label_1,Label_2,Label_3,Label_4,Label_5;//��ʾ����
    private Button baba_Button,mama_Button,erzi_Button,nver_Button,gege_Button,didi_Button,jiejie_Button,meimei_Button,zhangfu_Button,qizi_Button;//������ϵ����
    private Button equal_Button,del_Button,C_Button,back_Button;//���ڡ�ɾ������ա����ذ���
    
    private String[][] relationshipData = {
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
    private JPanel panel;
	/**
	 * Create the frame.
	 */
	public void Relationship() {
		Relation_Frame=new Frame("���ݹ�ϵ������");
		Relation_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Relation_Frame.setType(Type.UTILITY);
		Relation_Frame.setForeground(Color.BLACK);
		Relation_Frame.setSize(780, 480);
		Relation_Frame.setLocationRelativeTo(null);
		Relation_Frame.setBackground(Color.LIGHT_GRAY);
		Relation_Frame.setResizable(true);
		Relation_Frame.setLayout(new BorderLayout(3,1));
		
		title_Panel=new Panel(new GridLayout(2,1));
		title_Panel.setPreferredSize(new Dimension(390, 80));
		Label_1=new Label("\u5047\u5B9A\u6211\u7684\u6027\u522B\u4E3A:\u7537");
		Label_1.setFont(new Font("����", Font.BOLD, 22));
		Label_2=new Label("\u7ED3\u679C\u4E3A\u6211\u5BF9\u5BF9\u65B9\u7684\u79F0\u547C");
		Label_2.setFont(new Font("����", Font.BOLD, 22));
	    title_Panel.add(Label_1);
	    title_Panel.add(Label_2);
		
		relation_Panel=new Panel(new GridLayout(3,4,5,10));
		relation_Panel.setPreferredSize(new Dimension(340, 250));
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
		relation_Panel.add(baba_Button);
		relation_Panel.add(mama_Button);
		relation_Panel.add(erzi_Button);
		relation_Panel.add(nver_Button);
		relation_Panel.add(gege_Button);
		relation_Panel.add(didi_Button);
		relation_Panel.add(jiejie_Button);
		relation_Panel.add(meimei_Button);
		relation_Panel.add(zhangfu_Button);
		relation_Panel.add(qizi_Button);
		
		common_Panel=new Panel(new GridLayout(1,4,5,3));
		common_Panel.setPreferredSize(new Dimension(340, 90));
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
		common_Panel.add(equal_Button);
		common_Panel.add(del_Button);
		common_Panel.add(C_Button);
		common_Panel.add(back_Button);
		
		Label_5=new Label("��ϵ����");
		Label_5.setFont(new Font("����", Font.BOLD, 22));
		Label_5.setPreferredSize(new Dimension(360, 40));
		
		key_Panel=new Panel(new FlowLayout());
		key_Panel.setPreferredSize(new Dimension(360, 135));
		key_Panel.add(Label_5,BorderLayout.NORTH);
		key_Panel.add(relation_Panel,BorderLayout.CENTER);
		
		panel =  new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setPreferredSize(new Dimension(360, 10));
		key_Panel.add(panel);
		key_Panel.add(common_Panel,BorderLayout.SOUTH);
		
		input_Panel=new Panel(new FlowLayout());
		input_Panel.setPreferredSize(new Dimension(390, 200));
		Label_3=new Label("��ϵ��");
		Label_3.setFont(new Font("����", Font.BOLD, 20));
		Label_3.setPreferredSize(new Dimension(380, 20));
		input_TextField=new TextArea();
		input_TextField.setFont(new Font("����", Font.BOLD, 22));
		input_TextField.setText("��");
		input_TextField.setPreferredSize(new Dimension(375, 140));
		input_Panel.add(Label_3,BorderLayout.NORTH);
		input_Panel.add(input_TextField,BorderLayout.SOUTH);
		
		output_Panel=new Panel(new FlowLayout());
		output_Panel.setPreferredSize(new Dimension(390, 120));
		Label_4=new Label("�����");
		Label_4.setFont(new Font("����", Font.BOLD, 20));
		Label_4.setPreferredSize(new Dimension(380, 20));
		output_TextField=new TextField();
		output_TextField.setPreferredSize(new Dimension(375, 80));
		output_Panel.add(Label_4,BorderLayout.NORTH);
		output_Panel.add(output_TextField,BorderLayout.SOUTH);
		
		input_output_Panel=new Panel(new FlowLayout());
		input_output_Panel.setPreferredSize(new Dimension(400, 100));
		input_output_Panel.add(title_Panel,BorderLayout.NORTH);
		input_output_Panel.add(input_Panel,BorderLayout.CENTER);
		input_output_Panel.add(output_Panel,BorderLayout.SOUTH);
		
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
		
		Relation_Frame.add(input_output_Panel,BorderLayout.WEST);
		Relation_Frame.add(key_Panel,BorderLayout.EAST);
		Relation_Frame.setVisible(true);
		Relation_Frame.addWindowListener(this);
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
			Relation_Frame.setVisible(false);
			EmotionalLifePage newWindow=new EmotionalLifePage();
			newWindow.setVisible(true);
		}	
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		RelationshipCalculator new_rel = new RelationshipCalculator();
		new_rel.Relationship();
	}
}