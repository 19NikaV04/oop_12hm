package Урок_12.SingleResponsibilityPrinciple;


public interface MarketBehaviour {

    void acceptOrder(String order);
    String fulfillOrder();
}

