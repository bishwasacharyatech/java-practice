class Employee {
    private double salary; // Private data

    public void setSalary(double s) {
        if(s > 0) salary = s; // Validation
    }
    public double getSalary() {
        return salary;
    }
}

public class program13 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Salary is: " + emp.getSalary());
    }
}