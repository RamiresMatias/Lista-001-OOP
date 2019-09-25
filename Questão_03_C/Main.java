package Questão_03_C;

import java.util.Scanner;

import Questão_03_B.Portas;

public class Main {

	public static void main(String[] args) {
		
		Edificio f = new Edificio("azul", 0, 0);
		
		f.adicionarAndar();
		f.adicionaPorta();
		
		
		System.out.println("Total de portas abertas : "+f.portasAbertas());
		System.out.println("Total de portas: "+f.totalPortas());
	}
}
