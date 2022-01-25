package entities;

public class ClienteFisico extends Pessoa {
	
	protected Integer id;	
	protected String nomeCompleto;
	protected Long cpf;
	protected int idade;
	
	public ClienteFisico() {
	}

	public ClienteFisico(Integer id, String nomeCompleto, Long cpf, int idade) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.idade = idade;
	}

	public ClienteFisico(Integer id, String nomeCompleto, Long cpf) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
	}

	public ClienteFisico(Integer id, Long cpf) {
		this.id = id;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}

