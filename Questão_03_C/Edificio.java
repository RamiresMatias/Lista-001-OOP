package Questão_03_C;

import java.util.Scanner;

import Questão_03_B.Portas;

public class Edificio {

		String cor;
		int totalDePortas;
		int totalDeAndares;
		Portas p [];	
		int quant = 0;
		int quantPortas = 0;
		
		Scanner ent = new Scanner (System.in);
		
		public Edificio(String cor , int andar , int portas) {
			this.cor = cor;
			this.totalDePortas = portas;
			this.totalDeAndares = andar;
			p = new Portas [6];
		}
		public void adicionarAndar() {
			this.totalDeAndares += +1;
		}
		
		public int totalAndares() {
			return this.totalDeAndares;
		}
		
		public void adicionaPorta () {
			
			for(int i = 0; i < 6;i++) {
				if(this.p[i] == null) {
					
					boolean aberta = false;
					
					System.out.print("Está aberta? S/N : ");
					String portaAberta = ent.nextLine();
					
					System.out.print("Digite a cor da porta: ");
					String cor = ent.nextLine();
					
					if(portaAberta.equalsIgnoreCase("s")) {
						aberta = true;
					}
					
					this.p[i] = new Portas(aberta, cor);
					this.quantPortas++;
					
					System.out.println("\n--- PORTA CRIADA E ADICIONADA ---\n");
				}
				break;
			}
		}
		
		public int totalPortas() {
			return this.quantPortas;
		}
		
		public int portasAbertas() {
			int quant = 0;
			for(int i = 0; i < 6;i++) {
				if(this.p[i] != null) {
					if(this.p[i].estaAberta() == true) {
						quant++;
					}
				}
			}
			return quant;
		}
		
}
