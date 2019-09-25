package Questão_08;

import java.util.Scanner;

public class Questão_08 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		Ponto2D p = new Ponto2D(2 , 5);
		
		System.out.print("Digite a movimentação do Y: ");
		p.movimentaçaoY(ent.nextDouble());
		
		System.out.print("Digite a movimentação do X: ");
		p.movimentaçaoX(ent.nextDouble());
		
		p.distanciaDoPonto("x");
		
		p.novoPonto("x");
	}

}
