package lesson4.linkedlist;

class MainList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Oleg", 23);
        list.insert("Ivan", 35);
        list.insert("Maria", 21);

        list.print();

        if(list.isEmpty()){
            list.delete();
        }
        list.print();
    }

}
