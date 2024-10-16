package atividade;

public class Casa {

	public static void main(String[] args) {
		Tema tema = new Tema(3642864l, "Omori", 260, "Vermelho");
		ItemTema itemtema = new ItemTema(3857398l, "Bolo", "Um bolo de chocolate com recheiro de morango com a forma de um gato");
		Cliente cliente = new Cliente(1, "Sunny", "12 997348578", "409.125.574-43", "43.432.598.232-31");
		Endereco endereco = new Endereco(57349978l, "Rua do Mundo dos Sonhos", 790, "Casa", "Bairro Sweetheart", "São Paulo", "18900.450", "São Paulo");
		
		tema.exibirInfo();
		itemtema.exibirInfo();
		cliente.exibirInfo();
		endereco.exibirInfo();

	}

}
