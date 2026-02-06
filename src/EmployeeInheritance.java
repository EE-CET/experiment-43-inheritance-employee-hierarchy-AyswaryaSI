import java.util.Scanner;
public class EmployeeInheritance {
   String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    void printSalary() {
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();
        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        sc.nextLine();
        officer.phoneNumber = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = sc.nextInt();
        sc.nextLine();
        officer.specialization = sc.nextLine();

        Manager manager = new Manager();
        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        sc.nextLine();
        manager.phoneNumber = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = sc.nextInt();
        sc.nextLine();
        manager.department = sc.nextLine();

        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phoneNumber);
        System.out.println(officer.address);
        officer.printSalary();
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.address);
        manager.printSalary();
        System.out.println(manager.department);

        sc.close();
    }
}

class Officer extends EmployeeInheritance {
    String specialization;
}

class Manager extends EmployeeInheritance {
    String department;
}

