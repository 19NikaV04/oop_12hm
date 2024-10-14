
import java.util.Scanner;

public interface AddingOrdersService {
    
    public static void main(String[] args) {
        Market market = new Market();
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите заказ первого клиента: ");
            String order1 = scanner.nextLine();
            market.acceptOrder(order1);

            System.out.print("Введите заказ второго клиента: ");
            String order2 = scanner.nextLine();
            market.acceptOrder(order2);
        }
    }
}
