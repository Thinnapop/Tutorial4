import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Queues pplQueue = new Queues(5);
        Scanner input = new Scanner(System.in);

        String action;

       do { 
            System.out.println("Enter your action (enqueue/dequeue/exit): ");
            action = input.next();

            if (action.equalsIgnoreCase("exit")){
                System.out.println("Program terminated!!");
                break;
            }
            if(action.equalsIgnoreCase("enqueue")){
            System.out.println("Enter the name to enqueue: ");
            String en = input.next();
            System.out.println();
            pplQueue.enqueue(en);
           }
           else if (action.equalsIgnoreCase("dequeue")) {
               System.out.println("Dequeue: "+pplQueue.dequeue());
           }
           else{
            System.out.println("Invalid input!!");
           }
        }
           while(!action.equalsIgnoreCase("exit"));
        }
    }    


