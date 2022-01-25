package entities;

import java.util.Date;

public class usuarioSistema extends Pessoa {
	protected Integer id;
	protected String nomeCompleto;
	protected String login;
	protected String senha;
	
	public usuarioSistema(Integer id, Date dataCadastro, String endereco, String estado, String cidade, String bairro,
			String cep, String telefone, String celular, String email, String pontoReferencia, Integer id2,
			String nomeCompleto, String login, String senha) {
		super(id, dataCadastro, endereco, estado, cidade, bairro, cep, telefone, celular, email, pontoReferencia);
		id = id2;
		this.nomeCompleto = nomeCompleto;
		this.login = login;
		this.senha = senha;
	}
	
	
	
}
