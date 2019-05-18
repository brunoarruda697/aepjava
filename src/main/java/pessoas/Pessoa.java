package pessoas;

import java.util.UUID;

public abstract class Pessoa {
	protected String nome;
	protected UUID id;
	
	public String getNome() {
		return this.nome;
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
}
