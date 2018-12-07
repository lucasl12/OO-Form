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
import perguntasFechadas.Exclusiva;
import perguntasFechadas.Lista;
import perguntasFechadas.Opcional;
import tela.Tela;

public class Main {

	public static  String respostam;
	public void imprimir(String r) {
		if(r!=null) {
		respostam=r;}
	}

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
		String enuciadoLista[] = new String[quantidadeperg];
		String enunciadoExclusiva[] = new String[quantidadeperg];
		
		
		
		
		String itensAlternativa[]= {};
		String itensLista[]= {};
		String itensExclusiva[]= {};
		int quantidadei=0;
		int quantidadeiL=0;
		int quantidadeiE=0;
		//criar itens das outras que precisam de itens
		
		for(int i=0;i<quantidadeperg;i++) {
			String opcao =JOptionPane.showInputDialog("qual tipo da " + (1+i)+ "° pergunta deseja criar?"); //lendo a opcao
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
				opcoes[i]=opcao;
				JTextField Enunciado = new JTextField();
				JTextField quantidadedeitens = new JTextField();
				
				
				Object[] fields2= {
						"Enuciado",Enunciado,
						"Quantidade de itens ",quantidadedeitens,
						
							
		};	
				JOptionPane.showConfirmDialog(null,fields2,"CRIAÇÃO DA ALTERNATIVA",JOptionPane.CLOSED_OPTION);
				
				String enunciado = Enunciado.getText().toString();
				 quantidadei = Integer.parseInt(quantidadedeitens.getText().toString());
				
				enuciadoAlternativa[i]=enunciado;
				itensAlternativa= new String[quantidadei];
				for(int it=0;it<quantidadei;it++) {
					String item = JOptionPane.showInputDialog("Qual o item" +(1+it));
					itensAlternativa[it]=item;
				}
				
				
			}
			
			if(opcao.equalsIgnoreCase("Lista")) {
				opcoes[i]=opcao;
				JTextField Enunciado = new JTextField();
				JTextField quantidadedeitens = new JTextField();
				
				
				Object[] fields2= {
						"Enuciado",Enunciado,
						"Quantidade de itens ",quantidadedeitens,
						
							
		};	
				JOptionPane.showConfirmDialog(null,fields2,"CRIAÇÃO DA LISTA",JOptionPane.CLOSED_OPTION);
				
				String enunciado = Enunciado.getText().toString();
				 quantidadeiL = Integer.parseInt(quantidadedeitens.getText().toString());
				
				enuciadoLista[i]=enunciado;
				itensLista= new String[quantidadeiL];
				for(int it=0;it<quantidadeiL;it++) {
					String item = JOptionPane.showInputDialog("Qual o item" +(1+it));
					itensLista[it]=item;
				}
				
			}
			
			
			if(opcao.equalsIgnoreCase("opcional")){
				opcoes[i]= opcao;
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				enuciadoOpcoes[i]=enuciado;
			
			}
			
