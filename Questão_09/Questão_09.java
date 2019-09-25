package Questão_09;

import java.util.Scanner;

public class Questão_09 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("--- ENTRE COM OS PONTOS ---\n");
		
		System.out.print("Digite o valor de A: ");
		double a = ent.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		double b = ent.nextDouble();
		
		
		Reta r = new Reta (a,b);
		
		r.inicializarReta();
		System.out.println("Reta : "+ r.getReta());
		
		System.out.print("Digite um ponto : ");
		double ponto = ent.nextDouble ();
		
		System.out.println("Pertence a reta ? "+r.pontoReta(ponto));
		
		
		System.out.println("--- SEGUNDA RETA ---\n");
		
		System.out.print("Digite o ponto A da segunda reta: ");
		double pontoA = ent.nextDouble();
		
		System.out.print("Digite o ponto B da segunda reta: ");
		double pontoB = ent.nextDouble();
		
		System.out.println(r.interseçao(pontoA, pontoB));
	}

}
