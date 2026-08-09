

public class Cachorro extends Animal implements AtendivelNoEstetica {

	String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	
	
	
	
	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	




	@Override
	public void exibirDados() {
		System.out.println("\nINFORMAÇÕES DO CACHORRO:");
		System.out.printf("Nome: %s \n", getNome());
		System.out.printf("Idade: %d \n", getIdade());
		System.out.printf("Raça: %s \n", getRaca());
		if (dono != null) {
			System.out.println("o dono do cachorro é: " + dono.getNome() + " e seu telefone é: " + dono.getTelefone());
		} else {
			System.out.println("este cachorro não tem dono");
		}

		
		
		
	}
	public void emitirSom() {
		System.out.printf("O cachorro chamado %s emite um som: AU AU! ",nome);
	}
	public void darBanho(){
		System.out.printf("dando banho no %s",getNome());
	}
	public void cortarUnhas() {
		System.out.printf("cortando unhas do %s",getNome());
	}
}