package employees;

import employees.enums.Position;

import java.math.BigDecimal;

public class Developer extends Employee {

    private final String developmentLanguage;
    private final String university;

    public Developer(String firstName, String lastName, Position position, BigDecimal salary, String developmentLanguage, String university) {
        super(firstName, lastName, position, salary);
        this.developmentLanguage = developmentLanguage;
        this.university = university;
    }

    @Override
    public void getInfoEmployee() {
        System.out.println("Имя: " + getFirstName() +
                "\nФамилия: " + getLastName() +
                "\nДолжность: " + getPosition() +
                "\nЗарплата: " + getSalary() +
                "\nЯзык разработчика: " + getDevelopmentLanguage() +
                "\nУниверситет: " + getUniversity() +
                "\n");
    }

    public String getDevelopmentLanguage() {
        return developmentLanguage;
    }

    public String getUniversity() {
        return university;
    }
}