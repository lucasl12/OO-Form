package iu;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

import formulario.Formulario;
import jframe.Drop;
import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;

public class Main {

	public static void main(String[] args) {
		
		Drop drop;
		ArrayList<Pergunta>p = new ArrayList<Pergunta>();
		String opcao;

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
			
			
		for(int i=0; i<quantidadeperg;i++) {
			drop = new Drop();
			opcao = drop.selecionado();
			System.out.println(opcao);
		
		}
	
		
	/*	
		
		
		
		
		for(int i=0;i<quantidade;i++) {
			String tipo =JOptionPane.showInputDialog("qual tipo de pergunta deseja criar?"+(1+i));
			if(tipo.equalsIgnoreCase("texto curto") || tipo.equalsIgnoreCase("textocurto")) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?"+ (1+i));
				perg = new TextoCurto();
				perg.setEnuciadoPergunta(enuciado);
				p.add(perg);
				
			}
			
			if(tipo.equalsIgnoreCase("texto longo") || tipo.equalsIgnoreCase("textolongo")) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?"+ (1+i));
				perg = new TextoLongo();
				perg.setEnuciadoPergunta(enuciado);
				p.add(perg);
			}
			
			if(tipo.equalsIgnoreCase("Alternativa")) {
				// elementos somente em Perguntas;
				Alternativa alt = new Alternativa();
				perg = alt;
				int quantidadei = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de itens"));
				
				for(int j=0;j<quantidade; j++) {
				//	alt.novaPergunta(enuciadoPergunta, resposta, itens, quantidadei);
				//	((Alternativa)perg)
//				perg.novaPergunta(enuciadoPergunta, resposta);
				}
				
			}
			// Lista,excluisva,alternativ....
		}
		
		
		Formulario f = new Formulario(nomeFormulario,Descricao,DataInicio,DataFinal,p);
		
		JOptionPane.showMessageDialog(null, 
		"--------------Formulario criado!--------------" + "\n" +
				"Nome do formulario: " + f.getNomeFormulario() +"\n" +
				"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
				"Data de inicio: " + f.getDataInicio() + "\n " +
				"Data de Termino: " + f.getDataFinal() + "\n " 
				
				//como imprimo as perguntas.
		
				
				);
		
		
		
		
		
		
		
		
	
	
		*/
		
	}

}
