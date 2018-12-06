package telas;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame{
		
	JCheckBox teste = new JCheckBox();
	
		public CheckBox() {
			
			setLayout(new FlowLayout());
			add(teste);
			
			setTitle("Título da Janela");
			setSize(400,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
		}
}
