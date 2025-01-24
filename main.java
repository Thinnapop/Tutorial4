
public class main{
    public static void main(String[] args) {
        Queues pplQueue = new Queues(5);
       
        pplQueue.enqueue("John");
        System.out.println();

        pplQueue.enqueue("Man");
        System.out.println();

        pplQueue.enqueue("Pree");
        System.out.println();

        pplQueue.dequeue();

        System.out.println();

    }
}
