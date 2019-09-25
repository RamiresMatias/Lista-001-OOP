package Questão_03_B;

public class Casa {
	
	String cor;
	Portas porta1;
	Portas porta2;
	Portas porta3;
	
	public Casa(String cor, Portas porta1, Portas porta2, Portas porta3) {
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}
	
	void pinta(String corCasa) {
		this.cor = corCasa;
	}
	int totalDePortas() {
		return 3;
	}
	
	int totalAbertas() {
		int quant = 0;
		if(porta1.aberta == true) {
			quant++;
		}
		if(porta2.aberta == true) {
			quant++;
		}
		if(porta3.aberta == true) {
			quant++;
		}
		return quant;
	}

}
