package Questão_11;

import java.util.Scanner;

public class Questão_11 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Digite o dia: ");
		int dia = ent.nextInt();
		
		System.out.print("Digite o mês: ");
		int mes = ent.nextInt();
		
		System.out.print("Digite o ano: ");
		int ano = ent.nextInt();
		
		Data d = new Data (dia,mes,ano);

		System.out.println("Data em String: "+d.toString());
		d.avançarData();
		System.out.println("Data fornecida pelo S.O: "+d.getData());
	}

}
