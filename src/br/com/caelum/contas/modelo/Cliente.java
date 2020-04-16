package br.com.caelum.contas.modelo;


public class Cliente {
	
	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	private String cpf;

	public Cliente(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	public String getNome(String nome) {
		return this.nome;
	}
	
	public String getSobrenome(String sobrenome) {
		return this.sobrenome;
	}


	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		if(validaCPF(cpf) == true) {
			this.cpf = cpf;
		} else {
			this.cpf = " ";
		}

	}
	

	private boolean validaCPF(String cpf) {
		if (cpf.isEmpty()) {
			return false;
		}
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11)) {
			return false;
		} else {
			return true;
		}

	}
	public String cpf(String cpf) {
		return this.cpf;
	}

}
