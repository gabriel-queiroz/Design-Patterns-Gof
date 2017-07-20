package padraostrategy_estacionamento;

import util.Calculos;

public class main {

	
	public static void main(String[] args) {
		
		// fazendo calculo de " 4 " diaria de um Veiculo "Passeio"
 		
		CalculoEstaciomentoTempo calculoDiaria = new CalculoDiaria();
		
		Veiculo golf = new Automovel(calculoDiaria, 4);
		
		ContaEstacionamento contan1 = new ContaEstacionamento(golf);
		
		
		
		System.out.println("========== Conta ==================");
		System.out.println("Veiculo do tipo : " +  golf.getClass().getSimpleName());
		System.out.println("Tipo de Calculo " + golf.getCalculoTempo().getClass().getSimpleName());
		System.out.println("Quantidade : " +  golf.getQuantidade());
		System.out.println("Total da Conta  R$ :  " + contan1.calcularEstacionar());
		
	// fazendo calculo de " 4 " diaria de um Veiculo "Passeio"
 		
		CalculoEstaciomentoTempo calculohoras = new CalculoHora();
		
		Veiculo golf2 = new Automovel(calculohoras, 4);
		
		ContaEstacionamento contan2 = new ContaEstacionamento(golf2);
		
		
		
		System.out.println("========== Conta ==================");
		System.out.println("Veiculo do tipo : " +  golf2.getClass().getSimpleName());
		System.out.println("Tipo de Calculo " + golf2.getCalculoTempo().getClass().getSimpleName());
		System.out.println("Quantidade : " +  golf2.getQuantidade());
		System.out.println("Total da Conta  R$ :  " + contan2.calcularEstacionar());
	
	// fazendo  calculo de  4 "Meses" de um Veiculo "Onibus"

		CalculoEstaciomentoTempo calculoMensal = new CalculoMes();
		
		Veiculo onibusGrande = new Onibus(calculoMensal, 4);
		
		ContaEstacionamento contan3 = new ContaEstacionamento(onibusGrande);
		
		
		System.out.println("========== Conta ==================");
		System.out.println("Veiculo do tipo : " +  onibusGrande.getClass().getSimpleName());
		System.out.println("Tipo de Calculo " + onibusGrande.getCalculoTempo().getClass().getSimpleName());
		System.out.println("Quantidade : " +  onibusGrande.getQuantidade());
		System.out.println("Total da Conta  R$ :  " + contan3.calcularEstacionar());
	
	
	}
	
}
