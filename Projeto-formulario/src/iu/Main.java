package iu;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

import formulario.Formulario;

import opcoes.Tela;
import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;
import perguntasFechadas.Alternativa;
import perguntasFechadas.Lista;
import perguntasFechadas.Opcional;

public class Main {

	public static void main(String[] args) {
		
		
		
		  
        
	     
		 ArrayList<Pergunta>p = new ArrayList<Pergunta>(); // Um Lista de perguntas, pra dps passar por parametro.
		 Pergunta perg; // referencia gênerica para pergunta
		 
		  String items[]= {};
	
		  
		  int quantidadedeperguntasabertas=0;
		  int quantidadedeperguntasfechadasAlt=0;
		  int quantidadedeperguntasfechadasList=0;
		  int quantidadedeperguntasfechadasOp=0;
		  int quantidadeitens=0;
		 
		  
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

		//array que vai armazenart todos os enuciados
		  String enunciados[] = new String[quantidadeperg];
		    for(int i=0;i<quantidadeperg;i++) {
			String tipo =JOptionPane.showInputDialog("Qual tipo da " + (1+i)+"° pergunta deseja criar?");
				if(tipo.equalsIgnoreCase("texto curto") || tipo.equalsIgnoreCase("textocurto")) {
					String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
					perg = new TextoCurto();// Usando o polimorfismo
					perg.setEnuciadoPergunta(enuciado);
		                        enunciados[i]= perg.getEnuciadoPergunta();
		                        quantidadedeperguntasabertas= quantidadedeperguntasabertas+1;
		                        
		                }
		                if(tipo.equalsIgnoreCase("texto longo") || tipo.equalsIgnoreCase("textolongo")){
		                    String enuciado = JOptionPane.showInputDialog("Qual o enuciado?" + (1+i));
		                    perg = new TextoLongo();
		                    perg.setEnuciadoPergunta(enuciado);
		                    enunciados[i] = perg.getEnuciadoPergunta();
		                    quantidadedeperguntasabertas= quantidadedeperguntasabertas+1;
		                }
		                if(tipo.equalsIgnoreCase("Alternativa")||(tipo.equalsIgnoreCase("Alternativas"))) {
		                    Alternativa alt = new Alternativa();
		                    String enuciado = JOptionPane.showInputDialog("Qual o enuciado?" + (1+i));
		                    alt.setEnuciadoPergunta(enuciado);
		                    enunciados[i]=alt.getEnuciadoPergunta();
		                    quantidadeitens = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens terá as alternativas? "));
		                     items = new String[quantidadeitens];
		                    for (int m=0;m<quantidadeitens;m++){
		                        String item = JOptionPane.showInputDialog("Qual o item " + (1+m));
		                        items[i]=item;
		                        
		                    } 
		                    quantidadedeperguntasfechadasAlt =quantidadedeperguntasfechadasAlt+1;
		                    
		                }
		                    
		                 if(tipo.equalsIgnoreCase("Lista")){
		                     Lista list  = new Lista();
		                     String enuciado = JOptionPane.showInputDialog("Qual o enuciado?" + (1+i));
		                     list.setEnuciadoPergunta(enuciado);
		                     enunciados[i]=list.getEnuciadoPergunta();
		                     quantidadeitens = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens terá a Lista? "));
		                       items= new String[quantidadeitens];
		                       for (int m=0;m<quantidadeitens;m++){
		                        String item = JOptionPane.showInputDialog("Qual o item " + (1+m));
		                        items[i]=item;
		                    } 
		                       perg=list;
		                       quantidadedeperguntasfechadasList= quantidadedeperguntasfechadasList+1;
		                 }
		                 
		                 if(tipo.equalsIgnoreCase("")){
		                 
		                 }
		                 
		                 if(tipo.equalsIgnoreCase("opcional")){
		                     String enuciado = JOptionPane.showInputDialog("Qual o enuciado?" + (1+i));
		                     Opcional op = new Opcional();
		                     op.setEnuciadoPergunta(enuciado);
		                     enunciados[i]= op.getEnuciadoPergunta();
		                     perg = op;
		                    
		                     quantidadedeperguntasfechadasOp=quantidadedeperguntasfechadasOp+1;
		                     
		                    
		                 
		                 }
		                    
		                   
		                 
		                    
		            
		                 
		                
		                }
		    
		    
		 
		    for(int ab=0;ab<quantidadedeperguntasabertas;ab++){
		        String resposta = JOptionPane.showInputDialog(enunciados[ab]);
		        //aqui adiconar a pergunta na lista
		        
		    }
		    
		    
		    for(int op=0;op<quantidadedeperguntasfechadasOp;op++ ) {
		    	int resposta= JOptionPane.showConfirmDialog(null,enunciados[op]);
		    	if(resposta==0) {
		    		System.out.println("sim");
		    	}
		    	if(resposta==1) {
		    		System.out.println("não");
		    	}
		    	
		    	 
		    }
		    
		   
		    
		    

			Formulario f = new Formulario(nomeFormulario,Descricao,DataInicio,DataFinal,p);
			JOptionPane.showMessageDialog(null, 
					"--------------Formulario criado!--------------" + "\n" +
							"Nome do formulario: " + f.getNomeFormulario() +"\n" +
							"Descrição do formulario: " + f.getDescricaoFormulario() + "\n" +
							"Data de inicio: " + f.getDataInicio() + "\n " +
							"Data de Termino: " + f.getDataFinal() + "\n " );

		    
			  
		//	f.salvarFormulario(f);
		    
		    
		    
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
		
		
	
	
		
		
	
