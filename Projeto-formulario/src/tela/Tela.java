package tela;
 import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import iu.Main;
import javafx.scene.text.Text;


 public class Tela  extends JFrame{
	JCheckBox check;
	JLabel enumc = new JLabel();
	ButtonGroup grupo = new ButtonGroup();
	JButton ok = new JButton("Ok!");
	JCheckBox[]checks= {};
	public Tela() {}
	Main a = new Main();
	
	
	public void criarTela(int quantidade,String itens[],String enuciado,boolean g) {
		enumc.setText(enuciado);		
		add(enumc);
		checks = new JCheckBox[quantidade];
		for(int i=0;i<quantidade;i++) {
			check = new JCheckBox();
			check.setText(itens[i]);
			add(check);
			checks[i]=check;
			if(g==true) {
				grupo.add(check);
			}
			
	
			
		}
		
		add(ok);
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int u=0;u<quantidade;u++) {
					String texto[]= new String[quantidade];
				if(checks[u].isSelected()) {
					texto[u] = checks[u].getText();
					if(texto[u]!=null) {
					String b = 	texto[u];
					a.imprimir(b);
					}
					
				
					
					}
				}
			}
		});
		
	}
	
	
	
	
	
	
	
	
	
	
}