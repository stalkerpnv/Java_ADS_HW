package homework7;
/**
 * Класс очереди
 */
public class Queue {
    private final int SIZE = 20;
    private int  [] queArray;
    private int front;
    private int rear;

    public Queue(){
        queArray = new int[SIZE];
        front = 0;
        rear = -1;  // Указатель
    }

    /**
     * Вставка элемента в конец очереди
     */
    public void insert(int elem){
        if(rear == SIZE - 1){
            rear = -1;
        }
            queArray[++rear] = elem;
    }

    /**
     * Извлечение элемента в начале очереди
     */
    public int remove(){
        int temp = queArray[front++];
        if(front == SIZE){
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty(){
        return (rear+1 == front);
    }
}
