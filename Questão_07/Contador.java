package Questão_07;

public class Contador {
	
	int cont;
	
	public int Zerar() {
		this.cont = 0;
		
		return 0;
	}
	public int Incrementar () {
		this.cont++;
		
		return this.cont;
	}
	public int ReturnValor () {
		
		this.cont--;
		
		return this.cont;
	}

}
