package iu;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import formulario.Formulario;
import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeFormulario =JOptionPane.showInputDialog("Nomeformulario");
		String Descricao =JOptionPane.showInputDialog("descricaoFormulario");
		String DataInicio =JOptionPane.showInputDialog("Datainicio");
		String DataFinal =JOptionPane.showInputDialog("Datafinal");
		int quantidade =Integer.parseInt(JOptionPane.showInputDialog("quantidade"));
		ArrayList<Pergunta>p = new ArrayList<Pergunta>();
	
		Pergunta perg;
		
		
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
					alt.novaPergunta(enuciadoPergunta, resposta, itens, quantidadei);
					((Alternativa)perg)
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
		
		
		
		
		
		
		
		
	
	
		
		
	}

}
