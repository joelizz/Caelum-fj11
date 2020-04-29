package br.com.caelum.contas.main;

import br.com.caelum.contas.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		Conta	cc	=	new	ContaCorrente();
		
		try	{
						cc.deposita(-100);
		}	catch	(SaldoInsuficienteException	e)	{
				System.out.println(e.getMessage());
		}

	}

}
	
	
