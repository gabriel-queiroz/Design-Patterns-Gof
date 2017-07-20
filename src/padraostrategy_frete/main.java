package padraostrategy_frete;

import java.util.Scanner;
import padraostrategy_frete.*;
public class main {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite a distancia");
		
		int distancia = input.nextInt();
		
		System.out.println("frete  : 1(sedex) 2(normal)");
		
		int opcaofrete = input.nextInt();
		
		
		
		TipoFrete tipoFrete = TipoFrete.values()[opcaofrete-1];
		
		
		Frete frete = tipoFrete.obterFrete(); 
				
				
		System.out.println(frete.calcularFrete(distancia));
		
	}
	
}
