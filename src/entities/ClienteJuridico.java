package entities;

import java.util.Date;

public class ClienteJuridico extends Pessoa {
	
	protected Integer id;	
	protected String razaoSocial;
	protected String nomeFantasia;
	protected String cnpj;
	protected String inscricaoEstadual;
	protected String inscricaoMunicipal;	
	

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
	}		

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
	}		

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String nomeFantasia, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String razaoSocial, String cnpj, String inscricaoEstadual) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String razaoSocial, String cnpj) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}	

	public ClienteJuridico(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String cnpj) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.cnpj = cnpj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	
	
}
