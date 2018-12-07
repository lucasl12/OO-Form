package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tela  extends JFrame{
	JCheckBox check;
	JLabel enumc = new JLabel();
	ButtonGroup grupo = new ButtonGroup();
	JButton ok = new JButton("Ok!");
	String resposta  = "";
	
	public Tela() {}
	
	public void criarTela(int quantidade,String itens[],String enuciado,boolean g) {
		enumc.setText(enuciado);		
		add(enumc);
		for(int i=0;i<quantidade;i++) {
			check = new JCheckBox();
			check.setText(itens[i]);
			add(check);
			if(g==true) {
				grupo.add(check);
			}
			
	
			ok.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(check.isSelected()) {
						String texto = check.getText();
						resposta =texto;
						//JOptionPane.showMessageDialog(null, resposta);
					}
				}
			});
		}
		
		add(ok);
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public String respot() {
		return resposta;
	}
	
	
	
	
	
	
	
	
}
