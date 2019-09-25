package Questão_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		Contador c = new Contador();

		boolean dec = false;

		System.out.print("Digite o número que o contador irá começar: ");
		c.cont = ent.nextInt();

		System.out.println("CONTADOR : " + c.Incrementar());
		System.out.println("CONTADOR : " + c.Incrementar());
		System.out.println("CONTADOR : " + c.Incrementar());
		System.out.println("CONTADOR : " + c.Incrementar());
		System.out.println("RETORNANDO VALOR : " + c.ReturnValor());
		System.out.println("ZERANDO : " + c.Zerar());

	}

}
