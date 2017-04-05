public class Student implements Comparable<Student> {

	private static int count;
	private String firstName;
	private String lastName;
	private float gpa;

	public Student(String lastName, String firstName, float gpa) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.gpa = gpa;
		count++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getGpa() {
		return gpa;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public int compareTo(Student other) {
		if (lastName != other.lastName) {
			return lastName.compareTo(other.lastName);
		} else if (firstName != other.firstName) {
			return firstName.compareTo(other.firstName);
		} else {
			double result;
			result = gpa-other.gpa;
			result = Math.round(result);
			return (int)result;
		}
	}

	public String toString() {
		return lastName+", "+firstName+": "+gpa;
	}

}
