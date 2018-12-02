package iu;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

import formulario.Formulario;
import jframe.Botao;

import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;

public class Main {

	public static void main(String[] args) {
		
		Botao menu;
		ArrayList<Pergunta>p = new ArrayList<Pergunta>();
		int opcao;
		Pergunta perg;

		JTextField Nomef = new JTextField();
		JTextField Descf = new JTextField();
		JTextField Datainicio = new JTextField();
		JTextField Datafinal = new JTextField();
		JTextField QuantidadePerg = new JTextField();
		
		
		Object[] fields= {
				"Nome do formulario",Nomef,
				"Descrição ",Descf,
				"Data de inicio",Datainicio,
				"Data de termino",Datafinal,
				"Quantidade de perguntas",QuantidadePerg		
};
	
		JOptionPane.showConfirmDialog(null,fields,"CRIAÇÃO DO FORMULARIO",JOptionPane.CLOSED_OPTION);

		String nomeFormulario = Nomef.getText().toString();
		String Descricao = Descf.getText().toString();
		String DataInicio = Datainicio.getText().toString();
		String DataFinal = Datafinal.getText().toString();
		int quantidadeperg = Integer.parseInt(QuantidadePerg.getText().toString());
			
		for(int i=0;i<quantidadeperg;i++) {
			menu = new Botao();
			opcao = menu.opcaos();
			System.out.println(opcao);}
		/*
	
			if(opcao==0) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				perg = new TextoCurto();
				perg.setEnuciadoPergunta(enuciado);
				p.add(perg);
				
				
			}
			
			if(opcao==2) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				perg = new TextoLongo();
				perg.setEnuciadoPergunta(enuciado);
				p.add(perg);
			}
			
			if(opcao==3) {
				// elementos somente em Perguntas;
				Alternativa alt = new Alternativa();
				perg = alt;
			}
			
		
		}
		
		
		
		Formulario f = new Formulario(nomeFormulario,Descricao,DataInicio,DataFinal,p);

//		
//		JOptionPane.showMessageDialog(null, 
//		"--------------Formulario criado!--------------" + "\n" +
//				"Nome do formulario: " + f.getNomeFormulario() +"\n" +
//				"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
//				"Data de inicio: " + f.getDataInicio() + "\n " +
//				"Data de Termino: " + f.getDataFinal() + "\n " ); 
				
				//como imprimo as perguntas.
		
	
		
		
		
		
		
		*/
		
		
	
	
		
		
	}

}
