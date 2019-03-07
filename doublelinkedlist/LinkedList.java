package lesson4.doublelinkedlist;

public class LinkedList {
    public Link first;
    public Link last;

    public LinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    /**
     * Вставка в начало списка
     * @param name
     * @param age
     */
    public void insertFirst(String name, int age){
        Link link = new Link(name,age);
        if(this.isEmpty()) last = link;

        link.next = first;
        first = link;
    }

    /**
     * Вставка в конец
     *
     * @param name
     * @param age
     */
    public void insertLast(String name, int age){
        Link link = new Link(name,age);
        if(this.isEmpty()) {
            first = link;
        }
        else {
            last.next = link;
        }
        last = link;
    }

    /**
     * Удаление из начала списка
     */
    public Link deleteFirst(){
        Link temp = first;
        if(this.isEmpty()) last = null;
        first = first.next;
        return temp;
    }

    /**
     * Поиск по имени
     *
     * @param name
     * @return current
     */
    public Link find(String name){
        Link current = first;
        while(current.name != name){
            if(current.next == null) {
                return null;
            }
            else{
                current = current.next;
            }
        }
        return current;
    }

    /**
     * Удаление элемента
     *
     * @param name
     * @return
     */
    public Link delete(String name){
        Link cur = first;
        Link pre = first;

        while(cur.name != name){
            if(cur.next == null) {
                return null;
            }
            else{
                pre = cur;
                cur = cur.next;
            }
        }
        if(cur == first){
            first = first.next;
        }
        else{
            pre.next = cur.next;
        }
        return cur;
    }

    public void print(){
        Link current = first;
        while(current!=null){
            current.print();
            current = current.next;
        }
    }
}
