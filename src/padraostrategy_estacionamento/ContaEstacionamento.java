package padraostrategy_estacionamento;


/*
 * tabela de preços
 * 
 * hora carro passeio r$ : 2,50
 * hora caminho r$ : 4,50
 * hora onibus r$ : 9,50
 * 
 */

public class ContaEstacionamento {
	
	
	
	
	public ContaEstacionamento(Veiculo veiculo) {
		
		this.veiculo = veiculo;
	}

	private Veiculo veiculo;
	
	public double calcularEstacionar(){
		
	return	veiculo.calcularContaVeiculo();
		
	}
}
