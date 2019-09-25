package Questão_05;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("---- CADASTRO DE PRODUTO ----");
		
		System.out.print("DIGITE O NÚMERO: ");
		int num = Integer.parseInt(ent.nextLine());
		
		System.out.print("DIGITE O NOME/DESCRIÇÃO: ");
		String desc = ent.nextLine();
		
		System.out.print("DIGITE A QUANTIDADE: ");
		int quant = ent.nextInt();
		
		System.out.print("DIGITE O PREÇO DO PRODUTO: ");
		double preç = ent.nextDouble();
		
		Invoice produto = new Invoice(num, desc, quant, preç);
		
		System.out.println("\nREALIZAR COMPRA");
		
		System.out.print("DIGITE A QUANTIDADE QUE DESEJA: ");
		int quantCompra = ent.nextInt();		
		
		System.out.printf("VALOR DA FATURA: %.2f%n",produto.getInvoiceAmount(quantCompra));
	}

}
