public class Student implements Comparable<Student> {

	private static int count;
	private String firstName;
	private String lastName;
	private long gpa;

	public Student(String firstName, String lastName, long gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		count++;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getGpa() {
		return gpa;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGpa(long gpa) {
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


}
