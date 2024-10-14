package Урок_12.SingleResponsibilityPrinciple;

public interface MarketBehaviourService extends MarketBehaviour {

    @Override
    public void acceptOrder(String order);

    @Override
    public String fulfillOrder();
    
}
