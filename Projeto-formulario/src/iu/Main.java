package iu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import formulario.Formulario;
import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;
import perguntasFechadas.Opcional;

public class Main {

	public static void main(String[] args) {
		
		//criação do campo de obter informações do formulario
		 
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

		
		String opcoes[] = new String[quantidadeperg]; //string que armazena as opcoes que o usuario digitar
		String enuciadoTextoCurto[]= new String[quantidadeperg];// Array que armazena os enuciados das respectivas perguntas
		String enuciadoTextoLongo[] = new String[quantidadeperg];
		String enuciadoAlternativa[] = new String[quantidadeperg];
		String enuciadoOpcoes[] = new String[quantidadeperg];
		
		
		
		
		String itensAlternativa[]= {};
		//criar itens das outras que precisam de itens
		
		for(int i=0;i<quantidadeperg;i++) {
			String opcao =JOptionPane.showInputDialog("qual tipo de pergunta deseja criar?"+(1+i)); //lendo a opcao
			if(opcao.equalsIgnoreCase("texto curto") || opcao.equalsIgnoreCase("textocurto")) {
				opcoes[i]=opcao;// salvando no array
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?"); // lendo o enuciado
				enuciadoTextoCurto[i]=enuciado; //salvando no enuciado
				
				
			}
			if(opcao.equalsIgnoreCase("texto longo") || opcao.equalsIgnoreCase("textolongo")) {
				opcoes[i]= opcao;
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				enuciadoTextoLongo[i]=enuciado;

			}
			
			if(opcao.equalsIgnoreCase("Alternativa") || opcao.equalsIgnoreCase("alternativas")) { 
				JTextField Enunciado = new JTextField();
				JTextField quantidadedeitens = new JTextField();
				
				
				Object[] fields2= {
						"Enuciado",Enunciado,
						"Quantidade de itens ",quantidadedeitens,
						
							
		};	
				JOptionPane.showConfirmDialog(null,fields2,"CRIAÇÃO DA ALTERNATIVA",JOptionPane.CLOSED_OPTION);
				
				String enunciado = Enunciado.getText().toString();
				int quantidadei = Integer.parseInt(quantidadedeitens.getText().toString());
				
				enuciadoAlternativa[i]=enunciado;
				itensAlternativa= new String[quantidadei];
				for(int it=0;it<quantidadei;it++) {
					String item = JOptionPane.showInputDialog("Qual o item" +(1+it));
					itensAlternativa[it]=item;
				}
				
			}
			
			if(opcao.equalsIgnoreCase("opcional")){
				opcoes[i]= opcao;
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				enuciadoOpcoes[i]=enuciado;
			
			}
			
	
			
			
			
			
			
			
			
		}
		
			
		
		    
		Pergunta perg;
		ArrayList <Pergunta> p = new ArrayList<Pergunta>();
		
		String respostatipoTextoCurto[]= new String[quantidadeperg];
		String respostaTipoTextoLongo[] = new String[quantidadeperg];
		String respostaTipoalternativa[]= new String [quantidadeperg];
		String respostaTipoLista []= {};
		String respostatipoOpcinal[]= new String [quantidadeperg];
		for(int j=0;j<quantidadeperg;j++) {
			if(opcoes[j].equalsIgnoreCase("Textocurto")|| opcoes[j].equalsIgnoreCase("texto curto")) {
				perg = new TextoCurto();
				perg.setEnuciadoPergunta(enuciadoTextoCurto[j]);// setando o enunciado de acordo com enuciado
				respostatipoTextoCurto[j]= JOptionPane.showInputDialog(enuciadoTextoCurto[j]); //recebendo a resposta
				perg.setResposta(respostatipoTextoCurto[j]);// setendo a resposta
				p.add(perg);
				//System.out.println(perg.getEnuciadoPergunta());
				//System.out.println(perg.getResposta());
				
			}
			
			if(opcoes[j].equalsIgnoreCase("textolongo")|| opcoes[j].equalsIgnoreCase("texto longo")) {
				perg = new TextoLongo();
				perg.setEnuciadoPergunta(enuciadoTextoLongo[j]);
				respostaTipoTextoLongo[j]=JOptionPane.showInputDialog(enuciadoTextoLongo[j]);
				perg.setResposta(respostaTipoTextoLongo[j]);
				System.out.println(perg.getEnuciadoPergunta());
				System.out.println(perg.getResposta());
				p.add(perg);
			}
			/*if(opcoes[j].equalsIgnoreCase("Alternativa")|| opcoes[j].equalsIgnoreCase("Alternativas")) {
				Alternativa alt = new Alternativa();
				alt.setEnuciadoPergunta(enuciadoAlternativa[j]);
				respostaTipoalternativa[j] = JOptionPane.showInputDialog(enuciadoTextoLongo[j]);
				
		}
			*/
			
			if(opcoes[j].equalsIgnoreCase("opcional")) {
				Opcional op = new Opcional();
				op.setEnuciadoPergunta(enuciadoOpcoes[j]);
				String resposta="";
				int valor =JOptionPane.showConfirmDialog(null,enuciadoOpcoes[j]);
				if(valor==0) {
					resposta="sim";
				}
				if(valor==1) {
					resposta = "não";
				}
			
				respostatipoOpcinal[j]=resposta;
				op.setResposta(resposta);
			
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		Formulario f = new Formulario(nomeFormulario, Descricao, DataInicio, DataFinal, p);
		JOptionPane.showMessageDialog(null, 
		"                                    Formulario criado!                                      " + "\n" +
						"Nome do formulario: " + f.getNomeFormulario() +"\n" +
						"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
						"Data de inicio: " + f.getDataInicio() + "\n " +
					     "Data de Termino: " + f.getDataFinal() + "\n "+ f.salvarFormulario() + "\n" ); 
		
	
		
		
	/*	JOptionPane.showMessageDialog(null,"As perguntas de texto curto foram:" + "\n" +
			enuciadoTextoCurto +"\n" + "As respostas foram: " +"\n" + respostatipoTextoCurto 
				
				);*/
		
		for(int bo=0;bo<quantidadeperg;bo++) {
			JOptionPane.showMessageDialog(null,"As perguntas de texto curto foram:" + "\n" +
					enuciadoTextoCurto[bo] +"\n" + "As respostas foram: " +"\n" + respostatipoTextoCurto[bo]);
		}
		
				
}

				
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
		
		
	
	
		
		
	
