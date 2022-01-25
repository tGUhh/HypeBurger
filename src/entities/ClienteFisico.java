package entities;

import java.util.Date;

public class ClienteFisico extends Pessoa {
	
	protected Integer id;	
	protected String nomeCompleto;
	protected Long cpf;
	protected int idade;	
	

	public ClienteFisico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
	}
	
	public ClienteFisico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String nomeCompleto, Long cpf, int idade) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.idade = idade;
	}

	public ClienteFisico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String nomeCompleto, Long cpf) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
	}	

	public ClienteFisico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2, Long cpf) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
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
