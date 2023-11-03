package Exercicio04;

public abstract class Employee {
	private String name;

	//CONSTRUTOR
	public Employee() {
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	//METODOS
	public abstract void printPay();

	public abstract double getPay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}