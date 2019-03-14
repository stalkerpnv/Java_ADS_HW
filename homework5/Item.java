package homework5;

/*
 * Class Items
 */

class Item{
    String name;
    int weight;
    int cost;

    Item(String name, int weight, int cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  "Название вещи: " + name +
                " Вес: " + weight +
                " Цена: " + cost;
    }
}