package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import iu.Main;

public class Tela  extends JFrame{
	JCheckBox check;
	JCheckBox[] checks;
	JLabel enumc = new JLabel();
	ButtonGroup grupo = new ButtonGroup();
	JButton ok = new JButton("Ok!");
	String resposta  = "";
	private PrintWriter pw;

	
	public Tela() {}
	
	public void criarTela(int quantidade,String itens[],String enuciado,boolean g) {
		enumc.setText(enuciado);		
		add(enumc);
		checks = new JCheckBox[quantidade];
		for(int i=0;i<quantidade;i++) {
			check = new JCheckBox();
			check.setText(itens[i]);
			add(check);
			checks[i] =check;
			
			if(g==true) {
				grupo.add(check);
			}
			
		}
		FileWriter fw;
		try {
			fw = new FileWriter(enuciado +".txt",true);
			pw = new PrintWriter(fw);
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			ok.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int u=0;u<quantidade;u++) {
					if(checks[u].isSelected()) {
						String texto = checks[u].getText();
						resposta =texto;
						pw.println("Respota: "+resposta);
					//	JOptionPane.showMessageDialog(null, resposta);
					}}
				}
			});
			
		
	
		
		add(ok);
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
	
	
	
	
	
	
	
	
	

