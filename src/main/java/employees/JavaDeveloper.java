package employees;

public class JavaDeveloper {

    private final Developer developer;
    private final Integer experience;
    private final String ide;

    public JavaDeveloper(Developer developer, Integer experience, String ide) {
        super();
        this.developer = developer;
        this.experience = experience;
        this.ide = ide;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public Integer getExperience() {
        return experience;
    }

    public String getDevelopmentEnvironment() {
        return ide;
    }
}
