package lesson4.doublelinkedlist;

public class Link {
    public String name;
    public int age;
    public Link next;

    public Link(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("name: " + this.name + " age " +this.age);
    }
}
