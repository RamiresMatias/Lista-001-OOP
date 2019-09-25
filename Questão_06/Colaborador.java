package Questão_06;

public class Colaborador {

		String FirstName;
		String LastName;
		double salario;

		public  Colaborador(String nome , String sobrenome , double sal) {
			this.FirstName = nome;
			this.LastName = sobrenome;
			this.salario = sal;
			if(this.salario < 0) {
				this.salario = 0.0;
			}
		}
		
		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		public double SalarioAnual() {
			double anual = (this.getSalario() * 12);
			return anual;
		}
		public double Aumento() {
			
			return (this.SalarioAnual() + (this.SalarioAnual() * 0.1));
		}
		
	}
	

