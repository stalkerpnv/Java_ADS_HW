/**
 * Java. Algorithm and Data Structures of Java. Lesson 2. Homework 2
 *
 * @author Petrov Nikolay
 * @version dated Feb 26, 2019
 */

import java.util.Arrays;
public class Homework2 {
    public static void main(String[] args) {
        long start, stoptime;
        MyArr arr = new MyArr(1000000);
        arr.insertRandomv();
        //System.out.println(arr);

        start = System.currentTimeMillis();
        arr.sortBubble();
        stoptime = System.currentTimeMillis();
        System.out.println(stoptime - start);

        arr.insertRandomv();
        start = System.currentTimeMillis();
        arr.sortSelect();
        stoptime = System.currentTimeMillis();
        System.out.println(stoptime - start);

        arr.insertRandomv();
        start = System.currentTimeMillis();
        arr.sortInsert();
        stoptime = System.currentTimeMillis();
        System.out.println(stoptime - start);
    }
}
class MyArr{
    private int []arr;
    private int size;

    public MyArr(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public void delete(int value){
        int i = 0;
        for (i = 0; i <this.size ; i++) {
            if(this.arr[i] == value) break;
        }
        for (int j = i; j <this.size-1; j++) {
            this.arr[j] = this.arr[j+1];
        }
        this.size--;
    }

    public void insert(int value){
        this.arr[this.size] = value;
        this.size++;
    }

    public boolean find(int value){
        for (int i = 0; i <this.size; i++) {
            if(this.arr[i] ==value) return true;
        }
        return false;
    }
    public void insertRandomv(){
        for (int i = 0; i <this.size; i++) {
            this.arr[i] = (int)((Math.random()*30)-10);
        }
    }
    public void sortBubble(){
        int out, in;
        for (out = this.size -1; out>=1; out --){
            for(in = 0; in<out; in++){
                if(this.arr[in]>this.arr[in+1]){
                    change(in, in+1);
                }
            }
        }
    }
    public void sortSelect(){
        int out, in, mark;
        for(out = 0; out<this.size; out++){
            mark = out;
            for(in = out+1; in<this.size; in++){
                if(this.arr[in]<this.arr[mark]){
                    mark = in;
                }
            }
            change(out,mark);
        }
    }
    public void sortInsert(){
        int in, out;
        for(out = 1; out <this.size; out++){
            int temp = this.arr[out];
            in = out;
            while(in>0 && this.arr[in-1] >=temp){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }

    }
    public void change(int a, int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }
    @Override
    public String toString(){
        return Arrays.toString(this.arr);
    }
}
