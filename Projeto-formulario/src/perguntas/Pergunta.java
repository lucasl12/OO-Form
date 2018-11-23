package perguntas;

public abstract class  Pergunta {
	
	protected String enuciadoPergunta;
	protected String Resposta;
	
	
	public String getEnuciadoPergunta() {
		return enuciadoPergunta;
	}
	public  void setEnuciadoPergunta(String enuciadoPergunta) {
		this.enuciadoPergunta = enuciadoPergunta;
	}
	
	
	public String getResposta() {
		return Resposta;
	}
	public abstract  void setResposta(String resposta);
	
	 	
	public abstract void salvarPergunta(Pergunta p);
	
	public abstract Pergunta NovaPergunta(String enuciadoPergunta);
	
	


}
