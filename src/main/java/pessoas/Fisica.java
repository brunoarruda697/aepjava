package pessoas;

import java.util.UUID;

public class Fisica extends Pessoa {
	protected String cpf;
	protected String rg;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public Fisica(String nome, String cpf, String rg) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	/* professor, travei nessa parte... n�o entendi porque tem um id tipo int como parametro sendo que no diagrama de classe
	 * a classe Fisica n�o tem o atributo id, ent�o fiquei confuso pq, no metodo abaixo � passado como parametro o UUID da
	 * classe que pode ser referenciado pelo UUID da classe Pessoa, mas tbm tem o parametro int id que n�o existe na classe Fisica
	*/
	
	public void FisicaVoid(int id, int UUID, String nome, String rg, String cpf) {
		super(id, nome);
		this.cpf = cpf;
		this.rg = rg;
	}
}
