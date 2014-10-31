package br.com.rm.model;

/**
 * Classe utilizada para representar os usuários do sistema
 **/
public class Usuario {
	private Long id;
	private String login;
	private String senha;
	private int tipo; //Usuário pode ser do tipo mestre(0) ou do tipo jogador (1)
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
