package Questão_06;

import java.util.Scanner;

public class Firma {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		String nome , sobrenome;
		double sal;
		
		System.out.println("---- CADASTRAR COLABORADOR -----\n");
		
		System.out.print("Digite o nome: ");
		nome = ent.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		sobrenome = ent.nextLine();
		
		System.out.print("Digite o salário: ");
		sal = Double.parseDouble(ent.nextLine());
		
		Colaborador c = new Colaborador(nome, sobrenome, sal);
		
		System.out.println("Salário mensal: "+c.getSalario());
		System.out.println("Salário anual: "+c.SalarioAnual());
		System.out.println("Salário anual com desconto 10%: "+c.Aumento());
		
		System.out.println("\nSegundo colaborador\n");
		
		System.out.print("Digite o nome: ");
		nome = ent.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		sobrenome = ent.nextLine();
		
		System.out.print("Digite o salário: ");
		sal = Double.parseDouble(ent.nextLine());
		
		Colaborador c2 = new Colaborador(nome, sobrenome, sal);
		
		System.out.println("Salário mensal: "+c2.getSalario());
		System.out.println("Salário anual: "+c2.SalarioAnual());
		System.out.println("Salário anual com desconto 10%: "+c2.Aumento());

	}

}
