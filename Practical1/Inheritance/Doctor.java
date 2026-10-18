
class Doctor {
    int doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    void showFee() {
        int fee;

        if (specialization.equalsIgnoreCase("Cardiologist")) {
            fee = 1000;
        } else if (specialization.equalsIgnoreCase("Dermatologist")) {
            fee = 700;
        } else {
            fee = 500;
        }

        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: Rs. " + fee);
    }

    public static void main(String[] args) {
        Doctor d = new Doctor(301, "Rahul", "Cardiologist");
        d.showFee();
    }
}