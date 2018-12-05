package perguntasFechadas;

import perguntas.Pergunta;

public abstract class PerguntasFechadas extends Pergunta {
	
	protected int quantidadeitens;
	protected String[]listaItems = new String[quantidadeitens];
	
	
	
	public int getQuantidadeitens() {
		return quantidadeitens;
	}
	public void setQuantidadeitens(int quantidadeitens) {
		this.quantidadeitens = quantidadeitens;
	}
	public String[] getListaItems() {
		return listaItems;
	}
	public void setListaItems(String[] listaItems) {
		this.listaItems = listaItems;
	}
	
	public  void novaPergunta(String enuciadoPergunta,String resposta,String itens[], int quantidade) {
		this.enuciadoPergunta= enuciadoPergunta;
		//this.resposta = resposta;
		this.listaItems = itens;
		this.quantidadeitens = quantidade;
		this.resposta = resposta;
	
		
	}
	
	
	

}
