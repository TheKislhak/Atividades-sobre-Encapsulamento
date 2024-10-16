package mercado;

public class Produtos {

	private String nome;
	private double preco;
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço inválido! Não pode ser negativo.");
		}
	}
	
	public void exibirinformacoes() {
		System.out.println("Produto: " + nome + ", Precço: " + preco);
	}
}
