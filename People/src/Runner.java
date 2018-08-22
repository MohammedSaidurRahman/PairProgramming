import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Person john = new Person("john", 12, "Trainee");
		Person charlie = new Person("Charlie", 13, "Faliure");

		System.out.println(john.toString());
		System.out.println(charlie.toString());

		System.out.println(john.equals(charlie));

		System.out.println(john.showName() + " " + john.showAge() + " " + john.showJob());

		ArrayList<Person> people = new ArrayList<Person>();
		{
			people.add(john);
			people.add(charlie);
		}

		for (Person p : people) {
			System.out.println(p.name);
		} 

	}

}
