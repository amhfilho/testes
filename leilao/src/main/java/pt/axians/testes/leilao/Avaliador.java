package pt.axians.testes.leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;

	public void avalia(Leilao leilao) {
		for(Licitacao licitacao: leilao.getLicitacoes()) {
			if(licitacao.getMontante() > maiorDeTodos) {
				maiorDeTodos = licitacao.getMontante();
			}
			else if(licitacao.getMontante() < menorDeTodos ) {
				menorDeTodos = licitacao.getMontante();
			}
		}
	}
	
	public double getMaiorDeTodos() {
		return maiorDeTodos;
	}
	
	public double getMenorDeTodos() {
		return menorDeTodos;
	}
}
