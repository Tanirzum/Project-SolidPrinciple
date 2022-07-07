package InterfaceSegregationPrinciple;

public class Printer implements ColorPrinter {

    @Override
    public void colorPrint() {
        System.out.println("Цветной принтер работает");
    }
}
