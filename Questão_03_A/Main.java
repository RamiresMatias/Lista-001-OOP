package Questão_03_A;

public class Main {

	public static void main(String[] args) {
		
		Porta p = new Porta();
		
		p.cor = "Amarelo";
		p.aberta = true;
		
		p.dimensaoX = 2.5;
		p.dimensaoY = 2.0;
		p.dimensaoZ = 1.5;
		
		System.out.println("Está aberta ?"+p.estaAberta());
		p.pinta("AZUL");
		System.out.println(p.cor);

	}

}
