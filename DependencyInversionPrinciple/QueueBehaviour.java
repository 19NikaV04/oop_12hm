package Урок_12.DependencyInversionPrinciple;

public interface QueueBehaviour {
    
    void enqueue(String person);
    String dequeue();
    int size();
}
