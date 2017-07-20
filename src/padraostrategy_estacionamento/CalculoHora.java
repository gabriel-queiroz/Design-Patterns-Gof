package padraostrategy_estacionamento;

public class CalculoHora implements CalculoEstaciomentoTempo {

	@Override
	public double calcularTempo(int quantidade) {

		final double valorHora = 4.5;

		return quantidade * valorHora;


	}


}
