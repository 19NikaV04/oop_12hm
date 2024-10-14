package Урок_12.InterfaceSegregationPrinciple;


public interface QueueBehaviour {
    
    void enqueue(String person);
    String dequeue();
    int size();
}
