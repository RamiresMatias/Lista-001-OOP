package Questão_03_B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		Casa c = new Casa (null, null, null, null);
		
		c.pinta("azul");
		c.porta1.abre();
		c.porta2.abre();
		c.porta1.fechar();
		c.porta3.abre();
		c.porta1.fechar();
		
		System.out.println("Cor: "+c.cor);
		
		System.out.println(c.totalAbertas());
		
		System.out.print("Digite a qunatidade de broa: ");
		int broa =  ent.nextInt();
		
		System.out.print("Digite a quantidade de pao: ");
		int pao = ent.nextInt();
		
		double total =0, poupança = 0;
		
		total = total + (broa * 1.50) + (pao * 0.12);
		
		poupança += (total * 0.1);
		
		System.out.printf("%.2f%n",poupança);
	}
}
