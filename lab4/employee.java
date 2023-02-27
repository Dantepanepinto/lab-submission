import java.util.Random;


interface Measurable {
    public double getMeasurable();
    
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasurable();
        }
        return sum / objects.length;
    }
}

class Employee implements Measurable {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Name: " + name + " salary: " + salary);
    }

    public double getMeasurable() {
        return salary;
    }

    public String getName() {
        return name;
    }


   public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Random random = new Random();

        
        for (int i = 0; i < 10; i++) {
            String name = "Employee " + (i+1);
            double salary = random.nextInt(50000) + 25000; 
            employees[i] = new Employee(name, salary);
        }

        
        double averageSalary = Measurable.average(employees);
        System.out.println("Average salary: " + averageSalary);
    }
}