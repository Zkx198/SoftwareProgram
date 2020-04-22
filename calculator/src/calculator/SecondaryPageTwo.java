package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SecondaryPageTwo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondaryPageTwo frame = new SecondaryPageTwo();
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
	public SecondaryPageTwo() {
		setTitle("生活计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		
        contentPane.setLayout(new GridLayout(3,1,3,3));
        setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("健康计算器");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HealthLifePage newWindow=new HealthLifePage();
				newWindow.cal();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("情感计算器");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TertiaryPageTwo newWindow=new TertiaryPageTwo();
				newWindow.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("度量计算器");
		contentPane.add(btnNewButton_2);
	}

}
