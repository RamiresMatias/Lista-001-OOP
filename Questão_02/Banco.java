package Questão_02;

import java.util.Scanner;

public class Banco {
	
	Conta contas[];
	int quant = 0;
	
	Scanner ent = new Scanner (System.in);
	
	public Banco() {
		this.contas = new Conta[10];
	}
	
	
	public void criarConta() {	
		
		boolean status = false;

		System.out.println("--- CRIAÇÃO DE CONTA ---");
		for(int i = 0; i < 10;i++) {
			if(this.contas[i] == null) {
				
			System.out.print("Digite o número da conta: ");
			int numConta = Integer.parseInt(ent.nextLine());
			
			System.out.print("Digite o saldo: ");
			double saldo = Double.parseDouble(ent.nextLine());

			System.out.print("Digite o limite: ");
			double limite = Double.parseDouble(ent.nextLine());

			System.out.println("---- CONTA CADASTRADA ----");
			this.quant++;
			
			this.contas[i] = new Conta(numConta,saldo,true,limite);
			
			break;
			
			}
			
		}
	}
	
	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	public void excluirConta() {
		
		System.out.print("Informe o número da conta que deseja excluir: ");
		int num = ent.nextInt();
		
		for(int i = 0 ; i< 10;i++) {
			if(this.contas[i] != null) {
				if(num == this.contas[i].getNumConta()) {
					this.contas[i] = null;
					this.quant--;
					System.out.println("Conta excluída com sucesso");
					break;
				}
			}
		}
	}	
	public void efetuarTransferencias() {
		
		double valor = 0;
		
		System.out.print("Digite o número da conta do remetente que deseja transferir: ");
		int num = ent.nextInt();
		
		for(int i = 0; i < 10;i++) {
			
				if(num == this.contas[i].getNumConta()) {
					
					System.out.print("Digite o valor ao qual será transferido: ");
					valor = ent.nextDouble();
					
					this.contas[i].sacar(valor);

				}else {
					System.out.println("Conta não existe !!!");
				}
			break;
		}
		
		System.out.print("Digite o número da conta destino: ");
		int numConta = ent.nextInt();
		
		for(int i = 0; i < 10;i++) {
			if(this.contas[i] != null) {
				if(numConta == this.contas[i].getNumConta()) {
					this.contas[i].depositar(valor);
				}
			}
		}
	}
	
	public void emitirSaldo() {
		
		System.out.print("Digite o número da conta ao qual deseja ver o saldo: ");
		int conta3 = ent.nextInt();
		
		for(int i = 0;i < 10;i++) {
			if(this.contas[i] != null) {
				if(conta3 == this.getContas()[i].getNumConta()){
					System.out.println("Saldo: "+this.getContas()[i].getSaldo());
					break;
				}
			}
		}
	}
	public void quantidadeCadastrada() {
		System.out.println("quantidade : "+this.quant);
	}
	public void tipoMovimentaçao() {
		
	
		String tipoMovimentaçao = null;
		double valor = 0;
		
		System.out.print("Digite o número da conta: ");
		int conta = Integer.parseInt(ent.nextLine());
		
		for(int i = 0; i < 10;i++) {
			if(this.contas[i] != null) {
				if(conta == this.contas[i].getNumConta()) {
					
					System.out.print("A movimentação irá ser feita no crédito ou débito: ");
					 tipoMovimentaçao = ent.nextLine();
					
					System.out.print("Digite o valor do pagamento: ");
					valor  = Double.parseDouble(ent.nextLine());
					
					this.contas[i].setSaldo(this.contas[i].getSaldo() - valor);
					
				}else {
					System.out.println("\n Conta não encontrada !!! \n");
				}
			}
			System.out.println("\nMovimentação no "+tipoMovimentaçao+" no valor de "+valor+" efetuado com sucesso !!\n");
			break;
		}

	}
}
