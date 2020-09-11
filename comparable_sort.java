import java.util.*;

class Student implements Comparable<Student>{
	private final int id;
	private final String fname;
	private final double cgpa;

	public Student(final int id, final String fname, final double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int compareTo(final Student o) {
		if (cgpa == o.cgpa) {
			if (fname.equals(o.fname)) {
				return id - o.id;
			} else {
				return fname.compareTo(o.fname);
			}
		} else {

			if (cgpa - o.cgpa > 0) {
				return -1;
			} else {
				return 1;
			}
		}

	}
}

// Complete the code
class comparabl {
	public static void main(final String[] args) {
		final Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		final List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			final int id = in.nextInt();
			final String fname = in.next();
			final double cgpa = in.nextDouble();

			final Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList);
		for (final Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}