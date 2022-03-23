package employees;

import employees.enums.Position;

import java.math.BigDecimal;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final Position position;
    private final BigDecimal salary;

    public Employee(String firstName, String lastName, Position position, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public void getInfoEmployee() {
        System.out.println("Имя: " + firstName +
                "\nФамилия: " + lastName +
                "\nДолжность: " + position +
                "\nЗарплата: " + salary +
                "\n");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
