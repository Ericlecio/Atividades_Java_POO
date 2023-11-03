package Exercicio04;

public class Hourly extends Employee{
	private double hourlyRate; 
	private double hours;

	//CONSTRUTOR
	public Hourly() {
		// TODO Auto-generated constructor stub
	}

	public Hourly(double hourlyRate, double hours) {
		super();
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	//METODOS
	public void insertData(String name, double hourlyRate,double hours) {
		setName(name);
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	public void addHours(double hours) {
		this.hours = hours;
	}

	@Override
	public void printPay() {
		System.out.println(getPay());
	}

	@Override
	public double getPay() {
		System.out.println("Nome: "+getName());
		return hourlyRate * hours;
	}

	//GETS E SETS 
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
}