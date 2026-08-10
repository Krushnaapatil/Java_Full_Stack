package ExceptionHandling;

class NoSlotsAvailableException extends Exception {
    public NoSlotsAvailableException(String message) {
        super(message);
    }
}

class Hospital {
    private int availableSlots = 0;

    public void bookAppointment(String patientName) throws NoSlotsAvailableException {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Available Slots: " + availableSlots);
        System.out.println("-----------------------------------");

        if (availableSlots <= 0) {
            throw new NoSlotsAvailableException("No Appointment Slots Available");
        }

        availableSlots--;
        System.out.println("Appointment booked successfully for " + patientName + "!");
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        String patient = "John Doe";

        try {
            hospital.bookAppointment(patient);
        } catch (NoSlotsAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
