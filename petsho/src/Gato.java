

public class Gato extends Animal {
	boolean arranhaMoveis;
	public Gato (String nome, int idade,boolean faminto,boolean arranhaMoveis) {
		super(nome, idade, faminto);
		this.arranhaMoveis = arranhaMoveis;
	}
	
	
	
	public boolean isArranhaMoveis() {
		return arranhaMoveis;
	}



	public void setArranhaMoveis(boolean arranhaMoveis) {
		this.arranhaMoveis = arranhaMoveis;
	}



	public void emitirSom() {
		System.out.printf("O gato chamado %s emite um som: MIAU! ",nome);
	}
	public void exibirDados() {
		System.out.println("\nINFORMAÇÕES DO ANIMAL:");
		System.out.printf("Nome: %s \n",getNome());
		System.out.printf("Idade: %d \n",getIdade());
		if(arranhaMoveis==true) {
			System.out.println("Esse gato arranha moveis");
		}else {
			System.out.println("Este gato não arranha moveis");
		}
		if (dono != null) {
			System.out.println("o dono do Gato é: " + dono.getNome() + " e seu telefone é: " + dono.getTelefone());
			}
		else{
			System.out.println("este gato não tem dono");
		}
		if(faminto == true) {
			System.out.printf("O %s está com fome \n",getNome());
		}
		else {System.out.printf("O %s está de barriga cheia \n",getNome());
		}
	}

}