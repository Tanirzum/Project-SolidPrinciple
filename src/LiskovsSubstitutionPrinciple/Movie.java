package LiskovsSubstitutionPrinciple;

public class Movie extends AgeVerification {

    @Override
    public void ageVerification(int age) {
        if (age >= 18) {
            System.out.println("Вам можно посмотреть фильм");
        } else {
            System.out.println("Вам еще не 18");
        }
    }
}
