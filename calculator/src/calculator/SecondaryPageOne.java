package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondaryPageOne extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryPageOne frame = new SecondaryPageOne();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SecondaryPageOne() {
		setTitle("��ѧ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 480);
		JPanel contentPane = new JPanel();
		
        contentPane.setLayout(new GridLayout(2,3,3,3));
        setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("��������");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BasicCalculator newWindow=new BasicCalculator();
				newWindow.cal();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�ⷽ��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EquationCalculator new_Window=new EquationCalculator();
				new_Window.cal();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("�ⲻ��ʽ");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("�������");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("��������");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("���ƻ���");
		btnNewButton_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			  dispose();
			  new HexadecimalConversion();
		    }
	    });
		contentPane.add(btnNewButton_5);
		
	}
}
