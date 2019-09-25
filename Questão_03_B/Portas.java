package Questão_03_B;

public class Portas {
	
	boolean aberta;
	String cor ;

	public Portas(boolean aberta, String cor) {
		this.aberta = aberta;
		this.cor = cor;
	}

	public void abre(){
		this.aberta = true;
	}

	public void fechar(){
		this.aberta = false;
	}
	public void pinta(String cor){
		this.cor = cor;
	}
	public boolean estaAberta(){
		return this.aberta;
	}

	public boolean getPortaAberta() {
		return this.aberta = true;
	}
}
