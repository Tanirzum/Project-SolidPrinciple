package SingleResponsibilityPrinciple;

public class DeliveryWithScooter extends Delivery {
    @Override
    public void delivery() {
        System.out.println("Доставка с самокатом");
    }
}
