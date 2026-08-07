package Abstration;

abstract class Student {
	abstract void study();
	abstract void writeExam();
	void attendClass() {
		System.out.println("Student Attended Class");
	}
}

public class StudentManagement {

	public static void main(String[] args) {
		Student student = new Student() {
			
			@Override
			void writeExam() {
				System.out.println("Student is Writing Exam");
			}
			
			@Override
			void study() {
				System.out.println("Student is Studying");
			}
		};
		
		student.attendClass();
		student.study();
		student.writeExam();
	}

}
