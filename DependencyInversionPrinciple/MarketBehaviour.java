package Урок_12.DependencyInversionPrinciple;

public interface MarketBehaviour {

    void acceptOrder(String order);
    String fulfillOrder();
}

