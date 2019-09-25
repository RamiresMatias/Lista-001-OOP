package Quest�o_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		Banco b = new Banco ();
		
		
		boolean status = false;
		
		
		while(true) {
			System.out.println("--- MENU ----");
			System.out.println("1 - CRIAR CONTA");
			System.out.println("2 - EFETUAR DEP�SITO");
			System.out.println("3 - EFETUAR SAQUE");
			System.out.println("4 - EFETUAR TRANSFER�NCIA");
			System.out.println("5 - EXCLUIR CONTA");
			System.out.println("6 - EMITIR SALDOR");
			System.out.println("7 - QUANTIDADE DE CONTAS");
			System.out.println("8 - FAZER MOVIMENTA��O");
			System.out.println("0 - SAIR DO MENU");
			System.out.println();
			System.out.print("Digite sua op��o: ");
			int op�ao = ent.nextInt();
			
			switch(op�ao) {
			case 1:
				b.criarConta();
				break;
			case 2: 
				System.out.print("Digite o n�mero da conta ao qual deseja efetuar o DEP�SITO : ");
				int conta = ent.nextInt();
				
						for(int i = 0; i < 10;i++) {
						
							if(conta == b.contas[i].getNumConta()) {
								
								System.out.print("Digite o valor que deseja depositar: ");
								double valor = ent.nextDouble();
								
								System.out.println(b.contas[i].depositar(valor));
							
							}
							break;
						}
				break;
			case 3:
				System.out.print("Digite o n�mero da conta ao qual deseja efetuar o SAQUE: ");
				int conta2 = ent.nextInt();
				
				for(int i = 0; i < 10;i++) {
					
					if(conta2 == b.contas[i].getNumConta()) {
						System.out.print("Digite o valor que deseja sacar: ");
						double valor = ent.nextDouble();
						
						System.out.println(b.contas[i].sacar(valor));
						break;
					}
				}
				break;
			case 4 :
				b.efetuarTransferencias();
				break;
			case 5 :
				b.excluirConta();
				break;
			case 6 :
				b.emitirSaldo();
				break;
			case 7 :
				b.quantidadeCadastrada();
				break;
			case 8:
				b.tipoMovimenta�ao();
				break;
			case 0 :
				System.out.println("SAINDO...");
				System.exit(0);
				break;
					
			}

		}
	
	}
	
}
