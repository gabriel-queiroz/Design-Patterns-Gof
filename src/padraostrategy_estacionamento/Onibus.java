package padraostrategy_estacionamento;

import util.Calculos;

public class Onibus extends Veiculo {

	public Onibus(CalculoEstaciomentoTempo calculoTempo, int quantidade) {
		super(calculoTempo, quantidade);
		
	}

	@Override
	double calcularContaVeiculo() {
		
		
		double calcularTempo = this.getCalculoTempo().calcularTempo(this.getQuantidade());
		
		final double  porcentagem = 12.2;
	
		return Calculos.adicionarPorce(calcularTempo, porcentagem);
		
	
	}

	
}
