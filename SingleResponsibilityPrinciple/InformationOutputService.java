package Урок_12.SingleResponsibilityPrinciple;

public class InformationOutputService {
    
    public static void main(String[] args) {
        Market market = new Market();

        System.out.println("Текущий размер очереди: " + market.size());
        System.out.println("Обработанный заказ: " + market.fulfillOrder());
    }
}
