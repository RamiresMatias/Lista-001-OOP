package Quest�o_05;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("---- CADASTRO DE PRODUTO ----");
		
		System.out.print("DIGITE O N�MERO: ");
		int num = Integer.parseInt(ent.nextLine());
		
		System.out.print("DIGITE O NOME/DESCRI��O: ");
		String desc = ent.nextLine();
		
		System.out.print("DIGITE A QUANTIDADE: ");
		int quant = ent.nextInt();
		
		System.out.print("DIGITE O PRE�O DO PRODUTO: ");
		double pre� = ent.nextDouble();
		
		Invoice produto = new Invoice(num, desc, quant, pre�);
		
		System.out.println("\nREALIZAR COMPRA");
		
		System.out.print("DIGITE A QUANTIDADE QUE DESEJA: ");
		int quantCompra = ent.nextInt();		
		
		System.out.printf("VALOR DA FATURA: %.2f%n",produto.getInvoiceAmount(quantCompra));
	}

}
