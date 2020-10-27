
public class Teacher extends Person {

	private double salary;
	
	public Teacher(String name, String address, String qualification, double salary) {
		super(name, address, qualification);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
	public double yearlySalary() {
		double yearlySalary = 0;
		yearlySalary = (salary * 12)*1.125;
		return yearlySalary;
	}
	
	public double lønMedFeriepengeGennemsnit() {
		double averageMonthlySalary = 0;
		averageMonthlySalary = (salary * 12)*1.125;
		return averageMonthlySalary / 12;
	}
	
	
	public void udskrivPerson() {
		super.udskrivPerson();
		System.out.println("Årlig løn: " + yearlySalary());
		System.out.println("Månedsløn med feriepenge: " + lønMedFeriepengeGennemsnit());
	}

}
