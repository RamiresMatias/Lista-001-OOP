package Quest�o_10;

public class Main {
	
	public static void main(String[] args) {
		
		Circle c = new Circle (20 , 5,5);
		
		c.mover();
		
		c.mover(5.5, 5.6);
		c.mover(10, 10);
		
		c.inflar();
		
		System.out.println("Raio do c�rculo : "+c.getRaioCirculo());
		
		System.out.printf("�rea : %.2f%n",c.areaCirculo());
	}
}
