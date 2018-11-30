package formulario;

import java.util.ArrayList;

import perguntas.Pergunta;
import sun.util.calendar.BaseCalendar.Date;

public class Formulario {
	
	private String nomeFormulario;
	private String descricaoFormulario;
	private String dataInicio;
	private String dataFinal;
	private ArrayList<Pergunta> pergunta = new ArrayList <Pergunta>();
	
	
	
	
	
	public Formulario(String nomeFormulario, String descricaoFormulario, String dataInicio, String dataFinal,
			ArrayList<Pergunta> pergunta) {
		super();
		this.nomeFormulario = nomeFormulario;
		this.descricaoFormulario = descricaoFormulario;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.pergunta = pergunta;
	}
	public String getNomeFormulario() {
		return nomeFormulario;
	}
	public void setNomeFormulario(String nomeFormulario) {
		this.nomeFormulario = nomeFormulario;
	}
	public String getDescricaoFormulario() {
		return descricaoFormulario;
	}
	public void setDescricaoFormulario(String descricaoFormulario) {
		this.descricaoFormulario = descricaoFormulario;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public ArrayList<Pergunta> getPergunta() {
		return pergunta;
	}
	public void setPergunta(ArrayList<Pergunta> pergunta) {
		this.pergunta = pergunta;
	}
	
	public boolean salvarFormulario(Formulario f) {
		return true;
	}
}
