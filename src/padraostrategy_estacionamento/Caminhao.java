package padraostrategy_estacionamento;

import util.Calculos;

public class Caminhao extends Veiculo  {

	public Caminhao(CalculoEstaciomentoTempo calculoTempo, int quantidade) {
		super(calculoTempo, quantidade);
	
	}

	@Override
	double calcularContaVeiculo() {
		
		double calcularTempo = this.getCalculoTempo().calcularTempo(this.getQuantidade());
		
		double porcentagem = 9.0;
		
		return Calculos.adicionarPorce(calcularTempo, porcentagem);
	}

	
	

	
	

}
