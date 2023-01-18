public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation E = new EmployeeWageComputation();
        E.Attendance();

    }


    //Check Employee is Present or Absent

    int P = 1;

    void Attendance() {
        int randomCheck = (int) (Math.random() * 2);
        if (P == randomCheck) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }

    }
}


