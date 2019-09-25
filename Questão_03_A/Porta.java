package Questão_03_A;

public class Porta {
	
	boolean aberta;
	String cor ;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	public void Porta(String cor , double dimensaoX , double dimensaoY , double dimensaoZ){
		this.aberta = false;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	public void abre(){
		this.aberta = true;
	}
	public boolean getAbre() {
		return this.aberta;
	}
	public boolean getFechar() {
		return this.aberta;
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
}
