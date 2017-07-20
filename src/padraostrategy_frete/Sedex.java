package padraostrategy_frete;

public class Sedex implements Frete {

	public double calcularFrete(int distancia){


		return distancia * 1.45 + 12;
	} 
}
