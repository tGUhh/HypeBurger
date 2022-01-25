package entities;

public class ClienteJuridico extends Pessoa {
	
	protected Integer id;	
	protected String razaoSocial;
	protected String nomeFantasia;
	protected String cnpj;
	protected String inscricaoEstadual;
	protected String inscricaoMunicipal;
	
	public ClienteJuridico() {
	}

	public ClienteJuridico(Integer id, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual,
			String inscricaoMunicipal) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public ClienteJuridico(Integer id, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public ClienteJuridico(Integer id, String razaoSocial, String cnpj, String inscricaoMunicipal) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public ClienteJuridico(Integer id, String razaoSocial, String cnpj) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public ClienteJuridico(Integer id, String cnpj) {
		this.id = id;
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
