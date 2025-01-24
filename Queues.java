public class Queues {
    private int front;
    private int capacity;
    private String[] queue;
    private int rear;
    private int size;

    public Queues(){

    }
    public Queues(int capacity){
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public String enqueue(String name){
        if(isFull()){
            return "Can not add "+name+ "because the queue are full";
        }
        queue[rear] = name;
        rear = (rear + 1) % capacity;
        size++;
        System.out.println(name + " has been added");
        display();
        return name+ " has been added";
    }
    public String dequeue() {
        if (isEmpty()) {
            return "Cannot dequeue because the queue is empty.";
        }
        String removed = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        System.out.println(removed + " has been removed.");
        display();
        return removed + " removed successfully.";
    }
    public void display(){
        System.out.print("[");
        for(int i = 0; i < capacity; i++){
            if (i < size){
                System.out.print(queue[(front + i) % capacity]);
            }
            else{
                System.out.print("null");
            }
            if (i < capacity - 1){
                System.out.print(", ");
            }
        }
        System.out.print("] "+"Front: "+front+ " Rear: "+ rear+ " Size: "+size+"   ");
    }
}
