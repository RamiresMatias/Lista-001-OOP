package Questão_10;

public class Circle {
	
	private double raioCirculo;
	private double x;
	private double y;
	private double x2;
	private double y2;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double raioCirculo) {
		this.raioCirculo = raioCirculo;
		this.x = 0;
		this.y = 0;
	}

	public Circle(double raioCirculo, double x, double y) {
		this.raioCirculo = raioCirculo;
		this.x = x;
		this.y = y;
	}
	public void mover() {
		this.x = 0;
		this.y = 0;
	}
	
	public void mover(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void mover(int x2 , int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public double getRaioCirculo() {
		return raioCirculo;
	}

	public void setRaioCirculo(double raioCirculo) {
		this.raioCirculo = raioCirculo;
	}
	
	public double inflar (double valor) {
		this.raioCirculo += valor;
		return this.raioCirculo;
	}
	public double desinflar(double valor) {
		this.raioCirculo -= valor;
		return this.raioCirculo;
	}
	public double inflar() {
		this.raioCirculo += 1;
		return this.raioCirculo;
	}
	public double desinflar() {
		this.raioCirculo -= 1;
		return this.raioCirculo;
	}
	public double areaCirculo() {
		double area = Math.PI * this.raioCirculo;
		return area;
	}
}
