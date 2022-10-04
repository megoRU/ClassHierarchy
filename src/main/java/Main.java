import employees.*;
import employees.enums.Department;
import employees.enums.Position;
import employees.enums.ProgrammingLanguage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        Employee developer = new Developer(
                "Юрий",
                "Савин", Position.DEVELOPER,
                new BigDecimal(1200),
                ProgrammingLanguage.JAVA,
                "skillbox",
                2,
                "INTELLIJ IDEA");

        Employee installer = new Installer(
                "Иван",
                "Иванов",
                Position.INSTALLER,
                new BigDecimal(600),
                Department.WAREHOUSE);

        Employee quarryman = new Quarryman(
                "Вадим",
                "Мешков",
                Position.ELECTRONIC_ENGINEER,
                new BigDecimal(450),
                new String[]{"1", "2", "3"});

        employeeList.add(installer);
        employeeList.add(developer);
        employeeList.add(quarryman);

        //Печатаем информацию о каждом сотруднике
        employeeList.forEach(Employee::getInfoEmployee);

        //Используем компаратор, чтобы отсортировать заплату
        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toUnmodifiableList());

        List<Developer> javaDeveloperList = employeeList.stream()
                .filter(employee -> employee.getPosition().equals(Position.DEVELOPER))
                .map(Developer.class::cast)
                .filter(developers -> developers.getDevelopmentLanguage().equals(ProgrammingLanguage.JAVA))
                .collect(Collectors.toUnmodifiableList());

        javaDeveloperList.forEach(Employee::getInfoEmployee);


        //Выводим отсортированный список Сотрудников
        sortedEmployeeList.forEach(employee ->
                System.out.printf(
                                """
                                Имя: %s
                                Фамилия: %s
                                Зарплата: %s
                                %n""", employee.getFirstName(), employee.getLastName(), employee.getSalary()));

    }
}
