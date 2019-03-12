
public class Endereco {
	private String endereco;
	private String cep;
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	public Endereco(String endereco, String cep) {
		this.endereco = endereco;
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", this.endereco, this.cep);
	}

}
