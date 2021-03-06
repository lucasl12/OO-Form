package formulario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public String salvarFormulario(String[] opcoes,int quantidadeoerg,String[] enuciadopergCurta,String[] respostaCurta,
			String[]enuciadolongo,String[]respostalongo,String[]enuciadopergopcional,String[]respostaopcional
			) {

		try {
			FileWriter fw = new FileWriter(nomeFormulario +".txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome: "+this.nomeFormulario);
			pw.println("Data de In�cio: "+this.dataInicio);
			pw.println("Data Final: "+this.dataFinal);
			pw.println("Descri��o: "+this.descricaoFormulario);
			pw.println("");
			for(int i=0;i<quantidadeoerg;i++) {
				if(opcoes[i].equalsIgnoreCase("Texto curto")|| opcoes[i].equalsIgnoreCase("Textocurto")) {
				pw.println("Pergunta Texto curto:"+enuciadopergCurta[i]);
				pw.println("Resposta:" +respostaCurta[i]+"\n");
				pw.println("");
				}
				
				if(opcoes[i].equalsIgnoreCase("Texto Longo")|| opcoes[i].equalsIgnoreCase("Textolongo")) {
				pw.println("Pergunta Texto Longo:"+enuciadolongo[i]);
				pw.println("Resposta:" +respostalongo[i]+"\n");
				pw.println("");
				}
				
				if(opcoes[i].equalsIgnoreCase("opcional")){
				pw.println("Pergunta Opcional:"+enuciadopergopcional[i]);
				pw.println("Resposta:" +respostaopcional[i]+"\n");
				pw.println("");
				}
			}
			
			
			
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
