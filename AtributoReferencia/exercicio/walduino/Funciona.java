import javax.swing.JOptionPane;
public class Funciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente clienteTeste = new Cliente();
		
		clienteTeste.setNome(JOptionPane.showInputDialog("Insira o nome do cliente:"));
		clienteTeste.setCpf(JOptionPane.showInputDialog("Insira o CPF do cliente:"));
		clienteTeste.setEndereco(
				JOptionPane.showInputDialog("Insira o endereco:"),
				JOptionPane.showInputDialog("Insira o CEP:")
		);
		
		
		JOptionPane.showMessageDialog(null, "O nome do cliente: " + clienteTeste.getNome());
		JOptionPane.showMessageDialog(null, "O CPF do cliente: " + clienteTeste.getCpf());
		
		JOptionPane.showMessageDialog(null, "O endereco do cliente é: " + clienteTeste.getEndereco());

	}

}
