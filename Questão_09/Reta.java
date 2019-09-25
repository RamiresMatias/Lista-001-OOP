package Questão_09;

public class Reta {
	
	double a ;
	double b ;
	double x = 1;
	double y;
			
	public Reta(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public Reta() {
		// TODO Auto-generated constructor stub
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double getReta() {
		return this.y;
	}
	
	public void inicializarReta() {
		this.y  = (this.a * this.x) + this.b;
	}
	
	public void pertenceReta(double ponto) {
		if(this.y == ponto) {
			System.out.println("Pertence a reta");
		}else {
			System.out.println("Não pertence a reta");
		}
	}
	
	public boolean pontoReta(double ponto) {
		return this.a == ponto || this.b == ponto;
	}
	
	public String toString() {
		String str = "";
		
		str = "Abcissas: "+this.x + " Ordenadas: "+this.y;
		
		return str;
	}
	
	public String interseçao(double pontoA,double pontoB) {
		
		String inter = null;
		
		double segundaReta = (pontoA * this.x) + pontoB;
		
		if(segundaReta == this.y) {
				System.out.println("--- PONTOS DE INTERSEÇÃO ---");
				inter = "("+this.x+ " , "+this.y+")";
		}
		
		return inter;
	}
	
}
