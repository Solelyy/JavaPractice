package collections.queue;

public class Task implements Comparable<Task> {
    String name;
    int priority;
    int order;

    private static int counter = 0;
    public Task(String name, int priority){
        this.name= name;
        this.priority= priority;
        this.order = counter++;
    }

    @Override
    public int compareTo(Task other){
        int priorityCompare = Integer.compare(this.priority, other.priority);
        if (priorityCompare == 0 ) {
            return Integer.compare(this.order, other.order);
        }
        return priorityCompare;
    }

    @Override
    public String toString(){
        return name + " (priority " + priority + ").";
    }
}
