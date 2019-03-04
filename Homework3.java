import java.io.IOException;
import java.util.Scanner;
/**
 * Java. Algorithm and Data Structures of Java. Lesson 3. Homework 3
 *
 * @author Petrov Nikolay
 * @version dated March 3rd, 2019
 */
/* 1. Реализовать рассмотренные структуры данных в консольных программах.
   2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
   3. Создать класс для реализации дека.*/

class MyStack{
    private int maxSize;
    private char[] stackArray;
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        this.stackArray = new char[size];
        this.top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
class Deque{
    private int size;
    private int head;
    private int tail;
    private int[] data;

    Deque(int size){
        this.size = size;
        data = new int[size];
    }

    public void pushBack(int value) {
        if (++tail ==size) tail =0;
        data[tail] = value;
    }
    public int popBack(){
        int ret = data[tail];
        if(--tail<0) tail = size-1;
        return ret;
    }

    public void pushFront(int value){
        data[head] =value;
        if(--head <0) head = size - 1;
    }

    public int popFront(){
        if (++head == size) head = 0;
        return data[head];
    }

    public boolean isEmpty(){
        return head == tail;
    }

}

class Reverser{
    private String input;
    private String output;
    public Reverser(String in){
        input = in;
    }
    public String doRev(){
        int stackSize = input.length();
        MyStack theStack = new MyStack(stackSize);
        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output +ch;
        }
        return output;
    }
}
public class Homework3 {
    public static void main(String[] args) throws IOException{
        String input, output;
        while(true){
            System.out.println("Введите строку = >");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            if(input.equals("stop")) break;

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Перевернутая строка: " + output);
        }
    }
}
