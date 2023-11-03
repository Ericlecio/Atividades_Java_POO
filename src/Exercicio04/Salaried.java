package Exercicio04;

public class Salaried extends Employee{
	private double salary;

	//CONSTRUTOR
	public Salaried() {
		// TODO Auto-generated constructor stub
	}

	public Salaried(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public void printPay() {
		System.out.println(getPay());		

	}

	@Override
	public double getPay() {
		System.out.println("Nome: " + getName());
		return salary;
	}

	public void insertData(String name, double salary) {
		setName(name);
		this.salary = salary;
	}

	//GETS E SETS
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}