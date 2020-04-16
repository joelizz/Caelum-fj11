package br.com.caelum.contas.modelo;

public abstract class Conta {
	
	private int numero;
	protected double saldo;
	private String agencia;
	private Data dataDeAbertura;
	private double limite;
	private String titular;
	
	
	public Conta() {
		
	}
	
	
	public Conta(int numero, double saldo, String agencia, String titular ) {
		
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.titular = titular;
		
	}
	public Conta(int numero, String agencia) {
	
		this.numero = numero;
		this.agencia = agencia;
		this.titular = " ";
	}
	
	

	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public String getTitular() {
		return this.titular;
	}
	
	
	public Data getData() {
		return this.dataDeAbertura;
	}
	public void setDataDeAbertura(Data data) {
		this.dataDeAbertura = data;
	}
	
	

	public String getAgencia() {
		return agencia;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}

	

	public void deposita(double quantidade) {
		if(quantidade>0) {
		this.saldo = this.saldo + quantidade;
		} if(quantidade < 0) {
            this.saldo = this.saldo + 0;
		}
	}
     
	public void transfere ( double valor, Conta conta) {
      this.saca(valor);
      conta.deposita(valor);
	
	}
	
    public double rendimentoMensal(double valor){
		double rendimento = this.saldo * valor; 
		return rendimento;
		
	}
    
   public  String recuperarDadosParaImpressao() {
    	String dados = "Titular: " + this.titular;
    	dados += "\nNúmero: " + this.numero;
//    	dados	+=	"\nData	de	abertura:	"	+	this.dataDeAbertura.formatada();
    	return dados;
    }
   
	public	abstract String	getTipo();
    

}
