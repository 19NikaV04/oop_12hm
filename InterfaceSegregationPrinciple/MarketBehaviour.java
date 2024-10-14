package Урок_12.InterfaceSegregationPrinciple;


public interface MarketBehaviour {

    void acceptOrder(String order);
    String fulfillOrder();
}

