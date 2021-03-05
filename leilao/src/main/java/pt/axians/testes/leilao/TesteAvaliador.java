package pt.axians.testes.leilao;

public class TesteAvaliador {

	public static void main(String[] args) {
		Leilao leilao = new Leilao("XBox One");
		
		leilao.licitar(new Licitacao(new Utilizador("Eliseu"), 300.0));
		leilao.licitar(new Licitacao(new Utilizador("Moacir"), 400.0));
		leilao.licitar(new Licitacao(new Utilizador("Dirceu"), 500.0));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		double maior = avaliador.getMaiorDeTodos();
		double menor = avaliador.getMenorDeTodos();
		System.out.println("Menor valor deve ser 300: " + (menor==300));
		System.out.println("Maior valor deve ser 500: " + (maior==500));
	}

}
