public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation E = new EmployeeWageComputation();

        E.Attendance();
        E.Salary();


    }
    //Check Employee is Present or Absent

    int P = 1;
    int randomCheck = (int) (Math.random() * 2);

    void Attendance() {

        if (P == randomCheck) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }

    //Calculate Daily Employee Wage
    int empRatePerHrs = 20;
    int empHr = 8;
    void Salary() {
        if (P == randomCheck) {

            int salary = (empRatePerHrs * empHr);
            System.out.println("Salary:-" + salary);
        } else {
            System.out.println("salary=0");
        }


    }


}