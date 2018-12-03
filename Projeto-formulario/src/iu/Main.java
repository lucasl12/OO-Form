package iu;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

import formulario.Formulario;
import jframe.Tela;
import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;

public class Main {

	public static void main(String[] args) {
		
		
		Tela t = new Tela();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	/*	ArrayList<Pergunta>p = new ArrayList<Pergunta>(); // Um Lista de perguntas, pra dps passar por parametro.
		Pergunta perg; // referencia gênerica para pergunta
		String[]itens= {}; // Itens que será utilizado na opção alternativa
		int perguntasAbertas = 0; 
		

		

		JTextField Nomef = new JTextField(); // Criando o campo nome
		JTextField Descf = new JTextField();// 
		JTextField Datainicio = new JTextField();
		JTextField Datafinal = new JTextField();
		JTextField QuantidadePerg = new JTextField();
		
		
		Object[] fields= { //Criando um array do tipo Object, pois assim aceitaria qualquer tipo de dado,
						
				"Nome do formulario",Nomef,// a mensagem a ser exibida, e aa referencia
				"Descrição ",Descf,
				"Data de inicio",Datainicio,
				"Data de termino",Datafinal,
				"Quantidade de perguntas",QuantidadePerg		
};

	
		JOptionPane.showConfirmDialog(null,fields,"CRIAÇÃO DO FORMULARIO",JOptionPane.CLOSED_OPTION); //criação da tela

		String nomeFormulario = Nomef.getText().toString(); // salvando em uma variavel para string
		String Descricao = Descf.getText().toString();
		String DataInicio = Datainicio.getText().toString();
		String DataFinal = Datafinal.getText().toString();
		int quantidadeperg = Integer.parseInt(QuantidadePerg.getText().toString());
		
		String enuciados[] = new String[quantidadeperg]; // um array de enuciados
		
			
		for(int i=0;i<quantidadeperg;i++) {
			String tipo =JOptionPane.showInputDialog("qual tipo de pergunta deseja criar?"+(1+i));
			if(tipo.equalsIgnoreCase("texto curto") || tipo.equalsIgnoreCase("textocurto")) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				perg = new TextoCurto();// Usando o polimorfismo
				perg.setEnuciadoPergunta(enuciado);
				p.add(perg); //adicionando na lista
				enuciados[i] = perg.getEnuciadoPergunta();//adicionando no Array
				perguntasAbertas=perguntasAbertas+1;
				
				
			}
			if(tipo.equalsIgnoreCase("texto longo") || tipo.equalsIgnoreCase("textolongo")) {
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?" + (1+i));
 				perg = new TextoLongo();
 				perg.setEnuciadoPergunta(enuciado);
 				p.add(perg);
 				enuciados[i]=perg.getEnuciadoPergunta();
 				perguntasAbertas=perguntasAbertas+1;
			
			}
			
			if(tipo.equalsIgnoreCase("Alternativa")) {
				Alternativa alt = new Alternativa();
				JTextField Enunciado = new JTextField();
				JTextField quantidadedeitens = new JTextField();
				
				
				Object[] fields2= {
						"Enuciado",Enunciado,
						"Quantidade de itens ",quantidadedeitens,
						
							
		};
				JOptionPane.showConfirmDialog(null,fields2,"CRIAÇÃO DA ALTERNATIVA",JOptionPane.CLOSED_OPTION);
		
				String enunciado = Enunciado.getText().toString();
				int quantidadei = Integer.parseInt(quantidadedeitens.getText().toString());
				alt.setEnuciadoPergunta(enunciado);
				alt.setQuantidadeitens(quantidadei);
				enunciado=enuciados[i];
				itens= new String[quantidadei]; // Inicializado com as pocições de quantidade
				for(int f=0;f<quantidadei;f++) {
					itens[f]= JOptionPane.showInputDialog("Qual o item " +(f+1)+ " que deseja:");//armazenando no vetor
				
				}
		
				
			}
			
			
			

		
		
		
		
		}
		
		
		
		Formulario f = new Formulario(nomeFormulario,Descricao,DataInicio,DataFinal,p);
		JOptionPane.showMessageDialog(null, 
				"--------------Formulario criado!--------------" + "\n" +
						"Nome do formulario: " + f.getNomeFormulario() +"\n" +
						"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
						"Data de inicio: " + f.getDataInicio() + "\n " +
						"Data de Termino: " + f.getDataFinal() + "\n " );

		
		for(int i=0;i<perguntasAbertas;i++) {
		
		String resposta = JOptionPane.showInputDialog(enuciados[i]);
		JOptionPane.showMessageDialog(null, itens[i]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
