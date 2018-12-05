package opcoes;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Tela extends JFrame {
	
	
	JRadioButton RadioOpcoes;
	JRadioButton a = new JRadioButton();
	ButtonGroup grupo = new ButtonGroup();
	JLabel enumc = new JLabel();
	

	public Tela(String enuciado, String itens[]) {

		enumc.setText(enuciado);
		enumc.setBounds(10, 10, 150, 56);
		
		add(enumc);
		for(int i=0;i<3;i++) {
			RadioOpcoes = new JRadioButton();
			RadioOpcoes.setText(itens[i] + "\n");
			grupo.add(RadioOpcoes);
			add(RadioOpcoes);
			
		}
		
		setLayout(new FlowLayout());
		setSize(900,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		;
		
	
		
		
	}
	

}
