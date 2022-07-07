package DependencyInversionPrinciple;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer write java code");
    }

    @Override
    public void writeSqlCode() {
        System.out.println("Java developer write sql code");
    }
}
