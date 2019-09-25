package Questão_02;

public class Conta {
	
	int numConta;
	double saldo;
	boolean status;
	double limite;
	
	
	public Conta(int numConta, double saldo, boolean status, double limite) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double sacar(double valor) {
		
		if(valor < this.limite) {
			if(this.saldo - valor > 0) {
				this.saldo = this.saldo - valor;
			}else {
				System.out.println("Impossível sacar valor abaixo de zero");
				return 0;
			}
		}else {
			System.out.println("Valor ultrapassa o limite");
		}
		
		return this.saldo;
	}
	public double depositar(double valor) {
		this.saldo = this.saldo + valor;
		
		return this.saldo;
	}
	public double emitirSaldo2() {
		return this.getSaldo();
	}
}
