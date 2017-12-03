package trabalho6pc3GeorgeAFAraujo.model;

import java.io.Serializable;

public class Aluno implements Serializable{
	
	private static  final long serialVersionUID= 1L;
	
	private Integer matricula;
	private String nome;
	private String ra;
	
	public Integer getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	public String getRa() {
		return ra;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	

}
