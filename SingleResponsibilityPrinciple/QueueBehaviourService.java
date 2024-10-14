package Урок_12.SingleResponsibilityPrinciple;

public interface QueueBehaviourService extends QueueBehaviour {

    @Override
    public void enqueue(String person);

    @Override
    public String dequeue();

    @Override
    public int size();
    
}
