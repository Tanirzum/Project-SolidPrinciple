package LiskovsSubstitutionPrinciple;

public class Shop extends AgeVerification {

    @Override
    public void ageVerification(int age) {
        if (age >= 21) {
            System.out.println("Вам можно купить Алкоголь");
        } else {
            System.out.println("Вам еще не 21");
        }
    }
}
