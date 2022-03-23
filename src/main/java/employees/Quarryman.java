package employees;

import employees.enums.Position;

import java.math.BigDecimal;

public class Quarryman extends Employee {

    private final String[] newtonsLawsText;
    private final String[] newtonsLaws;

    public Quarryman(String firstName, String lastName, Position position, BigDecimal salary, String[] newtonsLaws) {
        super(firstName, lastName, position, salary);
        newtonsLawsText = new String[]{"Newton's cannonball", "Newton's cradle", "Newton's constant"};
        if (newtonsLaws.length > 3) throw new  IllegalArgumentException("newtonsLaws should be less: " + newtonsLawsText.length);
        this.newtonsLaws = newtonsLaws;
    }

    public String getNewtonsLawsText(int value) {
        return newtonsLawsText[value];
    }

    public String[] getNewtonsLaws() {
        return newtonsLaws;
    }

    @Override
    public void getInfoEmployee() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < newtonsLaws.length; i++) {
            temp.append(temp.length() == 0 ? newtonsLawsText[i] : ", " + newtonsLawsText[i]);
        }

        System.out.println("Имя: " + getFirstName() +
                "\nФамилия: " + getLastName() +
                "\nДолжность: " + getPosition() +
                "\nЗарплата: " + getSalary() +
                "\nЗнает законы ньютона: " + temp +
                "\n");

    }
}
