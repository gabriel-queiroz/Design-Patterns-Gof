package padraostrategy_estacionamento;

public class CalculoMes  implements CalculoEstaciomentoTempo {

	@Override
	public double calcularTempo(int quantidade) {

		final double valorMes = 235.22;

		return quantidade * valorMes;
	}



}
