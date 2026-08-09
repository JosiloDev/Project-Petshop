

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {
	
	private final ArrayList<Cachorro> cachorros = new ArrayList<>();

	/** Adiciona um animal à lista. */
	public void adicionar(Cachorro a) {
		
		cachorros.add(a);
	}

	/**
	 * Busca um animal pelo nome (case-insensitive).
	 * 
	 * @return o Animal encontrado, ou null se não existir.
	 */
	public Cachorro buscarPorNome(String nome) {
		 for (Cachorro a : cachorros) {
		        if (nome.equals(a.getNome())) {
		            return a;
		            
		        }}
		 return null;
		
	}
	public Cachorro atualizarDados(String nome, String idade, String raca,String nomeTutor, String tele) {
		 for (Cachorro a : cachorros) {
		        if (nome.equals(a.getNome())) {
				if (!idade.isEmpty()) {
                try {
                    int novaIdade = Integer.parseInt(idade);
                    a.setIdade(novaIdade);
                } catch (NumberFormatException e) {
                }
            }
            
            if (!raca.isEmpty()) {
                a.setRaca(raca);
            }
            
            if (!nomeTutor.isEmpty() || !tele.isEmpty()) {
   
                if (a.getDono() == null) {
                    a.setDono(new Cliente("", ""));
                }
                

                if (!nomeTutor.isEmpty()) {
                    a.getDono().setNome(nomeTutor);
                }
                

                if (!tele.isEmpty()) {
                    a.getDono().setTelefone(tele);
                }
            }
		            return a;
					
		        }}
		 return null;
		
	}
	/**
	 * Remove o animal com o nome informado.
	 * 
	 * @return true se encontrou e removeu, false caso contrário.
	 */
	public boolean remover(String nome) {
	    for (int a = 0; a < cachorros.size(); a++) {
	        if (nome.equals(cachorros.get(a).getNome())) {
	            cachorros.remove(a);
	            return true;
	        } else {return false;}
	    }
	    return false;
	}

	/** Retorna a lista completa de animais cadastrados (cópia defensiva). */
	public ArrayList<Cachorro> listarTodos() {
		return cachorros;
	}

	/** Quantidade de animais cadastrados no repositório. */
	public int quantidade() {
		return 0;
	}
	
	
}