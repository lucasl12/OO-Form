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
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public abstract Pergunta novaPergunta(String enuciadoPergunta);
	

}
