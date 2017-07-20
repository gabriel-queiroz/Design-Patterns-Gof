package padraostrategy_estacionamento;

public abstract class Veiculo {

	private CalculoEstaciomentoTempo calculoTempo;
	private int quantidade;
	
	
	public Veiculo(CalculoEstaciomentoTempo calculoTempo, int quantidade) {
		super();
		this.calculoTempo = calculoTempo;
		this.quantidade = quantidade;
	}

	abstract double calcularContaVeiculo();

	public CalculoEstaciomentoTempo getCalculoTempo() {
		return calculoTempo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setCalculoTempo(CalculoEstaciomentoTempo calculoTempo) {
		this.calculoTempo = calculoTempo;
	}
	
	
	
	
	
}
