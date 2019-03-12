
public class Carro{
	private String modelo;
	private Integer ano;
	private String cor;
	private Marca marca;
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Carro() {}
	
	
	// André não fez esta criacao de Marca dentro do carro
	public Carro(
		String modelo, Integer ano, String cor,	String nome_marca, String pais_marca
	){
		
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.marca = new Marca(nome_marca, pais_marca);
	}
	
	
	// Override da aula (André n fez)
	@Override
	public String toString() {
		return String.format("%s %d %s  %s", this.modelo, this.ano, this.cor, this.marca);
	}
	
}
