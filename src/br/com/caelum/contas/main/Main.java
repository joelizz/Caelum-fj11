package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class Main {
//	public static void main(String[] args) {
//		SistemaBancario.mostraTela(true);
//		
//		
//	}
//		
 public static void main(String[] args) {
		ContaCorrente	cc	=	new	ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		//	testando	polimorfismo:
		Tributavel	t	=	cc;
		System.out.println(t.getValorImposto());

}
}
