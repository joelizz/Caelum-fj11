package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {
	
	
	public String getTipo() {
		return "Conta Poupan�a";
	}
	
	@Override
	public void saca(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");
		} else {
			if (this.saldo < valor) {
				throw new SaldoInsuficienteException(valor);
			}
			this.saldo -= (valor	+ 0.10);
			
		}
	}

}
