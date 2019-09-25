package Questão_05;

public class Invoice {
	
		 int numero;
		 String descriçao;
		 int quantidade;
		 double preço;
		
		public Invoice (int num , String desc , int quant , double preç) {
			
			this.numero = num;
			this.descriçao = desc;
			this.quantidade = quant;
			this.preço = preç;
			
			if(this.quantidade < 0) {
				this.quantidade = 0;
			}
			
			if(this.preço < 0) {
				this.preço = 0;
			}
		}


		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getDescriçao() {
			return descriçao;
		}

		public void setDescriçao(String descriçao) {
			this.descriçao = descriçao;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public double getPreço() {
			return preço;
		}

		public void setPreço(double preço) {
			this.preço = preço;
		}
		public double getInvoiceAmount(int quantCompra) {
			double fatura = ( quantCompra * this.preço);
			
			if(this.quantidade < quantCompra) {
				System.out.println("\nQUANTIDADE INSUFICIENTE !!!!! \n");
				return 0;
			}
				
			this.quantidade = this.quantidade - quantCompra;
				
			return fatura;		
	}

}
