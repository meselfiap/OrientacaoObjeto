
public class Marca {
	private String nome;
	private String pais;
	
	public Marca() {
		
	}
	public Marca(String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	// Override da aula (André n fez)
	@Override
	public String toString() {
		return String.format("%s %s", this.nome, this.pais);
	}
}
