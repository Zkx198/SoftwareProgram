package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final String[]KEYS={"7","8","9","+","4","5","6","-","1","2","3","*","0",".","="};
    private final String[]Command={"delete","CE"};
    private JButton[] keys=new JButton[KEYS.length];
    private JButton[] coms=new JButton[Command.length];
    private JTextField text=new JTextField("0");
    private boolean Firstdigit=true;//�Ƿ��һ������
    private double result=0.0;//���
    private String operator = "=";//Ĭ�ϲ���Ϊ"="
    private boolean operateValidFlag = true;//�����Ƿ�Ϸ�
    public Calculator() {
        // TODO Auto-generated constructor stub
        init();
        this.setTitle("ֻ�ܼ���Ӽ��˳���..���");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(width, height)
        this.pack();
    }
    private void init() {
        // TODO Auto-generated method stub
        text.setHorizontalAlignment(JTextField.RIGHT);//�ı��Ҷ���
        text.setEditable(false);//���ɱ༭
        text.setBackground(Color.WHITE);//������ɫ
        JPanel keyspanel=new JPanel();//װ�����Ļ���
        keyspanel.setLayout(new GridLayout(4,4,3,3));//����Ϊ���񲼾�4��4�� ˮƽ��ֱ��඼Ϊ3����
        for(int i=0;i<keys.length;i++){//������ť
            keys[i]=new JButton(KEYS[i]);
            keyspanel.add(keys[i]);//�ڻ�������Ӱ�ť
            keys[i].setForeground(Color.blue);//����ǰ��ɫ��ɫ
        }
        //���������ǰ��ɫΪ��
        keys[3].setForeground(Color.red);
        keys[7].setForeground(Color.red);
        keys[11].setForeground(Color.red);
        keys[14].setForeground(Color.red);
        JPanel comspanel=new JPanel();
        comspanel.setLayout(new GridLayout(1,2,3,3));
        for(int i=0;i<coms.length;i++){
            coms[i]=new JButton(Command[i]);
            comspanel.add(coms[i]);
        }
        JPanel panel1=new JPanel();
        panel1.setLayout(new BorderLayout(3,3));
        panel1.add("North", comspanel);
        panel1.add("Center", keyspanel);
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add("Center", text);  
        getContentPane().setLayout(new BorderLayout(3,5));
        getContentPane().add("North", top); 
        getContentPane().add("Center", panel1);
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i].addActionListener(this);  
        }  
        for (int i = 0; i < Command.length; i++) {  
            coms[i].addActionListener(this);  
        }  
    }
    public void actionPerformed(ActionEvent e) {
        String label=e.getActionCommand();
        if(label==Command[0]){
            handledelete();
        }
        else if(label==Command[1]){
            handleC();
        }
        else if("0123456789.".indexOf(label)>=0){
            handlenumber(label);
        }
        else{
            handleOperator(label);
        }
    }
    private void handleOperator(String label) {
        if(operator.equals("/")){
            if(text.getText()=="0"){
                text.setText("��������Ϊ0");
                operateValidFlag=false;
                handleC();
            }
            else{
                result/=Double.valueOf(text.getText());
            }
        }
        else if(operator.equals("*")){
            result*=Double.valueOf(text.getText());
        }
        else if(operator.equals("+")){
            result+=Double.valueOf(text.getText());
        }
        else if(operator.equals("-")){
            result-=Double.valueOf(text.getText());
        }
        else if(operator.equals("=")){
            result=Double.valueOf(text.getText());
        }
        if(operateValidFlag){
            text.setText(String.valueOf(result));
        }
        operator=label;
        Firstdigit = true;//����������� ����������Ϊ��һ������
        operateValidFlag=true;
    }
    private void handlenumber(String label) {
        // TODO Auto-generated method stub
        if(Firstdigit){
            if(label.equals(".")){
                text.setText(text.getText()+".");
            }
            else{
            text.setText(label);
            }
        }
        else if(label.equals(".")&&text.getText().indexOf(".")<0){
            text.setText(text.getText()+".");
        }
        else if(!label.equals(".")){
            text.setText(text.getText()+label);
        }
        Firstdigit=false;
    }
    private void handleC() {
        text.setText("0");
        Firstdigit=true;
        operator="=";
    }
    private void handledelete() {
        // TODO Auto-generated method stub
        if(text.getText().length()>1){
            text.setText(text.getText().substring(0, text.getText().length()-1));
        }
        else if(text.getText().length()==1){
            text.setText("0");
        }
    }
    public static void main(String args[]) {  
        Calculator calculator1 = new Calculator();           
    }  
}