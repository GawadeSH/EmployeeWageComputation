public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation E = new EmployeeWageComputation();

        E.Attendance();
        E.Salary();
        E.AddPart();
        E.Switch();

    }
    //Check Employee is Present or Absent

    int P = 1;
    int randomCheck = (int) (Math.random() * 2);

    void Attendance()
    {

        if (P == randomCheck)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }

    //Calculate Daily Employee Wage
    int empRatePerHrs = 20;
    int empHr = 8;
    void Salary()
    {
        if (P == randomCheck)
        {

            int salary = (empRatePerHrs * empHr);
            System.out.println("Salary:-" + salary);
        }
        else
        {
            System.out.println("salary=0");
        }


    }
    //Add part time wage
    int Full = 2;
    int PartTime = 1;
    int Check = (int) (Math.random() * 3);

    void AddPart()
    {

        if (Full == Check)
        {
            int empHr = 8;
            int salary = (empRatePerHrs * empHr);
            System.out.println("Salary:-" + salary);
        }
        else if (PartTime == Check)
        {
            int empHr = 4;
            int salary = (empRatePerHrs * empHr);
            System.out.println("Salary:-" + salary);
        }

    }
    //using case statement

      void Switch() {
          switch (Check) {
              case 2:
                  int empHrs = 8;
                  System.out.println("Salary is:-"+empRatePerHrs * empHrs);
                  break;
              case 1:
                  empHrs = 4;
                  System.out.println("Salary is:-"+empRatePerHrs * empHrs);
                  break;
          }

      }
}