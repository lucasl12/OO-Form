package jframe;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Drop extends JFrame {
	
	
	JComboBox<String> combo = new JComboBox<String>(); 
	public String  item; 
	
	public Drop() {
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(combo);
		
		combo.addItem("Texto curto");
		combo.addItem("Texto Longo");
		combo.addItem("Lista");
		combo.addItem("Excluiva");
		combo.setSelectedItem(5);
		item = (String) combo.getSelectedItem();
		setTitle("Tipo de pergunta que deseja criar");
		setSize(400,150);
		
		setVisible(true);
		
		
	}
	
	public String selecionado() {
		return item;
		
	}
	
}
