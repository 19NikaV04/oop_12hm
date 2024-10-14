import java.util.Scanner;

public interface AddingClientsToTheQueueService {
    
    public static void main(String[] args) {
        Market market = new Market();
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.print("Введите имя первого клиента: ");
            String customer1 = scanner.nextLine();
            market.enqueue(customer1);

            System.out.print("Введите имя второго клиента: ");
            String customer2 = scanner.nextLine();
            market.enqueue(customer2);
        }
    }
}
