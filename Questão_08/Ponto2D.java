package Questão_08;

public class Ponto2D {
	double y;
	double x;
	double z;
	
	public Ponto2D(double y , double x) {
		this.y = y;
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void movimentaçaoY(double y) {
		this.setY(y);	
		System.out.println(this.getY());
	}
	public void movimentaçaoX(double x) {
		this.setX(x);
		System.out.println(this.getX());
	}
	public boolean equals() {
		return this.x == this.y;
	}
	
	public String toString () {
		return "Abscissas : "+ this.x + " Ordenadas: "+this.y; 
	}
	public void distanciaDoPonto(String ponto) {
		double soma = 0;
		
		if(ponto == "x") {
			soma = this.x - this.y;
			System.out.println("Distância de X para Y: "+soma);
		}else if(ponto == "y") {
			soma = this.y - this.x;
			System.out.println("Distância de Y para Y: "+soma);
		}	
	}
	
	
	public void novoPonto(String novo) {
		
		if(novo == "x") {
			this.z = this.getX();	
			
		}else if(novo == "y") {
			this.z = this.getY();
		}
		
		System.out.println("Ponto z valor: "+this.z);
	}
	
}
