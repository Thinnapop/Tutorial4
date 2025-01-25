import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queues pplQueues = new Queues(5);
        String action;
        System.out.println("enter 'quit' to exit: ");
    do {
        
        action = input.nextLine();
        if (!action.equalsIgnoreCase("quit")) {
            pplQueues.enqueue(action);
        }
        

    }while(!action.equalsIgnoreCase("quit"));
    System.out.println();
    pplQueues.dequeue();
    }    
}
