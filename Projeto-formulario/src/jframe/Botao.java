package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Botao extends JFrame implements ActionListener{

	
	JButton TextoCurto = new JButton("Texto Curto");
	JButton TextoLongo = new JButton("Texto Longo");
	JButton Lista = new JButton("Lista");
	JButton Alternativa = new JButton("Alternativa");
	JButton Exclusiva = new JButton("Exclusiva");
	JButton Opcional = new JButton("Opcional");
	//JLabel Texto = new JLabel("Selecione a opção"
//			+ " de pergunta que deseja criar");
	
	
	public Botao() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(50,250);
		setVisible(true);
		//add(Texto);
		add(TextoCurto);
		add(TextoLongo);
		add(Lista);
		add(Alternativa);
		add(Exclusiva);
		add(Opcional);
		TextoCurto.addActionListener(this);
		TextoLongo.addActionListener(this);
		Lista.addActionListener(this);
		Alternativa.addActionListener(this);
		Exclusiva.addActionListener(this);
		Opcional.addActionListener(this);
		
		
	
	}
	
	int escolha;
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==TextoCurto) {
			escolha=escolha+1;
			JOptionPane.showConfirmDialog(null, escolha);
			
		}
		if (e.getSource() == TextoLongo) {
			escolha=escolha+2;
		}
		
	}

	public int opcaos() {
		return this.escolha;
	}
				

}












	
	
	