package perguntasFechadas;

public class Alternativa  extends PerguntasFechadas{

	@Override
	public void setResposta(String resposta) {
		// TODO Auto-generated method stub
		
	}
	
	
	public  void novaPergunta(String enuciadoPergunta,String resposta,String itens[], int quantidade) {
			this.enuciadoPergunta= enuciadoPergunta;
			//this.resposta = resposta;
			this.listaItems = itens;
			this.quantidadeitens = quantidade;
			this.resposta = resposta;
		
			
		}
	}
	


