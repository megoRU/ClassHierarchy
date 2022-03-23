package employees;

import employees.enums.Department;
import employees.enums.Position;

import java.math.BigDecimal;

public class Installer extends Employee {

    private final Department department;

    public Installer(String firstName, String lastName, Position position, BigDecimal salary, Department department) {
        super(firstName, lastName, position, salary);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void getInfoEmployee() {
        System.out.println("Имя: " + getFirstName() +
                "\nФамилия: " + getLastName() +
                "\nДолжность: " + getPosition() +
                "\nЗарплата: " + getSalary() +
                "\nОтдел: " + department +
                "\n");
    }


}
