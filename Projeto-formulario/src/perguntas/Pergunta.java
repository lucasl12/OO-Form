package perguntas;

public abstract class Pergunta {

	protected String enuciadoPergunta;
	protected String resposta;
	
	
	
	public String getEnuciadoPergunta() {
		return enuciadoPergunta;
	}
	public void setEnuciadoPergunta(String enuciadoPergunta) {
		this.enuciadoPergunta = enuciadoPergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public abstract void setResposta(String resposta);
	
	
	public  void novaPergunta(String enuciadoPergunta,String resposta) {
		this.enuciadoPergunta = enuciadoPergunta;
		this.resposta = resposta;
	}
	
	

}
