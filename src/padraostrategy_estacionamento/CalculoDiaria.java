package padraostrategy_estacionamento;

public class CalculoDiaria implements CalculoEstaciomentoTempo {

	@Override
	public double calcularTempo(int quantidade) {

		final  double valorDiaria = 23;


		return quantidade * valorDiaria;
	}

}
