package mercado;

public class ObjetoPredutos {

	public static void main(String[] args) {
		Produtos prod = new Produtos("Queijo Prato", 50.00);
		
		System.out.println(prod.getNome() + " " + prod.getNome());
		
		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		prod.setPreco(56);
		System.out.println(prod.getPreco());
		
		prod.setNome("Queijo Parmesão");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
		
		

	}

}
