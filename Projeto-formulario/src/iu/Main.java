package iu;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import perguntas.Pergunta;
import perguntasAbertas.TextoCurto;
import perguntasAbertas.TextoLongo;

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

		
		String opcoes[] = new String[quantidadeperg];
		String enuciadoTextoCurto[]= new String[quantidadeperg];
		String enuciadoTextoLongo[] = new String[quantidadeperg];
		String enuciadoAlternativa[] = new String[quantidadeperg];
		
		
		int quantidadepergTxtCurto=0;
		int quantidadedepegTxtLongo=0;
		
		
		
		String itensAlternativa[]= {};
		
		for(int i=0;i<quantidadeperg;i++) {
			String opcao =JOptionPane.showInputDialog("qual tipo de pergunta deseja criar?"+(1+i));
			if(opcao.equalsIgnoreCase("texto curto") || opcao.equalsIgnoreCase("textocurto")) {
				opcoes[i]=opcao;
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				enuciadoTextoCurto[i]=enuciado;
				quantidadepergTxtCurto=quantidadepergTxtCurto+1;
				
			}
			if(opcao.equalsIgnoreCase("texto longo") || opcao.equalsIgnoreCase("textolongo")) {
				opcoes[i]= opcao;
				String enuciado = JOptionPane.showInputDialog("Qual o enuciado?");
				enuciadoTextoLongo[i]=enuciado;
				quantidadedepegTxtLongo=quantidadedepegTxtLongo+1;
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
			
			
			
			
			
		}
		
			
		
		    
		Pergunta perg;
		
		String respostatipoTextoCurto[]= new String[quantidadepergTxtCurto];
		String respostaTipoTextoLongo[] = new String[quantidadedepegTxtLongo];
		String respostaTipoalternativa[]= {};
		String respostaTipoLista []= {};
		String respostatipoOpcinal[]= {};
		for(int j=0;j<quantidadeperg;j++) {
			if(opcoes[j].equalsIgnoreCase("Textocurto")|| opcoes[j].equalsIgnoreCase("texto curto")) {
				perg = new TextoCurto();
				perg.setEnuciadoPergunta(enuciadoTextoCurto[j]);
				respostatipoTextoCurto[j]= JOptionPane.showInputDialog(enuciadoTextoCurto[j]);
				perg.setResposta(respostatipoTextoCurto[j]);
				System.out.println(perg.getEnuciadoPergunta());
				System.out.println(perg.getResposta());
			}
			
			if(opcoes[j].equalsIgnoreCase("textolongo")|| opcoes[j].equalsIgnoreCase("texto longo")) {
				perg = new TextoLongo();
				perg.setEnuciadoPergunta(enuciadoTextoLongo[j]);
				respostaTipoTextoLongo[j]=JOptionPane.showInputDialog(enuciadoTextoLongo[j]);
				perg.setResposta(respostaTipoTextoLongo[j]);
				System.out.println(perg.getEnuciadoPergunta());
				System.out.println(perg.getResposta());
			}
			//if(opcoes[j].equalsIgnoreCase("textolongo")|| opcoes[j].equalsIgnoreCase("texto longo")) {
				
			//}
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
		
		
	
	
		
		
	
