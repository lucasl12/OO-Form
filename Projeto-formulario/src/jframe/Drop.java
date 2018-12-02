package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Drop extends JFrame implements ActionListener{
	
	String opcao;
String [] itens = {"Texto Curto","Texto Longo","Lista","Excluisva","Opcional"};
JComboBox dropdow = new JComboBox(itens);

public Drop() {
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400,150);
	setVisible(true);
	add(dropdow);
	dropdow.setSelectedIndex(3);
	dropdow.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== dropdow) {
		JComboBox cb = (JComboBox)e.getSource();
		String msg = (String)cb.getSelectedItem();
		switch(msg) {
		case "Texto Curto":
			opcao= "Texto Curto";
			break;
		
		case "Texo Longo":
			opcao = "Texto Longo";
			break;
				
		}
		
		
		
		
		
		}
	}

	public String opcoaos() {
		return opcao;
	}
	
}












	
	
	