package Урок_12.SingleResponsibilityPrinciple;
import java.util.LinkedList;

import java.util.Queue;


public class Market implements MarketBehaviourService, QueueBehaviourService {
    
    private Queue<String> queue = new LinkedList<>();
    private Queue<String> orders = new LinkedList<>();

    @Override
    public void enqueue(String person) {
        queue.offer(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void acceptOrder(String order) {
        orders.offer(order);
    }

    @Override
    public String fulfillOrder() {
        return orders.poll();
    }

}
