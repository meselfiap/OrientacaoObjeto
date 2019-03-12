public class Cliente {
	
	//atributos da classe
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco, String cep) {
		this.endereco = new Endereco(endereco, cep);
	}
	
	//construtor vazio
	public Cliente() {
		
	}
	//construtor que pede nome e cpf
	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	//getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
}
