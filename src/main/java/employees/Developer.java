package employees;

import employees.enums.Position;
import employees.enums.ProgrammingLanguage;

import java.math.BigDecimal;

public class Developer extends Employee {

    private final ProgrammingLanguage developmentLanguage;
    private final String university;
    private final Integer experience;
    private final String ide;

    public Developer(String firstName, String lastName, Position position, BigDecimal salary,
                     ProgrammingLanguage developmentLanguage, String university,
                     Integer experience, String ide) {
        super(firstName, lastName, position, salary);
        this.developmentLanguage = developmentLanguage;
        this.university = university;
        this.experience = experience;
        this.ide = ide;
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

    public Integer getExperience() {
        return experience;
    }

    public String getIde() {
        return ide;
    }

    public ProgrammingLanguage getDevelopmentLanguage() {
        return developmentLanguage;
    }

    public String getUniversity() {
        return university;
    }
}