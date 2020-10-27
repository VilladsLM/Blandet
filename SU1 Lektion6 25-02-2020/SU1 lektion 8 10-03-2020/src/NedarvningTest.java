public class NedarvningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");
		
		Teacher teacher = new Teacher("Dennis", "cyklen 1", "Team easy on", 40000);

		person.udskrivPerson();

		System.out.println();

		System.out.println("Student:");

		student.udskrivPerson();// kalder overrided metode

		System.out.println();

		student.udskrivAdresse(); // kalder egen metode

		System.out.println(student.getName()); // kalder nedarvet metode
		
		System.out.println();
		
		teacher.udskrivPerson();
	}

}
