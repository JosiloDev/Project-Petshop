

public class Cliente {
	private String nome = "";
	private String telefone = "";
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome + "\nTelefone: " + telefone);
	}
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("EERROO");
			
		}else {
			this.nome = nome;
		}
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
