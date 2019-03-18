package homework6;

public class Node {
    int key;
    Node leftChild;
    Node rightChild;

    Node(){
        this.key = (int)((Math.random()*100) - 100);
    }

    public void display(){
        System.out.println(key);
    }

}
