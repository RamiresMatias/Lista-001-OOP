package Quest�o_08;

import java.util.Scanner;

public class Quest�o_08 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		Ponto2D p = new Ponto2D(2 , 5);
		
		System.out.print("Digite a movimenta��o do Y: ");
		p.movimenta�aoY(ent.nextDouble());
		
		System.out.print("Digite a movimenta��o do X: ");
		p.movimenta�aoX(ent.nextDouble());
		
		p.distanciaDoPonto("x");
		
		p.novoPonto("x");
	}

}
