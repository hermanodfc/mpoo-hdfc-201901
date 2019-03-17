package hdfc.mpoo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

	private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("hh:mm:ss");
	
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void imprimir() {
		System.out.println(LocalTime.now().format(FORMATTER) + " - Olá " + this.getNome() + 
				". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");

	}
	
}
