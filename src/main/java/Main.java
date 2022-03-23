import employees.*;
import employees.enums.Department;
import employees.enums.Position;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        Developer developer = new Developer(
                "Юрий",
                "Савин",
                Position.DEVELOPER,
                new BigDecimal(1200),
                "Java",
                "skillbox");
        JavaDeveloper javaDeveloper = new JavaDeveloper(developer, 2, "INTELLIJ IDEA");


        Employee installer = new Installer( "Иван",
                "Иванов",
                Position.INSTALLER,
                new BigDecimal(600),
                Department.WAREHOUSE);

        Employee quarryman = new Quarryman("Вадим",
                "Мешков",
                Position.ELECTRONIC_ENGINEER,
                new BigDecimal(450),
                new String[]{"1", "2", "3"});


        employeeList.add(installer);
        employeeList.add(developer);
        employeeList.add(quarryman);


        //Печатаем информацию о каждом сотруднике
        employeeList.forEach(Employee::getInfoEmployee);


        //Используем компаратор чтобы отсортировать заплату
        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();


        //Выводим отсортированный список Сотрудников
        sortedEmployeeList.forEach(employee -> System.out.println(
                "Имя: " + employee.getFirstName() +
                " Фамилия: " + employee.getLastName() +
                " Зарплата: " + employee.getSalary()));

    }
}
