package Quest�o_11;

import java.util.Scanner;

public class Quest�o_11 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Digite o dia: ");
		int dia = ent.nextInt();
		
		System.out.print("Digite o m�s: ");
		int mes = ent.nextInt();
		
		System.out.print("Digite o ano: ");
		int ano = ent.nextInt();
		
		Data d = new Data (dia,mes,ano);

		System.out.println("Data em String: "+d.toString());
		d.avan�arData();
		System.out.println("Data fornecida pelo S.O: "+d.getData());
	}

}
