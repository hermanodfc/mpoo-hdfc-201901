package hdfc.mpoo;

public class HelloWorld {

	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	private void imprimir() {
		System.out.println("Olá" + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");

	}
	
}
