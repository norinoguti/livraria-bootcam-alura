package br.com.alura.livraria.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.alura.livraria.modelo.Autores;

public class Teste {

	public static void main(String[] args) {
		Autores aut = new Autores();
		
		aut.setNome("Machado de Assis");
		aut.setEmail("macdeassis@gmail.com");
		aut.setDataNascimento(LocalDate.of(1839,6,21));
		aut.setMiniCurriculo("Machado de Assis (1839-1908) foi um escritor brasileiro, "
				+ "um dos nomes mais importantes da literatura brasileira do século XIX."
				+ "\n Destacou-se principalmente no romance e no conto, embora tenha escrito "
				+ "crônicas, poesias, crítica literária e peças de teatro.");
		
		System.out.println(aut.getNome());
		System.out.println(aut.getEmail());
		System.out.println(aut.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(aut.getMiniCurriculo());
		System.out.println("==============================================");
		
		Autores aut2 = new Autores("Lima Barreto",
				"limabarreto@gmail.com",
				LocalDate.of(1881, 5, 13),
				"\n Lima Barreto (1881-1922) foi um escritor brasileiro, “o romancista da primeira "
				+ "república.” \n Foi um importante escritor do Pré-Modernismo - período histórico "
				+ "que precedeu a Semana de Arte Moderna.");
		
		System.out.println(aut2);
	}
}
