package br.com.caelum.contas.modelo;

import br.com.caelum.contas.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	
     @Override
	public double getBonificacao(){
		return (getSalario() * 0.10) + 1000;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;

		}
	}

}
