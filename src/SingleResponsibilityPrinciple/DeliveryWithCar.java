package SingleResponsibilityPrinciple;

public class DeliveryWithCar extends Delivery {
    @Override
    public void delivery() {
        System.out.println("Доставка с машиной");
    }
}
