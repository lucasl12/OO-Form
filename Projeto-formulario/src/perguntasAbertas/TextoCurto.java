package perguntasAbertas;

public class TextoCurto extends PerguntaAberta {

	@Override
	public void setResposta(String resposta) {
		if(resposta.length()<50) {
			this.resposta = resposta;
		}
		
	
		
	}
	
	
	

}
