package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {

	private double total;
	
	
    public void ordenaLista(Evento evento) {
    	List<Conta> contas 	= evento.getLista("destino");
    	Collections.sort(contas);
    }

	public void calculaImpostos(Evento evento) {
		total = 0;
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		for (int i = 0; i < tamanho; i++) {
			Tributavel t = evento.getTributavel("listaTributaveis", i);
			total += t.getValorImposto();
		
		}
	}
	
	public double getTotal() {
		return total;
	}
 
}
