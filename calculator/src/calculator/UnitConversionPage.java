package calculator;

//  Àî›éÑþ 2017111147
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import java.awt.*;
public class UnitConversionPage extends WindowAdapter implements ActionListener {
	private Frame cal_Frame;
	
	
	public void cal() {
		cal_Frame = new Frame("\u5355\u4F4D\u6362\u7B97\u5668");
		cal_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cal_Frame.setType(Type.UTILITY);
		cal_Frame.setForeground(Color.BLACK);
		cal_Frame.setSize(780, 480);
		cal_Frame.setLocation(200, 200);
		cal_Frame.setBackground(Color.LIGHT_GRAY);
		cal_Frame.setResizable(true);
		cal_Frame.setLayout(new BorderLayout(3, 3));
		
	
		cal_Frame.setVisible(true);
		cal_Frame.addWindowListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		

	
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		UnitConversionPage new_cal = new UnitConversionPage();
		new_cal.cal();

	}
}
