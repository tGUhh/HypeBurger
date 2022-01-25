package entities;

import java.util.Date;

public class Pessoa {
	
	private Integer id;
	private Date dataCadastro;
	private String endereco;
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String telefone;
	private String celular;
	private String email;
	private String pontoReferencia;
	
	public Pessoa(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia) {
		this.id = id;
		this.dataCadastro = dataCadastro;
		this.endereco = endereco;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.pontoReferencia = pontoReferencia;
	}
	

}
