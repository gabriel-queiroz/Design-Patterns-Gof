package padraostrategy_frete;


public class Normal implements Frete {
 
	public double calcularFrete(int distancia){
	
			return distancia * 1.25 + 10;
		
	} 
	
}
