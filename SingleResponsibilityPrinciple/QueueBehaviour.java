package Урок_12.SingleResponsibilityPrinciple;


public interface QueueBehaviour {
    
    void enqueue(String person);
    String dequeue();
    int size();
}
