
public class CarrinhoDeCompras {
	static double valorTotal = 0;
	
	public static void Carrinho(Pizza p) {
		
		if(p.quantIngrediente !=0) {
			valorTotal += p.getPreco();
		}
		
	}

}
