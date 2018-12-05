package formulario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	public String salvarFormulario(Formulario f) {

		try {
			FileWriter fw = new FileWriter(nomeFormulario,true);
			PrintWriter pw = new PrintWriter(nomeFormulario);
			pw.println("Nome: "+this.nomeFormulario);
			pw.println("Data de Início: "+this.dataInicio);
			pw.println("Data Final: "+this.dataFinal);
			pw.println("Descrição: "+this.descricaoFormulario);
			pw.println("Pergunta: "+this.pergunta);
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
