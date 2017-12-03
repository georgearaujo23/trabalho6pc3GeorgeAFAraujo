package trabalho6pc3GeorgeAFAraujo.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import trabalho6pc3GeorgeAFAraujo.model.Aluno;
import trabalho6pc3GeorgeAFAraujo.persistence.AlunoDao;
import trabalho6pc3GeorgeAFAraujo.persistence.AlunoDaoImp;

@ManagedBean
public class AlunoController {

	private Integer matricula;
	private	String nome;
	private	String ra;
	private	Aluno aluno;
	private String mensagem;
	
	public void	addAluno(){
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDao ad = new AlunoDaoImp();
		setMensagem(ad.save(aluno));
		aluno = new Aluno();
	}
	
	public void editAluno(){
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setRa(ra);
		AlunoDao ad = new AlunoDaoImp();
		setMensagem(ad.update(aluno));
	}
	
	public void deleteAluno(){
		AlunoDao ad = new AlunoDaoImp();
		setMensagem(ad.delete(matricula));
	}
	
	public List<Aluno> getAlunos(){
		AlunoDao ad = new AlunoDaoImp();
		return ad.list();
	}
	
	public Aluno findAluno(){ 
		AlunoDao ad = new AlunoDaoImp();
		return ad.findByMatricula(matricula);
	}

	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getRa() {
		return ra;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public String getMensagem() {
		return mensagem;
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

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
