package entities;

public class Aluno {
	
	private int id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	
	
	
	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public Aluno(int id, String nome, String email, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	
}
