package Exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos funcinario deseja cadastrar ? ");
		int numero = scanner.nextInt();


		List<Employee> listafuncionario = new ArrayList <Employee> ();


		for (int i = 0; i < numero; i++) {
			System.out.print("Informe o nome do funcionario: ");
			String nome = scanner.next();

			System.out.print("Informe o tipo de funcionario (A - Assalariado, H - Horista): ");
			char tipo = scanner.next().charAt(0);

			if (tipo == 'A' || tipo == 'a') {
				System.out.print("Informe o salário: ");
				double salario = scanner.nextDouble();

				Salaried salaried = new Salaried();
				salaried.insertData(nome, salario);
				salaried.printPay();
				System.out.println("-----------------------------------------------------");
				listafuncionario.add(salaried);


			} else if (tipo == 'H' || tipo == 'h') {
				System.out.print("Informe as horas trabalhadas: ");
				double horasTrabalhadas = scanner.nextDouble();

				System.out.print("Informe a taxa horária: ");
				double taxaHoraria = scanner.nextDouble();

				Hourly hourly = new Hourly();
				hourly.insertData(nome, horasTrabalhadas, taxaHoraria);
				hourly.printPay();
				System.out.println("-----------------------------------------------------");
				listafuncionario.add(hourly);



			} else {
				System.out.println("Funcionario não existe. Digite A para Assalariado ou H para Horista.");
				i--; 
			}
		}
		double gastoTotal = 0;		for (Employee employee : listafuncionario) {			gastoTotal += employee.getPay();		}
		System.out.println("Gasto total da empresa com a folha salarial: " + gastoTotal);
	}
}
