package trabalho6pc3GeorgeAFAraujo.persistence;

import java.sql.Connection;
import java.util.List;

import trabalho6pc3GeorgeAFAraujo.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		/*AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula");
		a.setRa("Taguatinga");
		System.out.println(ad.save(a));
		*/
		
		/*
		AlunoDao ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula Almeida");
		a.setRa("Taguatinga	Norte");
		System.out.println(ad.update(a));
		*/
		
		/*
		AlunoDao ad = new AlunoDaoImp();
		System.out.println(ad.delete(6));
		*/
		
		/*
		AlunoDao ad = new AlunoDaoImp();
		List<Aluno> alunos = ad.list();
		if(alunos!=null){
			for(Aluno al : alunos){
				System.out.println("Aluno: "+al.getNome());
			}
		}
		*/
		
		AlunoDao ad= new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(2);
		if(aluno!=null){
			System.out.println(aluno.getNome());
		}
		
		
	}

}
