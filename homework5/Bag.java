package homework5;


/*
 * Class Bag
 */

import java.util.ArrayList;

public class Bag {
    ArrayList <Item> bestItems = null;
    double bestPrice;
    int volume;  // вместимость

    public Bag(int weight) {
        this.volume = weight;
    }

    private double calcWeight(ArrayList<Item>items){
        double sumW =0;
        for (Item i: items) {
            sumW+=i.weight;
        }
        return sumW;
    }

    private double calcCost(ArrayList<Item>items){
        double sumCost = 0;
        for (Item i: items) {
            sumCost+=i.cost;
        }
        return sumCost;
    }
    private void checkSet(ArrayList<Item>items){
        if(bestItems == null){
            if(calcWeight(items)<=volume){
                bestItems = items;
                bestPrice = calcCost(items);
            }
        }
        else{
            if(calcWeight(items)<= volume && calcCost(items)> bestPrice){
                bestItems = items;
                bestPrice = calcCost(items);
            }
        }
    }

    public void makeAllSets(ArrayList<Item>items){
        if(items.size()>0){
            checkSet(items);
        }
        for (int i = 0; i <items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<Item>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public ArrayList<Item> getBestSet(){
        return bestItems;
    }

  /*  void print(){
        System.out.println("Рюкзак (вместимость: " + volume + ", ценность " + cost + "):");
        System.out.println("Вещей в рюкзаке: " + content.size());
        for(Item i:content){
            System.out.println(i);
        }
    }
*/

    /*void add(Item i){
        if((volume-i.weight)<0) {
            return;
        }
        content.add(i);
        cost = cost + i.cost;
    }*/

    @Override
    public String toString() {
        return "Рюкзак (вместимость: " + volume + ")";
    }
}
