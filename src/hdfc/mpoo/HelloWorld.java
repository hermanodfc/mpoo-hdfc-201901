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
		System.out.println("Ol�" + this.getNome() + ". Voc� acabou de fazer seu primeiro Hello World em Java. Parab�ns.");

	}
	
}
