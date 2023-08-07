public class HourlyEmployee extends Employee {
        double hourlyPayRate;
        int hoursWorked;
        int doubleHours;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate, int hoursWorked) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double collectPay() {
        double paycheck;
        int regularHours;

        if (hoursWorked <= 40) {
            doubleHours = 0;
            regularHours = hoursWorked;
        } else {
            regularHours = 40;
            doubleHours = hoursWorked - 40;  // We are a generous employer who pays double, not 1.5,  for hours worked > 40.
        }
        paycheck = (hourlyPayRate * regularHours) + getDoublePay();
        return (int) paycheck;
    }

    public double getDoublePay() {
        double overtimeRate;

        overtimeRate = hourlyPayRate * 2;
        return (doubleHours * overtimeRate);
    }


}


