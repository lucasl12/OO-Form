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
	
	
	
	

}
