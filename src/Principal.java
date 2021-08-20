
public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Calabreza");
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Frango");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Oregano");
		p2.adicionaIngrediente("Atum");

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Carne de Sol");
		p3.adicionaIngrediente("Banana");
		p3.adicionaIngrediente("Queijo Coalho");
		p3.adicionaIngrediente("Presunto");
		p3.adicionaIngrediente("Atum");
		p3.adicionaIngrediente("2 Queijos");

		Pizza p4 = new Pizza();

		CarrinhoDeCompras.Carrinho(p1);
		CarrinhoDeCompras.Carrinho(p2);
		CarrinhoDeCompras.Carrinho(p3);
		CarrinhoDeCompras.Carrinho(p4);

		System.out.printf("Ingredientes: %s \n", p1.ingredientes.keySet());
		System.out.printf("Quantidade: %s \n", p1.ingredientes.values());

		System.out.printf("Ingredientes: %s \n", p2.ingredientes.keySet());
		System.out.printf("Quantidade: %s \n", p2.ingredientes.values());

		System.out.printf("Ingredientes: %s \n", p3.ingredientes.keySet());
		System.out.printf("Quantidade: %s \n", p3.ingredientes.values());

		System.out.printf("Total: %.2f \n", CarrinhoDeCompras.valorTotal);
		System.out.printf("Total de ingredientes: %s \n", Pizza.staticIngredientes);
		

	}

}
