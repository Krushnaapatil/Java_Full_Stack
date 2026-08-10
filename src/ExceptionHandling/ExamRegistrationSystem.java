package ExceptionHandling;

class AttendanceShortageException extends Exception {
    public AttendanceShortageException(String message) {
        super(message);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void registerExam(double attendancePercentage) throws AttendanceShortageException {
        System.out.println("Student Name: " + name);
        System.out.println("Attendance: " + attendancePercentage + "%");
        System.out.println("-----------------------------------");

        if (attendancePercentage < 75.0) {
            throw new AttendanceShortageException("Attendance Shortage");
        }

        System.out.println("Registration Successful! Hall ticket generated for " + name + ".");
    }
}

public class ExamRegistrationSystem {
    static void main(String[] args) {
        Student student = new Student("Alice");
        double currentAttendance = 68.5;

        try {
            student.registerExam(currentAttendance);
        } catch (AttendanceShortageException e) {
            System.out.println(e.getMessage());
        }
    }
}
