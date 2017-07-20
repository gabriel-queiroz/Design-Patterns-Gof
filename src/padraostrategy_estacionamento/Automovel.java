package padraostrategy_estacionamento;

import util.Calculos;

public class Automovel extends Veiculo {

	public Automovel(CalculoEstaciomentoTempo calculoTempo, int quantidade) {
		super(calculoTempo, quantidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularContaVeiculo() {
	
		double calcularTempo = this.getCalculoTempo().calcularTempo(this.getQuantidade());
		
		final double porcentagem = 4.3;
		
		return Calculos.adicionarPorce(calcularTempo, porcentagem);
	}

	

}
