package Questão_10;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle (20 , 5,5);
		
		c.mover();
		
		c.mover(5.5, 5.6);
		c.mover(10, 10);
		
		c.inflar();
		
		System.out.println("Raio do círculo : "+c.getRaioCirculo());
		
		System.out.printf("Área : %.2f%n",c.areaCirculo());
	}
}
