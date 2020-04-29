package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return "Conta Poupança";
	}
	
	@Override
	public void saca(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		} else {
			if (this.saldo < valor) {
				throw new SaldoInsuficienteException(valor);
			}
			this.saldo -= (valor	+ 0.10);
			
		}
	}

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
