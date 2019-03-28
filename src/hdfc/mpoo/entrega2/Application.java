package hdfc.mpoo.entrega2;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Hermano Costa");
		aluno.setCpf("123456");
		aluno.setAnoEntrada(2017);
		aluno.setPerioroEntrada(2);
		Endereco enderecoAluno = new Endereco();
		enderecoAluno.setRua("Rua A");
		enderecoAluno.setNumero(1);
		enderecoAluno.setComplemento("Apt 1");
		enderecoAluno.setCidade("Recife");
		aluno.setEndereco(enderecoAluno);
		
		Professor professor = new Professor();
		professor.setNome("Gabriel Alves");
		professor.setCpf("654321");
		Date dataAdmissao = new Date(2012 - 1900, 6 - 1, 1);
		professor.setAdmissao(dataAdmissao);
		Endereco enderecoProfessor = new Endereco();
		enderecoProfessor.setRua("Rua P");
		enderecoProfessor.setNumero(2);
		enderecoProfessor.setComplemento("Sala A");
		enderecoProfessor.setCidade("Jaboatão");
		professor.setEndereco(enderecoProfessor);
		
		System.out.println("ALUNO");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Ano de Entrada:" + aluno.getAnoEntrada());
		System.out.println("Período de Entrada: " + aluno.getPerioroEntrada());
		enderecoAluno = aluno.getEndereco();
		System.out.println("Endereço: " + enderecoAluno.getRua() + ", " + enderecoAluno.getNumero() +
				" - " + enderecoAluno.getComplemento() + " - " + enderecoAluno.getCidade());
		
		System.out.println();
		
		System.out.println("PROFESSOR");
		System.out.println("Nome: " + professor.getNome());
		System.out.println("CPF: " + professor.getCpf());
		dataAdmissao = professor.getAdmissao();
		System.out.println("Admissão: " + dataAdmissao.toLocaleString());
		enderecoProfessor = professor.getEndereco();
		System.out.println("Endereço: " + enderecoProfessor.getRua() + ", " + enderecoProfessor.getNumero() +
				" - " + enderecoProfessor.getComplemento() + " - " + enderecoProfessor.getCidade());
		
		
		/*Considerando a impossibilidade de que objeto seja, ao mesmo tempo, da classe Aluno e da classe Professor. É necessário
		 * criar um objeto da classe Aluno, que apreesentará o comportamento de aluno de dado indivíduo (AlunoJose123), bem como 
		 * um outro objeto da classe Professor, que representará o comportamento de professor deste mesmo indivíduo (professorJose123).
		 */

		Endereco enderecoJose123 = new Endereco();
		enderecoJose123.setRua("Rua 99");
		enderecoJose123.setNumero(11);
		enderecoJose123.setComplemento("Casa");
		enderecoJose123.setCidade("Recife");
		
		Aluno alunoJose123 = new Aluno();
		alunoJose123.setNome("Jose 123");
		alunoJose123.setCpf("7894567");
		alunoJose123.setAnoEntrada(2018);
		alunoJose123.setPerioroEntrada(1);
		alunoJose123.setEndereco(enderecoJose123);
		
		Professor professorJose123 = new Professor();
		professorJose123.setNome("Jose 123");
		professorJose123.setCpf("7894567");
		Date dataAdmissaoJose123 = new Date(2012 - 1900, 6 - 1, 1);
		professorJose123.setAdmissao(dataAdmissaoJose123);
		professor.setEndereco(enderecoJose123);
	}

}
