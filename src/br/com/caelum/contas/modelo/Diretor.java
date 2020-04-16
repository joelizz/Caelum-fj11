package br.com.caelum.contas.modelo;

import br.com.caelum.contas.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{
	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return (getSalario() * 0.10) + 2000;
	}

}
