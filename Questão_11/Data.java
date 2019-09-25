package Questão_11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	int dia;
	int mes;
	int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String toString() {
		String str = "";
		
		return str = "("+this.getDia()+"/"+this.getMes()+"/"+this.getAno()+")";
	}
	public String getData() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		return dateFormat.format(data);
	}
	
	public void avançarData() {
		this.dia = this.dia + 1;
		System.out.println("Data avançada: "+toString());
	}
}
