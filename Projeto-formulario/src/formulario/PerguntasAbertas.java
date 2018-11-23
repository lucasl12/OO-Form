package formulario;

public abstract class PerguntasAbertas extends Pergunta{
	protected int tamanhoResp;

	public int getTamanhoResp() {
		return tamanhoResp;
	}

	public void setTamanhoResp(int tamanhoResp) {
		this.tamanhoResp = tamanhoResp;
	}
	
	public abstract void novaPergunta(int tamanhoResp);
		
	public abstract void salvarPergunta(Pergunta p);
}