			if(opcao.equalsIgnoreCase("Exclusiva")) {
				opcoes[i]=opcao;
				JTextField Enunciado = new JTextField();
				JTextField quantidadedeitens = new JTextField();
				
				
				Object[] fields2= {
						"Enuciado",Enunciado,
						"Quantidade de itens ",quantidadedeitens,
						
							
		};	
				JOptionPane.showConfirmDialog(null,fields2,"CRIAÇÃO DA EXCLUSIVA",JOptionPane.CLOSED_OPTION);
				
				String enunciado = Enunciado.getText().toString();
				 quantidadeiE = Integer.parseInt(quantidadedeitens.getText().toString());
				
				enunciadoExclusiva[i]=enunciado;
				itensExclusiva= new String[quantidadeiE];
				for(int it=0;it<quantidadeiE;it++) {
					String item = JOptionPane.showInputDialog("Qual o item" +(1+it));
					itensExclusiva[it]=item;
				}
				
			}
			
			
			
	
			
			
			
			
			
			
			
		}
		
			
		
		    
		Pergunta perg;
		ArrayList <Pergunta> p = new ArrayList<Pergunta>();
		Tela a ;
		
		String respostatipoTextoCurto[]= new String[quantidadeperg];
		String respostaTipoTextoLongo[] = new String[quantidadeperg];
		String respostaTipoalternativa[]= new String [quantidadeperg];
		String respostaTipoLista []= new String [quantidadeperg];
		String respostatipoOpcinal[]= new String [quantidadeperg];
		String respostaTipoExclusiva []= new String [quantidadeperg];
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
				
				p.add(perg);
			}
			if(opcoes[j].equalsIgnoreCase("Alternativa")|| opcoes[j].equalsIgnoreCase("Alternativas")) {
				Alternativa alt = new Alternativa();
				alt.setEnuciadoPergunta(enuciadoAlternativa[j]);
				alt.setListaItems(itensAlternativa);
				String itens[]= alt.getListaItems();
				alt.setQuantidadeitens(quantidadei);
				int quantidade = alt.getQuantidadeitens();
				String enuciado = alt.getEnuciadoPergunta();
				a= new Tela();
				a.criarTela(quantidade,itens,enuciado,false);
				System.out.println(respostam);
//				alt.setResposta(respostam);
//				respostaTipoalternativa[j]=alt.getResposta();
				
				
			
				p.add(alt);
		}
			
			if(opcoes[j].equalsIgnoreCase("Lista")) {
				Lista list = new Lista();
				list.setEnuciadoPergunta(enuciadoLista[j]);
				list.setListaItems(itensLista);
				String itens[]= list.getListaItems();
				list.setQuantidadeitens(quantidadeiL);
				int quantidade = list.getQuantidadeitens();
				String enunciado = list.getEnuciadoPergunta();
				a = new Tela();
				a.criarTela(quantidade, itens, enunciado,true);
				//list.setResposta(respostam);
				//respostaTipoLista[j]= list.getResposta();
				
				
				//perg = list;
				p.add(list);
			};
			
			
			
			
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
			if(opcoes[j].equalsIgnoreCase("exclusiva")) {
				Exclusiva exc = new Exclusiva();
				exc.setEnuciadoPergunta(enunciadoExclusiva[j]);
				exc.setListaItems(itensExclusiva);
				String itens[]= exc.getListaItems();
				exc.setQuantidadeitens(quantidadeiE);
				int quantidade = exc.getQuantidadeitens();
				String enunciado = exc.getEnuciadoPergunta();
				a = new Tela();
				a.criarTela(quantidade, itens, enunciado,true);
				exc.setResposta(respostam);
				respostaTipoExclusiva[j]=exc.getResposta();
				
				
				//preg = exc;
				
				p.add(exc);
				
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		Formulario f = new Formulario(nomeFormulario, Descricao, DataInicio, DataFinal, p);
		f.salvarFormulario(opcoes,quantidadeperg,enuciadoTextoCurto, respostatipoTextoCurto,enuciadoTextoLongo,
				respostaTipoTextoLongo,enuciadoOpcoes,respostatipoOpcinal);
		
		JOptionPane.showMessageDialog(null, 
		"                                    Formulario criado!                                      " + "\n" +
						"Nome do formulario: " + f.getNomeFormulario() +"\n" +
						"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
						"Data de inicio: " + f.getDataInicio() + "\n " +
					    "Data de Termino: " + f.getDataFinal() + "\n "+ "\n" ); 
		
	
		
		for(int bo=0;bo<quantidadeperg;bo++) {
			if(opcoes[bo].equalsIgnoreCase("Texto curto")|| opcoes[bo].equalsIgnoreCase("Textocurto")) {
			JOptionPane.showMessageDialog(null,"As perguntas de texto curto foram:" + "\n" +
					enuciadoTextoCurto[bo] +"\n" + "As respostas foram: " +"\n" + respostatipoTextoCurto[bo]);}
			
			if(opcoes[bo].equalsIgnoreCase("Texto longo")|| opcoes[bo].equalsIgnoreCase("textolongo")) {
				JOptionPane.showMessageDialog(null,"As perguntas de texto longo foram:" + "\n" +
						enuciadoTextoLongo[bo] +"\n" + "As respostas foram: " +"\n" + respostaTipoTextoLongo[bo]);}
			
			if(opcoes[bo].equalsIgnoreCase("opcional")|| opcoes[bo].equalsIgnoreCase("opcao")) {
				JOptionPane.showMessageDialog(null,"As perguntas opcionas foram:" + "\n" +
						enuciadoOpcoes[bo] +"\n" + "As respostas foram: " +"\n" + respostatipoOpcinal[bo]);
			}
		}
				
}
	
	

				
}            
		                
		      
	
	
