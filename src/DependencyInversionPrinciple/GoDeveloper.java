package DependencyInversionPrinciple;

public class GoDeveloper implements Developer  {

    @Override
    public void writeCode() {
        System.out.println("Go developer write java code");
    }

    @Override
    public void writeSqlCode() {
        System.out.println("Go developer write sql code");
    }
}
