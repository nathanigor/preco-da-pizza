import java.util.HashMap;

public class Pizza {

	static int staticIngredientes = 0;
	int quantIngrediente = 0;
	HashMap<String, Integer> ingredientes = new HashMap<>();

	public void adicionaIngrediente(String novoIngrediente) {
		contabilizaIngrediente();
		quantIngrediente++;
		ingredientes.put(novoIngrediente, 1);
		
	}

	static void contabilizaIngrediente() {
		staticIngredientes++;
	}

	public double getPreco() {
		int preco = 0;
		if (quantIngrediente >= 1 && quantIngrediente <= 2) {
			preco = 15;
		} else if (quantIngrediente >= 3 && quantIngrediente <= 5) {
			preco = 20;

		} else if (quantIngrediente > 5) {
			preco = 23;
		}
		return preco;
	}

}
