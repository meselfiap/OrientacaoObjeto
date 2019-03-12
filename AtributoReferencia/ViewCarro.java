import javax.swing.JOptionPane;

public class ViewCarro {
	// String modelo, Integer ano, String cor, String nome_marca, String pais_marca
	public static void main(String[] args) {
		Carro carro;
		carro = new Carro("modelo", 1999, "amarelo", "brasilia", "brasil");
		System.out.println(carro.getMarca());
		
		// Usando caixas de dialogo
		// carro.setModelo(JOptionPane.showInputDialog("Insira o modelo do carro"));
		
		System.out.println(carro);
		
	}

}
