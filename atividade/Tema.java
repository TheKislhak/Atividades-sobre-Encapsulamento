package atividade;

public class Tema {
	
	private long id;
	private String nome;
	private double valorAluguel;
	private String corCarro;
	
	public Tema(long id, String nome, double valorAlugual, String corCarro) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAlugual;
		this.corCarro = corCarro;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	
	public void exibirInfo() {
		System.out.println("Id: " + id + " | Nome: " + nome + " | Aluguel: " + valorAluguel + " | Carro: " + corCarro);
	}
}
