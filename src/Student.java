import java.util.Comparator;

public  class Student implements Comparator<Student>{	//generic view implementation (to accept all type of data inputs)
	int roll_no;
	String name;
	double percentage;
	
	public Student(int roll_no,String name,	double percentage) {
		this.roll_no = roll_no;
		this.name = name;
		this.percentage = percentage;

	}
		
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", percentage=" + percentage + "]";
	}

//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return Double.compare(o1.percentage, o2.percentage);
//	}
	
	
	@Override
    public int compare(Student s1, Student s2) {
        // We use the String class's built-in compareTo method
        return s1.name.compareTo(s2.name);
    }

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	
	
	

//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.roll_no - o.roll_no;
	
	
	
	
//	}

}