public class Janitor extends Employee {
    private boolean isSweepingFloor;

    public Janitor(String employeeName, int employeeNumber, int salary, boolean isPaid, boolean isSweepingFloor) {
        super();
        this.isSweepingFloor = false;
    }

    public void isSweeping() {
        System.out.println("Is Boomhauer sweeping the floors?");
        if (isSweepingFloor == false) {
            System.out.println("Boomhauer is back in the alley...");
        } else {
            System.out.println("Wow! Boomhauer is sweeping the floors.");
        }
        isSweepingFloor = false;
    }
    @Override
    public String toString() {
        return " Employee ID: " + employeeNumber + " Salary: " + salary + " Has been paid: " + isPaid + "Is currently sweeping the floor: " + isSweepingFloor;
    }

}

