
class Employee {
    public double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 30000 + 20000;
    }
}

class Worker extends Employee {
    public double calculateSalary() {
        return 30000 + 10000;
    }
}

public class SalaryMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        Worker w = new Worker();

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Worker Salary: " + w.calculateSalary());
    }
}
