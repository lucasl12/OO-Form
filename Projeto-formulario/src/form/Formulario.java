package form;

import java.util.ArrayList;

import perguntas.Pergunta;
import sun.util.calendar.BaseCalendar.Date;

public class Formulario {
	private String nomeFormulario;
	private String descricaoFormulario;
	private Date dataInicio;
	private Date dataFinal;
	private ArrayList<Pergunta> pergunta = new ArrayList <Pergunta>();
	
	
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
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
