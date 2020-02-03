import java.util.HashMap;

public class HospitalApplication {
    public static void main(String[] args) {
        highStreetGreeting();

        ListAllEmployeesAndPatients listAllEmployeesAndPatients = new ListAllEmployeesAndPatients().invoke();
        HealthProviders doctor1 = listAllEmployeesAndPatients.getDoctor1();
        HealthProviders nurse1 = listAllEmployeesAndPatients.getNurse1();
        Employee janitor1 = listAllEmployeesAndPatients.getJanitor1();
        HashMap<String, Employee> employeeList = listAllEmployeesAndPatients.getEmployeeList();
        Patient patient1 = listAllEmployeesAndPatients.getPatient1();
        HashMap<String, Patient> patientList = listAllEmployeesAndPatients.getPatientList();

        doctorCheckUp(doctor1, employeeList, patient1, patientList);

        nurseCheckUp(nurse1, employeeList, patient1, patientList);

        janitorCheckUp((Janitor) janitor1);

        payWorkingEmployees(doctor1, nurse1, janitor1);

        highStreetFarewell();
    }

    private static void highStreetFarewell() {
        System.out.println("Thanks for visiting High St. Hospital!");
    }

    private static void payWorkingEmployees(HealthProviders doctor1, HealthProviders nurse1, Employee janitor1) {
        System.out.println("Let's pay our employees for the day.");
        doctor1.paySalary();
        nurse1.paySalary();
        doctor1.payChangeIsPaid();
        nurse1.payChangeIsPaid();
        System.out.println("Hank and Peggy just got paid! Let's double check to make sure.");
        System.out.println("Did Hank get paid?");
        System.out.println(doctor1.isPaid);
        System.out.println("Did Peggy get paid?");
        System.out.println(nurse1.isPaid);
        System.out.println("Did Boomhauer get paid?");
        System.out.println(janitor1.isPaid);
    }

    private static void janitorCheckUp(Janitor janitor1) {
        System.out.println("I wonder if janitor Boomhauer is doing his job? He's usually just drinking beer in the alley...");
        janitor1.isSweeping();
    }

    private static void nurseCheckUp(HealthProviders nurse1, HashMap<String, Employee> employeeList, Patient patient1, HashMap<String, Patient> patientList) {
        System.out.println("Nurse Peggie has Bobby as a patient. Let's look at what Peggy is up to.");
        System.out.println(employeeList.get("Peggie"));
        System.out.println("Peggie is going to care for Bobby after his blood was drawn");
        nurse1.careForPatient(patient1);
        System.out.println("How is Bobby doing now?");
        System.out.println(patientList.get("Bobby"));
    }

    private static void doctorCheckUp(HealthProviders doctor1, HashMap<String, Employee> employeeList, Patient patient1, HashMap<String, Patient> patientList) {
        System.out.println("What is Doctor Hank up to?");
        System.out.println(employeeList.get("Hank"));
        System.out.println("Hank is checking up on his patient Bobby.");
        System.out.println(patientList.get("Bobby"));
        System.out.println("Hank is drawing blood from Bobby.");
        doctor1.drawBlood(patient1);
        System.out.println(patientList.get("Bobby"));
    }


    private static void highStreetGreeting() {
    System.out.println("Hi there, come on in to High st. Hospital! Here's a look at a little days work.");
    System.out.println("Here are all our employees and patients");
}

    private static class ListAllEmployeesAndPatients {
        private HealthProviders doctor1;
        private HealthProviders nurse1;
        private Employee janitor1;
        private HashMap<String, Employee> employeeList;
        private Patient patient1;
        private HashMap<String, Patient> patientList;

        public HealthProviders getDoctor1() {
            return doctor1;
        }

        public HealthProviders getNurse1() {
            return nurse1;
        }

        public Employee getJanitor1() {
            return janitor1;
        }

        public HashMap<String, Employee> getEmployeeList() {
            return employeeList;
        }

        public Patient getPatient1() {
            return patient1;
        }

        public HashMap<String, Patient> getPatientList() {
            return patientList;
        }

        public ListAllEmployeesAndPatients invoke() {
            doctor1 = new Doctor("Hank", 319, 90000, false, "Spine");
            HealthProviders doctor2 = new Doctor("Dale", 318, 90000, false, "Hip");
            nurse1 = new Nurse("Peggie", 219, 50000, false, 2);
            HealthProviders nurse2 = new Nurse("Luanne", 218, 50000, false, 1);
            janitor1 = new Janitor("Boomhauer", 119, 40000, false, false);
            Employee receptionist1 = new Receptionist("Nancy", 419, 45000, false, false);
            employeeList = new HashMap<>();
            employeeList.put("Hank", doctor1);
            employeeList.put("Dale", doctor2);
            employeeList.put("Peggie", nurse1);
            employeeList.put("Luanne", nurse2);
            employeeList.put("Boomhauer", janitor1);
            employeeList.put("Nancy", receptionist1);

            patient1 = new Patient("Bobby", 20, 10);
            Patient patient2 = new Patient("Bill", 20, 10);
            Patient patient3 = new Patient("John Redcorn", 20, 10);
            patientList = new HashMap<>();
            patientList.put("Bobby", patient1);
            patientList.put("Bill", patient2);
            patientList.put("John Redcorn", patient3);

            System.out.println(employeeList);
            System.out.println(patientList);
            return this;
        }
    }
}
