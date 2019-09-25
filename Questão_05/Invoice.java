package Quest�o_05;

public class Invoice {
	
		 int numero;
		 String descri�ao;
		 int quantidade;
		 double pre�o;
		
		public Invoice (int num , String desc , int quant , double pre�) {
			
			this.numero = num;
			this.descri�ao = desc;
			this.quantidade = quant;
			this.pre�o = pre�;
			
			if(this.quantidade < 0) {
				this.quantidade = 0;
			}
			
			if(this.pre�o < 0) {
				this.pre�o = 0;
			}
		}


		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getDescri�ao() {
			return descri�ao;
		}

		public void setDescri�ao(String descri�ao) {
			this.descri�ao = descri�ao;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public double getPre�o() {
			return pre�o;
		}

		public void setPre�o(double pre�o) {
			this.pre�o = pre�o;
		}
		public double getInvoiceAmount(int quantCompra) {
			double fatura = ( quantCompra * this.pre�o);
			
			if(this.quantidade < quantCompra) {
				System.out.println("\nQUANTIDADE INSUFICIENTE !!!!! \n");
				return 0;
			}
				
			this.quantidade = this.quantidade - quantCompra;
				
			return fatura;		
	}

}
